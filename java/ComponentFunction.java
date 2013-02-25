import java.util.HashMap;

public class ComponentFunction {
	public HashMap<String, Boolean> varred;
	public HashMap<String, Boolean> unvarred;
	public String name;

	public ComponentFunction(String myName) {
		varred = new HashMap<String, Boolean>();
		unvarred = new HashMap<String, Boolean>();
		name = myName;

		varred.put("application", true);
		varred.put("session", true);
		varred.put("request", true);
		varred.put("this", true);
		varred.put("variables", true);
		varred.put("arguments", true);
		varred.put("local", true);
	}
	
	public boolean hasUnvarred() {
		return unvarred.size() > 0 ? true : false;
	}
}