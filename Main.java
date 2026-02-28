import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter number of students : ");
        int num = input.nextInt();
        input.nextLine();

        String topname="";
        double topGpa=-1;

        for(int i=1;i<=num;i++){
            System.out.println("Student : "+i);


            System.out.print("Enter Name : ");
            String name=input.nextLine();

            double g1;
            do{
            System.out.print("Enter grade1 : ");
            g1=input.nextDouble();
            if(g1<0 ||g1>100){
            System.out.println("invalid grade! enter number between 0 to 100");}
              }while(g1<0||g1>100);
            System.out.print("Enter hours of subject 1 : ");  
            int h1 = input.nextInt();

            double g2;
            do{
            System.out.print("Enter grade2 : ");
            g2=input.nextDouble();
            if(g2<0 ||g2>100){
            System.out.println("invalid grade! enter number between 0 to 100");}
              }while(g2<0||g2>100);
              System.out.print("Enter hours of subject 2 : ");  
            int h2 = input.nextInt();


            double g3;
            do{
            System.out.print("Enter grade3 : ");
            g3=input.nextDouble();
              if(g3<0 ||g3>100){
                 System.out.println("invalid grade! enter number between 0 to 100");}
            }while(g3<0||g3>100);
            System.out.print("Enter hours of subject 3 : ");  
            int h3 = input.nextInt();


            double g4;
            do{
            System.out.print("Enter grade4 : ");
             g4=input.nextDouble();
               if(g4<0 ||g4>100){
                 System.out.println("invalid grade! enter number between 0 to 100");}
             }while(g4<0||g4>100);
             System.out.print("Enter hours of subject 4 : ");  
            int h4 = input.nextInt();


            input.nextLine();
         
           Student s1=new Student(name,g1,g2,g3,g4,h1,h2,h3,h4 );
           s1.calcGpa();
           if(s1.getGpa()>topGpa){
              topGpa=s1.getGpa();
              topname=name;
          }
          System.out.println("Student "+i+" information");
          s1.printRes();
        }
        
        System.out.println("Top student is "+topname );
    }
    

}
