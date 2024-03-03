function addFunc(a:number, b:number):number {
    return a+b;
}
let funcResult = addFunc(2, 5);
console.log(`funcResult: ${funcResult}`);

function voidFunc(name: string, age:number) {
    console.log(`name: ${name}, age: ${age}`);
}
voidFunc('void function', 60);

let anonyFunc = (function(a, b) {
    return a+b;
})(3, 5);
console.log(`anonyFunc: ${anonyFunc}`);

const arrorFunc1 = (a: number, b:number): number => { return a + b };
const arrorFunc2 = (a: number, b:number): number => a + b;

const high_order_func1 = (a: number) => (b: number) => a + b;
const high_order_func2 = high_order_func1(5);
console.log(`high_order_func: ${high_order_func2(2)}`); // 5 + 3 = 8

type keyValType = {
    [key: string]: String;
};
const keyVal = (key: string, value: string): keyValType => ({[key]: value});
console.log(keyVal('first', 'second'));

class Calculator {
    constructor(public value: number = 0) {};
    add(value: number) {
        this.value += value;
        return this;
    }
    multiply(value: number) {
        this.value *= value;
        return this;
    }
}
const calc = new Calculator();
let methodChain = calc.add(1).add(2).multiply(3).multiply(4).value;
console.log(methodChain);

const range = (from: number, to:number): number[] => {
    return from < to ? [from, ...range(from + 1, to)]: [];
}
const array: number[] = range(1, 11);
let oddsFilter: number[] = array.filter((value)=> value % 2 != 0);
console.log('filter:', oddsFilter);

const half = array.length / 2;
let overFilter: number[] = array.filter((val, index)=> index >= half);
console.log('filter:', overFilter);

let mapFunc1: number[] = range(0, 3).map((val: number)=> val * 2);
console.log('map:', mapFunc1);

let mapFunc2: string[] = range(0, 3).map((val, index)=> `[${index}]: ${val * 2}`);
console.log('map:', mapFunc2);

let reduceFunc1: number 
    = range(1, 6)
        .reduce((result: number, value: number)=> result * value, 1);
console.log('reduce:', reduceFunc1);

function forPure(array: readonly number[]) {
    // array.push(10);
}

const original = 1;
const deepCopy = original;
console.log(original, deepCopy);

const originalArray = [1, 2, 3, 4];
const shallowCopy = originalArray;
shallowCopy[3] = 5;
console.log(originalArray, shallowCopy);

const deepCopyArr = [...originalArray];
deepCopyArr[2] = 7;
console.log(originalArray, deepCopyArr);

const tuple1: any[] = [true, 'ths ts tuple'];
const tuple2: [boolean, string] = [true, 'ths ts tuple'];
console.log(tuple1, tuple2);