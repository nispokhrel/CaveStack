package tunnels;

import java.util.*;

/**
 * Stack implementation of CaveInterface 
 * 
 * @author NPokhrel
 */

public class CaveStack<Cave> implements CaveInterface<Cave> {

	Stack<Cave> topStack;
	Stack<String> cCoordinate;

	@Override
	public boolean push(Cave newEntry, String coordinate) {
		boolean check = true;
		if ((cCoordinate.search(coordinate) == -1)) {
			topStack.push(newEntry);
			cCoordinate.push(coordinate);
		}
		else
		{
			check=false;
		}
		return check;

	}

	@Override
	public Cave pop() {
		return topStack.pop();
	}

	@Override
	public Cave peek() {
		return topStack.peek();
	}

	@Override
	public boolean isEmpty() {
		return topStack.empty();
	}

	@Override
	public void clear() {
		topStack.clear();

	}

	public CaveStack() {
		topStack = new Stack<Cave>();
		cCoordinate = new Stack<String>();
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
