public class Task4 {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"},
        							    {"5", "6", "7", "8"},
        							    {"1", "2", "3", "4"},
                                        {"5", "6", "7", "8"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int method(String[][] arr) throws MyArraySizeException , MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Неправильный размер массива!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Неправильный размер массива!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неверное значение в ячейке: [%d][%d].", i,j));                    
                }
            }
        }
        return count;
    }
}