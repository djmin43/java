/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Board {

    int[][] board;
    int width;
    int height;

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    public Board(int[][] tiles) {
        this.width = tiles.length;
        this.height = tiles[0].length;
        this.board = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.board[i][j] = (i * 3) + j;
            }
        }
    }

    // string representation of this board
    public String toString() {
        String newLine = System.getProperty("line.separator");
        StringBuilder boardToString = new StringBuilder()
                .append(height);

        for (int i = 0; i < height; i++) {
            boardToString.append(newLine);
            for (int j = 0; j < width; j++) {
                boardToString.append(" ").append(board[i][j]);
            }
        }
        return boardToString.toString();
    }

    // board dimension n
    // public int dimension()

    // number of tiles out of place
    // public int hamming()

    // sum of Manhattan distances between tiles and goal
    // public int manhattan()

    // is this board the goal board?
    // public boolean isGoal()

    // does this board equal y?
    // public boolean equals(Object y)

    // all neighboring boards
    // public Iterable<Board> neighbors()

    // a board that is obtained by exchanging any pair of tiles
    // public Board twin()

    // unit testing (not graded)
    public static void main(String[] args) {
        Board board1 = new Board(new int[3][3]);
        System.out.println(board1.toString());
    }

}