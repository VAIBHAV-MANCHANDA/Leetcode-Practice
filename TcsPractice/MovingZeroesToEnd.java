import java.util.*;
public class MovingZeroesToEnd{

    public static void main(String[] args){
        
        zeroes();
    }

    public static void zeroes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter values of array");

        for(int i=0; i<l; i++){
            arr[i]=sc.nextInt();
        }

        int index=0;

        for(int i=0; i<l; i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i=index; i<l; i++){
            arr[i]=0;
        }

        for(int i=0; i<l; i++){
            System.out.print(arr[i]+", ");
        }


    }
}