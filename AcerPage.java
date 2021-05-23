import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class AcerPage extends ElectronicStore{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acerProduct();
					AcerPage window = new AcerPage();
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
	public AcerPage() {
		initialize();
		acerProduct();
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
		
		JButton btnNewButton = new JButton("Cromebook");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nitro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Aspire");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		JButton btnNewButton_3 = new JButton("Swift");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(10, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Porshe");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3_1.setBounds(300, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3_1);
		
		
		String[] stringDataAr2 = new String[acer.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<acer.size(); i++){
			stringDataAr2[i] = acer.sendStringToGUI(i);
		}
		JList<String> myList2 = new JList<String>(stringDataAr2);
		myList2.setBackground(Color.WHITE);
		myList2.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(myList2);
	}

}
