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
console.log(oddsFilter);

const half = array.length / 2;
let overFilter: number[] = array.filter((v, index)=> index >= half);
console.log(overFilter);