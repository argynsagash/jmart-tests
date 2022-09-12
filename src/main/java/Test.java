import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] numbers = {4, 3, 9, 7, 2, 1};
        System.out.println("TEST-1");
        System.out.println(Arrays.toString(numbers));
        squareOrSquareRoot(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("TEST-2");
        System.out.println(dontGiveMeFive(-5, 5));
        System.out.println(dontGiveMeFive(1, 9));
        System.out.println(dontGiveMeFive(4, 17));
        System.out.println("TEST-3");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(whichFinger(10));
        System.out.println(whichFinger(20));
        System.out.println(whichFinger(30));
        System.out.println(whichFinger(50));
        System.out.println(whichFinger(100));
        System.out.println(whichFinger(1000));
        System.out.println(whichFinger(10000));

    }

    //TEST 1
    public static void squareOrSquareRoot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double number = Math.sqrt(arr[i]);
            if (number % 2 != 1 && number % 2 != 0) {
                arr[i] = arr[i] * arr[i];
            } else {
                arr[i] = (int) number;
            }
        }
    }

    //TEST 2
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        while (start <= end) {
            if (!String.valueOf(start).contains("5")) {
                count++;
            }
            start = start + 1;
        }
        return count;
    }

    //TEST 3
    public static String whichFinger(int num) {
        String a = "Большой палец";
        String b = "Указательный палец";
        String c = "Средний палец";
        String d = "Безымянный палец";
        String e = "Мизинец";
        String[] fingers = {b, c, d, e, d, c, b, a};

        if (num == 1) return a;
        else {
            num = num - 1;
            num = num % 8;
            return fingers[num - 1];
        }
    }

}
