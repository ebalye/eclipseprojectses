package EVALLE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class InventorywithSearchEvalle {
	private static JTextField textProduct;
	private static JTextField textPrice;
	private static JTextField textQuantity;
	private static JTextField FilterText;
	private static JTextField textSupplier;
	private static JComboBox comboBox;
	private static JLabel lblSearch;
	private static JLabel lblCategory;
	private static JLabel lblQuantity;
	private static JLabel lblPrice;
	private static JLabel lblProduct;
	private static JLabel lblSupplier;
	private static JButton btnRemove;
	private static JButton btnAdd;
	
	public static void main(String[] args) {
		JTable table = new JTable();
		Object[] columns = {"Name", "Section", "Grade"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame frame= new JFrame("Inventory");
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100,100,810,476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		table.setBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.black);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(285,77,484,288);
		frame.getContentPane().add(pane);
		
		textProduct = new JTextField();
		textProduct.setBounds(83, 14, 116, 22);
		frame.getContentPane().add(textProduct);
		textProduct.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(83, 49, 116, 22);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		textQuantity = new JTextField();
		textQuantity.setBounds(83, 84, 116, 22);
		frame.getContentPane().add(textQuantity);
		textQuantity.setColumns(10);
		
		textSupplier = new JTextField();
		textSupplier.setBounds(83, 160, 116, 22);
		frame.getContentPane().add(textSupplier);
		textSupplier.setColumns(10);
		
		lblSupplier = new JLabel("Supplier");
		lblSupplier.setForeground(Color.WHITE);
		lblSupplier.setBounds(15, 163, 56, 16);
		frame.getContentPane().add(lblSupplier);
		
		lblProduct = new JLabel("Name:");
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setBounds(15, 17, 56, 16);
		frame.getContentPane().add(lblProduct);
		
		lblPrice = new JLabel("Section");
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setBounds(15, 52, 56, 16);
		frame.getContentPane().add(lblPrice);
		
		lblQuantity = new JLabel("Grade:");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setBounds(15, 87, 56, 16);
		frame.getContentPane().add(lblQuantity);
		
		lblCategory = new JLabel("Category;");
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setBounds(15, 122, 56, 16);
		frame.getContentPane().add(lblCategory);
		
		lblSearch = new JLabel("Search:");
		lblSearch.setForeground(Color.WHITE);
		lblSearch.setBounds(290, 45, 56, 16);
		frame.getContentPane().add(lblSearch);
		lblSearch.setForeground(Color.white);
		lblSearch.setForeground(Color.gray);
		
		
		//ComboBox
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Food", "Beverage", "Frozen Food", "Bread/Bakery", "Personal", "Canned Goods", "Dairy", 
				"Dry/Baking goods", "Meat", "produce(vegetables)","Cleaners","Paper Goods","Other" }));
		comboBox.setSelectedItem(null);
		comboBox.setBounds(83, 119, 116, 22);
		String value= (String)comboBox.getSelectedItem();
		frame.getContentPane().add(comboBox);
		
		//rows
		Object[] row = new Object[3];
		
		
		//add button
		btnAdd = new JButton("add");
		btnAdd.setBounds(25, 204, 97, 25);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent arg0) {
			
			row[0] = textProduct.getText().toLowerCase();
			row[1] = "P" + textPrice.getText();
			row[2] = textQuantity.getText();
					
			model.addRow(row);
		}
		
		});
		
		//remove button
		btnRemove = new JButton("remove");
		btnRemove.setBounds(25, 242, 97, 25);
		frame.getContentPane().add(btnRemove);
			
		//SEARCHBAR
		FilterText = new JTextField();
		FilterText.addKeyListener(new KeyAdapter() {
			
		
			public void keyReleased(KeyEvent arg0) {
				String search = FilterText.getText().toLowerCase();
				
				filter(search);
			
			}

			private void filter(String search){
				
				TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
		
			}
		});
		FilterText.setBounds(340, 42, 238, 22);
		frame.getContentPane().add(FilterText);
		FilterText.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Food", "Beverage", "Frozen Food", "Bread/Bakery", "Personal", "Canned Goods", "Dairy", 
				"Dry/Baking goods", "Meat", "produce(vegetables)","Cleaners","Paper Goods","Other" }));
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String search=comboBox_1.getSelectedItem().toString();
				
				filter(search);
			}

			private void filter(String search) {
				
				TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
			}
		});
		comboBox_1.setBounds(626, 42, 137, 22);
		frame.getContentPane().add(comboBox_1);

		btnRemove.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				if(i>0) {
					model.removeRow(i);	
				}else{ 
					model.removeRow(i);
				}
				
			}
		});
		
		
		frame.revalidate();
		frame.setVisible(true);
		
		}
 	}
 


