public class Main {
    public static void main(String[] args) {
        // нормальный массив 4х4
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.processArray(validArray);
            System.out.println("Сумма: " + sum);
        }
        catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }


        // неправильный массив 3х3
        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int sum = ArrayProcessor.processArray(invalidSizeArray);
            System.out.println("Сумма: " + sum);
        }
        catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }


        // массив с символами
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "слово", "16"}
        };

        try {
            int sum = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("Сумма: " + sum);
        }
        catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
