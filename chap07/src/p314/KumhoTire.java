package p314;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " Tire¼ö¸í: "+(maxRotation-accmulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "Tire ÆãÅ© ***");
			return false;

		}
	}
}
