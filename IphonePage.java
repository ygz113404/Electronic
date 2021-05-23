import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class IphonePage extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iphoneProduct();
					IphonePage window = new IphonePage();
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
	public IphonePage() {
		initialize();
		iphoneProduct();
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
		
		JButton btnNewButton = new JButton("Ýphone");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "This phone is so expensive because of Turkey issues");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		
		String[] stringDataAr9 = new String[iphone.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<iphone.size(); i++){
			stringDataAr9[i] = iphone.sendStringToGUI(i);
		}
		JList<String> myList9 = new JList<String>(stringDataAr9);
		myList9.setBackground(Color.WHITE);
		myList9.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myList9);
		
	}

}
