import java.util.Random;

public class Main {


    public static String stringCompound(String[] s1) {
        StringBuilder sFinal = new StringBuilder();
        for (String s : s1) {
            sFinal.append(s);
            sFinal.append('|');
        }
        sFinal.deleteCharAt(sFinal.length() - 1);
        return sFinal.toString();
    }

    public static void FirstTask() {
        for (int i = 30; i > 0; i--) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int i = 30;
        while (i > 0) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();
        i = 30;
        do {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
            i--;
        } while (i > 0);
    }

    public static void SecondTask() {
        Random random = new Random();
        int[] arr1 = new int[random.nextInt(11) + 5];
        int[] arr2 = new int[random.nextInt(11) + 5];
        int max1 = 0;
        int max2 = 0;
        int min1 = 100;
        int min2 = 100;
        for (int j = 0; j < arr1.length; j++) {
            int temp = random.nextInt(101);
            if (temp % 2 != 0) {
                temp += 1;
            }
            arr1[j] = temp;
            if (max1 < temp) {
                max1 = temp;
            }
            if (min1 > temp) {
                min1 = temp;
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            int temp = random.nextInt(101);
            if (temp % 2 == 0) {
                if (temp == 100) {
                    temp = temp - 1;
                } else {
                    temp = temp + 1;
                }
            }
            arr2[j] = temp;
            if (max2 < temp) {
                max2 = temp;
            }
            if (min2 > temp) {
                min2 = temp;
            }
        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(min1);
        System.out.println(min2);
    }

    public static void main(String[] args) {

        System.out.println("Первое задание:");
        FirstTask();
        System.out.println();
        //________________
        System.out.println("Второе задание:");
        SecondTask();
        //________________
        System.out.println("Третье задание:");
        String[] s1 = {"ds", "dsas", "vsty", "12321"};
        System.out.println(stringCompound(s1));
    }
}
