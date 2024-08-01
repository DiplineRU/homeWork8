import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        /*Объявите три массива:
        -Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова
        new
        -Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        -Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
         с помощью ключевого слова или сразу заполненный элементами.
         */
        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        System.out.println(massiv[0] + " " + massiv[1] + " " + massiv[2] + " ");
        double[] drobnie = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(drobnie) + " ");
        int[] proizvol = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(proizvol));
        System.out.println("=======");


        System.out.println("Задание 2.");
        /*Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
         В конце строки запятую ставить не надо.*/

        //Не совсем понял условие задания, если оно связанно с предыдущим то получается я его уже выполнил
        System.out.println("=======");

        System.out.println("Задание 3.");
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        Если в задаче 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
        // Произвольные элементы третьего массива
        то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
        // Произвольные элементы третьего массива в обратном порядке*/


        for (int i = massiv.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massiv[i] + ", ");
            } else {
                System.out.print(massiv[i]);
            }
        }
        System.out.println(" ");

        for (int i = drobnie.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(drobnie[i] + ", ");
            } else {
                System.out.print(drobnie[i]);
            }
        }

        System.out.println(" ");

        for (int i = proizvol.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(proizvol[i] + ", ");
            } else {
                System.out.print(proizvol[i]);
            }
        }


        System.out.println(" ");

        System.out.println("Задание 4.");
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0){
                massiv[i] +=1;
                System.out.print(massiv[i] + ", ");
            } 
        }
    }
}