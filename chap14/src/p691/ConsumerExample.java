package p691;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
	
		Consumer<Integer> comsumer = t -> System.err.println(t + "8");
		
		Consumer.accept("5");
		
	}

}
