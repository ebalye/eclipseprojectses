package EVALLE;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class tableevalle {
	private static JTextField textProduct;
	private static JTextField textPrice;
	private static JTextField textQuantity;
	private static JTextField textCategory;
	
	public static void main(String[] args) {
		JTable table = new JTable();
		Object[] columns = {"Product", "Price", "Quantity", "Category"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame frame= new JFrame("Inventory");
		frame.getContentPane().setBackground(new Color(0,0,0));
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
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground((Color.RED));
		pane.setBackground(Color.WHITE);
		pane.setBounds(285,10,475,355);
		frame.getContentPane().add(pane);
		
		textProduct = new JTextField();
		textProduct.setBounds(83, 33, 116, 22);
		frame.getContentPane().add(textProduct);
		textProduct.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(83, 101, 116, 22);
		frame.getContentPane().add(textPrice);
		textPrice.setColumns(10);
		
		textQuantity = new JTextField();
		textQuantity.setBounds(83, 167, 116, 22);
		frame.getContentPane().add(textQuantity);
		textQuantity.setColumns(10);
		
		textCategory = new JTextField();
		textCategory.setBounds(83, 232, 116, 22);
		frame.getContentPane().add(textCategory);
		textCategory.setColumns(10);
		
		JLabel lblProduct = new JLabel("Product:");
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setBounds(15, 36, 56, 16);
		frame.getContentPane().add(lblProduct);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setBounds(15, 104, 56, 16);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setForeground(Color.WHITE);
		lblQuantity.setBounds(15, 170, 56, 16);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblCategory = new JLabel("Category;");
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setBounds(15, 235, 56, 16);
		frame.getContentPane().add(lblCategory);
		
		//rows
		Object[] row = new Object[4];
		
		//add button
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(12, 362, 97, 25);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {	
			row[0] = textProduct.getText();
			row[1] = textPrice.getText();
			row[2] = textQuantity.getText();
			row[3] = textCategory.getText();	
			model.addRow(row);	
		}
		
		});
		
		//remove button
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(120, 362, 97, 25);
		frame.getContentPane().add(btnRemove);
		btnRemove.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
			
				int i=table.getSelectedRow();
				if(i>0) {
					model.removeRow(i);	
				}else { 
						JOptionPane.showMessageDialog(frame, "Delete Error");
				}
				
			}
		});
		
		
		frame.revalidate();
		frame.setVisible(true);
		
		}
 	}
 


