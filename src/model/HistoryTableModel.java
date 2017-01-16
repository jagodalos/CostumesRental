package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class HistoryTableModel extends AbstractTableModel {

	private ArrayList<SingleLog> logs = new ArrayList();

	public HistoryTableModel() {

	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Customer";
		case 1:
			return "Costume";
		case 2:
			return "Price";
		case 3:
			return "Date";
		default:
			return "";
		}
	}

	public ArrayList<SingleLog> getItems() {
		return logs;
	}

	public void addItem(SingleLog singleLog) {

		logs.add(singleLog);

	}
	
	public void removeItem(SingleLog singlelog){
		logs.remove(singlelog);
	}

	public HistoryTableModel(ArrayList<SingleLog> logs) {
		super();

		this.logs = logs;
	}

	@Override
	public int getRowCount() {
		return logs.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		SingleLog selectedItem = logs.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return selectedItem.getCustomer().getName();
		case 1:
			return selectedItem.getCostume().getName();
		case 2:
			return selectedItem.getCostume().getPrice();
		case 3:
			return selectedItem.getDate();
		default:
			return null;
		}
	}

	public void clear() {
		logs.clear();
	}
}
