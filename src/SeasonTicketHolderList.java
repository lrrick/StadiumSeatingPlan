/**
 * Collection class to hold a list of season ticket holders
 * @author lee
 *
 */
public class SeasonTicketHolderList extends ObjectList {
	
	/** Initialises empty list and sets maximum size */
	public SeasonTicketHolderList(int maxSize) {
		super(maxSize); // calling ObjectList constructor
	}
	
	/**
	 * Selects seasonTicketHolder at chosen position in list
	 * @param numberIn the number of the position in the list
	 * @return Returns the seasonTicketHolder at that position, null if none found
	 */
	public SeasonTicketHolder getSeasonTicketHolder(int positionIn) {
		if(positionIn < 1 || positionIn > getTotal()) {
			return null;
		} else {
			return (SeasonTicketHolder) getObject(positionIn); //cast as STH and call method
		}
	}
	
	/** Searches for seasonTicketHolder  in the given seat number
	 * @param seatNumberIn the seat number being searched
	 * @return Returns the seasonTicketHolder in that seat, null if none found
	 */
	public SeasonTicketHolder search(int seatNumberIn) {
		for(int i = 1; i <= getTotal(); i++) {
			//find ticketHolder with the room number
			if(getSeasonTicketHolder(i).getSeatNumber() == seatNumberIn) {
				return getSeasonTicketHolder(i);
			}
		}
		return null; // executes if none found
	}
	
	/** Removes seasonTIcketHolder from given seat number
	 * @param seatNumberIn seat number to be cleared
	 * @return True if someone was removed, false if not.
	 */
	public boolean removeSeasonTicketHolder(int seatNumberIn) {
		for(int i = 1; i <=getTotal(); i++) {
			if(getSeasonTicketHolder(i).getSeatNumber() == seatNumberIn) {
				removeObject(i);
				return true;
			}
		}
		return false; // executes if unsuccessful 
	}
}
