/**
 * This class is a generic container designed to store lists of objects
 * Methods include adding, testing if list is full or empty, retrieving details
 * of a specific object in the list and removing an object from the list.
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
	
	/**
	 * Gets an object from a specific position in the list
	 * @param i Position of the object
	 * @return Returns the object at the specified position, null if no object
	 * 			
	 */
	public Object getObject(int positionIn) {
		if(positionIn <1  || positionIn>  total) {
			return null;
		} else {
			return list[positionIn -1];
		}
	}
	
	/** Reads the number of objects in the list */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Removes an object from specified position in list
	 * @param numberIn the position of the object to be removed
	 * @return True if object is removed, false if not.
	 */
	public boolean removeObject(int positionIn) {
		if(positionIn < 1 || positionIn > total) {
			return false;
		} else {
			for(int i = positionIn -1; i< total-1; i++) {
				list[i] = list[i+1];
			}
			total --;
			return true;
		}
	}
}


