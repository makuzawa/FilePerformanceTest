import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadTestWithStringReader implements FileReadTestInterface {
	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;

		try {
			
			Path path = Paths.get("./test.xml");
			byte[] file = Files.readAllBytes(path);
			String in = new String(file);
			streamTime = System.nanoTime();

			readTime = readWithInputStreamReader(new StringReader(in));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		
		ProcessTime time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
		return time;
	}
}
