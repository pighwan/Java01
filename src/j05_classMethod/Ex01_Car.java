package j05_classMethod;

//** 클래스에 포함 가능한것 (맴버)
//=> 속성(변수), 기능(메서드)
//=> 맴버변수(전역변수), 맴버메서드 

//** 클래스명
//=> 대문자로 시작, 예약어 사용불가 , API 라이브러리의 클래스명 비추
//=> 클래스는 객체의 설계도

//** 객체의 주기
//=> 생성 -> 사용 -> 소멸  (in Memory)
//=> 클래스(in HDD) -> 생성(in Memory) -> 객체화 (인스턴스 생성)
//   -> 사용 -> 소멸(Memory 반납)

//** 클래스, 객체, 인스턴스(instance : 사례, 경우) 
//클래스와 인스턴스는 설계도와 제품이라고 할수있다.
//그럼 객체는 클래스일까 인스턴스일까? 
//다소 논란이 있지만 일반적으로 설계도인 클래스가
//구체적인 실체인 인스턴스가 되었을 때 객체라고 부른다. 

//보통은 구체적인 코드상에서 나타는 객체를 인스턴스라고 부르고, 
//로직을 설계 할 때 나타나는 인스턴스를 객체라고 부른다. 
//그러므로 클래스와 인스턴스는 구별되고, 클래스와 객체도 구별되지만, 
//객체와 인스턴스는 구분없이 포괄적으로 객체라는 말을 쓰기도 한다.

public class Ex01_Car {
	
	// ** 맴버변수, 필드(field) : 속성 
	// => 클래스의 전역변수
	//    클래스내에서는 모든 메서드에서 사용가능
	public int speed; // 속도
	public int mileage; // 주행거리
	public String color; // 색상
	int t = 1000;
	// color="red" ; => 실행문은 맴버가 될수없음.
	
	// ** 맴버 메서드 (function, procedure)
	// => 동작 또는 기능을 구현
	public void speedUp() { // 속도 증가 메소드
		int t = 100;  // 지역변수 우선
		speed += 10+t+this.t;  // speed += 110;  this.t -> 전역(맴버)변수 t
	}
	public void speedDown() { // 속도 감소 메소드
		speed -= 10+t;  // 맴버변수 t 적용
	}
	public String toString2() { // 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + " 주행거리: " + mileage + " 색상: " + color;
	}
} //class
