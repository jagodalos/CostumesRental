package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javafx.scene.layout.Border;
import model.CostumeCollection;
import model.CustomerCostumeTableModel;

public class CartPanel extends JPanel {

	private JPanel panel;
	private JTable cartTable;
	private JPanel topPanel;
	
	public CartPanel() {

		super();
		this.setLayout(new BorderLayout());
		JPanel customerPanel = new JPanel();
		customerPanel.setLayout(new FlowLayout());

		JLabel yourCustomerLabel = new JLabel("Your customer");
		customerPanel.add(yourCustomerLabel);

		JTextField customerTextField = new JTextField("", 10);
		customerTextField.setEditable(false);
		customerPanel.add(customerTextField);

		JButton button = new JButton("...");
		customerPanel.add(button);

		this.add(customerPanel, BorderLayout.NORTH);
		CostumeCollection collection = new CostumeCollection();
		collection.fillWithitems();

		cartTable = new JTable(new CustomerCostumeTableModel(collection.getCostumes()));
		cartTable.setBorder(BorderFactory.createRaisedBevelBorder());
		JScrollPane scroll = new JScrollPane(cartTable);
		this.add(scroll, BorderLayout.CENTER);

		JPanel customerConfirmationPanel = new JPanel();
		customerConfirmationPanel.setLayout(new FlowLayout());

		JLabel priceLabel = new JLabel("Price");
		customerConfirmationPanel.add(priceLabel);

		JTextField priceTextField = new JTextField("", 3);
		priceTextField.setEditable(false);
		customerConfirmationPanel.add(priceTextField);

		JButton confirmButton = new JButton("Confirm");
		customerConfirmationPanel.add(confirmButton);

		this.add(customerConfirmationPanel, BorderLayout.SOUTH);
	}

}
