/* 
이름: 여러분들의 성함 > 변수 / 상수
국어: 80점
수학: 70점
영어: ..점
탐구: ..점
평균
학줨

이 네 가지 점수의 평균을 구하여
90점 이상이면 a학점
80점 이상이면 b학점
70점 이상이면 c학점
그 외 F학점

if문 사용
console.log()
OOO님의 이번학기 성적은 O학점입니다.
*/

let myName = '이성훈';
let kor = 80;
let math = 75;
let eng = 55;
let tam = 100;

let avg = (kor + math + eng + tam) / 4;
let grade;

if (avg >= 90) {
	grade = 'A';
} else if (avg >= 80) {
	grade = 'B';
} else if (avg >= 70) {
	grade = 'C';
} else {
	grade = 'F';
}

console.log(`${myName}님의 이번 학기 성적은 ${grade}학점입니다.`);
