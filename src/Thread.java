import java.sql.Time;

public class Thread {

	int threadID;
	String title;
	String text;
	Time time;
	int voteNum;
	boolean isLocked;
	String topicName;
	String posterName;

	public Thread(int threadID, String title, String text, Time time, int voteNum, boolean isLocked, String topicName, String posterName) {
		this.threadID = threadID;
		this.title = title;
		this.text = text;
		this.time = time;
		this.voteNum = voteNum;
		this.isLocked = isLocked;
		this.topicName = topicName;
		this.posterName = posterName;
	}

	public String toString() {
		return "ThreadObject: " + this.title + " & votecount: " + Integer.toString(this.voteNum);
	}

	/*
	 * Returns true if a thread is locked
	 */
	public boolean isThreadLocked(String threadID) throws SQLException {
		Statement stmt = this.connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT isLockedFlag FROM Thread WHERE ThreadID = '"+threadID+"'");

	  int flag = rs.getInt(6);
		if (flag == 1) return true;
		return false;
	}
}
