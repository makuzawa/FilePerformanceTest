import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FileReadTestWithURLStream implements FileReadTestInterface {

	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;

		try {
			FileInputStream fis = new FileInputStream(new File("test.xml"));
			URL url = new URL("jar:file:/E:/MASAO/work/develop/pleiades-2020-09-platform-win-64bit-jre_20200920/pleiades/workspace/FilePerformanceTest/test.jar!/test.xml");
			
			streamTime = System.nanoTime();

			readTime = readWithInputStreamReader(new InputStreamReader(url.openStream()));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		ProcessTime time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
		return time;
	}

}
