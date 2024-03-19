import { readFile, readFileSync } from "fs";

// // 동기 방식 (synchronous)
console.log('read package.json using synchronous api...');
const buffer: Buffer = readFileSync('./package.json');
console.log(buffer.toString());

// // 비동기 방식 (asynchronous)
readFile('./package.json', (error: Error, buffer: Buffer)=> {
    console.log('read package.json using asychronous api...');
    console.log(buffer.toString());
})

// Promise와 async/await
const readFilePomise = (filename: string): Promise<string>=>
    new Promise<string>((resolve, reject)=> {
        readFile(filename, (error: Error, buffer: Buffer)=> {
            if(error) reject(error);
            else resolve(buffer.toString());
        })
    });
(async()=> {
    const content = await readFilePomise('./package.json');
    console.log('read package.sjon using Promise and Promise and async/await...');
    console.log(content);
})();


// npm init --y
// npm i -D typescript ts-node @types/node
// mkdir src
// tsc --init
// ts-node .\src\test.ts

// API: 운영체제가 제공하는 서비스
// 스레드: CPU가 프로그램을 동작시키는 최소 단위
// 프로세스: 프로그램이 실행되고 있는 상태일 때