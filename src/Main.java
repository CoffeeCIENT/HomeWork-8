import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte[] num = new byte[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        double[] fractionalNum = {1.57, 7.654, 9.986};
        boolean[] fearPresence = {false, true};
        System.out.println("Задача 2:");
        System.out.println("num - " + Arrays.toString(num));
        System.out.println("fractional num - " + Arrays.toString(fractionalNum));
        System.out.println("fear presence - " + Arrays.toString(fearPresence));

        System.out.println("Задача 3:");
        System.out.print("num - ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        System.out.print("fractional num - ");
        for (int i = fractionalNum.length - 1; i >= 0; i--) {
            System.out.print(fractionalNum[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        System.out.print("fear presence - ");
        for (int i = fearPresence.length - 1; i >= 0; i--) {
            System.out.print(fearPresence[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.println("Задача 4:");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]++;
            }
            if (i == num.length - 1) {
                System.out.println(num[i]);
                break;
            }
            System.out.print(num[i] + ", ");
        }
        System.out.println("+ Проверка на уникальность работы кода:");
        int[] chekNum = {22, 25, 33};
        for (int i = 0; i < chekNum.length; i++) {
            if (chekNum[i] % 2 != 0) {
                chekNum[i]++;
            }
            if (i == chekNum.length - 1) {
                System.out.println(chekNum[i]);
                break;
            }
            System.out.print(chekNum[i] + ", ");
        }
    }
}