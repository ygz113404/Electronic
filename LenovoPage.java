import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class LenovoPage extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {asusProduct();
				lenovaProduct();
					LenovoPage window = new LenovoPage();
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
	public LenovoPage() {
		initialize();
		asusProduct();
		lenovaProduct();
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
		
		JButton btnNewButton = new JButton("Idea");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Legion");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Idiepad");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		
		String[] stringDataAr1 = new String[lenova.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<lenova.size(); i++){
			stringDataAr1[i] = lenova.sendStringToGUI(i);
		}
		JList<String> myList1 = new JList<String>(stringDataAr1);
		myList1.setBackground(Color.WHITE);
		myList1.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myList1);
	}

}
