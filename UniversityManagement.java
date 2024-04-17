import java.awt.event.*;
import javax.swing.*;

class UniversityManagement{
    public static void InnerUniversityManagement() {
        JFrame f = new JFrame("University Management Website"); 
        JFrame f2=new JFrame();
		JLabel l1, l2; 
		JTextField t1, t2;  
        JButton b1,b2;
		l1 = new JLabel("Username : "); 
		l1.setBounds(600, 40, 200, 50); 
		l2 = new JLabel("Password : "); 
		l2.setBounds(600, 120, 200, 50); 
		t1 = new JTextField(""); 
		t1.setBounds(700, 50, 200, 30); 
		t2 = new JTextField(""); 
		t2.setBounds(700, 130, 200, 30); 
        b1=new JButton("Login");
        b1.setBounds(700, 200, 100, 30); 
        b2=new JButton("Reset");
        b2.setBounds(820, 200, 100, 30); 
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText().toString();
                String s2=t2.getText().toString();
                if("admin".equals(s1) && "admin".equals(s2)){
                    JOptionPane.showMessageDialog(f2,"Login Successful","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(f2,"Incorrect Credentials" , "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");

            }
        });
        
        f.add(l1); 
		f.add(t1); 
		f.add(l2); 
		f.add(t2); 
        f.add(b1);
        f.add(b2);
        f.setLayout(null); 
		f.setSize(1920, 1080); 
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true); 
        
        
    }
    public static void main(String[] args) {
        InnerUniversityManagement(); 
    }
}
       
       
    