import java.util.Scanner;
class Student{

    float percentage(float total,float n)
    {
        float per=(float)total/n;
        return per;
    }
    String grade1(float per)
    {
        if(per>95&&per<=100)
        {
            return "O";
        }
        else if(per>90&&per<=95)
        {
            return "A+";
        }
        else if(per>80&&per<=90)
        {
            return "A";
        }
        else if(per>70&&per<=80)
        {
            return "B+";
        }
        else if(per>60&&per<=70)
        {
            return "B";
        }
        else if(per>50&&per<=60)
        {
            return "C";
        }
        else if(per>35&&per<=50)
        {
            return "D";
        }
        else if(per>=0&&per<=35)
        {
            return "F";
        }
        return "";
        
    }

    public static void main(String []args)
    {
        Student obj=new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("                            ----------------------------------------------------");
        System.out.println("                            |              STUDENT GRADE CALCULATOR            |");
        System.out.println("                            ----------------------------------------------------");
        System.out.print("Enter the Count How Many Subjects You Have: ");
        int n=sc.nextInt();
        System.out.println();
        System.out.println("Enter The All Subject Marks that You have got out of 100");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            if(m>=0&&m<=100)
            {
                arr[i]=m;
            }
            else{
                System.out.println("Enter Valid Marks Only in Between 0 to 100");
                i--;
            }
        }
        
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
                total=total+arr[i];
        }
        float per=obj.percentage(total,n);

        String grade=obj.grade1(per);


        System.out.println("          <----Student Marks---->        ");
        System.out.println("Total Marks | Average Percentage | Grade");
        System.out.print("    "+total+"    "+"         ");System.out.printf("%.2f",per);
        System.out.println("        "+"   "+grade);
        sc.close();
    }
    
}