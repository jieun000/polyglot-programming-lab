import { connect } from "../mongodb/connect";

const sortTest = async()=> {
    let connection;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        await personsCollection.createIndex({name: 1, age: -1});
        await personsCollection.deleteMany({});
        await personsCollection.insertMany([
            {name: 'names', age: 30},
            {name: 'names', age: 10},
            {name: 'names', age: 20}
        ]);
        const cursor = personsCollection.find({name: 'names'}).sort({age: -1});
        const result = await cursor.toArray();
        console.log(result);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
sortTest();