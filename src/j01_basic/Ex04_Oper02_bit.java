package j01_basic;

//** bit 연산
//=> 쉬프트 연산 , 논리 연산
public class Ex04_Oper02_bit {

	public static void main(String[] args) {
		
		int x=10; // 1010
		int y=3;  // 0011
		// 1) 쉬프트 연산 : >> , << 
		System.out.println("** x>>y => "+(x>>y));
		// x 가 우측으로 y 만큼이동: 1010 => 0101 -> 0010 -> 0001 : 1
		System.out.println("** x>>1 => "+(x>>1)); // 0101 : 5
		
		System.out.println("** x>>y => "+(x<<y));
		// x 가 좌측으로 y 만큼이동: 1010 => 10100 -> 101000 -> 1010000 : 80  
		System.out.println("** x>>1 => "+(x<<1)); // 10100 : 20
		// 2) 논리연산
		// => AND & , OR | , XOR ^ (같으면 0)
		System.out.println("** x&y => "+(x&y)); // 0010 : 2
		System.out.println("** x|y => "+(x|y)); // 1011 : 11  
		System.out.println("** x^y => "+(x^y)); // 1001 : 9
		
	} //main
} //class
