import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * A utility class for performing various operations on a two-dimensional ragged array of doubles.
 *
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: (Class that manipulates two dimensional ragged arrays of sales reports
 * according to sales reports)
 * Due: 12/01/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Binyam Wodajo
 */
public final class TwoDimRaggedArrayUtility {

    /**
     * Calculates the average of all the elements in the two-dimensional array.
     *
     * @param data The 2D array.
     * @return The average of the array elements.
     */
    public static double getAverage(double[][] data) {
        double sum = 0; // Sum tracker
        int count = 0; // Counter

        for (int i = 0; i < data.length; i++)
            for (int k = 0; k < data[i].length; k++) {
                count++;
                sum += data[i][k];
            }

        return sum / count;
    }

    /**
     * Calculates the total of a specific column in the two-dimensional array.
     *
     * @param data   The array.
     * @param column The column index.
     * @return The total of the specified column.
     */
    public static double getColumnTotal(double[][] data, int column) {
        double sum = 0; // Sum tracker
        for (int i = 0; i < data.length; i++) {
            if (column < data[i].length) {
                sum += data[i][column];
            }
        }

        return sum;
    }

    /**
     * Finds the highest value in the entire two-dimensional array.
     *
     * @param data The array.
     * @return The highest value in the array.
     */
    public static double getHighestInArray(double[][] data) {
        double highest = data[0][0];

        for (int i = 0; i < data.length; i++)
            for (int k = 0; k < data[i].length; k++)
                if (data[i][k] > highest)
                    highest = data[i][k];

        return highest;
    }

    /**
     * Finds the highest value in a specific column of the two-dimensional array.
     *
     * @param data The array.
     * @param column The column index.
     * @return The highest value in the specified column.
     */
    public static double getHighestInColumn(double[][] data, int column) {
        double highest = Double.MIN_VALUE;

        for (int i = 0; i < data.length; i++)
            if (column < data[i].length)
                if (data[i][column] > highest)
                    highest = data[i][column];

        return highest;
    }

    /**
     * Finds the index of the highest value in a specific column of the two-dimensional array.
     *
     * @param data The array.
     * @param column The column index.
     * @return The index of the highest value in the specified column.
     */
    public static int getHighestInColumnIndex(double[][] data, int column) {
        double highest = data[0][column];
        int highestIndex = 0;

        for (int i = 0; i < data.length; i++)
            if (column < data[i].length)
                if (data[i][column] > highest) {
                    highest = data[i][column];
                    highestIndex = i;
                }

        return highestIndex;
    }

    /**
     * Finds the highest value in a specific row of the two-dimensional array.
     *
     * @param data The array.
     * @param row The row index.
     * @return The highest value in the specified row.
     */
    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];

        for (int i = 0; i < data[row].length; i++)
            if (data[row][i] > highest)
                highest = data[row][i];

        return highest;
    }

    /**
     * Finds the index of the highest value in a specific row of the two-dimensional array.
     *
     * @param data The array.
     * @param row The row index.
     * @return The index of the highest value in the specified row.
     */
    public static int getHighestInRowIndex(double[][] data, int row) {
        double highest = data[row][0];
        int highestIndex = 0;

        for (int i = 0; i < data[row].length; i++)
            if (data[row][i] > highest) {
                highest = data[row][i];
                highestIndex = i;
            }

        return highestIndex;
    }

    /**
     * Finds the lowest value in the entire two-dimensional array.
     *
     * @param data The array.
     * @return The lowest value in the array.
     */
    public static double getLowestInArray(double[][] data) {
        double lowest = data[0][0];

        for (int i = 0; i < data.length; i++)
            for (int k = 0; k < data[i].length; k++)
                if (data[i][k] < lowest)
                    lowest = data[i][k];

        return lowest;
    }

    /**
     * Finds the lowest value in a specific column of the two-dimensional array.
     *
     * @param data The array.
     * @param column The column index.
     * @return The lowest value in the specified column.
     */
    public static double getLowestInColumn(double[][] data, int column) {
        double lowest = Double.MAX_VALUE;

        for (int i = 0; i < data.length; i++)
            if (column < data[i].length)
                if (data[i][column] < lowest)
                    lowest = data[i][column];

        return lowest;
    }

    /**
     * Finds the index of the lowest value in a specific column of the two-dimensional array.
     *
     * @param data The array.
     * @param column The column index.
     * @return The index of the lowest value in the specified column.
     */
    public static int getLowestInColumnIndex(double[][] data, int column) {
        double lowest = data[0][column];
        int lowestIndex = 0;

        for (int i = 0; i < data.length; i++)
            if (column < data[i].length)
                if (data[i][column] < lowest) {
                    lowest = data[i][column];
                    lowestIndex = i;
                }

        return lowestIndex;
    }

    /**
     * Finds the lowest value in a specific row of the two-dimensional array.
     *
     * @param data The array.
     * @param row The row index.
     * @return The lowest value in the specified row.
     */
    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];

        for (int i = 0; i < data[row].length; i++)
            if (data[row][i] < lowest)
                lowest = data[row][i];

        return lowest;
    }

    /**
     * Finds the index of the lowest value in a specific row of the two-dimensional array.
     *
     * @param data The array.
     * @param row The row index.
     * @return The index of the lowest value in the specified row.
     */
    public static int getLowestInRowIndex(double[][] data, int row) {
        double lowest = data[row][0];
        int lowestIndex = 0;

        for (int i = 0; i < data[row].length; i++)
            if (data[row][i] < lowest) {
                lowest = data[row][i];
                lowestIndex = i;
            }

        return lowestIndex;
    }

    /**
     * Calculates the total of a specific row in the two-dimensional array.
     *
     * @param data The array.
     * @param row The row index.
     * @return The total of the entire row.
     */
    public static double getRowTotal(double[][] data, int row) {
        double sum = 0;

        for (int i = 0; i < data[row].length; i++)
            sum += data[row][i];

        return sum;
    }

    /**
     * Calculates the total of all the elements in the two-dimensional array.
     *
     * @param data The array.
     * @return The total of all the elements in the array.
     */
    public static double getTotal(double[][] data) {
        double sum = 0; // The sum of the entire array

        for (int i = 0; i < data.length; i++)
            for (int k = 0; k < data[i].length; k++) {
                sum += data[i][k];
            }

        return sum;
    }

    /**
     * Reads a file and converts its contents to a two-dimensional array of doubles.
     *
     * @param file The file to be read.
     * @return A two-dimensional array with the contents of the file.
     */
    public static double[][] readFile(java.io.File file) {
        int numRows = 0;                    // Number of rows in the file
        String nextLine;                    // The next line in the file
        Scanner dataReader;                 // The scanner used to read the data
        double[][] data = new double[0][];    // Random initialization to get rid of errors, will get this if there's an error

        try {
            dataReader = new Scanner(file);
            while (dataReader.hasNextLine()) {
                numRows++;
                dataReader.nextLine();
            }

            dataReader.close();

            dataReader = new Scanner(file);

            data = new double[numRows][];

            for (int i = 0; i < numRows; i++) {
                String[] nextNumbers;
                nextLine = dataReader.nextLine();
                nextNumbers = nextLine.split(" ");
                data[i] = new double[nextNumbers.length];
                for (int k = 0; k < nextNumbers.length; k++) {
                    data[i][k] = Double.parseDouble(nextNumbers[k]);
                }
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return data;
    }

    /**
     * Writes the data from a two-dimensional array to a file.
     *
     * @param data        The array to be written to the file.
     * @param outputFile  The file where the array will be written.
     */
    public static void writeToFile(double[][] data, java.io.File outputFile) {
        try {
            FileWriter fileWriter = new FileWriter(outputFile);

            for (int i = 0; i < data.length; i++) {
                for (int k = 0; k < data[i].length; k++) {
                    fileWriter.write(data[i][k] + " ");
                }
                fileWriter.write('\n');
            }

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
