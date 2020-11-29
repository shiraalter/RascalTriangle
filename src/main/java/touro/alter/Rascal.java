package touro.alter;

public class Rascal {

    private int row;
    private int col;

    public Rascal(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getValue() {
        int halfOfRowNum = (int) Math.round((double) (row / 2));
        int finalValue = 1;

        if (col > halfOfRowNum) {
            col = row - col;
        }

        int valueBetweenColumn = row - 1;  //gets second index

        for (int i = 0; i < col; i++) {
            finalValue += valueBetweenColumn;
            valueBetweenColumn -= 2;
        }
        return finalValue;
    }
}


