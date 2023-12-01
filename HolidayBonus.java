/**
 * A class for calculating holiday bonuses based on sales reports.
 *
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class provides methods to calculate holiday bonuses for various categories
 *              and the total holiday bonus based on sales reports.
 * Due: 12/01/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Binyam Wodajo
 */
public class HolidayBonus {

    private static double high;
	private static double low;
	private static double other;

	/**
     * Calculates the holiday bonus for each category based on sales data.
     *
     * @param data  The 2D array representing sales data.
     * @return An array containing the calculated bonuses for each category.
     */
    public static double[] calculateHolidayBonus(double[][] data, double low, double other, double high) {
        double[] bonus = new double[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[i].length; k++) {
                if (data[i][k] > 0) {
                    if (data[i][k] == TwoDimRaggedArrayUtility.getHighestInColumn(data, k))
                        bonus[i] += high;
                    else if (data[i][k] == TwoDimRaggedArrayUtility.getLowestInColumn(data, k))
                        bonus[i] += low;
                    else
                        bonus[i] += other;
                }
            }
        }

        return bonus;
    }

    /**
     * Calculates the total holiday bonus based on sales data and bonus criteria.
     *
     * @param data  The 2D array representing sales data.
     * @return The total holiday bonus for all categories.
     */
    public static double calculateTotalHolidayBonus(double[][] data, double low, double other, double high) {
        double[] bonus = new double[data.length];
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k < data[i].length; k++) {
                if (data[i][k] > 0) {
                    if (data[i][k] == TwoDimRaggedArrayUtility.getHighestInColumn(data, k))
                        bonus[i] += high;
                    else if (data[i][k] == TwoDimRaggedArrayUtility.getLowestInColumn(data, k))
                        bonus[i] += low;
                    else
                        bonus[i] += other;
                }
            }
        }

        for (int i = 0; i < bonus.length; i++)
            sum += bonus[i];

        return sum;
    }
}
