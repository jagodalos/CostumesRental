package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Customer;
import model.RentalShopData;
import view.View;

public class AddCustomerButtonListener implements ActionListener {
	
	private View view;
	private RentalShopData model;
	
	public AddCustomerButtonListener(View view, RentalShopData model) {
		super();
		this.view = view;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String customerName = view.getShopPanel().customerTextField.getText();
		System.out.println("Add customer");
		view.getShopPanel().addCustomer(new Customer(customerName));
		
	}

}
