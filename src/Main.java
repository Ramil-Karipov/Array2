public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1, 3");
        int[] arr = generateRandomArray();
        int total = 0;
        int totalLAverage = 0;
        for (int element : arr) {
            total += element;
            totalLAverage = total / 30;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + totalLAverage + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int totalMax = 0;
        int totalMin = -1;
        String max = "Максимальная сумма трат за день составила ";
        String rub = " рублей";
        String min = "Минимальная сумма трат за день составила ";
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > totalMax) {
                totalMax = current;
            }
        }
        System.out.println(max + totalMax + rub);
        for (int i = 0; i < arr.length - 1; i++) {
            final int current = arr[i];
            final int next = arr[i + 1];
            if (current < next) {
                totalMin = current;
            }
        }
        System.out.println(min + totalMin + rub);
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
        }
        int c = reverseFullName.length;
        for (int i = 0; i < c / 2; i++) {
            char temp = reverseFullName[c - i - 1];
            reverseFullName[c - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);

        }


    }


}


        

