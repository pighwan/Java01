package j01_basic;

// ** 변수의 선언과 출력 
// => 변수명: 변수의 이름은 식별자 ( identifier, 직접 작명 ) 의 일종
// => 비교 : modifier 는 특징을 제한하는 한정자 ( public 등 예약어의 일종 ) 
//          변수 우측의 값은 리터럴(literal) 이라함.
// => 변수명 의 규칙 (ppt J03_01 , 8p)

public class Ex02_Variable02 {

	public static void main(String[] args) {
		// 1) 선언
		// 1.1) 기본자료형: 정수형 
		// => 연산자(+,-,*,/,%) 는 식별자에 포함할 수 없음
		byte b;
		short s = 123;
		int i = 2147483647;
		long l = 123456789012345678L; // l,L 모두가능  
		l = 10l;
		// i = 10l;  // Error
		// Java 에서 정수 리터럴 의 기본 타입은 int ( 즉, 4byte를 초과할수 없음) 
		// => 그러므로 long Type 의 경우에는 이것을 표시하기위해 리터럴에 l(L) 을 붙여줌
		
		// 1.2) 기본자료형: 실수형
		float f = 123.456f; // f,F 모두가능 
		double d = 12345.6789;
		// Java 에서 실수 리터럴 의 기본 타입은 double  
		// => 그러므로 float Type 의 경우에는 이것을 표시하기위해 리터럴에 f(F) 를 붙여줌
		
		// 1.3) 기본자료형: boolean
		boolean bool ;  // true 또는 false 
		bool = s > i ;  // false -> 관계식의 결과는 항상 boolean
		
		// 1.4) 기본자료형: char 
		// => 한글자를 의미, 2byte
		char cc = 'A' ; // ""는 한 글자
		cc='김' ;
		// String 과 비교
		String ss = "A" ; // ""는 문장
		ss="가나다라" ;
		
		// 2) 변수의 사용
		// => 반드시 선언 후 & 값 할당 후 사용
		b=127;
		System.out.println("** byte b => "+b);
		System.out.println("** boolean bool => "+bool); // 위의 i가 s보다 크므로 false
		System.out.println("** char cc => "+cc); // 한 글자 '김'
		
		// 3) 최대값 & 최소값 출력하기
		// => 모든 기본 자료형에는 그 자료형을 지원해 주는 클래스가 있음 : 래퍼(Wrapper)클래스
		//    해당 클래스명은 기본 자료형의 첫글자를 대문자로 하면됨
		System.out.println("* byte Max => "+Byte.MAX_VALUE); // byte : -128~0~127
		System.out.println("* byte Min => "+Byte.MIN_VALUE);
		System.out.println("* short Max => "+Short.MAX_VALUE); // short : -32768~0~32767
		System.out.println("* short Min => "+Short.MIN_VALUE);
		System.out.println("* int Max => "+Integer.MAX_VALUE); // int : -2147483648~0~2147483647
		System.out.println("* int Min => "+Integer.MIN_VALUE);
		//System.out.println("* long Max => "+Long.MAX_VALUE);
		//System.out.println("* long Min => "+Long.MIN_VALUE);
		System.out.printf("* Long Max=%d , Min=%d \n", Long.MAX_VALUE, Long.MIN_VALUE);
		
		System.out.printf("* float Max=%f , Min=%f \n", Float.MAX_VALUE, Float.MIN_VALUE);
		System.out.printf("* double Max=%f , Min=%f \n", Double.MAX_VALUE, Double.MIN_VALUE);
		
		System.out.printf("* char cc=%s , String ss=%s \n", cc, ss);
		
		// 4) 치환
		// => 값의 맞교환 
		//    중간 보관을 위한 같은 타입의 임시 변수(temp)가 필요함
		// => "=" 동일성을 의미하는것이 아니고 대입연산자
		String cup1 = "콜라" ;
		String cup2 = "사이다" ;
		String temp = cup1 ;
		cup1 = cup2 ;
		cup2 = temp ;

	} //main

} //class
