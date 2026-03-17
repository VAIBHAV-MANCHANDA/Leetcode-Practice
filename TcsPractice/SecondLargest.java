import java.util.*;
public class SecondLargest {
    
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        SecondLargest ob = new SecondLargest();
        System.out.println("Second Largest "+ob.find());
    }
    
    public int find(){
        System.out.println("Enter length for array");
        int length=sc.nextInt();
        System.out.println("Enter values for array");
        int[] arr = new int[length];

        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0], secondMax=Integer.MIN_VALUE;
        for(int i=0; i<length; i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if( arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        
    }
    return secondMax;
    }
}
