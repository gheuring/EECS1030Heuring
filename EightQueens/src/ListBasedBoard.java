import java.util.Arrays;
/**
 * 
 */

/**
 * @author Jerry Heuring
 *
 */
public class ListBasedBoard implements BoardInterface {
	private int queens[];
	private static final int NotPlaced = -1;
	/**
	 * 
	 */
	public ListBasedBoard() {
		// TODO Auto-generated constructor stub
		this(8);
	}

	public ListBasedBoard(int boardSize) {
		queens = new int[boardSize];
		Arrays.fill(queens, NotPlaced);
		//  for (int i = 0; i < boardSize; i++) {
		//      queens[i] = NotPlaced;
		//  }
	}

	public ListBasedBoard(ListBasedBoard orig) {
		queens = Arrays.copyOf(orig.queens, orig.queens.length);
	}

	/* (non-Javadoc)
	 * @see BoardInterface#squareAvailable(int, int)
	 */
	@Override
	public boolean squareAvailable(int row, int column) 
			throws InvalidBoardPositionException {
		/*
		 * Make sure the position is within range. 
		 */
		if (row >= queens.length || column >= queens.length ||		
				row < 0 || column < 0) {
			throw new InvalidBoardPositionException();
		}
		/*
		 * Check if the queen can be captured at this square...
		 */
		for (int currentRow = 0; currentRow < queens.length; 
				currentRow++) {
			// Already a Queen on This row?
			if (queens[row] != NotPlaced) {
				return false;
			}
			// If there is a queen in this column 
			if (queens[currentRow] == column) {
				return false;
			}
			// Check if there is a queen on the same diagonal
			// as this square. 
			if (queens[currentRow] != NotPlaced) {  // There is a queen on the current row.
				if (Math.abs(row - currentRow) == Math.abs(column - queens[currentRow])) {
					return false;
				}
			}

		}
		return true;
	}

	/* (non-Javadoc)
	 * @see BoardInterface#placeQueen(int, int)
	 */
	@Override
	public void placeQueen(int row, int column) throws InvalidBoardPositionException {
		// TODO Auto-generated method stub
		if (row >= queens.length || column >= queens.length ||		
				row < 0 || column < 0) {
			throw new InvalidBoardPositionException();
		}
		queens[row] = column;
	}

	/* (non-Javadoc)
	 * @see BoardInterface#getSize()
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return queens.length;
	}

	/* (non-Javadoc)
	 * @see BoardInterface#getCopy()
	 */
	@Override
	public BoardInterface getCopy() {
		// TODO Auto-generated method stub
		ListBasedBoard copy = new ListBasedBoard(this);

		return copy;
	}

	public String toString() {
		String separator=" +";
		String spacer = " | ";
		String outputString = "";

		for (int i = 0; i< queens.length; i++) {
			separator = separator + "---+";
		}

		for (int currentRow = 0; currentRow < queens.length; currentRow++) {
			outputString = outputString + separator + "\n";
			outputString = outputString + spacer ;
			for (int column = 0; column < queens.length; column++) {
				if (queens[currentRow] == column) {
					outputString = outputString + "Q" + spacer; 
				} else {
					outputString = outputString + " " + spacer;
				}
			}
			outputString = outputString + "\n";
		}
		outputString = outputString+separator+"\n";
		return outputString;
	}
}

