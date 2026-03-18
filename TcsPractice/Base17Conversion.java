// 2. Base 17 Conversion
// Given a string input representing a number in Base 17 (where A=10, B=11... G=16), 
// convert it to a decimal (Base 10) integer.
// Input: 1A
// Output: 27
public class Base17Conversion {
    public static void main(String[] args){
        Base17Conversion ob = new Base17Conversion();
        System.out.println(ob.converted("A1"));
    }
    public int converted(String n){
        return Integer.parseInt(n,17);
    }
}
