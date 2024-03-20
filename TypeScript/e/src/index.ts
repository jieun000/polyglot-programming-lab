// import express from 'express';
// const app = express(), port = 4000;

// app.get('/', (req, res)=> res.json({message: 'Hello Express world!'}))
//     .listen(port, ()=> console.log(`http://localhost: ${port} started...`));

// npm i -S express body-parser cors
// npm i -D @types/express @types/body-parser @types/cors



// import express from 'express';
// const app = express(), port = 4000;

// app.get('/', (req, res) => res.json({ message: 'Hello Express world!' }))
//     .get('/users/:skip/:limit', (req, res) => {
//         const { skip, limit } = req.params;
//         res.json({ skip, limit });
//     })
//     .listen(port, () => console.log(`http://localhost: ${port} started...`));



import { connect } from "./mongodb/connect";
import { runServer } from "./runServer";

connect().then(async(connection)=> {
    const db = await connection.db('testDB');
    return db;
})
.then(runServer)
.catch((e: Error)=> console.log(e.message));