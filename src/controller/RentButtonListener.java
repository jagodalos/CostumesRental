package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JTable;

import javafx.util.converter.LocalDateStringConverter;
import model.Costume;
import model.Customer;
import model.RentalShopData;
import model.SingleLog;
import view.View;

public class RentButtonListener implements ActionListener {
	
	private View view;
	private RentalShopData model;
	
	public RentButtonListener(View view, RentalShopData model) {
		super();
		this.view = view;
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Customer customer = view.getShopPanel().getSelectedCustomer();
		JTable table = view.getShopPanel().costumeTable;
		int[] selectedRows = table.getSelectedRows();
		for(int i : selectedRows){
			Costume costume = view.getShopPanel().costumes.get(i);
			costume.setAvailable(false);
			view.getHistoryPanel().tableModel.addItem(new SingleLog(costume,customer,LocalDate.now()));
		}
		view.getShopPanel().costumeTableModel.fireTableDataChanged();
		view.getHistoryPanel().tableModel.fireTableDataChanged();
		
	}

}
