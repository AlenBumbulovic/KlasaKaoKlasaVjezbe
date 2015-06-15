package ba.bitcamp.task1;

public class Bag {

	Integer maxCapacity;
	Integer currentCapacity;

	public Bag(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
		currentCapacity = 0;
	}

	/**
	 * A method that gets the max capacity of the bag
	 * 
	 * @return the maximum capacity of the bag
	 */

	public Integer getMaxCapacity() {
		return maxCapacity;

	}

	/**
	 * A method that gets the current capacity of the bag
	 * 
	 * @return the current capacity of the bag
	 */

	public Integer getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * A method that returns th free space in the bag
	 * 
	 * @return the free space left in the bag
	 */

	public Integer getFreeSpace() {
		return (maxCapacity - currentCapacity);
	}

	/**
	 * a method that adds something to the bag
	 * 
	 * @param items
	 *            - items that we add to the bag
	 */

	public void addToBag(Integer items) {

		if (currentCapacity + items <= maxCapacity) {
			currentCapacity += items;
		} else {
			throw new IllegalArgumentException();
		}

	}

	/**
	 * a method that removes something from the bag
	 * 
	 * @param items
	 *            - items that we remove from the bag
	 */

	public void removeFromBag(Integer items) {
		if (currentCapacity - items >= 0) {
			currentCapacity -= items;
		}
	}

}
