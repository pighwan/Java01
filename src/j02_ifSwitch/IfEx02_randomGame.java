package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

//** 숫자 맞추기 게임
//=> 1~10 범위에서 숫자 하나를 입력받아
//=> 입력 숫자가 이 범위를 벗어나면 " 잘못 입력 했습니다. " 
//   다시 1~10 범위의 숫자를 입력 하세요   
//=> Random 함수의 결과와 일치하면 금메달
//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝

public class IfEx02_randomGame {

	public static void main(String[] args) {
		// 1) myNumber 입력 받기
		// => Scanner 사용
		// => 입력값 오류 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 범위의 숫자를 하나 입력 하세요 =>");
		int myNumber = sc.nextInt();
		
		// 2) Random 값 찾기
		int r = 0;
		Random rn = new Random();
		r=rn.nextInt(10)+1;
		
		// 3) 비교 , 등수 확인 
		// => 일치하면 금메달
		// => 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝
		// => 같으면 금메달, 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝.
		if  (r==myNumber) System.out.println("축하드립니다~~금메달 당첨되었습니다~!!!");
		//else if  차이가 1 이면  (r-n==1 || n-r==1)
		//else if (r-n==1 || r-n==-1 ) 
		else if (Math.abs(r-myNumber)==1) 	
			System.out.println("축하드립니다~~은메달 당첨되었습니다~!!!");
		//else if (r-n==2 || r-n==-2 )
		else if (Math.abs(r-myNumber)==2) 
			System.out.println("축하드립니다~~동메달 당첨되었습니다~!!!");
		else System.out.println(" 완전 꽝꽝꽝 !!! 더이상 기회 없어요!!!");
		System.out.println(" R => "+r);
// *** 비교 Test		
//		if  (r==myNumber) System.out.println("축하드립니다~~금메달 당첨되었습니다~!!!");
//		//else if  차이가 1 이면  (r-n==1 || n-r==1)
//		//else if (r-n==1 || r-n==-1 ) 
//		if (Math.abs(r-myNumber)==1) 	
//			System.out.println("축하드립니다~~은메달 당첨되었습니다~!!!");
//		//else if (r-n==2 || r-n==-2 )
//		if (Math.abs(r-myNumber)==2) 
//			System.out.println("축하드립니다~~동메달 당첨되었습니다~!!!");
//		else System.out.println(" 완전 꽝꽝꽝 !!! 더이상 기회 없어요!!!");
		
		sc.close();
	} //main
} //class
