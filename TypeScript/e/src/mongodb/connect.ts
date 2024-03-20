import { MongoClient } from "mongodb";

export const connect = (mongoUrl: string = 'mongodb+srv://id:pw@whatpj.m9kmvq4.mongodb.net/?retryWrites=true&w=majority&appName=whatPj') =>
    MongoClient.connect(mongoUrl);



// npm i -S mongodb
// npm i -D @types/mongodb
// mkdir -p src/mongodb