package j01_basic;

import java.util.Scanner;

// ** 복습 과제
// => 이름과 나이를 입력하면 평생먹은 밥값 계산 후 출력하기
//    한끼니당 5000 원으로
// => 예) 나이: 20살 -> 20 * 365 * 3 * 5000  

public class Ex55_BasicTest01 {

	public static void main(String[] args) {
		// 1) 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 이름을 입력 하세요 => ");
		String name = sc.nextLine();
		System.out.println("** 나이를 입력 하세요 => ");
		int age = sc.nextInt(); 
		// 숫자가 아닌것을 입력하면 : java.util.InputMismatchException
		// 2) 계산하기
		int result = age * 365 * 3 * (5000+1000);
		// 3) 출력하기
		System.out.println("** 이름 => "+name);
		System.out.println("** 나이 => "+age);
		System.out.println("** 나의 밥값 => "+result);
		sc.close();
		
		// 이름과 나이를 입력하면 내가 그동안 먹은 밥값을 계산해주는 하나의 클라스
	} //main
} //class
