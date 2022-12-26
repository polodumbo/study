package selectionSort;

import java.util.Random;
import java.util.Scanner;

// [선택 정렬]
public class SelectionSort {
	// 선택 정렬
	public static void selectionSort(int[] arData) {
		
		int minIdx = 0; // 제일 작은 수의 인덱스
		for (int i = 0; i < arData.length - 1; i++) { // 마지막 2개 남았을 때 하나 정렬하면 끝나니까 -1
			minIdx = i; // 첫 번째 수가 제일 작다고 가정
			for (int j = i + 1; j < arData.length; j++) { // 그 다음 수부터 끝까지 하나하나
				if (arData[j] > arData[minIdx]) { // 제일 작은 줄 알았던 게 작은 게 아니었다면
					minIdx = j; // 더 작은 수의 인덱스 저장
				}
			}
			// 반복이 끝났다면 minIndex에는 제일 작은 수의 인덱스 번호가 저장되어 있음
			// 정렬 안 된 번호들의 첫 번째 수와 제일 작은 수 교환
			int tmp = arData[i]; 
			arData[i] = arData[minIdx];
			arData[minIdx] = tmp;
			
			// 출력
			prtAr(arData);
			System.out.print(" > " + (i + 1) + "회전 정렬");
			System.out.println();
		}
	}
	
	// 배열 출력
	public static void prtAr(int[] arData) {
		System.out.print("[ ");
		for (int v : arData) {
			System.out.print(v + " ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1~100 선택 정렬");
		System.out.print("배열 길이 입력: ");
		int length = sc.nextInt();
		
		int[] arData = new int[length];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(100) + 1;
		}
		
		prtAr(arData);
		System.out.println(" > 정렬 전 배열");
		
		selectionSort(arData);
		
		prtAr(arData);
		System.out.print(" > 정렬 후 배열");
		
		sc.close();
	}

}
