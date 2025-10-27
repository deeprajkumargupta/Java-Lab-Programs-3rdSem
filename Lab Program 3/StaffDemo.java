import java.util.Scanner;

class Staff {

    String staffID, name, phone, salary;

    Scanner sc = new Scanner(System.in);

    void read()
    {
        System.out.print("\nEnter your Staff ID: ");
        staffID = sc.next();
        System.out.print("Enter your Name: ");
        name = sc.next();
        System.out.print("Enter your Phone Number: ");
        phone = sc.next();
        System.out.print("Enter your Salary: ");
        salary = sc.next();
    }

    void display() {
        System.out.println("\nStaff Id: "+staffID + "\nName: "+ name + "\nPhone Number: "+ phone + "\nSalary: "+ salary);
    }
}

class Teaching extends Staff {
    String domain, publication;

    void read() {
        super.read();
        System.out.print("Enter your Domain: ");
        domain = sc.next();
        System.out.print("Enter your Publication: ");
        publication = sc.next();
    }

    void display() {
        super.display();
        System.out.println("Domain: "+ domain + "\nPublication: "+ publication);
    }
}

class Technical extends Staff {
    String Skills;

    void read() {
        super.read();
        System.out.print("Enter your Skills: ");
        Skills = sc.next();
    }

    void display()
    {
        super.display();
        System.out.println("Skills: "+ Skills);
    }
}

class Contract extends Staff {
    String period;

    void read() {
        super.read();
        System.out.print("Enter your Contract Period: ");
        period = sc.next();
    }

    void display()
    {
        super.display();
        System.out.println("Period: "+ period);
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of staff details to be created: ");
        int n = sc.nextInt();

        Teaching [] teach = new Teaching[n];
        Technical [] tech = new Technical[n];
        Contract [] c = new Contract[n];

        // Read Staff information under 3 categories

        System.out.println("\n\nEnter Teaching staff information: ");
        for (int i = 0; i < n; i++)
        {
            teach[i] = new Teaching();
            teach[i].read();
        }
        System.out.println("\n\nEnter Technical staff information: ");
        for (int i = 0; i < n; i++)
        {
            tech[i] = new Technical();
            tech[i].read();
        }
        System.out.println("\n\nEnter Contract staff information: ");
        for (int i = 0; i < n; i++)
        {
            c[i] = new Contract();
            c[i].read();
        }

        // Display Staff Information

        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("\n\n\n------TEACHING STAFF DETAILS------");
        for (int i = 0; i < n; i++) {
            teach[i].display();
        }
        System.out.println("\n------TECHNICAL STAFF DETAILS------");
        for (int i = 0; i < n; i++) {
            tech[i].display();
        }
        System.out.println("\n------CONTRACT STAFF DETAILS------");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
    }
}