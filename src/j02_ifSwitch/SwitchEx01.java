package j02_ifSwitch;

//** switch - case - break 문
//1. => switch(key) 문의 인자로 사용 가능 Type ( int, char, String )
//2. => break : 무조건 탈출 (없으면 아래로 계속 default 까지 진행)
//3. => case 블럭에는 복합구문에도 {....} 사용하지 않음 

public class SwitchEx01 {

	public static void main(String[] args) {
		// ** int Type Test
		int i = 1 ;
		switch (i) {
		case 1: System.out.println("** 1 입력 **");	
				System.out.println("** 복문 Test **");	
				break;
		case 2: System.out.println("** 2 입력 **");
		case 3: System.out.println("** 3 입력 **");
		case 4: System.out.println("** 4 입력 **");
		case 5: System.out.println("** 5 입력 **");
		default: System.out.println("** 입력 Error **");
		} // switch
		
		// ** char Type Test
		char jobCode = 'A' ;
		switch(jobCode) {
		case 'A' : System.out.println("** 예술가 **"); 
				   if (i==1) {	
					   i++;
					   System.out.println("** i++ =>"+i);
				   }   
				   break;
		case 'B' : System.out.println("** 학생 **"); break;
		case 'C' : System.out.println("** Programmer **"); break;
		} // switch
		
		// ** char Type Test
		String color = "R" ;
		switch(color) {
		case "B" : System.out.println("** Black **"); break;
		case "W" : System.out.println("** White **"); break;
		case "R" : System.out.println("** Red **"); break;
		default: System.out.println("** Green **");
		} // switch
		
		// 변수 수정해서 확인해봄
	} //main
} //class
