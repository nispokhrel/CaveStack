package tunnels;

/**
 * An interface for the ADT stack.
 * 
 * @author NPokhrel
 */

public interface CaveInterface<Cave> {
	
	/**
	 * Adds a new entry to the top of this stack.
	 * 
	 * @param newEntry An object to be added to the stack.
	 */
	public boolean push(Cave newEntry, String Coordinate);

	/**
	 * Removes and returns this stack's top entry.
	 * 
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty before the operation.
	 */
	public Cave pop();

	/**
	 * Retrieves this stack's top entry.
	 * 
	 * @return The object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty.
	 */
	public Cave peek();

	/**
	 * Detects whether this stack is empty.
	 * 
	 * @return True if the stack is empty.
	 */
	public boolean isEmpty();

	/** Removes all entries from this stack. */
	
	public void clear();
} // end StackInterface
