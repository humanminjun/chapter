package lamda0530;

public class Execute {
	 public static void main(String[] args) {
	        //��ü ����
	        JavaCoding jc;

	        //{} �����ڵ� �ڿ� �����ݷ�(;)�� �ٿ����Ѵ�
	        jc = () -> {
	            System.out.println("Rollin' Rollin' Rollin' Rollin'");
	        };
	        jc.nowCoding();

	        // {} �����ڵ尡 1���ΰ�� {} ��������
	        jc = () -> System.out.println("Rollin' Rollin' Rollin' Rollin'");
	        jc.nowCoding();
	    }
	}                                                                                                                                                                                                                                                                                                                                                                                        