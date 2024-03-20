import { connect } from "../mongodb/connect";

const insertDocumentTest = async()=> {
    let connection, cursor;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        const addresssCollection = db.collection('addresses');

        const person = {name: 'name1', age: 55};
        let result = await personsCollection.insertOne(person);
        console.log(result);

        const address = {country: 'korea', city: 'seoul'};
        result = await addresssCollection.insertOne(address);
        console.log(result);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
insertDocumentTest();