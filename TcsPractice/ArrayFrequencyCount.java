import java.util.*;
public class ArrayFrequencyCount{

    public static void main(String[] args){

        freq(new int[]{1,1,2,3,4,4,4,2,1});
    }

    public static void freq(int arr[]){

        Map <Integer, Integer> map = new HashMap<>();
        
        // Step 1 : Frequency
        for(int i:arr){
            
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }

            else{
                map.put(i,1);
            }
        }
        // System.out.println(map);

        // Step 2 : Get keys and sort
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        //Step 3 : Print result
        for(int key : keys){
            System.out.println(key+", "+map.get(key));
        }

    }

    
}