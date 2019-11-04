package z3;

public class Array {
    public static int[] changeArray (int[] array, int a){
        int[] newArray = new int[array.length];
        if (array==null){
            return null;
        }else if (a==array.length) {
            return array;
        } else{
                for (int i = 0; i < array.length; i++) {
                    if (i < a) {
                        newArray[array.length-a+i] = array[i];
                    } else newArray[i-a] = array[i];
                }
                return newArray;
            }
        }
    }

