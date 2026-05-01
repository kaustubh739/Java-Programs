import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    public MarvellousLogin(String title, int width, int height)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // Username : Marvellous
    // Password : Marvellous@123
    public void actionPerformed(ActionEvent aobj)
    {
        String uname = tobj.getText();
        String pass = pobj.getText();

        if(uname.equals("Marvellous")) && (pass.equals("Marvellous@123"))
        {   
            Resultlabel.setText("Login Successful...");
        }
        else
        {
            Result.setText("Login Failed...");
        }
    }
}

class LoginFrameFinal
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",400,300);
    }
}