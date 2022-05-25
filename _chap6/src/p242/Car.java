package p242;

public class Car {
    
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	
	public static void main(String[]args) {   //static 을 쓰지않으면 오류
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
