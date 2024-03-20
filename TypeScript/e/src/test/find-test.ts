import { connect } from "../mongodb/connect";

const findDocumentTest = async()=> {
    let connection, cursor;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        const addresssCollection = db.collection('addresses');

        cursor = personsCollection.find({name: 'name1'});
        const foundPerson = await cursor.toArray();
        console.log(foundPerson);

        cursor = addresssCollection.find({});
        const foundAddresses = await cursor.toArray();
        console.log(foundAddresses);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
findDocumentTest();