import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Swing Demo");
		frame.setSize(800,300);
		JLabel helloLabel = new JLabel("Hello World");
		frame.add(helloLabel);
		frame.setVisible(true);
	}
}