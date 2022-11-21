let num = 5;
let answer;

if (num > 0) {
	answer = '양수';
} else if (num < 0) {
	answer = '음수';
} else {
	answer = '0';
}

console.log(answer); // 양수

// early return
// 나중에 자세히
// if (num > 0) return (answer = '양수');
// if (num < 0) return (answer = '음수');
// if (num === 0) return (answer = '0');

// console.log(answer);
