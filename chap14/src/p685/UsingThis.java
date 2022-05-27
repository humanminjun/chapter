package p685;

class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerFiled = 20;
		
		void method() {
			//¶÷´Ù½Ä
			MyFunctionalInterface fi = () -> {
				System.out.println("outeerField:" + outterField);
				System.out.println("outeerField:" + UsingThis.this.outterField + "\n");
			
				System.out.println("innerField:" + innerFiled);
				System.out.println("innerField:" + this.innerFiled + "\n");
			
			};
			fi.method();
		}
	}
}
