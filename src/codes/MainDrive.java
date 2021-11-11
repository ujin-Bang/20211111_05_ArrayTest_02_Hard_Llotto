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
				
//				검사2. 이미 입력한 숫자인가? 중복검사 결과를 boolean으로 저장.
				
//				일단 써도 괜찮다 해뒀다가 -> 내 입력 목록에 지금 입력한 숫자가 들어있나? 찾아보자
//				같은 숫자를 발견했다? 쓰면 안된다고 말 변경

				boolean isDuplOk = true;
				
//				입력 숫자 목록(배열) 조회 -> for - each문 활용
				for (int num : myInputNumbers) {
					
//					꺼내온 숫자가 입력한 숫자랑 같은가? => 같다면? 중복발견!
					if(num == inputNum) {
//					중복 검사 탈락!
						isDuplOk = false;
					}
				}
				
				
//				범위 검사도 중복검사도 통과하면 숫자 대입( 사용처리)
				if (isRangeOK && isDuplOk ) {
					
//					써도 되는 숫자를 입력했다
					myInputNumbers[i] = inputNum;
//					다음 숫자 받으러 가자 -> while 무한 반복 종료
					break;
				}
				else {
//					왜 쓰면 안되는지? 경우별로 안내
//					범위검사에 탈락?>
					if(!isRangeOK) {
						System.out.println("1~45의 숫자마 입력 가능합니다.");
					}
					else {
//						범위 검사 통과? =>중복검사 탈락
						System.out.println("이미 입력한 숫자입니다.");
					}
					System.out.println("잘못된 숫자를 입력했습니다.다시 입력해주세요");
				}
			}
			

//		
		}
		
//		6개의 숫자 입력 완료됨
		
//		당첨 번호 임시로 6개 숫자 직접 타이핑 (하드코딩)
		
		int[] winLottoNumbers = { 2, 13, 20, 30, 31, 41 };
		
		
		
		
	}
}
