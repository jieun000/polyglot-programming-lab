import { connect } from "../mongodb/connect";
import { ObjectId } from "mongodb";

const findOneTest = async()=> {
    let connection, cursor;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        
        cursor = personsCollection.find({});
        const foundPerson = await cursor.toArray();
        
        const _id = foundPerson[0]._id;
        const result = await personsCollection.findOne({_id});
        console.log(result);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
findOneTest();