for (let i = 0; i < 10; i++) {
	console.log(`현재 숫자는 ${i + 1}입니다.`);
}

// for문의 조건식이 언제 false인지 비교하고
// 그 바로 직전의 값을 i에 대입하면 그 때까지 반복

for (let i = 10; i > 0; i--) {
	console.log(`현재 숫자는 ${i}입니다.`);
}

for (let i = 0; i < 10; i++) {
	console.log(`현재 숫자는 ${10 - i}입니다.`);
}

// 중첩 반복문
// 서울고등학교(1,2,3학년 각 9반까지)

// for (let i = 0; i < 9; i++) {
// 	console.log(`1학년 ${i + 1}반`);
// }
// for (let i = 0; i < 9; i++) {
// 	console.log(`2학년 ${i + 1}반`);
// }
// for (let i = 0; i < 9; i++) {
// 	console.log(`3학년 ${i + 1}반`);
// }

for (let i = 0; i < 3; i++) {
	for (let j = 0; j < 9; j++) {
		console.log(`${i + 1}학년 ${j + 1}반`);
	}
}

// quiz. 구구단
// 1 x 1 = 1
// 1 x 2 = 2
for (let i = 1; i < 10; i++) {
	console.log(`----${i}단----`);
	for (let j = 1; j < 10; j++) {
		console.log(`${i} x ${j} = ${i * j}`);
	}
}
