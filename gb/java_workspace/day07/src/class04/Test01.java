package class04;

// [퀵 정렬]
public class Test01 {
	public static void quickSort(int[] arData, int start, int end) {
		if (start >= end) { // 요소가 1개가 되면
			return;
		}
		
		int pivot = arData[start]; // 피벗에 시작 지점 저장
		int L = start + 1; // 시작 지점 + 1
		int H = end; // 끝 지점
		
		while (L <= H) {
			
			while (arData[L] < pivot) { // Low-point의 수가 pivot보다 작은 동안
				L++; // 우측으로 한 칸씩 이동
			}
			while (arData[H] > pivot) { // High-point의 수가 pivot보다 큰 동안
				H--; // 좌측으로 한 칸씩 이동
			}
			
			// 종료 조건
			if (L > H) { // cross가 일어난다면
				break;
			}
			
			// arData[H] < pivot < arData[L]이라면 
			// pivot(arData[start])과 arData[H] 교환
			int tmp = arData[L];
			arData[L] = arData[H];
			arData[H] = tmp;
			
		}
		// tmp
		// pivot(arData[start])과 arData[H] 교환
		int tmp = arData[start];
		arData[start] = arData[H];
		arData[H] = tmp;
		
		quickSort(arData, start, H - 1);
		quickSort(arData, H + 1, end);
	}

	public static void main(String[] args) {

		int[] arData = {48, 16, 54, 74, 94, 9, 92, 79, 81, 97}; 
		
		for (int v : arData) {
			System.out.print(v + " ");
		}
		
		quickSort(arData, 0, arData.length - 1);
		
		System.out.println();
		for (int v : arData) {
			System.out.print(v + " ");
		}
	}
	
	/*
	 * [4 1 10 2 8 7 9 3 6 5]
	 *  p L                H
	 *  
	 * pivot = arData[start]
	 * L = start(pivot) + 1
	 * H = end
	 * 
	 * L<H	arD[L]<p	arD[H]<p	L>H
	 * ---------------------------------------
	 *  4	1 T			5 T			F
	 * 		10 F		6 T
	 * 					3 F
	 *      
	 * [4 1 3 2 8 7 9 10 6 5]
	 *  p   L         H					> 교환
	 *      3 T			10 T
	 * 		2 T			9 T
	 * 		8 F			7 T
	 * 					8 T
	 * 					2 F			T
	 * 
	 * [4 1 3 2 8 7 9 10 6 5]
	 *  p     H L     					> cross
	 *  
	 * [2 1 3 4 8 7 9 10 6 5]
	 *  p     H L     
	 * 
	 * quickSort(arData, start, H - 1)
	 * L<H	arD[L]<p	arD[H]<p	L>H
	 * ---------------------------------------
	 * [2 1 3]
	 *  p L H
	 *  2	1 T			3 T
	 *  	3 F			1 F			T
	 *  
	 * [2 1 3]
	 *  p H L							> cross
	 *  
	 * [1 2 3]
	 *  p H L
	 *  
	 * quickSort(arData, start, H - 1)
	 * 		 			 1		1		> break
	 * 
	 * quickSort(arData, H + 1, end)
	 *                   8		5
	 * L<H	arD[L]<p	arD[H]<p	L>H
	 * ---------------------------------------
	 * [8 7 9 10 6 5]
	 *  p L        H
	 *  8	7 T			5 F
	 *  	9 F							> 교환
	 * [8 7 5 10 6 9]
	 *  p   L      H			
	 *  	5 T			9 T
	 *  	10 F		6 F				> 교환
	 * [8 7 5 6 10 9]
	 *  p     L H			
	 * 		6 T			10 T
	 * 		10 F		6 F			T
	 * [8 7 5 6 10 9]
	 *  p     H F						> cross
	 * [6 7 5 8 10 9]
	 *  p     H F	
	 *  			
	 * quickSort(arData, start, H - 1)
	 * 					 6		5
	 * L<H	arD[L]<p	arD[H]<p	L>H
	 * ---------------------------------------
	 * [6 7 5]
	 *  p L H
	 *  6		7 F		5 F				> 교환
	 * [6 5 7]
	 *  p L H
	 *  		5 T		7 T
	 *  		7 F		5 F				> cross
	 * [6 5 7]
	 *  p H L
	 * [5 6 7]
	 *  p H L
	 * 
	 * quickSort(arData, H + 1, end)
	 * 					 10		9
	 * L<H	arD[L]<p	arD[H]<p	L>H
	 * ---------------------------------------
	 * [10 9]
	 *  p  LH
	 *  F								> cross
	 * [9 10]
	*/

}
