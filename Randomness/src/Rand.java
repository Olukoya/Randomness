import java.util.ArrayList;
import java.util.List;

public class Rand {

	@SuppressWarnings("unused")
	private String response, question,history, answer;
	List<String>thequestion = new ArrayList<String> ();
	List<String>theanswer = new ArrayList<String> ();

	public Rand ()
	{
		response = "";
		question = "";
		answer = "";
		history = "";
	}
	
	public void setHistory (String history)
	{
		this.history = history;
	}
	
	public String getHistory ()
	{
		return history;
	}
	
	public void setResponse (String response)
	{
		this.response = response;
	}
	
	public List<String> getThequestion() {
		return thequestion;
	}

	public void setThequestion(List<String> thequestion) {
		this.thequestion = thequestion;
	}

	public List<String> getTheanswer() {
		return theanswer;
	}

	public void setTheanswer(List<String> theanswer) {
		this.theanswer = theanswer;
	}

	public String getResponse ()
	{
		return response;
	}
	
}
