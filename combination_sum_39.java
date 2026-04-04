package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {
    public static void main(String[] args) {
        int [] coin={2,3,6,7};
        int amount =7;
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        CombinatonSum(coin,amount,0,ans,ll);
        System.out.println(ans);
    }
    public static void CombinatonSum(int [] coin , int amount ,int idx,List<List<Integer>> ans,List<Integer> ll ){
   if (amount==0){
       ans.add(new ArrayList<>(ll));
       return;
   }

       for (int i=idx; i<coin.length; i++){
           if (amount>=coin[i]){
               ll.add(coin[i]);
               CombinatonSum(coin,amount-coin[i],i,ans,ll);
               ll.remove(ll.size()-1);
           }

       }

    }
}
