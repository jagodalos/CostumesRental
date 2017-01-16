package controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.View;

public class App {

	private View view;

	public App(View view) {

		this.view = view;

		addListenerToAddCostumeButton(new AddToCostumeButtonListener(view));
		addListenerToAddCustomerButton(new AddCustomerButtonListener(view));
		addListenerToRentButton(new RentButtonListener(view));

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
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
					ex.printStackTrace();
				}
				setDefaultSize(16);
				View view = new View();
				App shop = new App(view);
			}
		});
	}
}
