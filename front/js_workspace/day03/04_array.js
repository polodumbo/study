const arr = [];
console.log(arr[0]); // undefined
arr[1] = 1;
arr[3] = 3;
console.log(arr); //[ <1 empty item>, 1, <1 empty item>, 3 ]
console.log(arr.length); // 4

const newArr = ['계피', '우엉이'];

// if (newArr.indexOf('달콩이') === -1) {
// 	newArr.push('달콩이');
// }

if (!newArr.includes('달콩이')) {
	newArr.push('달콩이');
}

console.log(newArr); // 맨 끝에 달콩이 추가
console.log(newArr.indexOf('달콩이')); // 2

// split
const phone = '010-1234-5678';
// 문자열(분자로 이루어진 배열)
console.log(phone.length); // 13
const splitArr = phone.split('-');
console.log(splitArr); // [ '010', '1234', '5678' ]

// 내장함수
// push
const arr1 = [1, 2];
arr1.push(3, 4);
console.log(arr1); // [ 1, 2, 3, 4 ]

// concat
const arr2 = [1, 2];
const arr3 = [3, 4];
const result2 = arr2.concat(3, 4);
const result3 = arr2.concat(arr3);
console.log(result2); // [ 1, 2, 3, 4 ]
console.log(result3); // [ 1, 2, 3, 4 ]

// 배열 관련 함수를 사용할 때 가장 주의해야 되는 것
// 1. 반환 값 존재 여부
// 2. 원본 데이터 훼손 여부

// 개발자의 목적에 따라 올바른 알고리즘 선택 필수

// pop
const arr4 = [1, 2, 3, 4];
const result4 = arr4.pop(); // pop은 원본을 훼손
console.log(result4, arr4); // 4 [1, 2, 3]

// shift, unshift
const arr5 = [1, 2, 3, 4];
arr5.unshift(5);
console.log(arr5); // 5 1 2 3 4
console.log(arr5.shift()); // 5
console.log(arr5); // 1 2 3 4

// slice(start, end)
// start번째 인덱스부터 시작하여 end - 1까지의 묘소만 배열을 복사하여 반환
const apart = ['우엉', '계피', '성훈', '누나'];
// [	0	1	2	3	]
// [	-4	-3	-2	-1	]
console.log(apart.slice(1, 3)); // ['계피', '성훈']
console.log(apart.slice(1, -1)); // ['계피', '성훈']
console.log(apart.slice(-3, 3)); // ['계피', '성훈']
console.log(apart.slice(-3, -1)); // ['계피', '성훈']
console.log(apart.slice(1, 1)); // []

// splice(start, deleteCount, additem);
// start번째 인덱스부터 시작하여 몇 개의 데이터를 삭제할 것인지
// 그리고 제거한 위치에 어떠한 값을 추가할 것인지(생략가능)

// const deleteItem = apart.splice(1, 2);
// console.log(apart); // ['우엉', '누나']
// console.log(deleteItem); // ['계피', '성훈']

const deleteItem = apart.splice(1, 2, '배고프다');
console.log(apart); // ['우엉', '배고프다', '누나']
console.log(deleteItem); // ['계피', '성훈']

const minusApart = ['우엉', '계피', '성훈', '누나'];
minusApart.splice(-1, 2);
console.log(minusApart); // ['우엉', '계피', '성훈']
