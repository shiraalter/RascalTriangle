package touro.alter;

public class Main {

    public static void main(String[] args) {
        RascalFileReader fileReader = new RascalFileReader(args[0]);
        Rascal rascalTriangle = new Rascal();
        int[][] matrix = fileReader.getInputList();

        for(int[] matrixLine : matrix){  //get one line of input at a time
            int numOfInput = matrixLine[0];
            int row = matrixLine[1];
            int col = matrixLine[2];
            System.out.println(numOfInput + " " + rascalTriangle.getValue(row, col));
        }
        }
    }

