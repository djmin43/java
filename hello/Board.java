/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.MaxPQ;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Board {

    int[][] board;
    int[][] goalBoard;

    int N;
    int total;

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    public Board(int[][] tiles) {
        this.total = tiles.length * tiles[0].length;

        this.N = tiles.length;
        int[] initialFlatBoard = getFlatTiles(this.total);
        this.goalBoard = getBoard(initialFlatBoard);

        StdRandom.shuffle(initialFlatBoard);
        this.board = getBoard(initialFlatBoard);
    }


    // string representation of this board
    public String toString() {
        String newLine = System.getProperty("line.separator");
        StringBuilder boardToString = new StringBuilder()
                .append(N);

        for (int i = 0; i < N; i++) {
            boardToString.append(newLine);
            for (int j = 0; j < N; j++) {
                boardToString.append(" ").append(board[i][j]);
            }
        }
        return boardToString.toString();
    }

    // board dimension n
    public int dimension() {
        return N;
    }

    // number of tiles out of place
    public int hamming() {
        int difference = 0;
        int[] flatBoard = Arrays.stream(board).flatMapToInt(v -> Arrays.stream(v)).toArray();
        int[] flatGoalBoard = Arrays.stream(goalBoard).flatMapToInt(v -> Arrays.stream(v))
                                    .toArray();
        for (int i = 0; i < flatGoalBoard.length; i++) {
            if (flatGoalBoard[i] != flatBoard[i]) {
                difference++;
            }
        }
        return difference;
    }

    private int[][] getBoard(int[] flatTiles) {
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int index = (i * N) + j;
                array[i][j] = flatTiles[index];
            }
        }
        return array;
        MaxPQ
    }

    private int[] getFlatTiles(int total) {
        int[] array = new int[total];
        for (int i = 0; i < total; i++) {
            array[i] = i + 1;
        }
        array[array.length - 1] = 0;
        return array;
    }

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
        Board board1 = new Board(new int[4][4]);
        int hamming = board1.hamming();
        System.out.println("hamming = " + hamming);
        System.out.println(board1.toString());
    }

}