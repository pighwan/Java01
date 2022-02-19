package j02_ifSwitch;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		
		// ** 삼항식을 if 문으로
		// => a, b 중 큰수 출력하기
		int a=100, b=60;
		int max = (a>b) ? a : b ;
		if (a>b) max = a;
		else max = b;
		
		boolean bool = (a>b) ? true : false ;
		if (a>b) System.out.println("A 는 B 보다 크다 => true");
		else System.out.println("A 는 B 보다 크다 => false");
		
		char c = (a>b) ? '참' : 'F' ;
		if (a>b) System.out.println("a>b => 참");
		
		// 동일성 비교 Test
		// => c 의 값이 '참' 이면 출력한다.
		if ( c=='참') System.out.println("c 는 참 입니다 ~~");
		String t="참" ;
		if ( t.equals("참")) System.out.println("t 는 참 입니다 ~~");
		
		// => a 와 b 의 값이 같으면 (a+b) 결과를 출력한다 
		b=100;
		if (a==b) System.out.println("a+b => "+(a+b));
		
		// ** Scanner 로 근무시간을 입력받아 임금계산하기
		// => 조건 
		//    근무시간이 5시간 이하면 : 시간당 임금 10000원,
		//    근무시간이 6시간 이상이면 : 시간당 임금 9000원,
		Scanner sc = new Scanner(System.in);
		System.out.println("** 근무시간을 입력 하세요 => ");
		//int hours = sc.nextInt(); 
		int hours = Integer.parseInt(sc.nextLine());    
		double pay = 0;
//		if (hours < 6)
//			 pay = hours*10000;
//		else pay = hours*9000;
		// => 조건추가
		//    야간근무이면 30% 추가수당 지급
		System.out.println("** 야간근무이면 Y , 아니면 N 을 입력하세요 => ");
		String s = sc.nextLine();
		if (hours < 6) {
			if (s.equals("Y")) pay = (hours*10000) +(hours*10000)*0.3;
			else pay = hours*10000;
		}else {
			if (s.equals("Y")) pay = (hours*9000) +(hours*9000)*0.3;
			else pay = hours*9000;
		}
		System.out.println("** 오늘의 급여 =>"+pay);
		
		sc.close();
	} //main
		
} //class

