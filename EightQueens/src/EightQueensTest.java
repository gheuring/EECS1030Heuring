import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EightQueensTest {

	private ListBasedBoard testBoard;
	@BeforeEach
	void setUp() throws Exception {
		testBoard = new ListBasedBoard();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testListBasedBoard() {
		fail("Not yet implemented");
	}

	@Test
	void testListBasedBoardInt() {
		fail("Not yet implemented");
	}

	@Test
	void testListBasedBoardListBasedBoard() {
		fail("Not yet implemented");
	}

	@Test
	void testSquareAvailable() {
		fail("Not yet implemented");
	}

	@Test
	void testPlaceQueen() {
		int row=0, column=0;
		int size;
		
		size = testBoard.getSize();
		try {
			for (row = 0; row < size; row++) {
				for (column=0; column < size; column++) {
					testBoard.placeQueen(row, column);
				}
			}
		} catch (Exception e) {
			fail("valid placement "+row+", " + column + " threw exception");
		}
	}

	@Test
	void testGetSize() {
		ListBasedBoard board;
		for (int size = 0; size < 100; size++) {
			board = new ListBasedBoard(size);
			if (board.getSize() != size) {
				fail ("GetSize didn't return size of created board!");
			}
		}
	}

	@Test
	void testGetCopy() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
