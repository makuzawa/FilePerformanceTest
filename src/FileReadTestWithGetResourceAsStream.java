import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReadTestWithGetResourceAsStream implements FileReadTestInterface{

	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;

		InputStream in = FileReadTest.class.getResourceAsStream("test.xml");
		streamTime = System.nanoTime();
		readTime = readWithInputStreamReader(new InputStreamReader(in));

		long endTime = System.nanoTime();
		
		ProcessTime time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
		return time;
	}

}
