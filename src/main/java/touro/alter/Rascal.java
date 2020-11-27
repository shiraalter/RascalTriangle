package touro.alter;

public class Rascal {

    private int value;
    public Rascal() {

    }

   // private int value;

    public int getValue(int row, int col) {
        int halfOfRowNum = (int)Math.round((double)(row / 2));

       if (row == 1 || col == 0 || col == row + 1) {       //topmost # and bookends of rows is always 1
            return 1;
        }
        else if (col == 1 || col == row - 1) {
            return row;
        }
         else if(row % 2 == 0){  //for all even rows
            value = calculateEvenRowVal(halfOfRowNum, col);
        }
        else{      //all odd rows
            value = calculateOddRowVal(halfOfRowNum, col);
        }

        return value;
    }

    private int calculateOddRowVal(int halfOfRowNum, int col) {
        int midValue = (int) Math.pow(halfOfRowNum, 2) + (halfOfRowNum +1);
        int number = (halfOfRowNum - col);
        int indexValue = midValue - (int)Math.pow(halfOfRowNum, 2) - number;
        return indexValue;
    }

    /* when a row is even,  halfOfRowNum^2 + 1 will get middle value in row.
        subtracting column index from halfOfRowNum, squaring it, and subtracting that from center value will return the value
        at a specified index in the row.
     */

    private int calculateEvenRowVal(int halfOfRowNUm, int col) {
           int midValue = (int) Math.pow(halfOfRowNUm , 2) + 1;
           int number = (halfOfRowNUm - col);
           int indexValue = (int) (midValue - Math.pow(number, 2));
           return indexValue;
    }
}


