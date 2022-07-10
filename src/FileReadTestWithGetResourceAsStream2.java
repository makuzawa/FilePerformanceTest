import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.jar.JarFile;

public class FileReadTestWithGetResourceAsStream2 implements FileReadTestInterface{

	@Override
	public ProcessTime read() {
		long streamTime=0;
		long startTime = System.nanoTime();
		long readTime=0;
		ProcessTime time = null;
		
		JarFile jar;
		try {
			jar = new JarFile("test.jar");
			jar.getInputStream(jar.getEntry("test.xml"));
			InputStream in = FileReadTest.class.getResourceAsStream("test.xml");
			streamTime = System.nanoTime();
			readTime = readWithInputStreamReader(new InputStreamReader(in));

			long endTime = System.nanoTime();
			
			time = new ProcessTime(streamTime-startTime,readTime,endTime-startTime);
//			Enumeration files = jar.entries();
//			while (files.hasMoreElements()) {
//			    ZipEntry entry = (ZipEntry)files.nextElement();
//			 
//			    // entryを使ってJARファイルに格納されたディレクトリやファイルにアクセス
//			    System.out.println(entry);
//			    
//			    InputStream is = jar.getInputStream(entry);
//			    
//			    
//			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		
		return time;
	}

}
