package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javafx.scene.control.Button;
import model.Costume;
import model.CostumeTableModel;
import model.Customer;
import model.HistoryTableModel;

public class ShopPanel extends JPanel {
	
	public JButton rentCostumesButton;
	public JButton addCustomerButton;
	public JButton addCostumeButton;
	public JTextField customerTextField;
	public JTextField priceTextField;
	public JTextField costumeTextField;
	public JTable costumeTable;
	public CostumeTableModel costumeTableModel;
	
	public ArrayList<Costume> costumes;
	
	public ShopPanel(){
		
		JPanel tempPanel;
		this.setLayout(new BorderLayout());
		
		JPanel costumePanel = new JPanel();
		costumePanel.setLayout(new BorderLayout());
		costumes = getAllCostumes();
		
		costumeTableModel = new CostumeTableModel(costumes);
		costumeTable = new JTable(costumeTableModel);
		costumeTable.setBorder(BorderFactory.createRaisedBevelBorder());
		JScrollPane scroll = new JScrollPane(costumeTable);
		costumePanel.add(scroll);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout());
		buttonsPanel.add(generateCustomerComboBox());
		rentCostumesButton = new JButton("Rent");
		buttonsPanel.add(rentCostumesButton);
		
		costumePanel.add(buttonsPanel, BorderLayout.SOUTH);
		
		this.add(costumePanel, BorderLayout.CENTER);
		
		
		JPanel managePanel = new JPanel();
		managePanel.setLayout(new BoxLayout(managePanel, BoxLayout.PAGE_AXIS));
		
		JPanel addCustomerPanel = new JPanel();
		addCustomerPanel.setLayout(new BoxLayout(addCustomerPanel, BoxLayout.LINE_AXIS));
		tempPanel = new JPanel();
		tempPanel.setLayout(new FlowLayout());
		JLabel yourCustomerLabel = new JLabel("Customer name");
		tempPanel.add(yourCustomerLabel);
		customerTextField = new JTextField("", 5);
		tempPanel.add(customerTextField);
		addCustomerButton = new JButton("Add");
		tempPanel.add(addCustomerButton);
		addCustomerPanel.add(tempPanel);
		managePanel.add(addCustomerPanel);
	
		
		JPanel addCostumePanel = new JPanel();
		addCostumePanel.setLayout(new BoxLayout(addCostumePanel, BoxLayout.PAGE_AXIS));
		tempPanel = new JPanel();
		tempPanel.setLayout(new FlowLayout());
		JLabel yourCostumeLabel = new JLabel("Costume name");
		tempPanel.add(yourCostumeLabel);
		costumeTextField = new JTextField("", 5);
		tempPanel.add(costumeTextField);
		addCostumePanel.add(tempPanel);
		tempPanel = new JPanel();
		JLabel yourPriceLabel = new JLabel("Price");
		tempPanel.add(yourPriceLabel);
		priceTextField = new JTextField("",5);
		tempPanel.add(priceTextField);
		addCostumePanel.add(tempPanel);
		addCostumeButton = new JButton("Add costume");
		addCostumePanel.add(addCostumeButton);
		
		managePanel.add(addCostumePanel);
		
		this.add(managePanel, BorderLayout.EAST);
		
		
		
	}

	private ArrayList<Costume> getAllCostumes() {
		Random generator = new Random();
		ArrayList <Costume> costumes = new ArrayList<>();

		String[] starWarsCostumes = { "Princess Leia", "Jawa", "Jabba", "Jar Jar", "Darth Vader", "Yoda",
				"Queen Amidala", "Ewok", "Yoda", "Chewbacca" };
		
		for (String item : starWarsCostumes){
			costumes.add(new Costume(item,generator.nextInt(300)+ 80));
		}
		
		String[] superHeroesCostumes = {"Wonder Woman", "Deadpool", "Batman" ,"Hulk" ,"SpiderMan" ,"Black Widow","Harley Quinn"};
		
		for(String item : superHeroesCostumes){
			costumes.add(new Costume(item, generator.nextInt(200) + 70));
		}
		
		String[] halloweenCostumes = {"Vampire", "Mummy", "Skeleton", "Witch", "Tooth Fairy", "Ghost"};
		
		for(String item : halloweenCostumes){
			costumes.add(new Costume(item, generator.nextInt(150) + 50));
		}
		return costumes;
	}
     private DefaultComboBoxModel model;
     private JComboBox comboBox;
	private Component generateCustomerComboBox() {
		Vector comboBoxItems=new Vector();
	    comboBoxItems.add(new Customer("A"));
	    comboBoxItems.add(new Customer("B"));
	    comboBoxItems.add(new Customer("C"));
	    comboBoxItems.add(new Customer("D"));
	    model = new DefaultComboBoxModel(comboBoxItems);
	    comboBox = new JComboBox(model);
	    return comboBox;
	    
	}
	
	public void addCustomer(Customer customer){
		model.addElement(customer);
		
	}
	
	public Customer getSelectedCustomer(){
		return (Customer)comboBox.getSelectedItem();
	}

}
