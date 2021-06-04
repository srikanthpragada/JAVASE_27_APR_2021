package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.nio.channels.IllegalBlockingModeException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutDemo extends JFrame {
	public NullLayoutDemo() {
		super("Hello"); // Title of Frame
		JLabel lbl = new JLabel("Hello Swing!");
		Container c = this.getContentPane();
		c.setLayout(null);
		lbl.setBounds(10, 10, 300,50);
		c.add(lbl);
	}

	public static void main(String[] args) {
		NullLayoutDemo f = new NullLayoutDemo();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 200);
		f.setVisible(true);
	}

}
