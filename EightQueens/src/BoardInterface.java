/**
 * 
 */

/**
 * @author Jerry Heuring
 *
 */
public interface BoardInterface {
	public boolean squareAvailable (int row, int column) 
			throws InvalidBoardPositionException;	
	public void    placeQueen(int row, int column)       
			throws InvalidBoardPositionException;
	public int     getSize();
	public BoardInterface getCopy();
}
