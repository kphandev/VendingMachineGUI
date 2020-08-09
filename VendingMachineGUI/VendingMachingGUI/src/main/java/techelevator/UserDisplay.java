package techelevator;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserDisplay implements ActionListener {
	ChangeMaker changeMaker = new ChangeMaker();
	Main main = new Main();

	JButton bA = new JButton("A");
	JButton bB = new JButton("B");
	JButton bC = new JButton("C");
	JButton bD = new JButton("D");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bE = new JButton("ENTER");
	JButton bU = new JButton("C / CE");
	JButton confirmMoney = new JButton("ADD CASH");
	JButton finishTransaction = new JButton("FINISH TRANSACTION");

	JButton gotSnack1 = new JButton("");
	JButton gotSnack2 = new JButton("");
	JButton gotSnack3 = new JButton("");
	JButton gotSnack4 = new JButton("");
	JButton gotSnack5 = new JButton("");
	JButton gotSnack6 = new JButton("");
	JButton gotSnack7 = new JButton("");
	JButton gotSnack8 = new JButton("");
	JButton gotSnack9 = new JButton("");

//	CHANGE DISPENSE

	JPanel coins = new JPanel(new GridLayout(4, 1));
	JPanel changeBorder = new JPanel(new CardLayout(10, 10));
	JLabel change = new JLabel("CHANGE: ");
	JPanel quartersBorder = new JPanel(new CardLayout(10, 10));
	JLabel quarters = new JLabel("QUARTERS: ");
	JPanel dimesBorder = new JPanel(new CardLayout(10, 10));
	JLabel dimes = new JLabel("DIMES: ");
	JPanel nickelsBorder = new JPanel(new CardLayout(10, 10));
	JLabel nickels = new JLabel("NICKELS: ");

	// FIRST DISPLAY

	JPanel snackbox1 = new JPanel();
	JPanel snackbox2 = new JPanel();
	JPanel snackbox3 = new JPanel();
	JPanel snackbox4 = new JPanel();
	JPanel snackbox5 = new JPanel();
	JPanel snackbox6 = new JPanel();
	JPanel snackbox7 = new JPanel();
	JPanel snackbox8 = new JPanel();

	// SECOND DISPLAY

	JPanel snackbox9 = new JPanel();
	JPanel snackbox10 = new JPanel();
	JPanel snackbox11 = new JPanel();
	JPanel snackbox12 = new JPanel();
	JPanel snackbox13 = new JPanel();
	JPanel snackbox14 = new JPanel();
	JPanel snackbox15 = new JPanel();
	JPanel snackbox16 = new JPanel();

	JLabel displayCode = new JLabel(">> ENTER A SNACK ID <<");
	JLabel displayMoney = new JLabel(">> BALANCE: $0.00 <<");

	String dollars[] = { "INSERT MONEY", "+$1", "+$2", "+$5", "+$10" };

	@SuppressWarnings({ "rawtypes", "unchecked" })
	JComboBox insertMoney = new JComboBox(dollars);

	private StringBuilder userInput = new StringBuilder();

	// FIRST DISPLAY PANEL LABELS

	JLabel i1Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(0) + "---" + main.snacks.getAllSnacksPrices().get(0) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(0)) + ")---");
	JLabel i2Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(1) + "---" + main.snacks.getAllSnacksPrices().get(1) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(1)) + ")---");
	JLabel i3Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(2) + "---" + main.snacks.getAllSnacksPrices().get(2) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(2)) + ")---");
	JLabel i4Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(3) + "---" + main.snacks.getAllSnacksPrices().get(3) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(3)) + ")---");
	JLabel i5Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(4) + "---" + main.snacks.getAllSnacksPrices().get(4) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(4)) + ")---");
	JLabel i6Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(5) + "---" + main.snacks.getAllSnacksPrices().get(5) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(5)) + ")---");
	JLabel i7Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(6) + "---" + main.snacks.getAllSnacksPrices().get(6) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(6)) + ")---");
	JLabel i8Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(7) + "---" + main.snacks.getAllSnacksPrices().get(7) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(7)) + ")---");

	// SECOND DISPLAY LABELS

	JLabel i9Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(8) + "---" + main.snacks.getAllSnacksPrices().get(8) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(8)) + ")---");
	JLabel i10Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(9) + "---" + main.snacks.getAllSnacksPrices().get(9) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(9)) + ")---");
	JLabel i11Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(10) + "---" + main.snacks.getAllSnacksPrices().get(10) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(10)) + ")---");
	JLabel i12Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(11) + "---" + main.snacks.getAllSnacksPrices().get(11) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(11)) + ")---");
	JLabel i13Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(12) + "---" + main.snacks.getAllSnacksPrices().get(12) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(12)) + ")---");
	JLabel i14Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(13) + "---" + main.snacks.getAllSnacksPrices().get(13) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(13)) + ")---");
	JLabel i15Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(14) + "---" + main.snacks.getAllSnacksPrices().get(14) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(14)) + ")---");
	JLabel i16Label = new JLabel(
			"---" + main.snacks.getAllSnacks().get(15) + "---" + main.snacks.getAllSnacksPrices().get(15) + "---("
					+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(15)) + ")---");

	public void display() {
		JFrame f = new JFrame("VENDING MACHINE KP3000");
		JPanel body = new JPanel(new GridLayout(3, 1));

//Color randomizer

		List<Color> colors = new ArrayList<Color>();
		colors.add(Color.CYAN);
		colors.add(Color.CYAN);
		colors.add(Color.YELLOW);
		colors.add(Color.YELLOW);
		colors.add(Color.YELLOW);
		colors.add(Color.ORANGE);
		colors.add(Color.ORANGE);
		colors.add(Color.ORANGE);
		colors.add(Color.PINK);
		colors.add(Color.PINK);
		colors.add(Color.RED);
		colors.add(Color.lightGray);

		body.setBounds(50, 50, 675, 800);
		body.setBackground(Color.GRAY);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===	

		JPanel snacksBought = new JPanel(new GridLayout(10, 1));
		JPanel center = new JPanel(new CardLayout(10, 10));
		JLabel listTitle = new JLabel("INVENTORY");

		snacksBought.add(center);
		center.add(listTitle);
		snacksBought.add(gotSnack1);
		snacksBought.add(gotSnack2);
		snacksBought.add(gotSnack3);
		snacksBought.add(gotSnack4);
		snacksBought.add(gotSnack5);
		snacksBought.add(gotSnack6);
		snacksBought.add(gotSnack7);
		snacksBought.add(gotSnack8);
		snacksBought.add(gotSnack9);

		snacksBought.setBounds(750, 50, 200, 530);
		center.setBackground(Color.LIGHT_GRAY);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===	

		f.add(coins);
		coins.setBounds(750, 600, 200, 250);

		coins.add(changeBorder);
		coins.add(quartersBorder);
		coins.add(dimesBorder);
		coins.add(nickelsBorder);

		changeBorder.add(change);
		quartersBorder.add(quarters);
		dimesBorder.add(dimes);
		nickelsBorder.add(nickels);

		changeBorder.setBackground(Color.lightGray);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===	

		JPanel box1 = new JPanel(new CardLayout(30, 30));
		JPanel displayA = new JPanel(new GridLayout(2, 4));

//	probably could've made a for loop to randomize the colors...

		double random = (double) (Math.random() * 10);
		int rounded = (int) Math.round(random);
		snackbox1.setBackground(colors.get(rounded));

		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox2.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox3.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox4.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox5.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox6.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox7.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox8.setBackground(colors.get(rounded));

		box1.setBackground(Color.BLACK);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===			

		JPanel box2 = new JPanel(new CardLayout(30, 10));
		JPanel displayB = new JPanel(new GridLayout(2, 4));

		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox9.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox10.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox11.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox12.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox13.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox14.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox15.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);
		snackbox16.setBackground(colors.get(rounded));
		random = (double) (Math.random() * 10);
		rounded = (int) Math.round(random);

		box2.setBackground(Color.BLACK);
		displayB.setBackground(Color.LIGHT_GRAY);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===	

		JPanel box3 = new JPanel(new GridLayout(1, 2));

		JPanel moneyUI = new JPanel(new CardLayout(15, 15));
		JPanel moneyInsert = new JPanel(new GridLayout(1, 2));
		JPanel money = new JPanel(new GridLayout(4, 1));

		JPanel numpadUI = new JPanel(new CardLayout(15, 15));
		JPanel numpad = new JPanel(new GridLayout(4, 4));

		moneyUI.setBackground(Color.black);
		numpadUI.setBackground(Color.black);
		numpad.setBackground(Color.black);

//		===	===	===	===	===	//	===	===	===	===	===	//	===	===	===	===	===	

		JPanel borderA = new JPanel(new CardLayout(10, 10));
		JPanel borderB = new JPanel(new CardLayout(10, 10));

		f.add(body);
		f.add(snacksBought);
		body.add(box1);
		body.add(box2);
		body.add(box3);

		box1.add(displayA);
		borderA.setBackground(Color.lightGray);

//		EACH SNACK IN THE DISPLAY A	//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(0));
		JPanel slot1 = new JPanel(new GridLayout(2, 1));
		JLabel item1Name = new JLabel(main.snacks.getSnackName());
		JPanel item1border = new JPanel(new CardLayout(3, 3));
		JPanel label1border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot1);

		slot1.add(item1border);
		item1border.add(snackbox1);

		slot1.add(label1border);
		label1border.add(i1Label);

		snackbox1.add(item1Name);

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(1));
		JPanel slot2 = new JPanel(new GridLayout(2, 1));
		JLabel item2Name = new JLabel(main.snacks.getSnackName());
		JPanel item2border = new JPanel(new CardLayout(3, 3));
		JPanel label2border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot2);

		slot2.add(item2border);
		item2border.add(snackbox2);

		slot2.add(label2border);
		label2border.add(i2Label);

		snackbox2.add(item2Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(2));
		JPanel slot3 = new JPanel(new GridLayout(2, 1));
		JLabel item3Name = new JLabel(main.snacks.getSnackName());
		JPanel item3border = new JPanel(new CardLayout(3, 3));
		JPanel label3border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot3);

		slot3.add(item3border);
		item3border.add(snackbox3);

		slot3.add(label3border);
		label3border.add(i3Label);

		snackbox3.add(item3Name);

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(3));
		JPanel slot4 = new JPanel(new GridLayout(2, 1));
		JLabel item4Name = new JLabel(main.snacks.getSnackName());
		JPanel item4border = new JPanel(new CardLayout(3, 3));
		JPanel label4border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot4);

		slot4.add(item4border);
		item4border.add(snackbox4);

		slot4.add(label4border);
		label4border.add(i4Label);

		snackbox4.add(item4Name);

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(4));
		JPanel slot5 = new JPanel(new GridLayout(2, 1));
		JLabel item5Name = new JLabel(main.snacks.getSnackName());
		JPanel item5border = new JPanel(new CardLayout(3, 3));
		JPanel label5border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot5);

		slot5.add(item5border);
		item5border.add(snackbox5);

		slot5.add(label5border);
		label5border.add(i5Label);

		snackbox5.add(item5Name);

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(5));
		JPanel slot6 = new JPanel(new GridLayout(2, 1));
		JLabel item6Name = new JLabel(main.snacks.getSnackName());
		JPanel item6border = new JPanel(new CardLayout(3, 3));
		JPanel label6border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot6);

		slot6.add(item6border);
		item6border.add(snackbox6);

		slot6.add(label6border);
		label6border.add(i6Label);

		snackbox6.add(item6Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(6));
		JPanel slot7 = new JPanel(new GridLayout(2, 1));
		JLabel item7Name = new JLabel(main.snacks.getSnackName());
		JPanel item7border = new JPanel(new CardLayout(3, 3));
		JPanel label7border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot7);

		slot7.add(item7border);
		item7border.add(snackbox7);

		slot7.add(label7border);
		label7border.add(i7Label);

		snackbox7.add(item7Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(7));
		JPanel slot8 = new JPanel(new GridLayout(2, 1));
		JLabel item8Name = new JLabel(main.snacks.getSnackName());
		JPanel item8border = new JPanel(new CardLayout(3, 3));
		JPanel label8border = new JPanel(new CardLayout(3, 3));

		displayA.add(slot8);

		slot8.add(item8border);
		item8border.add(snackbox8);

		slot8.add(label8border);
		label8border.add(i8Label);

		snackbox8.add(item8Name);

//		//

//EACH SNACK IN THE DISPLAY B	//

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(8));
		JPanel slot9 = new JPanel(new GridLayout(2, 1));
		JLabel item9Name = new JLabel(main.snacks.getSnackName());
		JPanel item9border = new JPanel(new CardLayout(3, 3));
		JPanel label9border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot9);

		slot9.add(item9border);
		item9border.add(snackbox9);

		slot9.add(label9border);
		label9border.add(i9Label);

		snackbox9.add(item9Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(9));
		JPanel slot10 = new JPanel(new GridLayout(2, 1));
		JLabel item10Name = new JLabel(main.snacks.getSnackName());
		JPanel item10border = new JPanel(new CardLayout(3, 3));
		JPanel label10border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot10);

		slot10.add(item10border);
		item10border.add(snackbox10);

		slot10.add(label10border);
		label10border.add(i10Label);

		snackbox10.add(item10Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(10));
		JPanel slot11 = new JPanel(new GridLayout(2, 1));
		JLabel item11Name = new JLabel(main.snacks.getSnackName());
		JPanel item11border = new JPanel(new CardLayout(3, 3));
		JPanel label11border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot11);

		slot11.add(item11border);
		item11border.add(snackbox11);

		slot11.add(label11border);
		label11border.add(i11Label);

		snackbox11.add(item11Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(11));
		JPanel slot12 = new JPanel(new GridLayout(2, 1));
		JLabel item12Name = new JLabel(main.snacks.getSnackName());
		JPanel item12border = new JPanel(new CardLayout(3, 3));
		JPanel label12border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot12);

		slot12.add(item12border);
		item12border.add(snackbox12);

		slot12.add(label12border);
		label12border.add(i12Label);

		snackbox12.add(item12Name);

//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(12));
		JPanel slot13 = new JPanel(new GridLayout(2, 1));
		JLabel item13Name = new JLabel(main.snacks.getSnackName());
		JPanel item13border = new JPanel(new CardLayout(3, 3));
		JPanel label13border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot13);

		slot13.add(item13border);
		item13border.add(snackbox13);

		slot13.add(label13border);
		label13border.add(i13Label);

		snackbox13.add(item13Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(13));
		JPanel slot14 = new JPanel(new GridLayout(2, 1));
		JLabel item14Name = new JLabel(main.snacks.getSnackName());
		JPanel item14border = new JPanel(new CardLayout(3, 3));
		JPanel label14border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot14);

		slot14.add(item14border);
		item14border.add(snackbox14);

		slot14.add(label14border);
		label14border.add(i14Label);

		snackbox14.add(item14Name);

//		//
		main.snacks.snackExtract(main.snacks.getAllSnacks().get(14));
		JPanel slot15 = new JPanel(new GridLayout(2, 1));
		JLabel item15Name = new JLabel(main.snacks.getSnackName());
		JPanel item15border = new JPanel(new CardLayout(3, 3));
		JPanel label15border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot15);

		slot15.add(item15border);
		item15border.add(snackbox15);

		slot15.add(label15border);
		label15border.add(i15Label);

		snackbox15.add(item15Name);

//		//		//

		main.snacks.snackExtract(main.snacks.getAllSnacks().get(15));
		JPanel slot16 = new JPanel(new GridLayout(2, 1));
		JLabel item16Name = new JLabel(main.snacks.getSnackName());
		JPanel item16border = new JPanel(new CardLayout(3, 3));
		JPanel label16border = new JPanel(new CardLayout(3, 3));

		displayB.add(slot16);

		slot16.add(item16border);
		item16border.add(snackbox16);

		slot16.add(label16border);
		label16border.add(i16Label);

		snackbox16.add(item16Name);

//		//		//

		box2.add(displayB);
		box3.add(numpadUI);
		numpadUI.add(numpad);
		box3.add(moneyUI);
		moneyUI.add(money);
		money.add(borderA);

		borderA.add(displayCode);
		money.add(borderB);
		borderB.add(displayMoney);

		money.add(moneyInsert);
		moneyInsert.add(insertMoney);
		moneyInsert.add(confirmMoney);
		money.add(finishTransaction);

		numpad.add(bA);
		bA.addActionListener(this);
		numpad.add(b1);
		b1.addActionListener(this);
		numpad.add(b2);
		b2.addActionListener(this);
		numpad.add(b3);
		b3.addActionListener(this);

		numpad.add(bB);
		bB.addActionListener(this);
		numpad.add(b4);
		b4.addActionListener(this);
		numpad.add(b5);
		b5.addActionListener(this);
		numpad.add(b6);
		b6.addActionListener(this);

		numpad.add(bC);
		bC.addActionListener(this);
		numpad.add(b7);
		b7.addActionListener(this);
		numpad.add(b8);
		b8.addActionListener(this);
		numpad.add(b9);
		b9.addActionListener(this);

		numpad.add(bD);
		bD.addActionListener(this);
		numpad.add(bU);
		bU.addActionListener(this);
		numpad.add(b0);
		b0.addActionListener(this);
		numpad.add(bE);
		bE.addActionListener(this);

		gotSnack1.addActionListener(this);
		gotSnack2.addActionListener(this);
		gotSnack3.addActionListener(this);
		gotSnack4.addActionListener(this);
		gotSnack5.addActionListener(this);
		gotSnack6.addActionListener(this);
		gotSnack7.addActionListener(this);
		gotSnack8.addActionListener(this);
		gotSnack9.addActionListener(this);
		finishTransaction.addActionListener(this);

		gotSnack1.setEnabled(false);
		gotSnack2.setEnabled(false);
		gotSnack3.setEnabled(false);
		gotSnack4.setEnabled(false);
		gotSnack5.setEnabled(false);
		gotSnack6.setEnabled(false);
		gotSnack7.setEnabled(false);
		gotSnack8.setEnabled(false);
		gotSnack9.setEnabled(false);
		finishTransaction.setEnabled(false);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 950);
		f.setBackground(Color.blue);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);

		confirmMoney.addActionListener(this);
	}

	//

	// BUTTON ACTIONS

	//

	public void actionPerformed(ActionEvent e) {

		// Letter buttons //
		if (userInput.length() < 1) {
			if (e.getSource() == bA) {
				userInput.append("A");
				System.out.println(userInput);
			}
			if (e.getSource() == bB) {
				userInput.append("B");
				System.out.println(userInput);
			}
			if (e.getSource() == bC) {
				userInput.append("C");
				System.out.println(userInput);
			}
			if (e.getSource() == bD) {
				userInput.append("D");
				System.out.println(userInput);
			}
		}

		// Number Buttons //
		if (userInput.length() == 1) {
			if (e.getSource() == b1) {
				userInput.append("1");
				System.out.println(userInput);
			}
			if (e.getSource() == b2) {
				userInput.append("2");
				System.out.println(userInput);
			}
			if (e.getSource() == b3) {
				userInput.append("3");
				System.out.println(userInput);
			}
			if (e.getSource() == b4) {
				userInput.append("4");
				System.out.println(userInput);
			}
			if (e.getSource() == b5) {
				userInput.append("5");
				System.out.println(userInput);
			}
			if (e.getSource() == b6) {
				userInput.append("6");
				System.out.println(userInput);
			}
			if (e.getSource() == b7) {
				userInput.append("7");
				System.out.println(userInput);
			}
			if (e.getSource() == b8) {
				userInput.append("8");
				System.out.println(userInput);
			}
			if (e.getSource() == b9) {
				userInput.append("9");
				System.out.println(userInput);
			}
			if (e.getSource() == b0) {
				userInput.append("0");
				System.out.println(userInput);
			}
		}
		displayCode.setText(userInput.toString());

		// money buttons //
		if (e.getSource() == confirmMoney) {
			System.out.println(insertMoney.getSelectedIndex());
			if (insertMoney.getSelectedIndex() == 0) {
				displayCode.setText(">>WHERE'S THE MONEY?!<<");
			}
			if (insertMoney.getSelectedIndex() == 1) {
				System.out.println("GOT YOU A DOLLAR");
				main.userMoney.addOne();
				displayCode.setText(">>ADDED +$1<<");
				displayMoney.setText("$" + main.userMoney.getUserBalance().toString());
				insertMoney.setSelectedIndex(0);
				try {
					main.purchaseLog.addCash("+$1.00", main.userMoney.getUserBalance());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (insertMoney.getSelectedIndex() == 2) {
				System.out.println("GOT YOU 2 DOLLARS");
				main.userMoney.addTwo();
				displayCode.setText(">>ADDED +$2<<");
				displayMoney.setText("$" + main.userMoney.getUserBalance().toString());
				insertMoney.setSelectedIndex(0);
				try {
					main.purchaseLog.addCash("+$2.00", main.userMoney.getUserBalance());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (insertMoney.getSelectedIndex() == 3) {
				System.out.println("GOT YOU 5 DOLLARS");
				main.userMoney.addFive();
				displayCode.setText(">>ADDED +$5<<");
				displayMoney.setText("$" + main.userMoney.getUserBalance().toString());
				insertMoney.setSelectedIndex(0);
				try {
					main.purchaseLog.addCash("+$5.00", main.userMoney.getUserBalance());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (insertMoney.getSelectedIndex() == 4) {
				System.out.println("GOT YOU 10 DOLLARS");
				main.userMoney.addTen();
				displayCode.setText(">>ADDED +$10<<");
				displayMoney.setText("$" + main.userMoney.getUserBalance().toString());
				insertMoney.setSelectedIndex(0);
				try {
					main.purchaseLog.addCash("+$10.00", main.userMoney.getUserBalance());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		// Enter and Undo

		if (e.getSource() == bU && userInput.length() > 0) {
			userInput.delete(userInput.length() - 1, userInput.length());
		}

		try {
			if (e.getSource() == bE && userInput.length() == 2) {
				// make it stop at out of stock
				String choice = userInput.toString();
				main.snacks.snackExtract(userInput.toString());

				BigDecimal snackPrice = new BigDecimal(main.snacks.getSnackPrice());

				if (main.userMoney.getUserBalance().compareTo(snackPrice) < 0) {
					displayCode.setText(">> INSUFFICIENT FUNDS");
					userInput.delete(0, userInput.length());
				}
				if (main.snackStock.getSnackLeft(choice) == 0) {
					displayCode.setText(">> SORRY OUT OF STOCK");
					userInput.delete(0, userInput.length());

				}
				if (main.getSnackBag().size() == 10) {
					displayCode.setText(">> INVENTORY FULL--EAT YOUR SNACKS");
					userInput.delete(0, userInput.length());
				}

//CONFIRMING A PURCHASE

				if (main.userMoney.getUserBalance().compareTo(snackPrice) >= 0
						&& main.snackStock.getSnackLeft(choice) > 0 && main.getSnackBag().size() <= 10) {
					main.snackStock.subtractSnack(userInput.toString());
					BigDecimal cost = new BigDecimal(main.snacks.getSnackPrice());
					main.userMoney.subtract(cost.toString());

					main.addSnackBag(main.snacks.getSnackName());
					main.addSnackTypesBag(main.snacks.getSnackType());
					System.out.println(main.getSnackBag());
					System.out.println(main.getSnackType());
					try {
						main.purchaseLog.addSnack(main.snacks.getSnackName(), main.snacks.getSnackID(),
								main.snacks.getSnackPrice(), main.userMoney.getUserBalance().toString());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					// ADDING SNACK TO A BUTTON
					gotSnack1.setText(main.getSnackFromBag(1));
					gotSnack2.setText(main.getSnackFromBag(2));
					gotSnack3.setText(main.getSnackFromBag(3));
					gotSnack4.setText(main.getSnackFromBag(4));
					gotSnack5.setText(main.getSnackFromBag(5));
					gotSnack6.setText(main.getSnackFromBag(6));
					gotSnack7.setText(main.getSnackFromBag(7));
					gotSnack8.setText(main.getSnackFromBag(8));
					gotSnack9.setText(main.getSnackFromBag(9));

					finishTransaction.setEnabled(true);
					userInput.delete(0, userInput.length());

					displayCode.setText(">> THANK YOU FOR YOUR PURCHASE");
					displayMoney.setText(">> BALANCE: $" + main.userMoney.getUserBalance().toString());

//	CHANGES THE LABELS FOR EACH SNACK			//

					if (choice.equals(main.snacks.getAllSnacks().get(0))) {
						i1Label.setText("---" + main.snacks.getAllSnacks().get(0) + "---"
								+ main.snacks.getAllSnacksPrices().get(0) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(0)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(1))) {
						i2Label.setText("---" + main.snacks.getAllSnacks().get(1) + "---"
								+ main.snacks.getAllSnacksPrices().get(1) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(1)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(2))) {
						i3Label.setText("---" + main.snacks.getAllSnacks().get(2) + "---"
								+ main.snacks.getAllSnacksPrices().get(2) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(2)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(3))) {
						i4Label.setText("---" + main.snacks.getAllSnacks().get(3) + "---"
								+ main.snacks.getAllSnacksPrices().get(3) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(3)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(4))) {
						i5Label.setText("---" + main.snacks.getAllSnacks().get(4) + "---"
								+ main.snacks.getAllSnacksPrices().get(4) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(4)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(5))) {
						i6Label.setText("---" + main.snacks.getAllSnacks().get(5) + "---"
								+ main.snacks.getAllSnacksPrices().get(5) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(5)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(6))) {
						i7Label.setText("---" + main.snacks.getAllSnacks().get(6) + "---"
								+ main.snacks.getAllSnacksPrices().get(6) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(6)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(7))) {
						i8Label.setText("---" + main.snacks.getAllSnacks().get(7) + "---"
								+ main.snacks.getAllSnacksPrices().get(7) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(7)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(8))) {
						i9Label.setText("---" + main.snacks.getAllSnacks().get(8) + "---"
								+ main.snacks.getAllSnacksPrices().get(8) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(8)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(9))) {
						i10Label.setText("---" + main.snacks.getAllSnacks().get(9) + "---"
								+ main.snacks.getAllSnacksPrices().get(9) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(9)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(10))) {
						i11Label.setText("---" + main.snacks.getAllSnacks().get(10) + "---"
								+ main.snacks.getAllSnacksPrices().get(10) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(10)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(11))) {
						i12Label.setText("---" + main.snacks.getAllSnacks().get(11) + "---"
								+ main.snacks.getAllSnacksPrices().get(11) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(11)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(12))) {
						i13Label.setText("---" + main.snacks.getAllSnacks().get(12) + "---"
								+ main.snacks.getAllSnacksPrices().get(12) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(12)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(13))) {
						i14Label.setText("---" + main.snacks.getAllSnacks().get(13) + "---"
								+ main.snacks.getAllSnacksPrices().get(13) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(13)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(14))) {
						i15Label.setText("---" + main.snacks.getAllSnacks().get(14) + "---"
								+ main.snacks.getAllSnacksPrices().get(14) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(14)) + ")---");
					}
					if (choice.equals(main.snacks.getAllSnacks().get(15))) {
						i16Label.setText("---" + main.snacks.getAllSnacks().get(15) + "---"
								+ main.snacks.getAllSnacksPrices().get(15) + "---("
								+ main.getSnackStock().getSnackLeft(main.snacks.getAllSnacks().get(15)) + ")---");
					}
				}
			}
		} catch (NullPointerException e1) {
			displayCode.setText(">> INVENTORY FULL << ");
			System.out.println("ERROR: INVENTORY FULL");
			userInput.delete(0, userInput.length());
		}
		try {
			if (e.getSource() == finishTransaction) {
				displayCode.setText("EAT ALL SNACKS BEFORE BUYING MORE!");
				String changeToDispense = main.userMoney.getUserBalance().toString();
				changeMaker.change(main.userMoney.getUserBalance());
				main.userMoney.reset();
				try {
					main.purchaseLog.addChange(changeToDispense, main.userMoney.getUserBalance().toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				displayMoney.setText("BALANCE RESET: $" + main.userMoney.getUserBalance());

				change.setText("CHANGE DISPENSED: " + changeToDispense);
				quarters.setText("QUARTERS: " + changeMaker.getQuarters());
				dimes.setText("DIMES: " + changeMaker.getDimes());
				nickels.setText("NICKELS: " + changeMaker.getNickels());

				finishTransaction.setEnabled(false);
				if (main.getSnackBag().size() > 1) {
					gotSnack1.setEnabled(true);
				}
				if (main.getSnackBag().size() > 2) {
					gotSnack2.setEnabled(true);
				}
				if (main.getSnackBag().size() > 3) {
					gotSnack3.setEnabled(true);
				}
				if (main.getSnackBag().size() > 4) {
					gotSnack4.setEnabled(true);
				}
				if (main.getSnackBag().size() > 5) {
					gotSnack5.setEnabled(true);
				}
				if (main.getSnackBag().size() > 6) {
					gotSnack6.setEnabled(true);
				}
				if (main.getSnackBag().size() > 7) {
					gotSnack7.setEnabled(true);
				}
				if (main.getSnackBag().size() > 8) {
					gotSnack8.setEnabled(true);
				}
				if (main.getSnackBag().size() > 9) {
					gotSnack9.setEnabled(true);
				}
			}

			if (e.getSource() == gotSnack1) {
				gotSnack1.setEnabled(false);
				String snackType = main.getSnackTypesBag(1);
				if (snackType.equals("Chip")) {
					gotSnack1.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack1.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack1.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack1.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(1);
				main.eatSnackTypesFromBag(1);
			}
			if (e.getSource() == gotSnack2) {
				gotSnack2.setEnabled(false);
				String snackType = main.getSnackTypesBag(2);
				if (snackType.equals("Chip")) {
					gotSnack2.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack2.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack2.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack2.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(2);
				main.eatSnackTypesFromBag(2);
			}
			if (e.getSource() == gotSnack3) {
				gotSnack3.setEnabled(false);
				String snackType = main.getSnackTypesBag(3);
				if (snackType.equals("Chip")) {
					gotSnack3.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack3.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack3.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack3.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(3);
				main.eatSnackTypesFromBag(3);
			}

			if (e.getSource() == gotSnack4) {
				gotSnack4.setEnabled(false);
				String snackType = main.getSnackTypesBag(4);
				if (snackType.equals("Chip")) {
					gotSnack4.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack4.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack4.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack4.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(4);
				main.eatSnackTypesFromBag(4);
			}

			if (e.getSource() == gotSnack5) {
				gotSnack5.setEnabled(false);
				String snackType = main.getSnackTypesBag(5);
				if (snackType.equals("Chip")) {
					gotSnack5.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack5.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack5.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack5.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(5);
				main.eatSnackTypesFromBag(5);
			}

			if (e.getSource() == gotSnack6) {
				gotSnack6.setEnabled(false);
				String snackType = main.getSnackTypesBag(6);
				if (snackType.equals("Chip")) {
					gotSnack6.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack6.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack6.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack6.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(6);
				main.eatSnackTypesFromBag(6);
			}

			if (e.getSource() == gotSnack7) {
				gotSnack7.setEnabled(false);
				String snackType = main.getSnackTypesBag(7);
				if (snackType.equals("Chip")) {
					gotSnack7.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack7.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack7.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack7.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(7);
				main.eatSnackTypesFromBag(7);
			}

			if (e.getSource() == gotSnack8) {
				gotSnack8.setEnabled(false);
				String snackType = main.getSnackTypesBag(8);
				if (snackType.equals("Chip")) {
					gotSnack8.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack8.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack8.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack8.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(8);
				main.eatSnackTypesFromBag(8);
			}

			if (e.getSource() == gotSnack9) {
				gotSnack9.setEnabled(false);
				String snackType = main.getSnackTypesBag(9);
				if (snackType.equals("Chip")) {
					gotSnack9.setText("Crunch Crunch, Yum!");
				}
				if (snackType.equals("Candy")) {
					gotSnack9.setText("Munch Munch, Yum!");
				}
				if (snackType.equals("Drink")) {
					gotSnack9.setText("Glug Glug, Yum!");
				}
				if (snackType.equals("Gum")) {
					gotSnack9.setText("Chew Chew, Yum!");
				}
				main.eatSnackFromBag(9);
				main.eatSnackTypesFromBag(9);
			}
		} catch (NullPointerException e1) {
			System.out.println("EVERYTHING IS FINE");
		}

	}
}
