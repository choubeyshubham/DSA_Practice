package data.Arrays;

import java.util.Arrays;

public class MoveAllZeroes {

    void main() {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};//[1, 2, 4, 3, 5, 0, 0, 0]
        System.out.println(Arrays.toString(move(arr)));
    }



    public static int[] move(int[] arr) {
        int index = 0;
        for (int a : arr)
            if (a != 0)
                arr[index++] = a;
        while (index < arr.length)
            arr[index++] = 0;
        return arr;
    }




}
