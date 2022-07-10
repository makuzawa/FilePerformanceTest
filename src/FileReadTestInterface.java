import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public interface FileReadTestInterface {
	public ProcessTime read();
	
	default public long readWithInputStreamReader(Reader in) {
		long startTime = System.nanoTime();
		BufferedReader br =
				// InputStreamReaderでstreamを文字列として読み込む
				new BufferedReader(in);
		String str;
		try {
			while((str = br.readLine()) != null){
				//System.out.println(str);

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		//System.out.println("read時間：" + (endTime - startTime) + " ナノ秒");
		
		return endTime - startTime;
	}
	

	
}
