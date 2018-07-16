package sec21.ex01_gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

class PrintActionListener implements ActionListener {
	JTable table;

	PrintActionListener(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel(); //model(������)
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		for (int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
}

public class WindowExample7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("������ ��� ���α׷�");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		String colNames[] = { "�̸�", "����", "����" };
		Object data[][] = { { "��ö��", 24, '��' }, { "�̼���", 21, '��' }, { "������", 26, '��' } };
		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);

		button.addActionListener(new PrintActionListener(table));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
