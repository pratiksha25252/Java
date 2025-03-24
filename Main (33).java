// You are using Java


import java.time.LocalDate;
import java.util.Scanner;
class Datevalidator{
    public static String getdaytype(String date){
        String arr[]=date.split(" ");
        int y=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        int da=Integer.parseInt(arr[2]);
        LocalDate d =LocalDate.of(da,m,y);
        int dd=d.getDayOfWeek().getValue();
        if(dd== 6 || dd==7){
            return "Weekend";
        }
        else{
            return " Weekday";
        }
    }
}
    class Main{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String date=sc.nextLine();
         String s=   Datevalidator.getdaytype(date);
         System.out.println(s);        
        }
}