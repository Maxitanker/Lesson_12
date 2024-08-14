// неверные данные
class MyArrayDataException extends Exception {
    private final int row;
    private final int column;

    public MyArrayDataException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " (Ряд:" + row + ", Столб: " + column + ")";
    }
}

// неверный массив
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

public class ArrayProcessor {


    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException ("Массив должен иметь 4 ряда");
        }

        int sum = 0;

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                try {
                    sum += Integer.parseInt(array[a][b]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в массиве", a, b);
                }
            }
        }

        return sum;
    }
}
