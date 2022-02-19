package j04_array;

import java.util.Arrays;
import java.util.Random;

//** 찾기(Search) & 정렬(Sort)
//=> Lotto 번호 생성기

public class Ex04_Lotto02 {

	public static void main(String[] args) {
		// 1) 배열 생성 : lotto
		int[] lotto = new int[6] ;
		// 2) Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
		Random rn = new Random();
		for (int i=0; i<lotto.length; i++) {
			 lotto[i] = rn.nextInt(45)+1;
		// 3) 중복 확인 & 제외
		// => search
			 for (int j=0; j<i; j++) {
				 if (lotto[i]==lotto[j]) {
					 --i; break;
				 } // if
			 } //for_j
		} //for_i
		// 4) 정렬전 출력
		System.out.println("** 정렬전 Lotto => "+Arrays.toString(lotto));
		
		// 5) 오름차순 정렬(Sort) 출력하기
		// => 순차정렬 (Sequence Sort)
		// => 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
		//    배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘
		// ** 정렬 알고리즘 : 삽입(insert)정렬, 합병(Merge)정렬, 퀵(Quick)정렬...
		// => https://blog.naver.com/tepet/221690306235 
		for (int i=0; i<lotto.length; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				//if (lotto[i] < lotto[j]) { // 내림차순
				if (lotto[i] > lotto[j]) { // 오름차순
					// 맞교환 (치환)
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp ;
				} // if
			} // for_j
		} // for_i
		System.out.println("** 정렬후 Lotto => "+Arrays.toString(lotto));
		// 6) Arrays : 배열의 Wrapper 클래스
		// => toString() , sort(), equals( , ) ....
		int[] mylotto = {13, 2, 33, 40, 14, 11} ;
		Arrays.sort(mylotto);
		System.out.println("** 정렬후 MyLotto => "+Arrays.toString(mylotto));
		
		if ( Arrays.equals(lotto,mylotto)) {
			  System.out.println("** 당첨 !!! **");
		}else System.out.println("** 꽝 꽝 꽝 !!! **");

	} //main

} //class