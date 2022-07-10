import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadTestWithByteArrayInputStream implements FileReadTestInterface{
	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;

		try {
			//ByteArrayInputStream fis = new FileInputStream(new File("test.xml"));
			Path path = Paths.get("./test.xml");
			//System.out.println(Files.size(path));
			byte[] file = Files.readAllBytes(path);
			//String in = new String(file);

			ByteArrayInputStream bis = new ByteArrayInputStream(file);
			streamTime = System.nanoTime();
			readTime = readWithInputStreamReader(new InputStreamReader(bis));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		
		ProcessTime time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
		return time;
	}
}
