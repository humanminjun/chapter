package p683;

public class MyFunctioninterface {

	public static void main(String[] args) {

		MyFunctionalInterface fi;
		
		fi = (x) ->{
			int result = x * 5;
			System.out.println(result);		      //오리지널 버전
		};
		fi.method(2);
		
		
		fi = (x) ->{System.out.println(x*5);};    // 간략화 버전
		fi.method(2);
		
		
		fi = x ->System.out.println(x*5);         //더 간략화 버전
		fi.method(2);


	}

}
