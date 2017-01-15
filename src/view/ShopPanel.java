package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.CostumeTableModel;
import model.HistoryTableModel;

public class ShopPanel extends JPanel {
	
	public JButton rentCostumesButton;
	
	public ShopPanel(){
		
		setLayout(new BorderLayout());
		JTable costumeTable = new JTable(new CostumeTableModel());
//		JTable costumeTable = new JTable(new CustomerCostumeTableModel());
		costumeTable.setBorder(BorderFactory.createRaisedBevelBorder());
		JScrollPane scroll = new JScrollPane(costumeTable);
		this.add(scroll, BorderLayout.CENTER);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout());
		rentCostumesButton = new JButton("Rent");
		JButton newCostumeButton = new JButton("New Costume");
		buttonsPanel.add(rentCostumesButton);
		buttonsPanel.add(newCostumeButton);
		
		this.add(buttonsPanel, BorderLayout.SOUTH);
		
	}

}
