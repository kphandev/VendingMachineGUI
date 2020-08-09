package techelevator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snacks {

	private String snackID;
	private String snackName;
	private String snackPrice;
	private String snackType;
	private List<String> allSnacks = new ArrayList<String>();
	private List<String> allSnacksPrices = new ArrayList<String>();
	int j;
	
	// // //

	StringBuilder result = new StringBuilder();
	String holder = "";
	
	String path = "vendingmachine.txt";
	File inputFile = new File(path);

// wtf are these array sizes, was I drunk?
	String[] snack = new String[1];
	String[] snackValues = new String[4];
 
	public String snackSplitter() throws FileNotFoundException {
		Scanner scan = new Scanner(inputFile);
		while (scan.hasNextLine()) {
			holder = scan.nextLine();
			result.append("\n" + holder);
		}
		return result.toString();
	}

	public void snackExtract(String userID) {
		try {
			snackSplitter();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// splits lines into each snack
		this.snack = result.toString().split("\\\n");
		// cycles thru each snack for ID
		for (int i = 1; i <= 16; i++) {
			snackValues = snack[i].split("\\|");
			snackID = snackValues[0];
			snackPrice = snackValues[2];
			allSnacks.add(snackID);
			allSnacksPrices.add(snackPrice);
			if (snackID.equals(userID)) {
				j = i;
			}
		}
		snackValues = snack[j].split("\\|");
		snackID = snackValues[0];
		snackName = snackValues[1];
		snackPrice = snackValues[2];
		snackType = snackValues[3];
	}

	public String getSnackID() {
		return snackID;
	}

	public String getSnackName() {
		return snackName;
	}

	public String getSnackPrice() {
		return snackPrice;
	}

	public String getSnackType() {
		return snackType;
	}

	public List<String> getAllSnacks() {
		return allSnacks;
	}
	public List<String> getAllSnacksPrices() {
		return allSnacksPrices;
	}
}
