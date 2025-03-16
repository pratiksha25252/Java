// You are using Java
import java.util.Scanner;
class eg{
public static void main(String args[]){
if(args.length==0)
{
System.out.println("no args passed");
}else{
System.out.println("args passed");
int sum=0;
for(int i=0;i<args.length;i++){
int x=Integer.parseInt(args[i]);
}
sum=sum+x;
System.out.println(sum);

}
}
}