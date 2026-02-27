package data.Arrays;

import java.util.Arrays;

public class MoveAllZeroes {

    void main() {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println(Arrays.toString(move1(arr)));


    }

    public static int[] move0(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int a : arr)
            if (a != 0)
                temp[index++] = a;
        System.arraycopy(temp, 0, arr, 0, arr.length);
        return temp;
    }


    public static int[] move1(int[] arr) {
        int index = 0;
        for (int a : arr)
            if (a != 0)
                arr[index++] = a;
        while (index < arr.length) arr[index++] = 0;
        return arr;
    }


}
