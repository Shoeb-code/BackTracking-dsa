package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class subset_78 {
    public static void main(String[] args) {
        int [] arr={1,2,3};

        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
      Subsets(arr,0,ll,ans);
        System.out.println(ans);
    }
    public static void Subsets(int [] arr,int idx,List<Integer> ll,List<List<Integer>> ans){
if (idx==arr.length){
    ans.add(new ArrayList<>(ll));
    return;
         }

        Subsets(arr,idx+1,ll,ans);
        ll.add(arr[idx]);
        Subsets(arr,idx+1,ll,ans);
        ll.remove(ll.size()-1);

    }
}
