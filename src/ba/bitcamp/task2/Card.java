package ba.bitcamp.task2;

public class Card {
	private String cardNum;
	private String bank;
	private int expMonth;
	private int expYear;
	private int balance;

	public Card(String cardNum, String bank, int expMonth, int expYear) {
		super();
		this.cardNum = cardNum;
		this.bank = bank;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.balance = 0;
	}

	/**
	 * A method that adds values to the card
	 * 
	 * @param money
	 *            value added to the card
	 */
	public void addToCard(int money) {
		balance += money;

	}

	/**
	 * a method that removes values from the card
	 * 
	 * @param money
	 *            - value removed from the card
	 */
	public void removeFromCard(int money) {
		balance -= money;
	}

	/**
	 * a method that gets the balance of the card
	 * 
	 * @return - balance on the card
	 */
	public int getBalance() {

		return balance;
	}

}
