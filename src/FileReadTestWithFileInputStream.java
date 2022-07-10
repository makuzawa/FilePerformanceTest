import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadTestWithFileInputStream implements FileReadTestInterface {

	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;

		try {
			FileInputStream fis = new FileInputStream(new File("test.xml"));
			streamTime = System.nanoTime();

			readTime = readWithInputStreamReader(new InputStreamReader(fis));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		ProcessTime time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
		return time;
	}

}
