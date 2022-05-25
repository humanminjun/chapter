package p240;

public class ClassName {
    
	 //인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//정적 블록
	static {
		field1 = 10;    // (x)
		method1();      // (x)
		field2 = 10;    // (o)
		method2();      // (o)
	}
	//정적 메소드
	static void Method3 (){
    	this.field1 = 10; // (x)
		this.method1();   // (x)
		field2 = 10;      // (o)
		method2();        // (o)
	}
}
