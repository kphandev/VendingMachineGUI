package techelevator;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Main extends JPanel {

	Snacks snacks = new Snacks();
	SnackStock snackStock = new SnackStock();
	UserMoney userMoney = new UserMoney();
	PurchaseLog purchaseLog = new PurchaseLog();

	//	//	//	//	//	//	//	//	//	//

	private Map<Integer, String> snackBag = new HashMap<Integer, String>();

	public Map<Integer, String> getSnackBag() {
		return snackBag;
	}

	public String getSnackFromBag(int i) {
		String result = "";
		result = snackBag.get(i);
		return result;
	}

	public void eatSnackFromBag(int i) {
		snackBag.remove(i);
	}

	public Map<Integer, String> addSnackBag(String input) {
		snackBag.put(snackBag.size(), input);
		return snackBag;
	}

	public void clearSnackBag() {
		for (int i2 = 1; i2 <= 10; i2++) {
			snackBag.remove(i2);
		}
		snackBag.put(0, "holder");
		System.out.println(snackBag);
	}

	//	//	//	//	//	//	//	//	//	//
	
	private Map<Integer, String> snackTypes = new HashMap<Integer, String>();

	public Map<Integer, String> getSnackType() {
		return snackTypes;
	}

	public String getSnackTypesBag(int i) {
		String result = "";
		result = snackTypes.get(i);
		return result;
	}

	public void eatSnackTypesFromBag(int i) {
		snackTypes.remove(i);
	}

	public void clearSnackTypes() {
		for (int i2 = 1; i2 <= 10; i2++) {
			snackTypes.remove(i2);
		}
		snackTypes.put(0, "holder");
		System.out.println(snackTypes);
	}

	public Map<Integer, String> addSnackTypesBag(String input) {
		snackTypes.put(snackTypes.size(), input);
		return snackTypes;
	}

	//	//	//	//	//	//	//	//	//	//

	Main() {
		snacks.snackExtract("A1");
		snackStock.snackStock(snacks.getAllSnacks(), 5);
		snackBag.put(0, "Holder");
		snackTypes.put(0, "Holder");
	}

	public static void main(String args[]) {
		new Main();
		UserDisplay ui = new UserDisplay();
		ui.display();
	}

	public Snacks getSnacks() {
		return snacks;
	}

	public SnackStock getSnackStock() {
		return snackStock;
	}

}
