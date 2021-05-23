import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class SamsungPage extends ElectronicStore{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					samsungProduct();
					SamsungPage window = new SamsungPage();
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
	public SamsungPage() {
		initialize();
		samsungProduct();
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
		
		JButton btnNewButton = new JButton("Galaxy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		
		String[] stringDataAr6 = new String[samsung.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<samsung.size(); i++){
			stringDataAr6[i] = samsung.sendStringToGUI(i);
		}
		JList<String> myList6 = new JList<String>(stringDataAr6);
		myList6.setBackground(Color.WHITE);
		myList6.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myList6);
		
	}

}
