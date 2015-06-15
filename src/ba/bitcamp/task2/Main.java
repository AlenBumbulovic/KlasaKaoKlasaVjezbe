package ba.bitcamp.task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card("1234 5678 9012 3456", "UniCredit", 5, 2016);
		Card c1 = new Card("0000 0000 0000 0000", "Intesa SP", 7, 2017);

		Wallet w = new Wallet(2);

		System.out.println(c.getBalance());
		c.addToCard(100);
		System.out.println(c.getBalance());
		c.removeFromCard(30);
		System.out.println(c.getBalance());
		c.removeFromCard(100);
		System.out.println(c.getBalance());

		w.addCard(c);
		w.addCard(c1);

	}

}
