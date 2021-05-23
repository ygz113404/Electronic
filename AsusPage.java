import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AsusPage extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asusProduct();
					monsterProduct();
					appleProduct();
					lenovaProduct();
					acerProduct();
					samsungProduct();
					 xiaomiProduct();
					 iphoneProduct();
					 huaweiProduct();
					 oppoProduct();
					 beyazEsyaProduct();
					 sesProduct();
					  goruntuProduct();
					 isitmaSogutmaProduct();
					 televizyonProduct();
					AsusPage window = new AsusPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AsusPage() {
		initialize();
		asusProduct();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("ZENBOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ZEPHYRUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ROG");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXPERTBOOK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(10, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Tuf");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3_1.setBounds(300, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3_1);
		String[] stringDataAr = new String[asus.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<asus.size(); i++){
			stringDataAr[i] = asus.sendStringToGUI(i);
		}
		JList<String> myList = new JList<String>(stringDataAr);
		myList.setBackground(Color.WHITE);
		myList.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myList);
		
		
		
	}
	
}
