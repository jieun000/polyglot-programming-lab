Promise.resolve('what? '+ 5 + ' ' + [1,2,3,4,5] + ' ' + {objKey: 'obj'})
    .then(value=> console.log(value));

Promise.reject(new Error('에러'))
    .catch((err: Error)=> console.log('errorda!:', err.message));

Promise.resolve(3)
    .then((value: number)=> {
        console.log('then-chain');
        return Promise.resolve(true);
    })
    .then((value: boolean)=> {
        console.log(value);
    })

const isAllTrue = (values: boolean[])=> values.every((value=> value == true));
console.log(
    isAllTrue([true, true, true]),
    isAllTrue([true, false, true])
);
const isAnyTrue = (values: boolean[])=> values.some((value=> value == true));
console.log(
    isAnyTrue([false, false, false]), 
    isAnyTrue([false, true, false])
);