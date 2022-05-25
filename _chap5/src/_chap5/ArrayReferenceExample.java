package _chap5;

public class ArrayReferenceExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]); // ==주소를 비교
		System.out.println(strArray[0].equals(strArray[2]) ); // .equals는 내용을 비교
	}

}
