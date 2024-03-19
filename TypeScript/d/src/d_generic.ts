// interface IValuable<T> {
//     value: T;
// }

// class Valuable<T> implements IValuable<T> {
//     constructor(public value: T) {}
// }

// const printValue = <T>(a: IValuable<T>): void=> console.log(a.value);

// printValue(new Valuable<number>(1000));
// printValue(new Valuable<boolean>(true));
// printValue(new Valuable('변수 추론'));
// printValue(new Valuable<number[]>([1,2,3,4,5]));



// const create = <T>(type: { new (...args: any[]): T }, ...args: any[]): T => new type(...args);

// class Point {
//     constructor(public x: number, public y: number) {} 
// }
// [
//     create(Date),
//     create(Point, 0, 0)
// ].forEach(i=> console.log(i));



// import * as R from 'ramda'

// const obj = { name: 'my name is~', age: 50, country: 'Korea', city: 'Seoul' };
// const R_pick = R.pick(['name', 'age'], obj);
// console.log(R_pick);
// const pick = (obj, keys)=> keys.map(key=> ({[key]: obj[key]}))
//     .reduce((result, value)=> ({...result, ...value}), {});
// const pickFunc = pick(obj, ['country', 'city'])
// console.log(pickFunc);



type NumberOrString = number | string;
let ns: NumberOrString = 111;
ns = '타입 뭘까~요?';
console.log(ns);


interface ISquare { tag: 'square', size: number };
interface IRectangle { tag: 'rectangle', width: number, height: number };
interface ICircle { tag: 'circle', radius: number };
const square: ISquare = { tag: 'square', size: 44};
const rectangle: IRectangle = { tag: 'rectangle', width: 4, height: 5};
const circle: ICircle = { tag: 'circle', radius: 3 };
type IShape = ISquare | IRectangle | ICircle;
const calcArea = (shape: IShape): number=> {
    switch(shape.tag) {
        case 'square': return shape.size * shape.size;
        case 'rectangle': return shape.width * shape.height;
        case 'circle': return Math.PI * shape.radius * shape.radius;
    }
    return 0
};
console.log(
    'square: ', calcArea(square),
    '\nrectangle: ', calcArea(rectangle),
    '\ncircle: ', calcArea(circle)
);


const mergeObjects = <T, U>(a: T, b: U): T & U=> ({ ...a, ...b });
type INameable = {name: string};
type IAgeable = {age: number};
const nameAndAge: INameable & IAgeable = mergeObjects({name: 'what types?'}, {age: 111});
console.log(nameAndAge);



class Bird { fly() { console.log(`Flying bird`); } }
class Fish { swim() { console.log(`Swimming fish`); } }
const flyOrSwim = (i: Bird | Fish): void=> {
    if(i instanceof Bird) {
        // (i as Bird).fly();
        // (<Bird>i).fly();
        i.fly();
    } else if(i instanceof Fish) {
        // (i as Fish).swim();
        (<Fish>i).swim();
        // i.swim();
    }
}
flyOrSwim(new Bird);

const isFlyable = (i: Bird | Fish): i is Bird=> {
    return i instanceof Bird;
}
const isSwimmable = (i: Bird | Fish): i is Fish=> {
    return i instanceof Fish;
}
const swimOrFly = (i: Fish | Bird)=> {
    if(isFlyable(i)) i.fly();
    else if(isSwimmable(i))i.swim();
}
[new Fish, new Bird].forEach(swimOrFly);
