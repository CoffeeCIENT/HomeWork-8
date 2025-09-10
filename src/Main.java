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
        for (int index = 2; index < num.length; index--) {
            if (index == num.length - 3) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }
        System.out.print("fractional num - ");
        for (int index = 2; index < fractionalNum.length; index--) {
            if (index == fractionalNum.length - 3) {
                System.out.println(fractionalNum[index]);
                break;
            }
            System.out.print(fractionalNum[index] + ", ");
        }
        System.out.print("fear presence - ");
        for (int index = 1; index < fearPresence.length; index--) {
            if (index == fearPresence.length - 2) {
                System.out.println(fearPresence[index]);
                break;
            }
            System.out.print(fearPresence[index] + ", ");
        }

        System.out.println("Задача 4:");
        for (int index = 0; index < num.length; index++) {
            if (num[index] % 2 != 0) {
                num[index]++;
            }
            if (index == num.length - 1) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }
        System.out.println("+ Проверка на уникальность работы кода:");
        int [] chekNum = {22, 25, 33};
        for (int index = 0; index < chekNum.length; index++) {
            if (chekNum[index] % 2 != 0) {
                chekNum[index]++;
            }
            if (index == chekNum.length - 1) {
                System.out.println(chekNum[index]);
                break;
            }
            System.out.print(chekNum[index] + ", ");
        }
    }
}
