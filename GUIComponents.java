import javax.swing.*;

public class GUIComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		
		JLabel jlblName = new JLabel("Enter your name: ");
		
		JTextField jtfName = new JTextField("Type Name Here");
		
		JCheckBox jcbkItalic = new JCheckBox("Italic");
		JCheckBox jcbkBold = new JCheckBox("Bold");
		
		JRadioButton jrbRed = new JRadioButton("Red");
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		
	
		JComboBox jcboColor = new JComboBox(new String[] {"Freshman", "Sophmore", "Junior", "Senior"});
		
		JPanel panel = new JPanel();
		
		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jcbkItalic);
		panel.add(jcbkBold);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Show GUI Components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
 	}

}
