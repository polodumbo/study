//  비교 연산자

console.log(5 == 5); // true
console.log(5 == '5'); // true
console.log(5 == 8); // false

console.log(false == '0'); // true
console.log(false == 'false'); // false

console.log(false == undefined); // false
console.log(false == null); // false
console.log(null == undefined); // true
console.log(null === undefined); // false

console.log(5 === 5); // true
console.log(5 === '5'); // false

console.log(NaN === NaN); // false
// NaN은 JS에서 자신과 일치하지 않는 유일한 값
// 따라서 숫자인지 확인하기 위해서는 자바스크립트의 빌트인(내장, 기본적으로 설정되어있는) 객체의 isNaN(a)를 사용

/* 
let a = NaN;
a === NaN; // false
inNasN(a) // true
 */
console.log(0 === -0); //true

console.log(5 != 8); //true
console.log(5 != 5); // false
console.log(5 != '5'); // false

console.log(5 !== 8); //true
console.log(5 !== 5); // false
console.log(5 !== '5'); //true

// 값은 5, //  false
// 타입 number, string // true ---> true
// 값이 같아 그러니까 false[값이 같아] 아니야? 아니야 타입이 다르니까 true[값이 달라]야

// 논리연산자
