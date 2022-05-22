package com.company;
import java.util.*;
/*
Runtime-4ms
Memory Usage-44.2 MB
 */
public class Add_to_array_form_of_integer {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int N=num.length;
        int cur=k;
        List<Integer> ans=new ArrayList();
        int i=N;
        while(--i>=0 || cur>0){
            if(i>=0)
                cur+=num[i];
            ans.add(cur%10);
            cur/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
