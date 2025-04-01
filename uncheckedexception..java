// You are using Java
import java.io.*;
class Main{
    static void divide(int a,int b) throws ArithmeticException{
        System.out.println(a/b);
        
    }
    public static void main(String args[]){
        int a=10;
        int b=6;
        try{
            divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        }
    }
    