let sunghoon = {
	name: '이성훈',
	age: 20,
	height: 170,
	hobby: '영화 감상',
};

console.log(sunghoon.name); // 이성훈
console.log(sunghoon.age); // 20
console.log(sunghoon['age']); // 20
console.log(sunghoon); // object

sunghoon.hobby = '코딩';
console.log(sunghoon);

// 자주 사용하지는 않습니다.
// new 생성자
let kong = new Object();
kong.name = '콩이';

console.log(kong);

// 두 객체를 합치는 기능
// 중복 키 값이 있으면, 키 값은 유니크해야 하기 때문에 덮어씌워진다.
const newObj = Object.assign(sunghoon, kong);
console.log(newObj); // name: '콩이', age: 20, ...
