package ba.bitcamp.task1;

public class Main {

	public static void main(String[] args) {
		Bag b1 = new Bag(40);

		System.out.println(b1.getMaxCapacity());
		System.out.println();
		System.out.println(b1.getCurrentCapacity());
		System.out.println();
		b1.addToBag(30);
		System.out.println(b1.getCurrentCapacity());
		System.out.println(b1.getFreeSpace());

	}

}
