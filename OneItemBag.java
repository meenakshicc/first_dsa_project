/**
 * OneItemBag is a generic class with T types and adds/removes/checks if the bag has an item.
 * @param <T> item
 */
public class OneItemBag<T> {
	/**
	 * T variable of type Item.
	 */
	private T item;
	
	/**
	 * Constructor for the OneItemBag class.
	 */
	public OneItemBag() {
		this.item = null;
	}
	
	/**
	 * If the item is null, then the param is added to the bag and returns true.
	 * @param i item
	 * @return boolean
	 */
	public boolean addItem(T i) {
		if (item == null) {
			this.item = i;
			return true;
		}
		
		return false;
	}

	/**
	 * If the bag has an item then returns true.
	 * @return boolean.
	 */
	public boolean hasItem() {
		if (item != null) {
			return true;
		}
		return false;
	}

	/**
	 * If the item isn't null then the item is removed and is returned.
	 * @return T object
	 */
	public T removeItem() {
		
		T newitem = item;
		if (item != null) {
			item = null;
		}
		return newitem;
	}

}
