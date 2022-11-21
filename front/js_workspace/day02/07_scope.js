let num1 = 100;
let num2 = 200;

function f1() {
	console.log(num1); // 100
	function f1_1() {
		console.log(num1, num2); // 100 200
	}
	f1_1();
}

f1();
// f1_1(); // 에러

function f2() {
	num1 = 150;
}

function f3() {
	let num1 = 100;
	let num3 = 150;
	num1 = 300;
}

console.log(num1); // 100
f1(); // 100 200

f2(); // 전역변수 num1 = 150
console.log(num1); // 150

f3(); // f3의 num1 = 300
console.log(num1); // 150
// console.log(num3); // ReferenceError: num3 is not defined
