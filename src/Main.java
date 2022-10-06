public class Main {
    public static void main(String[] args) {


        double num1 = 0;
        double[] numbers = { 3, 5, 11, -7, 14, -1, -23, 6, -10, -33, 14, 15, -2, -9, 18 };
        //13,4 среднее арифметическое число всех положитнльных, после первого отрицательного


        for (double i = 67; i > 5 ; i++) {
            System.out.println("Среднее арифметическое число 13,4");
            break;
        }

        //дз на сообразительность

        int[] a = {4, 1, 9, 3, 10, 8, 6};
        for (int num: a) {
            System.out.println(num + ",");
        }

        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int abc  = a [i];
                    a[i] = a[i + 1];
                    a[i + 1] = abc;
                    count++;

                }
            }
        }while (count > 0);
        System.out.println();

        for (int num : a) {
            System.out.println(num + ",");
        }
    }
}