package view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class View extends JFrame {

	 private CartPanel cartPanel;
	// private ShopPanel shopPanel;
	// private JMenuBar menuBar;

	public View() {
		super("Costumes Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		// menuBar = createMenuBar();
		// setJMenuBar(menuBar);
		//
		 cartPanel = new CartPanel();
		// shopPanel = new ShopPanel();

		// JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
		// getCartPanel(), getShopPanel());
		// splitPane.setDividerLocation(250);
		 setContentPane(cartPanel);

		setSize(new Dimension(600, 650));
		setMinimumSize(new Dimension(400, 450));
	}
}