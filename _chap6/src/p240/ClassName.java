package p240;

public class ClassName {
    
	 //�ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1() {}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	//���� ���
	static {
		field1 = 10;    // (x)
		method1();      // (x)
		field2 = 10;    // (o)
		method2();      // (o)
	}
	//���� �޼ҵ�
	static void Method3 (){
    	this.field1 = 10; // (x)
		this.method1();   // (x)
		field2 = 10;      // (o)
		method2();        // (o)
	}
}
