package swing;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

	public GridLayoutDemo() {
		super("GridLayout Demo");
		Container c = getContentPane();
		c.setLayout(new GridLayout(0, 3));

		for (int i = 1; i <= 8; i++)
			c.add(new JButton("Button" + i));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setVisible(true);
	} // end of init

	public static void main(String args[]) {
		new GridLayoutDemo();
	}

}
