import java.util.*;
//using HashSet
public class RemoveDuplicate {
    public static void main(String[] args){
        RemoveDuplicate ob =new RemoveDuplicate();
        ob.remove();
    }

    public void remove(){
        int arr[]={1,2,2,3,4,4,5};
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);              
        }

        System.out.println(set);
    }
}

