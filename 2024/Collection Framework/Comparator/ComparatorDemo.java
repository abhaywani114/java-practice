import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

class MyComp implements Comparator<String> {
	public int compare(String a, String b) {
		return a.substring(0, a.indexOf(' ')).compareTo(b.substring(0, b.indexOf(' ')));
	}
}

class ComparatorDemo {
	public static void main(String[] argv) {
		TreeMap<String, String> bankBalance = new TreeMap<String, String>(new MyComp());
		bankBalance.put("Abrar Ajaz", "100 USD");
		bankBalance.put("Zara Ab***", "100000 USD");

		for(Map.Entry<String,String> i : bankBalance.entrySet()) {
			System.out.println("User: " + i.getKey());
			System.out.println("Balance: " + i.getValue());
			System.out.println();
		}

	}
}
