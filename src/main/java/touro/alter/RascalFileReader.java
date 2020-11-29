package touro.alter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RascalFileReader {
    private int[][] matrix;

    public RascalFileReader(String fileName) {

        try {
            Scanner inputFile = new Scanner(new File(fileName));
            int sampleSize = inputFile.nextInt();
            matrix = new int[sampleSize][3];
            while (inputFile.hasNextInt()) {
                for (int row = 0; row < sampleSize; row++) {
                    for (int col = 0; col < 3; col++) {
                        matrix[row][col] = inputFile.nextInt();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getInputList() {
        return matrix;
    }
}
