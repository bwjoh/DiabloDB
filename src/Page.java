import java.util.ArrayList;

public class Page {
	
	String topicName;
	ArrayList<Thread> threads;
	String posterName;
	
	public Page(String topicName, String posterName) {
		this.topicName = topicName;
		this.threads = new ArrayList<Thread>();
		this.posterName = posterName;
	}
	

}
