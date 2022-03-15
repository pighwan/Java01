package j01_basic;

//연산자(operator)는 특정한 연산을 나타내는 기호
//피연산자(operand)는 연산의 대상
//연산자의 우선순위 => ppt J03_02 , 23p

public class Ex04_Oper01 {

	public static void main(String[] args) {
		// ** 사칙연산
		int a=10, b=3;
		System.out.println("** 사칙연산 **");
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b)); // 몫
		System.out.println("a % b = "+(a%b));  // a/b 의 나머지값
		
		// ** 대입연산
		// a+=b --> a=a+b
		System.out.println("** 대입연산 **");
		System.out.println("a += b , "+(a+=b)); // a=10+3 , 13
		System.out.println("a -= b , "+(a-=b)); // a=13-3 , 10
		System.out.println("a *= b , "+(a*=b)); // a=10*3 , 30
		System.out.println("a /= b , "+(a/=b)); // a=30/3 , 10
		System.out.println("a %= b , "+(a%=b)); // a=10%3 , 1 
		// 변수 a의 값이 지속적으로 바뀌는중. b는 고정
		
		// ** 단항연산
		// => 1씩 증감 ( 전 or 후 )
		a=10; b=10;
		System.out.println("** 단항연산 **");
		System.out.println("++a => "+(++a)); // 11 되고 11 출력
		System.out.println("b++ => "+(b++)); // 10 출력후 b=11
		System.out.println("--a => "+(--a)); // 10 되고 10 출력
		System.out.println("b-- => "+(b--)); // 11 출력후 b=10
		
		// ** 관계연산
		// => 모든 관계연산의 결과는 참(true) or 거짓(false)
		a=10; b=3;
		System.out.println("** 관계연산 **");
		System.out.println("a==b => "+(a==b));  // f
		System.out.println("a!=b => "+(a!=b));  // t
		System.out.println("a>b => "+(a>b));    // t
		System.out.println("a>=b => "+(a>=b));  // t 
		System.out.println("a<b => "+(a<b));    // f
		System.out.println("a<=b => "+(a<=b));  // f
		
		// ** 삼항식
		// => (조건) ? yes : no
		//    기본자료형 모두사용가능
		// => a, b 중 큰수 출력하기
		int max = (a>b) ? a : b ; 
		System.out.println("누가 누가 더 클까~? => "+max); // a가 b보다 크면 a의 값 출력
		boolean bool = (a>b) ? true : false ;
		char c = (a>b) ? '참' : 'F' ;
		String s = (a>b) ? "참" : "거짓" ;
		System.out.println("** 삼항식 **");
		System.out.printf("max=%d, bool=%b, c=%s, s=%s \n",max,bool,c,s);
		
		// ** 논리(집합) 연산
		System.out.println("** 논리(집합) 연산 **");
		// => && , || , !
		// 1) a , b 모두 짝수이면 true
		// (a 짝수확인) && (b 짝수확인)
		bool = (a%2==0) && (b%2==0) ; // false	
		System.out.println("** && => "+bool); // a:10, b:3 false
		// 2) a , b 둘중 하나만 짝수여도 true
		bool = (a%2==0) || (b%2==0) ; // true
		System.out.println("** || => "+bool);
		// 3) 부정, Not
		System.out.println("** 부정, Not => "+!bool); // false
		
	} //main
} //class
