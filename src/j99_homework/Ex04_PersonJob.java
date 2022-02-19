package j99_homework;

import java.util.Scanner;

public class Ex04_PersonJob {

	public static void main(String[] args) {
				
					
					Scanner scan = new Scanner(System.in);
					System.out.println("이름을 입력하세요.");
					String name = scan.next();
					System.out.println("주민등록번호를 입력하세요.");
					String idNo = scan.next();
					while(idNo.length()<5) {
						System.out.println("다시 기입해 주십시오.(7자리 이상)");
						 String idNo2 = scan.next();
						 idNo=idNo2;
						} 
												
					System.out.println("직업군을 입력하세요. (Front,BackEnd)");
					String job = scan.next();
					System.out.println("부서를 입력하세요.(기획,모바일,PC)");
					String team = scan.next();
					System.out.println("월 급여를 입력하세요.(숫자만 기입)");
					int pay = scan.nextInt();
					
					Ex04_Person p  = new Ex04_Person(idNo,name);					
					Job j = new Job(job,team,pay,idNo,name);
					j.infoPrint();
					
					System.out.println("이름을 수정하시겠습니까?(y/n)");
					String ans = scan.next();					
					if(ans.equals("n")) {
						System.out.println("종료되었습니다. 수고하셨습니다.");
					}
					else if(ans.equals("y")) 
						System.out.println("수정할 이름을 입력하세요.");
					j.setName(scan.next());
					System.out.println("수정된 이름 : "+j.getName());
					j.infoPrint();
				
			}// end main

		}// end class
