import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		ComponentFunction test = new ComponentFunction("myTestFunction");
		test.varred.put("yourmom", true);
		System.out.println(test.varred.get("yourmom"));
		System.out.println(test.name);
		/* 
		HashMap<String, Object> functions = new HashMap<String, Object>();
		HashMap<String, Boolean> varred = new HashMap<String, Boolean>();
		varred.put("testVar", true);
		functions.put("name", "myMethod");
		functions.put("varred", varred);
		HashMap<String, Boolean> wtf = functions.get("varred"); */
		// System.out.println(wtf.get("testVar"));
		// System.out.println(functions.get("name"));
		// System.out.println(functions.get("varred").get("testVar"));
	}
}