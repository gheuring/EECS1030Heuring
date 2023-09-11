/**
 * 
 */
import java.util.Stack;
/**
 * @author Jerry Heuring
 *
 *This is the main class for the Eight Queens problem we
 *are working on in class.
 */
public class EightQueens {
	private BoardInterface board;
	Stack<BoardInterface> savedBoards;
	/**
	 * The constructor.  This class requires an initial
	 * board to be given that supplies the BoardInterface. 
	 * @param board  The initial board for this problem. 
	 */
	public EightQueens(BoardInterface board) {
		// TODO Auto-generated constructor stub
		this.board = board;
		savedBoards = new Stack<BoardInterface> ();
	}
	
	/**
	 * This is the entry point for solving the n-queens 
	 * problem.  It starts the recursion by calling 
	 * tryToPlaceQueens with row = 0 and the initial 
	 * board. 
	 * @throws InvalidBoardPositionException if an invalid row and column are used. 
	 */
	public void solve () throws InvalidBoardPositionException {
		int row = 0;
		tryToPlaceQueens (row, board);
		
	}
	
	/**
	 * This is the recursive routine that tries to place a
	 * queen on the current row.  The board is passed in as
	 * a current Position.  It tries to find a column in the
	 * row to place a queen and, if it does, it saves its
	 * state and moves on to the next row.   If it reaches 
	 * the limit for placing queens the result is printed. 
	 * 
	 * @param currentRow   The row to try to place a queen upon.
	 * @param currentPosition  the current state of the chess board.
	 * @throws InvalidBoardPositionException  If a position that would be off the board is used this exception is thrown.
	 */
    private void tryToPlaceQueens( int currentRow, BoardInterface currentPosition) throws InvalidBoardPositionException {
    	int column;
    	if (currentRow  == currentPosition.getSize()) {
    		// we are done...
    		System.out.println (currentPosition);
    		return;
    	}
    	/*
    	 * Try each column.  If the square is available, 
    	 * save our state, place a queen on the column, and
    	 * move onto the next row.  When the routine returns
    	 * restore the previous state from the stack and 
    	 * try the other columns. 
    	 */
	   for (column = 0; column < board.getSize(); column++) {
		   if (currentPosition.squareAvailable(currentRow,  column)) {
			   savedBoards.push(currentPosition.getCopy());
			   currentPosition.placeQueen(currentRow, column);
			   tryToPlaceQueens( currentRow+1, currentPosition);
			   currentPosition = savedBoards.pop();
		   }
	   }
}

	/**
	 * Main program.  Just sets up the object and calls the solve method
	 * to find solutions.
	 * @param args  Command line arguements -- not used. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EightQueens eight = new EightQueens( new ListBasedBoard(8));
		try {
			eight.solve();
		} catch (Exception e) {
		}
	}

}
