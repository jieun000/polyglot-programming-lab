let a:number = 1;
let b:boolean = true;
let c:string = 'typeScript';
let d:object = {};
console.log(a, b, c, d);

let e:any = 100; // 최상위 타입
let f:undefined = undefined; // 최하위 타입
console.log(e, f);

let templateString:string = `This is a ${c}.`;
console.log(templateString);

interface TsInterface1 {
    name: string;
    age: number;
}
let whatInterFace:TsInterface1 = {name: 'tsInterface1', age: 11};
// let errorInterFace:TsInterface1 = {name: 'error'};
// let errorInterFace:TsInterface1 = {name: 'error', etc: 'error'};
// let errorInterFace:TsInterface1 = {};
console.log(whatInterFace);

interface TsInterface2 {
    name: string; // 필수 속성
    age: number; // 필수 속성
    etc?: boolean; // 선택 속성
};
let requiredAttribute:TsInterface2 = {name: 'tsInterface2', age: 11};
let selectionAttribute:TsInterface2 = {name: 'tsInterface2', age: 11, etc: false};
console.log(requiredAttribute);
console.log(selectionAttribute);

let tsInterface3: {
    name: string;
    age: number;
    etc?: boolean;
} = {name: 'tsInterface3', age: 11, etc: false};
console.log(tsInterface3);

// class TsClass1 {
//     name: string;
//     age?: number;
// }
// let TsClass1: TsClass1 = new TsClass1();
// TsClass1.name = "what's yours name";
// TsClass1.age = 10;
// console.log(TsClass1);

class TsClass2 {
    name: string;
    age?: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
}
let tsClass2 = new TsClass2('class name is a MyClass2', 20);
console.log(tsClass2)

interface TsClassInterface {
    name: string;
    age: number;
}
// class TsClass3 implements TsClassInterface {
//     name: string;
//     age: number;
// }
class TsClass4 implements TsClassInterface {
    constructor(public name: string, public age:number) {}
};
let tsClassInterface:TsClass4 = new TsClass4('nameida', 30);
console.log(tsClassInterface);

abstract class TsClass5_1 {
    abstract name: string;
    constructor(public age?: number) {}
}
class TsClass5_2 extends TsClass5_1 {
    constructor(public name: string, age?:number) {
        super(age);
    }
}
let tsClass5:TsClass5_2 = new TsClass5_2('부모 클래스', 100);
console.log(tsClass5);

class tsClass6 {
    static staticValue = 'ts';
}
let initVal = tsClass6.staticValue;
console.log(initVal);

let typeConversion:Object = {name: 'typeScript', age: 60};
// typeConversion.name = 'error';
(<{name: string}>typeConversion).name = 'typeConversion';
console.log(typeConversion);

interface TypeAssertion {
    name: string;
}
let typeAssertion:object = {name: 'typeAssertion'};
let typeAssertion_1 = (<TypeAssertion>typeAssertion).name;
let typeAssertion_2 = (typeAssertion as TypeAssertion).name;
console.log(typeAssertion_1);
console.log(typeAssertion_2);

