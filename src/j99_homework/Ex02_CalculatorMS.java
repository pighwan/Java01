package j99_homework;


import java.util.Scanner;

		//** 실습
		//=> 두개의 정수를 입력 받아 4칙연산(+,-,*,/) 결과 출력하기
		//=> 입력 정수는 1 ~ 99 까지 허용
		// 1) 범위를 벗어난 값를 입력하면 정상 값 입력 할때까지 반복
		// 2) 반복분 이용해서 종료하고 싶을때까지 Test 하기.

		//** Scanner 사용시 주의 사항
		//=> nextInt() , nextLine() 사용시 주의
		//   nextInt()는 개행문자 (\n) 가 뒤에 붙고, 숫자만 받아 처리한다. 
		//   그래서 nextInt() 만 계속되면 문제가 없는데, 
		//   뒤이어서 nextLine() 이 오면 앞 nextInt() 의 
		//   남겨진 \n 을 한줄로 인식 받아 버린다.
class Cal{
	public int a;
	public int b;
	
	Scanner sc = new Scanner(System.in);
	public void input() {	
	System.out.println("정수 두개를 입력하세요.(범위 1~99)");
	System.out.print("첫번째 정수 (범위 1~99) =>>");
	this.a = Integer.parseInt(sc.nextLine());
	System.out.print("두번째 정수 (범위 1~99) =>>");
	this.b = Integer.parseInt(sc.nextLine());
	}
	
	public void calculrator() {
		int sum = a+b;
		int mul = a*b;
		int sub = a-b;
		double dev = a/b;
		
		System.out.println("+ , -, X, /");
		System.out.printf("%d + %d = %d%n",a,b,sum);
		System.out.printf("%d - %d = %d%n",a,b,sub);
		System.out.printf("%d x %d = %d%n",a,b,mul);
		System.out.printf("%d / %d = %.2f%n",a,b,dev);
	}
		
}// class Cal

public class Ex02_CalculatorMS {

	public static void main(String[] args) {
		// 1. 반복문 적용
		Cal c = new Cal();

		while(true) {
			try {
				c.input();
				if(c.a<100 && c.a>1 && c.b<100 && c.b>1) {	
				c.calculrator();
			}else
				System.out.println("다시 입력하세요.");
				
			}catch(Exception e) {
				System.out.println("잘못 입력하셨어요, 다시 입력해 주세요.");
			}//catch
		}// while
			}// main	
}// class

