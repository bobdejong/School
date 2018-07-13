package sec21.ex01_gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ConfirmActionListener implements ActionListener {
	JTextField text;
	JLabel label;
	ConfirmActionListener(JTextField text, JLabel label){
		this.text=text;
		this.label=label;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name = text.getText();
		label.setText("Hello. "+name);
}
}
public class WindowExample2 {

	public static void main(String[] args) {
		JFrame f= new JFrame("Hello, Java Program");
		f.setLocation(500, 400);
		f.setPreferredSize(new Dimension(200,80));
		Container contentPane = f.getContentPane();
		JTextField text = new JTextField();
		JButton button = new JButton("»Æ¿Œ");
		JLabel label = new JLabel("Test Program");
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(button,BorderLayout.EAST);
		contentPane.add(label,BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmActionListener(text,label);
		button.addActionListener(listener);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.pack();
		f.setVisible(true);
		
		
		
	}

}
