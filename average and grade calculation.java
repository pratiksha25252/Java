// You are using Java
class Student{
    int roll;
    int m1;
    int m2;
    int m3;
    Student(int r,int a,int b,int c){
        roll=r;
        m1=a;
        m2=b;
        m3=c;
    }
    void display(){
        System.out.println("ROll:"+roll+"marks:"+m1+","+m2+","+m3);
    }
    
    class gradecal{
        int avg;
        void calavg(){
           // int avg;
            avg=(m1+m2+m3)/3;
            System.out.println("avg  "+avg);
        }
        void calgrade(){
            if (avg>90){
                System.out.println("Grade : A");
            }
            else if (avg>80 && avg<90){
                System.out.println("Grade : B");
            }
            else{
                System.out.println("Grade : C");
            }
        }
        
        
    }
    
}
class Main{
    public static void main(String args[]){
        Student s= new Student(101,50,60,70);
        Student.gradecal t= s.new gradecal();
        t.calavg();
        t.calgrade();
    }
}