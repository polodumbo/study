let month = 3;

const MONTH_NAME = 'TEXT';

/* 
변수의 사용 목적
1. 재사용
2. 가독성
변수의 기본은 어떤 변수인지 알아 볼 수 있도록 변수명을 작성해야 한다.
 */

switch (month) {
	case 1:
		console.log('January');
		break; // 탈출문, 비슷한 용어로 return
	case 2:
		console.log('February');
		break;
	case 3:
		console.log('March');
		break;
	default:
		console.log('None');
		break;
}
