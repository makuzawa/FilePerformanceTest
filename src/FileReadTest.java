public class FileReadTest {

	
	public static void calculate(FileReadTestInterface frti) {
		System.out.println(frti.getClass().getName());
		//ArrayList<ProcessTime> timeList = new ArrayList<ProcessTime>();
		long streamTime=0;
		long readTime=0;
		long processTime = 0;
		int count=100;
		
		for(int i=0;i<count;i++) {
			ProcessTime time = frti.read();
			streamTime += time.streamTime;
			readTime +=time.readTime;
			processTime += time.processTime;
			
		}
		
		System.out.println("stream取得時間：" + streamTime/count + " ナノ秒");
		System.out.println("read時間：" + readTime/count + " ナノ秒");
		System.out.println("処理時間：" + processTime/count + " ナノ秒");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		calculate(new FileReadTestWithGetResourceAsStream());
		calculate(new FileReadTestWithFileInputStream());
		calculate(new FileReadTestWithStringReader());
		calculate(new FileReadTestWithByteArrayInputStream());
		calculate(new FileReadTestWithGetResourceAsStream2());
		calculate(new FileReadTestWithURLStream());
	}


}
