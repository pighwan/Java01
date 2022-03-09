package j01_basic;

public class Ex02_Variable01 {

	public static void main(String[] args) {
		// 변수 와 상수 ( 변하지 않는고정값, 전체 대문자로 표기 )
		final double PI = 3.141592;
		// pi= 31415;  // 상수
		String job = "프로그래머";
		String name = "박창환";
		String 이름 = "꿀꿀이" ; 
		// 지원은 되지만 권장하지않음 (사용하지 않는것이 좋음)
		int age;
		double weight = 87.5 ;
		boolean tf = true ; // true/false
		String lang = "Java 쪼금/많이" ;
		age=100;
		job="Java_Programmer" ;
		name="창환박" ;
		
		System.out.println("~~ 안녕하세요 ~~");
		System.out.println("* 직업 : "+job); // 문자열 연산(문자열이 이어짐)
		System.out.println("* 이름 : "+name);
		//System.out.println("* 나이 : "+age);
		//System.out.println("* 몸무게: "+weight);
		System.out.println("* 프로그램경험있다: "+tf);  // Java, C++
		System.out.println("* 사용언어 : "+lang);
		System.out.println("* 희망사항 : 개발자로 취업");
		System.out.println("* 한글변수명 Test : "+이름);
	} //main
} //class
