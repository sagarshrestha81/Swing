import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingLogin {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login Demo");
		frame.setSize(500,500);
		frame.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(20, 40, 100, 25);
		frame.add(usernameLabel);
		
		JTextField usernameField = new JTextField();
		usernameField.setBounds(90, 40, 200, 25);
		frame.add(usernameField);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(20, 80, 100, 25);
		frame.add(passwordLabel);
		
		JPasswordField PasswordField = new JPasswordField();
		PasswordField.setBounds(90, 80, 200, 25);
		frame.add(PasswordField);
		
		JButton loginButton = new JButton("Log In");
		loginButton.setBounds(90, 115, 70, 30);
		frame.add(loginButton);
		
		loginButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			String username =usernameField.getText();
			String password =PasswordField.getText();
//			System.out.println("Username is "+username+"password is "+password);
//			JOptionPane.showMessageDialog(null, 
//				"Username is "+username+"password is "+password,
//					"Message!",JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, 
			"Username is "+username+"password is "+password,
			"Message!",JOptionPane.ERROR_MESSAGE);
	JOptionPane.showMessageDialog(null, 
			"Username is "+username+"password is "+password,
			"Message!",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		frame.setVisible(true);
	}
	
}
