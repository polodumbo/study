/* 
add라는 이름을 갖고 있는 함수를 컴퓨터에게 기억시킬 것
add라는 함수는 파라미터를 2가지 전달

전달 받은 2개의 파라미터는 숫자이며
이 두 개의 파라미터를 더한 값을 반환 값으로 삼는 함수
 */

function add(num1, num2) {
	// return num1 + num2
	let result = num1 + num2;
	return result;
}

// add(3, 4); // 3
// console.log(add(3, 4));

let addNumber = add(3, 4); // 7
console.log(addNumber);

/* 
문자열을 전달받은 print 함수
print 함수를 실행하면 반환값은 없이 console.log() 전달 받은 문자열을 콘솔창에 로그하는 함수
*/

// 선언부
function print(str) {
	console.log(str);
}

print(`문자열입니다`); // 실행부

let c = 7;
{
	let b = 5;
	{
		let a = 5;
		// let c = 3; (가능은 하나 X)
		c = 3;
		console.log(a, b, c);
	}
}
