import java.util.*;

public class SweetSeventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower and upper limit of range");
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        for(int i = lower; i<=upper; i++){

            int count=0;
            for(int j=1; j<=i;j++){
                if(i%j==0)
                    count++;               
            }
            if(count==2)
                    System.out.println(i);
        }
    }
}
