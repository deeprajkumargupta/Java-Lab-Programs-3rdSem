import java.util.Stack;
import java.util.Scanner;
public class TOH {
    public static int N;
    public static Stack<Integer>tower[]=new Stack[4];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        tower[1]=new Stack<>();
        tower[2]=new Stack<>();
        tower[3]=new Stack<>();
        System.out.print("Enter the number of disks: ");
        int num=sc.nextInt();
        N=num;
        toh(num);
    }
    public static void toh(int n)
    {
        for(int i=n;i>0;i--)
            tower[1].push(i);
        display();
        move(n,1,2,3);
    }
    public static void move(int n, int a, int b, int c)
    {
        if(n>0)
        {
            move(n-1,a,c,b);
            int d=tower[a].pop();
            tower[c].push(d);
            display();
            move(n-1,b,a,c);
        }
    }
    public static void display()
    {
        System.out.println(" A | B | C\n-----------");
        for(int i=N-1;i>=0;i--)
        {
            String d1=" ",d2=" ",d3=" ";
            if(i<tower[1].size())
                d1=String.valueOf(tower[1].get(i));
            if(i<tower[2].size())
                d2=String.valueOf(tower[2].get(i));
            if(i<tower[3].size())
                d3=String.valueOf(tower[3].get(i));
            System.out.println(" "+d1+" | "+d2+" | "+d3);
        }
        System.out.println();
    }

}
