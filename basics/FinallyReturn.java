package examples.basics;

import java.util.*;
class FinallyReturn {
    public int finallyReturnTest(int a, int b){
        try{
            System.out.println("In Try Block");
            int c= a/b;
            return c;
        }
        catch(Exception e){
            System.out.println("In Catch Block \nThe Input you gave was not supported so output is");
            return 0;
        }
        finally {
            System.out.println("In Finally Block");
            return a;
        }
        
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        FinallyReturn m = new FinallyReturn();
        System.out.println(m.finallyReturnTest(sc.nextInt(),sc.nextInt())
            );
            sc.close();
            /*
Test Case 1:
3
0
In Try Block
In Catch Block 
The Input you gave was not supported so output is
In Finally Block
3

=== Code Execution Successful ===
Test Case 2:
3
4
In Try Block
In Finally Block
3

=== Code Execution Successful ===
            */
    }
}
