package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javafx.scene.layout.Border;

public class CartPanel extends JPanel {
	
	 //private JTextField;
	private JPanel panel;
	
	public CartPanel(){
		
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
		 
//	        panel = new JPanel();
//	        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
//	        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
//	        panel.setLayout(boxLayout);
//	        
	}
	 
	 private JLabel createSelectShopLabel() {
	        JLabel selectShopLabel = new JLabel("Select shop");
	        selectShopLabel.setAlignmentX(LEFT_ALIGNMENT);
	        return selectShopLabel;
	    }

}
