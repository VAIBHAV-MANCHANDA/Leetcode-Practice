import java.util.*;
public class Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int l = sc.nextInt();
        System.out.println("Enter values");
        int[] arr=new int[l];
        for(int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        map.forEach((key,value) -> 
            System.out.println(key+"->"+value)
        );
        
        sc.close();
    }
}
