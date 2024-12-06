package np.edu.nast.sort;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    void ascending(int[] nums){
        Arrays.sort(nums);
        for(int n:nums){
            System.out.println(n);
        }
    }
    void descending(Integer[] nums){
        Arrays.sort(nums, Collections.reverseOrder());
        for(int n:nums){
            System.out.println(n);
        }
    }
}
