import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.UIManager;

public class MainPage extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					MainPage window = new MainPage();
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
	public MainPage() {
		initialize();
		acerProduct();
	
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ProgressBar.foreground"));
		frame.setBounds(100, 100, 494, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Pc");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.setFont(new Font("Roboto Slab", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Pc pg = new Pc();
				pg.initialize();
				asus.outputList();
			
				
			}
		});
		btnNewButton_1.setBounds(189, 181, 122, 113);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Phone");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1_1.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Phone ph = new Phone();
				ph.initialize();
				
			}
		});
		btnNewButton_1_1.setBounds(10, 180, 144, 113);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Others");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setBackground(new Color(0, 191, 255));
		btnNewButton_1_2.setFont(new Font("Roboto Slab", Font.BOLD, 16));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Others ot = new Others();
				ot.initialize();
				
			}
		});
		btnNewButton_1_2.setBounds(340, 180, 128, 113);
		frame.getContentPane().add(btnNewButton_1_2);
		
		
		JLabel lblNewLabel = new JLabel("Hi , Welcome what do you want in shop ? ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto Slab", Font.BOLD, 20));
		 lblNewLabel.setBackground(Color.CYAN);
		 lblNewLabel.setBounds(53, 11, 425, 132);
		 frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}
}
