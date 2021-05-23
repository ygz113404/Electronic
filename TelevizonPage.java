import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TelevizonPage extends ElectronicStore{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					televizyonProduct();
					TelevizonPage window = new TelevizonPage();
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
	public TelevizonPage() {
		initialize();
		televizyonProduct();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Philips 50PUS7805");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Sipariþiniz hazýrlanýyor");
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 278, 103, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vestel 50U9500");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Sipariþiniz hazýrlanýyor");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(168, 278, 124, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Samsung40T5300");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Sipariþiniz hazýrlanýyor");
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(335, 278, 89, 49);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LG 43UN71006");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Sipariþiniz hazýrlanýyor");
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(10, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("SkytechST-3230");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Sipariþiniz hazýrlanýyor");
				System.exit(0);
			}
		});
		btnNewButton_3_1.setBounds(300, 338, 124, 49);
		frame.getContentPane().add(btnNewButton_3_1);
		String[] stringDataAr = new String[televizyon.size()]; //StringDataAr - asus - myList
		for(int i = 0; i<televizyon.size(); i++){
			stringDataAr[i] = televizyon.sendStringToGUI(i);
		}
		JList<String> List11 = new JList<String>(stringDataAr);
		List11.setBackground(Color.WHITE);
		List11 .setBounds(103, 11, 365, 132);
		frame.getContentPane().add(List11 );
		
	}

}
