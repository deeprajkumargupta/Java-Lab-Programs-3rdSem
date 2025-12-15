import javax.swing.*;
import java.awt.event.*;
public class P10 extends JFrame
{
    public P10()
    {
        setTitle("Swing Button with Inheritance");
        setLayout(new java.awt.FlowLayout());
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 120, 40);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new P10();
    }
}