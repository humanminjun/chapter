package p290;

public class DmbCellPhone extends Cellphone{
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "��DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+ this.channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}