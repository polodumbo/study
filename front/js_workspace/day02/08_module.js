// import { print } from '08_export.js';
const print = require('./08_export');

function add(a, b) {
	return a + b;
}

print(add(1, 2));

/* 
1. 재사용
2. 독립심(단말책임원칙), 유지 보수가 쉬워진다.
	print라는 기능의 함수를 바깥으로 따로 분리하여 사용한 것을 모듈화(reactJS, vueJS)
 */
