import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaGUILayoutDemo extends JFrame {

	public JavaGUILayoutDemo() {
		JFrame frame1 = new JFrame("Flow Layout Demo");
		JFrame frame2 = new JFrame("Grid Layout Demo");
		JFrame frame3 = new JFrame("Border Layout Demo");
		FlowLayout flowLayout = new FlowLayout();
		GridLayout gridLayout = new GridLayout(2, 2);
		BorderLayout borderLayout = new BorderLayout();

		JPanel panel1 = new JPanel(flowLayout);
		JPanel panel2 = new JPanel(gridLayout);
		JPanel panel3 = new JPanel(borderLayout);

		JTextField [] textField = new JTextField[4];
		for (int i =0; i<textField.length; i++) {
			textField[i] = new JTextField(5);
			panel1.add(textField[i]);
		}	
		for (int i=0; i<textField.length; i++){	
			textField[i] = new JTextField(5);
			panel2.add(textField[i]);
		}	
		
		JTextField textField1 = new JTextField(5);
		JTextField textField2 = new JTextField(5);
		JTextField textField3 = new JTextField(5);
		JTextField textField4 = new JTextField(5);
		panel3.add(textField1, BorderLayout.NORTH);
		panel3.add(textField2, BorderLayout.SOUTH);
		panel3.add(textField3, BorderLayout.WEST);
		panel3.add(textField4, BorderLayout.EAST);
		frame1.setSize(300, 100);
		frame2.setSize(300, 100);
		frame3.setSize(400, 100);
		frame1.add(panel1);
		frame2.add(panel2);
		frame3.add(panel3);
		frame1.setVisible(true);
		frame2.setVisible(true);
		frame3.setVisible(true);
	}

	public static void main(String [] args) {
		new JavaGUILayoutDemo();
	}
}
