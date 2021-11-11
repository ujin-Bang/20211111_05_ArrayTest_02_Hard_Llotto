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
		
//		int[] winLottoNumbers = { 2, 13, 20, 30, 31, 41 };
		
//		몇 등인지 판단 -> 몇 개의 숫자가 같은가?
		
		
//		당첨 번호 6개를 랜덤으로 추출
		int[] winLottoNumbers = new int[6];
//				6개를 채워넣기 위한 for문
			for(int i=0 ; i<winLottoNumbers.length ; i++) {
				
//				써도 되느 ㄴ숫자를 뽑을 때까지 무한 반복
				while (true) {
					
//					랜덤 숫자 추출 -> 1~45로 추출하면 범위 검사는 필요가 없다. 
//					랜덤 추출 : Math.random() * 45 + 1=> 1.0~ 46.0사이의 값이 랜덤으로 추출. -> 정수 변환 :0~45랜덤
					
					int randomNum = (int)(Math.random() * 45 +1);
					
					System.out.println("랜덤숫자 :" + randomNum);
					
//					임시 - 무조건 사용
					if(true) {
						
//						제대로 된 랜덤 추출 => 당첨번호로 사용
						winLottoNumbers[i] = randomNum;
//						다음 숫자 뽑으로 무한반복탈출
						break;
					}
					
					
				}
			}
		
		
		
		int correctCount = 0;
		
//		내 번호를 하나 들고 -> 당첨번호 6개를 비교해 보자. (하나씩 비교를 6번 반복) -> 내 번호 6개에 대해 반복
		for(int myNum : myInputNumbers) {
			
//			당첨번호 6개 꺼내보자.
			
			for ( int winNum : winLottoNumbers) {
//				내 번호와 당첨번호가 같은가? => 맞췄나?
				
				if( winNum ==myNum) {
					
//					 맞춘 숫자를 한개 더 발견
					correctCount++;
				}
				
				
				
			}
			
		}
		
//		맞춘 갯수가 correctCount에 확보됨 => 등수 판단
		if(correctCount == 6) {
			System.out.println("1등!!");
		}
		else if(correctCount == 5) {
			
			System.out.println("3등");
			
		}
		else if(correctCount ==4) {
			System.out.println("4등");
		}
		else if(correctCount == 3) {
			System.out.println("5등");
		}
			else if(correctCount == 2) {
				System.out.println("6등");
		}
		else {
			System.out.println("낙첨입니다");
		}
	}
}
