const createRangeIterable = (from: number, to:number)=> {
    let currentValue = from
    return {
        next() {
            const value = currentValue < to ? currentValue++ : undefined;
            const done = value == undefined;
            return  {value, done};
        }
    }
}

const iterator = createRangeIterable(1, 4);
while(true) {
    const {value, done} = iterator.next();
    if(done) break;
    console.log(value, done);
}

function* generator() {
    console.log('generator started...');
    let value = 1;
    while(value < 4) yield value++;
    console.log('generator finished...')
}
for(let value of generator()) console.log(value);

const period = 1000;
let count = 0;
console.log('program started...');
const id = setInterval(()=> {
    if(count >= 3) {
        clearInterval(id);
        console.log('program finished...');
    } else {
        console.log(++count);
    }
}, period);

function* gen12() {
    yield 1;
    yield 2;
}
function* gen12345() {
    yield* gen12();
    yield* [3, 4];
    yield 5;
}
for(let value of gen12345()) console.log(value);

const asyncFunc = async() => {
    const value = await Promise.resolve('promise');
    console.log(value + ':  finished');
}
asyncFunc();