package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III_216 {
    public static void main(String[] args) {
        int [] arr=new int[7];
        for (int i=0; i< arr.length; i++){
            arr[i]=i+1;
        }
        int k=3;
        int sum=7;
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        CombinationSum3(arr,k,0,sum,0,ll,ans);
        System.out.println(ans);
    } // 1 2 3 4 5 6 7 8 9
    public static  void CombinationSum3(int [] arr,int k,int p,int sum,int idx, List<Integer> ll,List<List<Integer>> ans ){

        if (sum==0 && p==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i=idx; i<arr.length; i++){
            if (sum>0 && k>p){
                ll.add(arr[i]);
                CombinationSum3(arr,k,p+1,sum-arr[i],i+1,ll,ans);
                ll.remove(ll.size()-1);
            }
        }




    }




}
