package codes;

import java.util.Scanner;

public class MainDrive {

	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
//		입력할 숫자 6개를 저장할 배열
		int[] myInputNumbers = new int[6];
		
		
		for (int i = 0; i <myInputNumbers.length; i++) {
			
//			각 자리에 맞는 숫자를 -> 올바른 숫자를 넣을 때까지 다시 입력
			while (true ) {
				
				
//				안내문구 -> 1번재 숫자 입력 : , 2번째 숫자 입력 :...
				System.out.println(i +1 +"번째 숫자 입력 :");
				
				int inputNum = myScanner.nextInt();
				
//				제약 조건 통과했는지 ? 검사
//				검사1 . 1~45의 범위 맞는가? 결과를 boolean으로 저장
				boolean isRangeOK = (1 <= inputNum) && (inputNum <= 45);
				
				
//				임시로 범위 검사만 징행
				if (isRangeOK) {
					
//					써도 되는 숫자를 입력했다
					myInputNumbers[i] = inputNum;
//					다음 숫자 받으러 가자 -> while 무한 반복 종료
					break;
				}
				else {
					System.out.println("잘못된 숫자를 입력했습니다.다시 입력해주세요");
				}
			}
			

//		
		}
		
		
	}
}
