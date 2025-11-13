import java.util.Scanner;

public class Student {
    String USN, Name, Branch, Phone;
    static Scanner sc=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter USN: ");
        USN=sc.next();
        System.out.println("Enter Name:");
        Name=sc.next();
        System.out.println("Enter Branch: ");
        Branch=sc.next();
        System.out.println("Enter Phone: ");
        Phone=sc.next();
    }
    public void display()
    {
        System.out.println("USN: "+USN);
        System.out.println("Name: "+Name);
        System.out.println("Branch: "+Branch);
        System.out.println("Phone: "+Phone);
    }
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        Student s[]= new Student[n];
        for(i=0;i<n;i++)
        {
            s[i]=new Student();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter "+(i+1)+" Student Details:");
            s[i].read();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nThe Student Details are: ");
            s[i].display();
        }
    }
}
