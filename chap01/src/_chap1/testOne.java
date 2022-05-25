package _chap1;

public class testOne {

	public static void main(String[] args) {

		int i = 0;
		
		while(true) {
			
			i++;
			
			if(i%5!=0) continue;
			
			System.out.println("i="+i);
		
			if(i>=100)  break;
				
			
		}

	}

}
