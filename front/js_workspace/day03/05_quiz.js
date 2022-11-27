/* 
자판기라는 함수를 정의
자판기 함수는 처음에 실행되었을 때 '자판기가 거동되었습니다' 츨력
매개변수로는 coin과 메뉴 이름

리턴 값은
잔동이 0원이면 음료수 이름을 리턴
잔돈이 있으면 음료수 이름과 잔돈을 리턴

선택한 음료수의 값이 coin보다 클 경우
금액이 부족합니다 출력

솔의눈 300원
비타500 500원
콜라 1000원
없는 메뉴를 선택하면 존재하지 않는 상품입니다.
 */

function vdMachine(coin, product) {
	console.log('자판기가 가동되었습니다');
	let menu = { 솔의눈: 300, 비타500: 500, 콜라: 1000 };
	let price = menu[product];

	if (coin < price) {
		console.log('금액이 부족합니다.');
	} else if (coin > price) {
		console.log(`${product}(과)와 잔돈 ${coin - price}원이 나왔습니다.`);
	} else if (coin === price) {
		console.log(`${product}(이)가 나왔습니다.`);
	} else if (!price) {
		console.log('존재하지 않는 상품입니다.');
	}
}

vdMachine(500, '콜라'); // 금액 부족
vdMachine(1000, '콜라'); // 콜라만 나옴
vdMachine(2000, '콜라'); // 콜라 + 잔돈 1000원
vdMachine(2000, '환타'); // 없는 상품
