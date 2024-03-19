import * as R from 'ramda'

// console.log(
//     R.range(1, 7)
// );

// const numbers: number[] = R.range(1, 6);
// R.tap(n=> console.log(n))(numbers);

// const dump = R.pipe(
//     R.tap(n=> console.log(n))
// )
// dump(R.range(1, 5));

// const sum = (...numbers: number[]): number=> 
//     numbers.reduce((result: number, sum: number)=> result + sum, 0)
// const curriedSum = R.curryN(3, sum);
// console.log(curriedSum(1)(2)(3));


// const numbersArr: number[] = R.range(1, 6);
// const incNumbers = R.pipe(
//     R.tap(a=> console.log('before inc: ', a)),
//     R.map(R.inc),
//     R.tap(a=> console.log('after inc: ', a))
// );
// console.log(incNumbers(numbersArr));


// const addIndex = R.pipe(
//     R.addIndex(R.map)(R.add),
//     R.tap(a=> console.log('addIndex: ', a))
// );
// addIndex(R.range(1, 6));


// const subtract = a => b => a - b; // b: index
// const subtractFrom5 = subtract(6);
// const newArray = R.pipe(
//     R.map(subtractFrom5)
// )(R.range(1, 6));
// console.log(newArray);

// const reverseSubtract = R.flip(R.subtract); // b - a
// const newReverseArray = R.pipe(
//     R.map(reverseSubtract(6))
// )(R.range(1, 6));
// console.log(newReverseArray);


// console.log('add: 1 + 2 = ', R.add(1, 2));
// console.log('subtract: 5 - 3 = ', R.subtract(5, 3));
// console.log('multiply: 2 * 4 = ', R.multiply(2, 4));
// console.log('divide: 5 / 2 = ', R.divide(5, 2));

// console.log(R.lt(1)(3)); // a < b
// console.log(R.lte(1)(3)); // a <= b
// console.log(R.gt(1)(3)); // a > b
// console.log(R.gte(1)(3)); // a >= b


// type NumberToBooleanFunc = (n: number) => boolean;
// const selectRange = (min: number, max: number): NumberToBooleanFunc =>
//     R.allPass([R.lte(min), R.gt(max)]);
// let rangeChecker = selectRange(1, 3);
// console.log('selectRange:', rangeChecker(2));

// const notRange = (min: number, max:number)=> R.pipe(selectRange(min, max), R.not);
// rangeChecker = notRange(1, 3);
// console.log('notRange:', rangeChecker(2));


// const input: number[] = R.range(1, 11), halfVlaue = input[input.length / 2]
// const subtractOrAdd = R.pipe(
//     R.map(R.ifElse(
//         R.lte(halfVlaue), // 조건 서술자
//         R.inc, // true일 때 실행할 함수: 숫자를 1 증가
//         R.dec // false일 때 실행할 함수: 숫자를 1 감소
//     )),
//     R.tap(a=> console.log('ifElse: ', a))
// )
// subtractOrAdd(input);


console.log(
    R.trim('\t trim \n'),
    R.toUpper('\nupper'),
    R.toLower('\nLOWER')
)
const words: string[] = R.split(' ')('Hello, TypeScript world!');
console.log('split:', words);
const joinWords = R.join(' ')(words)
console.log('join:',joinWords);



// npm i -S ramda
// npm i -D @types/ramda
// => 
// npm i -S chance
// npm i -D @types/chance