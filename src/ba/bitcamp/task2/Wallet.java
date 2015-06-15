package ba.bitcamp.task2;

public class Wallet {
	private int walletMoney;
	private Card[] card;

	public Wallet(int numOfCards) {
		super();
		this.walletMoney = 0;
		this.card = new Card[numOfCards];
	}

	/**
	 * aa method that adds money to the wallet
	 * 
	 * @param money
	 *            - value added to the wallet
	 */
	public void addMoney(int money) {
		walletMoney += money;

	}

	/**
	 * A method that removes money from the wallet
	 * 
	 * @param money
	 *            - value removed from the wallet
	 */
	public void removeMoney(int money) {
		if (walletMoney - money >= 0) {
			walletMoney -= money;
		}
	}

	/**
	 * A method that adds cards to empty spaces in the wallet
	 * 
	 * @param c
	 *            cards added to the wallet
	 */
	public void addCard(Card c) {
		for (int i = 0; i < card.length; i++) {
			if (card[i] == null) {
				card[i] = c;
				break;
			}
		}
	}

}
