package touro.alter;

public class Rascal {

    public Rascal() {
    }

    public int getValue(int row, int col) {
        int halfOfRowNum = (int) Math.round((double) (row / 2));
        int finalValue = 1;

        /*after the middle index, numbers repeat themselves until the end.
        if col index is higher than half the amount of indexes in row, assign it to its 'twin' in first half of row*/
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


