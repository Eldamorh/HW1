import java.util.Random;

public class Main {
    public static int FirstTask() {
        Random random = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            sum += arr[i];
        }
        return sum / 10;
    }


    public static int SecondTask(int i) {
        return (i < 0) ? -i : i;
    }

    public static char[] ThirdTask(char[] arr) {
        char[] arrReverse = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - i - 1];
        }
        return arrReverse;
    }

    public static void main(String[] args) {
        System.out.println(FirstTask());
        System.out.println(SecondTask(-134));
        System.out.println(ThirdTask(new char[]{'a', 'b', 'c'}));
    }
}
