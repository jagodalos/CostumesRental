package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javafx.scene.layout.Border;
import model.HistoryTableModel;

public class HistoryPanel extends JPanel {

	private JPanel panel;
	private JTable historyTable;
	private JPanel topPanel;
	public HistoryTableModel tableModel;
	
	public HistoryPanel() {

		super();
		this.setLayout(new BorderLayout());
		
		tableModel = new HistoryTableModel();
		historyTable = new JTable(tableModel);
		historyTable.setBorder(BorderFactory.createRaisedBevelBorder());
		JScrollPane scroll = new JScrollPane(historyTable);
		this.add(scroll, BorderLayout.CENTER);
	}
}
