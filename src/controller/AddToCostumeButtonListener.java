package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jdk.management.resource.internal.ResourceNatives;
import model.Costume;
import model.RentalShopData;
import view.View;

public class AddToCostumeButtonListener implements ActionListener {
	
	private View view;
	private RentalShopData model;
	
	public AddToCostumeButtonListener(View view, RentalShopData model) {
		super();
		this.view = view;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String costumeName = view.getShopPanel().costumeTextField.getText();
		try {
			Integer price = Integer.parseInt(view.getShopPanel().priceTextField.getText());
			Costume costume = new Costume(costumeName,price);
			view.getShopPanel().costumes.add(costume);
			view.getShopPanel().costumeTableModel.fireTableDataChanged();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(view,
				    "Given price is not integer!",
				    "Price error",
				    JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	

}
