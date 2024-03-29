SELECT * FROM USER_TABLES;

CREATE TABLE MEMBER(
	NUM INT PRIMARY KEY, -- 컬럼, 필드, 속성, 멤버변수
	NAME VARCHAR(20) NOT NULL, -- 이름
	AGE INT DEFAULT 20
);

DROP TABLE MEMBER;

SELECT * FROM MEMBER;
SELECT NUM, NAME FROM MEMBER;
SELECT COUNT(*) FROM MEMBER;
SELECT * FROM MEMBER WHERE NUM = 101;

INSERT INTO MEMBER VALUES(101, '홍길동', 21);
INSERT INTO MEMBER (NUM, NAME) VALUES(102, '임꺽정');

UPDATE MEMBER SET AGE = AGE + 1 WHERE NAME = '홍길동';
UPDATE MEMBER SET AGE = 1 WHERE NUM = 101;

DELETE FROM MEMBER WHERE NAME = '임꺽정';
DELETE FROM MEMBER WHERE NUM = 113;


-- INSERT를 할 때마다 PK갑싱 가장 최신값으로 저장되었으면 좋겠다!
-- 서브쿼리(쿼리문 안의 쿼리문)
-- 서브쿼리는 먼저 처리하기 위해서 ()로 묶어준다.
-- INSERT INTO MEMBER VALUES(최신값, '임꺽정', 30);
INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM), 0) + 1 FROM MEMBER), '임꺽정', 30);

-- MAX(칼럼명) : 칼럼값 중에서 가장 큰 값을 반환
-- NVL(값1, 값2) : 값1이 NULL이라면, 값2를 반환




