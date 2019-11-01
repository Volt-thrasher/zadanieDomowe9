package z3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 0, 4, 5};
        int[] array2 = new int[5];

        int[] chArray1 = Array.changeArray(array1,2);
        int[] chArray11 = Array.changeArray(array1,array1.length);
        int[] chArray2 = Array.changeArray(array2,1);
        System.out.println(Arrays.toString(chArray1));
        System.out.println(Arrays.toString(chArray11));
        System.out.println(Arrays.toString(chArray2));
    }
}
