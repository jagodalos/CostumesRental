package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Customer;
import view.View;

public class AddCustomerButtonListener implements ActionListener {

	private View view;

	public AddCustomerButtonListener(View view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String customerName = view.getShopPanel().customerTextField.getText();
		System.out.println("Add customer");
		view.getShopPanel().addCustomer(new Customer(customerName));

	}
}
