import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JPasswordField pobj;
    JLabel Userlabel, Passlabel, Resultlabel;
    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        

        Userlabel = new Jlabel("Username");
        Userlabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        Passlabel = new JLabel("Password");
        Passlable.setBounds(50,100,100,30);

        Pobj = new JPasswordField();
        pobj.setBounds(50,100,150,30);
        
        bobj = new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,150,100,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(User label);
        fobj.add(Pass label);
        fobj.add()

        fobj.addActionListener(this);

        fobj.setLayout(null);



        fobj.setSize(width,height);





        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ActionPerformed(ActionEvent aobj)
    {
        Resultlabel.setText("Button clicked...");
    }
}

class LoginFrame3
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",400,300);
    }
}