import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;



public class IsýtaSogutmaPage extends ElectronicStore{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					isitmaSogutmaProduct();
					IsýtaSogutmaPage window = new IsýtaSogutmaPage();
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
	public IsýtaSogutmaPage() {
		initialize();
		isitmaSogutmaProduct();
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
		
		JButton btnNewButton = new JButton("Vestel Flora");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baymak Elegant");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bosch Climate");
		btnNewButton_2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Raks Eco Plus");
		btnNewButton_3.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(10, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		
		String[] stringDataArrr = new String[isitmaSogutma.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<isitmaSogutma.size(); i++){
			stringDataArrr[i] = isitmaSogutma.sendStringToGUI(i);
		}
		JList<String> myListr = new JList<String>(stringDataArrr);
		myListr.setBackground(Color.WHITE);
		myListr.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myListr);
		
	}

}
