package p1026;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C://Temp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났씁니다.");

	}

}
