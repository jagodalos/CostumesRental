package controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.RentalShopData;
import view.View;

public class App {

	private View view;
	private RentalShopData shop;

	
	public App(View view, RentalShopData shop) {

		this.view = view;
		this.shop = shop;
		
		addListenerToAddCostumeButton (new AddToCostumeButtonListener(view, shop));
		addListenerToAddCustomerButton(new AddCustomerButtonListener(view, shop));
		addListenerToRentButton(new RentButtonListener(view, shop));
		
		view.setVisible(true);
	}

	private void addListenerToRentButton(RentButtonListener rentButtonListener) {
		view.getShopPanel().rentCostumesButton.addActionListener(rentButtonListener);
		
	}

	private void addListenerToAddCustomerButton(AddCustomerButtonListener addCustomerButtonListener) {
		view.getShopPanel().addCustomerButton.addActionListener(addCustomerButtonListener);
		
		
	}

	private void addListenerToAddCostumeButton(ActionListener addCostumeButtonListener) {
		view.getShopPanel().addCostumeButton.addActionListener(addCostumeButtonListener);
		
	}
	
	

	public static void setDefaultSize(int size) {

		Set<Object> keySet = UIManager.getLookAndFeelDefaults().keySet();
		Object[] keys = keySet.toArray(new Object[keySet.size()]);

		for (Object key : keys) {

			if (key != null && key.toString().toLowerCase().contains("font")) {

				System.out.println(key);
				Font font = UIManager.getDefaults().getFont(key);
				if (font != null) {
					font = font.deriveFont((float) size);
					UIManager.put(key, font);
				}
			}
		}
	}

	static public void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
                setDefaultSize(16);
				View view = new View();
				
		
				RentalShopData shopModel = new RentalShopData();
				App shop = new App(view, shopModel);
            }
		});
	}
}
