package Assignment3.module9;
import java.util.*;

public class Subsets {

    static void generateSubsets(int[] arr, int index, List<Integer> current) {

        if(index == arr.length) {
            System.out.println(current);
            return;
        }

        // include element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        // exclude element
        current.remove(current.size() - 1);
        generateSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}