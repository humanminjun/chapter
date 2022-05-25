//변수의 사용범위
package chap2;

public class chap02 {

	  public static void main(String[]args) {
		  
		  int v1 = 5;
		  int v2 = 20;
		  if (v1>10) {
			   v2 = v1 - 10;
		  }
		  
		  int v3 = v1 + v2 + 5;
		  
		  System.out.println("v3="+v3);
	  }
}

