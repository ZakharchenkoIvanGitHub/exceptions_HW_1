//task_1
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

//task_2
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

//task_3
//* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих
// массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class HW_1 {
    public static void main(String[] args) {
        //task_1_ArithmeticException();
        //task_1_ArrayIndexOutOfBoundsException();
        //task_1_NullPointerException();

        //int [] arr = task_2(new int[]{1,2,3,4}, new int[]{5,6,7});
        //if (arr == null) System.out.println("Размеры массивов не совпадают");

        int [] arr3 = task_3(new int[]{1,2,3,4}, new int[]{5,6,7,0});



    }

    public static void task_1_ArithmeticException() {
        int x = 2 / 0;
    }

    public static void task_1_ArrayIndexOutOfBoundsException() {
        int[] x = new int[]{1, 2, 3, 4, 5};
        int a = x[5];
    }

    public static void task_1_NullPointerException() {
        Integer x = null;
        x++;
    }

    public static int[] task_2(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            int[] res = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                res[i] = arr1[i] - arr2[i];
            }
            return res;
        } else
            return null;
    }

    public static int[] task_3(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {
            int[] res = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0){
                    throw new RuntimeException("Ошибка деления на 0");
                }else {
                res[i] = arr1[i] / arr2[i];}
            }
            return res;
        } else
            throw new RuntimeException("Длинны массивов не совпадают");
    }

}
