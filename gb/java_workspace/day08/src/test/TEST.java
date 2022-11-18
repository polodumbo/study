package test;

import java.util.Random;
import java.util.Scanner;

//[선택정렬]
// 0. data.length -1 전까지(for)
// 1. 입력 배열 전체(0 ~ length-1)에서 최솟값 선택
// 2. 배열의 0번 원소와 자리 바꿈
// -------------
// 3. 0번 제외한 나머지 원소에서 최솟값 선택
// 4. 배열의 1번 원소와 자리 바꿈
// 5. ...반복

public class TEST {

   // 선택 정렬 수행 함수
   public static void selectionSort(int[] arr) {
      int minIndex = 0;
      int cnt = 0; //몇 번 교환했는지 알려주는 count 변수
      // i = 0 ~ length - 2
      for (int i = 0; i < arr.length - 1; i++) {
         // 최소값 찾기
         minIndex = i;
         // j ~ length-1 까지 중 최솟값 선택
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
               minIndex = j;
            }
         }
         
         
         // N회전 결과 출력
         System.out.println("========== " + (i + 1) + "회전 결과" + " ==========");

         // 이미 정렬되어 있는 수라면 교환하지 않음
         if (i != minIndex) {
            swap(arr, i, minIndex);
            cnt++;
         }

         printArr(arr);

      }
      System.out.println(cnt + "번의 교환으로 정렬을 완료하였습니다.");
   }

   // 교환 함수
   public static void swap(int[] arr, int i, int minIndex) {
      System.out.println((i + 1) + "번째에 있는 숫자 " + arr[i] + "와(과) " + (minIndex + 1) + "번째에 있는 숫자 " + arr[minIndex]
            + "를 교환했습니다.\n");
      int tmp = arr[i]; // tmp에 data[i] 저장
      arr[i] = arr[minIndex];// data[minIndex] 를 data[i] 에 대입
      arr[minIndex] = tmp;// tmp에 저장해놨던 data[i] 원래 값을 data[minIndex]에 대입
   }

   // array 출력 함수
   public static void printArr(int[] arr) {
      System.out.print("[ ");
      for (int v : arr) {
         System.out.print(v + " ");
      }
      System.out.println("]\n");
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();

      System.out.print("배열 크기 입력: ");
      int N = input.nextInt();

      // 배열 생성
      int[] arr = new int[N];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rand.nextInt(50) + 1;
      }

      System.out.print("\n초기 배열 : ");
      printArr(arr);
      selectionSort(arr);
   }

}