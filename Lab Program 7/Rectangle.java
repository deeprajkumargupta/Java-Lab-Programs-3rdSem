import java.util.Scanner;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void display() {
        System.out.println("Rectangle Dimensions (Widthxheight): " + width + " X " + height);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Before Resizing:");
        rect.display();

        System.out.print("Enter new Width: ");
        int w=sc.nextInt();
        System.out.print("Enter new Height: ");
        int h=sc.nextInt();
        rect.resizeWidth(w);
        rect.resizeHeight(h);

        System.out.println("\nAfter Resizing:");
        rect.display();
    }
}