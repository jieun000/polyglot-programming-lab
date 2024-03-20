import { connect } from "../mongodb/connect";

const makedbTest = async()=> {
    let connection;
    try {
        connection = await connect();
        const db = await connection.db('testDB');
        console.log('DB: ', db);
    } catch(e) {
        console.log(e.message);
    } finally {
        connection.close();
    }
}
makedbTest();

// collection = table
// document = record