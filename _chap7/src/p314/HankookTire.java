package p314;

public class HankookTire extends Tire {
	//�ʵ�
	//������
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " Tire����: "+(maxRotation-accmulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;

		}
	}
	
}