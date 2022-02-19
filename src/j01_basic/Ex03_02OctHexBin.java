package j01_basic;

//** 2진수, 8진수 , 16진수 표기
//=> 2진수 : 0b 로시작 -> 0b1111
//=> 8진수 : 0
//=> 16진수: 0x

public class Ex03_02OctHexBin {

	public static void main(String[] args) {
		int bin = 0b1111 ; // 1+2+4+8 = 15
		int oct = 017 ; // 7+8 = 15
		int hex = 0xf ; // 9,a(10), b(11), c(12), d(13), e(14), f(15), 10(16)
		System.out.println("** binary => "+bin);
		System.out.println("** oct => "+oct);
		System.out.println("** hex => "+hex);
		
		// => Integer 를 2, 8, 16 진법으로 출력하기
		System.out.println("** binary => "+Integer.toBinaryString(bin));
		System.out.println("** oct => "+Integer.toOctalString(oct));
		System.out.println("** hex => "+Integer.toHexString(hex));
		
		// => Integer to String
		//    문자열 연산에 연결되면 문자로 취급됨
		System.out.println("Integer to String 1 => "+bin+oct+hex);
		System.out.println("Integer to String 2 => "+(bin+oct+hex));
		
		// => String to Integer
		String s = "12345" ;
		System.out.println("String to Integer 1 => "+(s+10)); //1234510
		System.out.println("String to Integer 2 => "+(Integer.parseInt(s)+10)); //12355
		s="123ABC" ;
		//System.out.println("String to Integer 3 => "+(Integer.parseInt(s)+10));
		// java.lang.NumberFormatException: For input string: "123ABC"
		
		// => String to Double
		s="123.4567";
		System.out.println("String to Double 1 => "+(Double.parseDouble(s)+10));
		s="123.ABCD";
		//System.out.println("String to Double 2 => "+(Double.parseDouble(s)+10));
		// java.lang.NumberFormatException: For input string: "123.ABCD"
		
	} //main

} //class
