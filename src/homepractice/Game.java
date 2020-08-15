package homepractice;

public class Game {

    private final char[][] board = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}
    };

    private final char[] placements = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

    public String[] winningPositions = new String[8];

    private char winner;

    private void updateWinningPositions() {
        winningPositions[0] = "" + this.placements[0] + this.placements[1] + this.placements[2];
        winningPositions[1] = "" + this.placements[3] + this.placements[4] + this.placements[5];
        winningPositions[2] = "" + this.placements[6] + this.placements[7] + this.placements[8];
        winningPositions[3] = "" + this.placements[0] + this.placements[3] + this.placements[6];
        winningPositions[4] = "" + this.placements[1] + this.placements[4] + this.placements[7];
        winningPositions[5] = "" + this.placements[2] + this.placements[5] + this.placements[8];
        winningPositions[6] = "" + this.placements[0] + this.placements[4] + this.placements[8];
        winningPositions[7] = "" + this.placements[6] + this.placements[4] + this.placements[2];
    }

    public char[][] getBoard() {
        return this.board;
    }

    public char getWinner() {
        return winner;
    }

    public char[] getPlacements() {
        return this.placements;
    }

}
