import java.util.*;
public class basics {
    public static void main(String[] args) {
        //Input Taking

        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the Radius of the Circle ");
        // int num = sc.nextInt();
        // System.out.println(num*num*3.14);
        // System.out.print(num+2);

        //Type Casting

        // float a = 24.10f;
        // int b = (int)a;
        // System.out.println(b);
        // sc.close();

        //IF ELSE STATEMENT

        // int num =sc.nextInt();
        // int b =sc.nextInt();

        // if(a>b){
        //     System.out.print("Number "+a+" is bigger");
        // }else{
        //     System.out.print("Number "+b+" is bigger");
        // }

        // if(num%2==0){
        //     System.out.print("even");
        // }else{
        //     System.out.print("odd");

        // }
        
        // Ternary Operator

        int larger = (5<2)?5:2;
        System.out.print(larger);

        boolean num = (6%2==0)?true:false;
        System.out.println(num);

    }    
}
