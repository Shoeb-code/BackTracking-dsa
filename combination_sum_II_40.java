package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class combination_sum_II_40 {
    public static void main(String[] args) {
         int [] arr={10,1,2,7,6,1,5};
         int target=8;
         Arrays.sort(arr);
         // 1 1 2 5 6 7 10
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        CombinationSum2(arr,target,0,ll,ans);
        System.out.println(ans);
    }
    public static  void CombinationSum2(int [] arr, int target, int idx, List<Integer> ll, List<List<Integer>> ans ) {

        if (target == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }  // 1 1 2 5 6 7 10
        for (int i = idx; i < arr.length; i++) {

            if (i!=idx && arr[i]==arr[i-1]){
                continue;
            }
            if (target > 0) {
                ll.add(arr[i]);
                CombinationSum2(arr,target - arr[i], i + 1, ll, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
}