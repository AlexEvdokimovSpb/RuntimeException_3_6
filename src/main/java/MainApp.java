import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr1 = {4, 2, 0, 2, 3, 1, 7, 9};
        int[] arr2 = {1, 2, 1, 7};

        int[] arr3 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] arr4 = {1, 1, 1, 1, 1, 1};
        int[] arr5 = { 4, 4, 4, 4};
        int[] arr6 = { 1, 4, 4, 1, 1, 4, 3};

        try {
            int[] arr7 = takeAfterFour(arr);
            System.out.println(Arrays.toString(arr7));
        } catch (RuntimeException e) {
            System.out.println("В массиве нет 4!");
        }

        try {
            int[] arr8 = takeAfterFour(arr1);
            System.out.println(Arrays.toString(arr8));
        } catch (RuntimeException e) {
            System.out.println("В массиве нет 4!");
        }

        try {
            int[] arr9 = takeAfterFour(arr2);
            System.out.println(Arrays.toString(arr9));
        } catch (RuntimeException e) {
            System.out.println("В массиве нет 4!");
        }

        System.out.println(areFourAndOne(arr3));
        System.out.println(areFourAndOne(arr4));
        System.out.println(areFourAndOne(arr5));
        System.out.println(areFourAndOne(arr6));
    }


    public static int[] takeAfterFour(int arr[]) throws RuntimeException {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (arr.length-1); i >= 0; i--) {
            if (arr[i]!=4) {
                list.add(0, arr[i]);
                if (i==0){
                    throw new RuntimeException();
                }
            } else {
                break;
            }
        }
        int [] newArr = new int [list.size()];
        for (int i =0; i < list.size(); i++){
            newArr[i] = list.get(i);
        }
        return newArr;
    }


    public static boolean areFourAndOne (int arr[]) {
        boolean isOne = false;
        boolean isFour = false;
        boolean isnotFourOrOne = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                isOne = true;
            }
            if (arr[i]==4) {
                isFour = true;
            }
            if ( (arr[i]!=4) && (arr[i]!=1) ) {
                isnotFourOrOne = true;
            }
        }
        if (isOne && isFour && !isnotFourOrOne) {
            return true;
        } else {
            return false;
        }
    }

}