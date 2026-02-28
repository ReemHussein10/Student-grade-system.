public class Student {
    private String name;
    private double grade1,grade2,grade3,grade4;
    private int h1,h2,h3,h4;

    private double gpa;
    
    public Student(String name,double grade1,double grade2,double grade3,double grade4,
        int h1,int h2,int h3,int h4){
            this.name=name;
            this.grade1=grade1;
            this.grade2=grade2;
            this.grade3=grade3;
            this.grade4=grade4;
            this.h1=h1;
            this.h2=h2;
            this.h3=h3;
            this.h4=h4;
        }   

    public void calcGpa(){
        int totalHours= h1+h2+h3+h4;
        gpa =(grade1*h1 + grade2*h2 + grade3*h3 + grade4*h3)/ totalHours;
    }
    public double getGpa(){
       return gpa; 
    }
    public String getGrade(){
        if (gpa>=90)
            return "A+";
        else if(gpa>=85&&gpa<90)
            return "A";
        else if(gpa>=80&&gpa<85)
            return "B+";
        else if(gpa>=75&&gpa<80)
            return "B";
        else if(gpa>=70&&gpa<75)
            return "C+";
        else if(gpa>=65&&gpa<70)
            return "C";
        else if(gpa>=60&&gpa<65)
            return "D+";
        else if(gpa>=50&&gpa<60)
            return "D";
        else return "F";
    }
    public void printRes(){
        
        System.out.println("name is : " + name);
        System.out.println( "gpa is : " + gpa);
        System.out.println( "grade is : "+getGrade());
        System.out.println( "****************************************");

    }
}