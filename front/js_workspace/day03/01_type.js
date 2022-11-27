// 문자형
console.log(1 + '2'); // '12'
console.log(1 - '1'); // 0
console.log(1 * '10'); // 10

// 숫자형
console.log(Number('0')); // 0
console.log(Number(true)); // 1
console.log(parseInt('0')); // 0

// 불린형
console.log(Boolean(1)); // true
console.log(Boolean(undefined)); // false
console.log(Boolean(NaN)); // false
console.log(Boolean('')); // false
console.log(Boolean('false')); // true
console.log(Boolean(null)); // false

console.log(Boolean({})); // true
console.log(Boolean([])); // true

console.log(typeof (1 + '')); // string
console.log(typeof parseInt('1')); // number
console.log('1' + '2'); // 12
console.log(1 - '-1'); // 2
console.log(Boolean(null)); // false
console.log(Boolean({})); // true
