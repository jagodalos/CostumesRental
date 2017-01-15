package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class View extends JFrame {

	private HistoryPanel historyPanel = new HistoryPanel();
	private ShopPanel shopPanel = new ShopPanel();

	public HistoryPanel getHistoryPanel() {
		return historyPanel;
	}

	public ShopPanel getShopPanel() {
		return shopPanel;
	}

	public View() {
		super("Costumes Rental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, getShopPanel(),getHistoryPanel());
		splitPane.setDividerLocation(250);
		setContentPane(splitPane);

		setSize(new Dimension(600, 650));
		setMinimumSize(new Dimension(400, 450));
	}
}