/**
 * This class is a generic container designed to store lists of objects
 * @author lee
 *
 */
public class ObjectList {
	
	private Object[] list;
	private int total;
	
	/**
	 * Constructor initialises an empty list
	 * @param sizeIn sets maximum size of the list
	 */
	public ObjectList(int maxSize) {
		list = new Object[maxSize];
		total = 0;
	}
	
	/**
	 * Adds an object to the list
	 * @param objectIn The object to be added
	 * @return Returns true if object was successfully added, false otherwise
	 */
	
	public boolean add(Object objectIn) {
		if(!isFull()) {
			list[total] = objectIn;
			total++;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Reports on whether the list is empty
	 * @return True if empty, false otherwise
	 */
	public boolean isEmpty() {
		if(total==0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Reports on whether the list is full
	 * @return True if full, false otherwise
	 */
	public boolean isFull() {
		if(total==list.length) {
			return true;
		}else {
			return false;
		}
	}
}


