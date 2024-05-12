package kz.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "X", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println(arraySum(validArray));
//        System.out.println(arraySum(invalidDataArray));
        System.out.println(arraySum(invalidSizeArray));
    }


    public static int arraySum(String[][] arr) throws Exception {
        if (arr.length != 4) {
            throw new MyArraySizeException("Array must have 4 rows");
        }

        for (String[] row: arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Each row must have 4 columns");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Invalid data at [" + i + "][" + j + "]: " + arr[i][j]
                    );
                }
            }
        }

        return sum;
    }
}
