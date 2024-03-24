import java.util.HashMap;
import java.util.Map;


class HashMapDemo {
	public static void main(String[] argv) {
			HashMap<String, String> countryCurrency = new HashMap<String, String>();
			countryCurrency.put("USA", "Dollar");
			countryCurrency.put("India", "Rupee");
			countryCurrency.put("England", "Pound");

			System.out.println("USA's currency is: " + countryCurrency.get("USA"));

			System.out.println("Traversing all currencies");
			for(Map.Entry<String, String> e : countryCurrency.entrySet())
				System.out.println("Country: " + e.getKey() + " Currency: " + e.getValue());

	}
}
