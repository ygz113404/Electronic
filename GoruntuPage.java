import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class GoruntuPage extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					goruntuProduct();
					GoruntuPage window = new GoruntuPage();
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
	public GoruntuPage() {
		initialize();
		goruntuProduct();
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
		
		JButton btnNewButton = new JButton("EverestSC-HD01");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OEMPro-hd05");
		btnNewButton_1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("logitechC310");
		btnNewButton_2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DEEP BLUE");
		btnNewButton_3.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(10, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("HADRONX11");
		btnNewButton_3_1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Your order is preparing");
				System.exit(0);
			}
		});
		btnNewButton_3_1.setBounds(300, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3_1);
		String[] stringDataAr = new String[goruntu.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<goruntu.size(); i++){
			stringDataAr[i] = goruntu.sendStringToGUI(i);
		}
		JList<String> goruntuList = new JList<String>(stringDataAr);
		goruntuList.setBackground(Color.WHITE);
		goruntuList.setBounds(103, 11, 365, 132);
		frame.getContentPane().add(goruntuList);
	}

}
