package p314;


public class Tire {
	//필드
	public int maxRotation;
	public int accmulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " Tire수명: "+(maxRotation-accmulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
