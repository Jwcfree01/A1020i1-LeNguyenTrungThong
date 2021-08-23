let a : number = 10;
console.log(a);

// If/else
let b = 50;
if (b>40){
    console.log("b lon hon 40");
}else {
    console.log("b nho hon 40");
}

//loop and array
let arr1 = new Array(3, 4, 5);
for (let i=0; i<arr1.length; i++){
    console.log(arr1[i]);
}
console.log(arr1);

arr1.forEach(value => {
    console.log(value);
})

arr1.forEach((value, index) => {
    console.log(value);
    console.log(index);
})

arr1.map(value => {
    console.log(value + "a");
})

//function
let sum = (x: number, y: number): number => {
    return x + y;
}
console.log(sum(10,20))

//array
let arr = new Array(3);
arr.push("abc");
console.log(arr);

let arr2 = [];
console.log(arr2.length);  //0
arr2.push("n");
console.log(arr2);
console.log(arr2.length); //1
