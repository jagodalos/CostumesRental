package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomerCostumeTableModel extends AbstractTableModel {
	private ArrayList<Costume> costumes = new ArrayList();

	public CustomerCostumeTableModel() {

	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Costume";
		case 1:
			return "Price";
		default:
			return "";
		}
	}

	public ArrayList<Costume> getItems() {
		return costumes;
	}

	public void addItem(Costume costume) {

		costumes.add(costume);

	}

	public CustomerCostumeTableModel(ArrayList<Costume> costumes) {
		super();

		this.costumes = costumes;
	}

	@Override
	public int getRowCount() {
		return costumes.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Costume selectedItem = costumes.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return selectedItem.getName();
		case 1:
			return selectedItem.getPrice();
		default:
			return null;
		}
	}

	public void clear() {
		costumes.clear();
	}

}
