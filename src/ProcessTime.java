
public class ProcessTime {
	public long streamTime = 0;
	public ProcessTime(long streamTime, long readTime, long processTime) {
		super();
		this.streamTime = streamTime;
		this.readTime = readTime;
		this.processTime = processTime;
	}
	public long readTime = 0;
	public long processTime = 0;
}
