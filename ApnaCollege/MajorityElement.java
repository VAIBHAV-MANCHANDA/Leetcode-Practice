// more than n/3 times
// nums[] = {1,3,2,5,1,3,1,5,1} 
// n/3= 9/3= 3 
// anything greater than 3 , answer 4
// {1,2} output: 1,2


import java.util.*;
public class MajorityElement{
    public static void main(String[] args){
        int nums[] = {1,3,2,5,1,3,1,5,1} ;
        display(nums);
    }

    public static void display(int nums[]){
        int n = nums.length;
        int calc = n/3;

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int num : nums){

            // if(map.containsKey(num))
            //     map.put(num, map.get(num)+1);
            // else
            //     map.put(num, 1);

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            if(map.get(key) > n/3)
                System.out.println(key);
        }
    }
}