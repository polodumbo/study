package test;

import java.util.Scanner;

// 11.14 능력단위평가
public class TEST {

    public static void main(String[] args) {
//        ex)
//        정수입력: 5
//            *
//           ***
//          *****
//         *******
//        *********

        Scanner sc = new Scanner(System.in);
        int num = 0;

        // 사용자 편의성을 고려한 문구
        System.out.println("입력하는 수 만큼의 층으로 이루어진 피라미드가 출력됩니다.");

        // 유효성 검사
        while (true) {
            System.out.print("정수입력: ");
            num = sc.nextInt();

            if (num > 0) { // 종료 조건
                break;
            }
            System.out.println("0보다 큰 정수를 입력해주세요.");
        }

        // 몇 번 반복될지 아니까 for문
        for (int i = 0; i < num; i++) { // 디버깅표 작성한 결과,
            for (int j = 0; j < num - 1 - i; j++) { // j < num - 1 - i
                System.out.print(" ");
            }
            for (int j2 = 0; j2 < i * 2 + 1; j2++) { // j2 < i * 2 + 1
                System.out.print("*");
            }
            System.out.println();
        }
        
		/*
		 * 디버깅표
		 * ex) num = 5
		 * 
		 * i	j1	" "	j2	"*"
		 * ----------------------
		 * 0	0	 T				j는 5 - 1 - i보다 작을 때 T
		 * 		3	 T				5는 num이니까
		 * 		4	 F	0	 T		j < num - 1 - i
		 * 				1	 F
		 * 1	0	 T				j2는 i * 2 + 1 보다 작을 때 T
		 * 		2	 T				j2 < i * 2 + 1
		 * 		3	 F	0	 T
		 * 				2	 T
		 * 				3	 F
		 * 2	0	 T
		 * 		1	 T
		 * 		2	 F	0	 T
		 * 				4	 T
		 * 				5	 F	
		*/ 

    }

}
