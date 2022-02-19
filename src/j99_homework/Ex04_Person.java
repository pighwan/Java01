package j99_homework;

public class Ex04_Person{
	
	private String idNo;
	private String name;		
	private int age;
	private char gender;
	
	public Ex04_Person() {// default 값
	}
	
	public Ex04_Person(String idNo, String name) {
				
		this.idNo = idNo;
			if(idNo.contains("-"))
				idNo=idNo.replaceAll("-","");
			
		this.name = name;
		
		if(idNo.charAt(6)=='1'||idNo.charAt(6)=='2') {
			age=2021-1900-(Integer.parseInt(idNo.substring(0,2)))+1;
		}
		if(idNo.charAt(6)=='3'||idNo.charAt(6)=='4') {
			age=2021-2000-(Integer.parseInt(idNo.substring(0,2)))+1;
		}
		
		if(idNo.charAt(6)=='1'||idNo.charAt(6)=='3') {
			gender = '남';
		}
		if(idNo.charAt(6)=='2'||idNo.charAt(6)=='4') {
			gender = '여';
		}
		
	}
	
	public String getIdNo() {
		return idNo.substring(0,idNo.indexOf("-"))+"-"+(idNo.substring(idNo.indexOf("-")+1))+"******";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public char getGender() {
		return gender;
	}

	void infoPrint() {
		
		System.out.println("** info");
		System.out.println("이름 : "+this.name);
		System.out.println("번호 : "+this.idNo);
		System.out.println("나이 : "+this.age+" 세");
		System.out.println("성별 : "+this.gender);
	}

	@Override
	public String toString() {
		return "Person [idNo=" + idNo + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
		
} // end person class

class Job extends Ex04_Person{
	
	private String job;
	private String team;
	private int pay;
	
	public Job() { // default 초기화
		System.out.println("default 생성자 초기화");
	}

	public Job(String job, String team, int pay,String idNo, String name) {

		super(idNo,name);
		this.job = job;
		this.team = team;
		this.pay = pay;	
	}

	public String getJob() {
		return job;
	}

	public String getteam() {
		return team;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	void infoPrint() {
		
		super.infoPrint();
		System.out.println("직업 : "+this.job);
		System.out.println("부서 : "+this.team);
		System.out.println("급여 : "+this.pay+" 만원");
		
	}

	@Override
	public String toString() {
		return "Job [job=" + job + ", position=" + team + ", pay=" + pay + "]";
	}
	
} // end job class


