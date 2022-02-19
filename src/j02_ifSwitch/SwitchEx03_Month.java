package j02_ifSwitch;

import java.util.Scanner;

//** 실습 : 
//1. 월을 입력 받아서 
//2. 몇일까지 인지,  
// => 1,3,5,7,8,10,12월 => ?월은 31일 까지 입니다.
// => 4,6,9,11 월 => ?월은 30일 까지 입니다.
// => 2 월 => ?월은 29일 까지 입니다.
//3. 무슨 계절인지 출력 하기
//	 => 3~5:봄 , 6~8:여름, 9~11:가을, 12~2:겨울

public class SwitchEx03_Month {

	public static void main(String[] args) {
		//1. 월을 입력 받아서 
		Scanner sc = new Scanner(System.in);
		int month = 1 ;
		String msg = "";
		
		System.out.print("달을  입력 하세요 =>");
		month = sc.nextInt(); //정수형 숫자 1~12사이 숫자입력
		sc.close();
		
		//2. 몇일까지 인지,
		int year = 2021 ;
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12: msg = "31"; break;

//		case 1:
//		case 3: 
//		case 5:  
//		case 7: 
//		case 8: 
//		case 10: 
//		case 12: msg = "31"; break;
		case 4: 
		case 6: 
		case 9: 
		case 11: msg = "30"; break;
		// => 윤년을 적용하기
		//    4 로  나눠지면서 100 으로는 나눠지지 않거나  400 으로는 나눠지는 해 (year) 
		case 2: if (((year%4==0) && (year%100!=0)) || (year%400==0))  
					 msg = "29(윤년)";	// 윤년
				else msg = "28(평년)";	// 평년
				break;
		default: msg = "Error"; 			 
		} // switch
		System.out.println(month+"월은 "+msg+"일 까지 입니다 ~");
		//   System.out.printf("%d월은 31일 까지 입니다.", month);

		//3. 무슨 계절인지 출력 하기
		String mtoS = "안내문" ;
		switch(month) { //1, 2, 12
			case 12: 
			case 1:
			case 2: mtoS="겨울입니다. "; break;
			case 3:	case 4: case 5:  mtoS="봄날입니다. "; break;
			case 6:	case 7:	case 8:  mtoS="여름입니다. "; break;
			case 9: System.out.print("멋진 ");
					 //break;
			case 10:System.out.print("아름다운 ");
					//break;
			case 11:System.out.print("낙엽의 ");
		         	mtoS="가을입니다. "; break;
			default: mtoS="1~12월 벗어난 달입니다. "; break;
		}//switch end
		System.out.println( month +"월은 " + mtoS );  

	} //main
} //class
