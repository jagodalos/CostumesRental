package controller;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Set;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.CostumeCollection;
import model.RentalShopData;
import view.View;

public class App {

	private View view;
	private RentalShopData shop;

	/**
	 * 
	 * @param view
	 *            the view
	 * @param shop
	 *            the model
	 */
	public App(View view, RentalShopData shop) {

		this.view = view;
		this.shop = shop;
		view.setVisible(true);

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
                setDefaultSize(34);
				View view = new View();
				CostumeCollection itemCollection = new CostumeCollection();
				itemCollection.fillWithitems();
		
				RentalShopData shopModel = new RentalShopData(itemCollection);
				App shop = new App(view, shopModel);
            }
		});
	}
}
