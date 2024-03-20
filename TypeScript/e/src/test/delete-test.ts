import { connect } from "../mongodb/connect";

const deleteTest = async()=> {
    let connection;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        const personsCollection = db.collection('person');
        await personsCollection.insertMany([
            {name: 'name2'},
            {name: 'name3'},
            {name: 'name4'}
        ]);

        let result = await personsCollection.deleteOne({name: 'name2'});
        console.log(result);
        result = await personsCollection.deleteMany({});
        console.log(result);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
deleteTest();