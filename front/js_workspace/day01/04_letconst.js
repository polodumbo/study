/* 
컴퓨터한테 변수명과 값을 기억시키기 위한 과정
	선언문
		let a;
	할당문
		a = 5;
*/

let a = 5;
a = 6;
// let a = 7;
// SyntaxError: Identifier 'a' has already been declared
// a가 이미 정의되었다. > 중복 선언 불가

const b = 7;
// b = 8;
// TypeError: Assignment to constant variable.
// 상수에 변수가 할당 > 상수 값을 바꾸면 안 된다.

console.log("a", a); // a 6
console.log("b", b); // b 7
console.log(a, b); // 6 7

/* 
console.log에 변수 혹은 상수를 찍는 방법
(1) , // 값으로 출력
(2) + // 문자열로 출력
(3) ``, ${} // 문자열로 출력
	// backtick, backquote, grave
*/
console.log("a의 값은", a, "입니다");
console.log("a의 값은 " + a + "입니다");
console.log(`a의 값은 ${a}입니다`);
