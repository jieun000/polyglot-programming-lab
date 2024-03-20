import { connect } from "../mongodb/connect";

const makeCollectionsTest = async()=> {
    let connection;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        const addresssCollection = db.collection('addresses');
        console.log(personsCollection, addresssCollection);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
makeCollectionsTest();