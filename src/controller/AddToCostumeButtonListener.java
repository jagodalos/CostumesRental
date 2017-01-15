package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jdk.management.resource.internal.ResourceNatives;
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
		System.out.println("Wow");
		
	}
	
	

}
