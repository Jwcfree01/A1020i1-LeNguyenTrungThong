var a = 10;
console.log(a);
// If/else
var b = 50;
if (b > 40) {
    console.log("b lon hon 40");
}
else {
    console.log("b nho hon 40");
}
//loop and array
var arr1 = new Array(3, 4, 5);
for (var i = 0; i < arr1.length; i++) {
    console.log(arr1[i]);
}
console.log(arr1);
arr1.forEach(function (value) {
    console.log(value);
});
arr1.forEach(function (value, index) {
    console.log(value);
    console.log(index);
});
arr1.map(function (value) {
    console.log(value + "a");
});
//function
var sum = function (x, y) {
    return x + y;
};
console.log(sum(10, 20));
