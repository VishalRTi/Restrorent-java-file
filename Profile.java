import java.util.Scanner;
public class Profile 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        byte age=sc.nextByte();
        if(age>=18)
        {
            System.out.println("You are Allowed To Vote in The Election");
            System.out.println("Please Enter Your Area Pincode to Check Your Area Candidate:");
            int Pincode=sc.nextInt();
            if (true)
            {
                String bjp="Vishal";
                String Congress="Pritam";
                String Shivsena="Pritam1";
                System.out.println("The Candidate of Different Patry Candidates are:"+bjp +Congress +Shivsena);
            }
        }

        sc.close();
    }
}
