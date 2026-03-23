import java.util.*;
public class Base17toDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base17 number:");
        String n=sc.next();
        int base=17;
        int value=0;
        int result=0;
        for (int i =0;i<n.length();i++){
            char ch = n.charAt(i); // ch=5, D
            if(ch>='0' && ch<='9')
                value=ch-'0'; // 0=48; value= 53-48
            else
                value=ch-'A'+10; // D-A =3 ; 3+10=13
            result = result*base + value;
        }
        System.out.print(result);
        sc.close();
    }
}
