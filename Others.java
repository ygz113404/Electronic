import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Others extends ElectronicStore{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Others window = new Others();
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
	public Others() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.setBounds(100, 100, 624, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("    Which brand do you prefer ?\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Slab", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 53, 588, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("HouseholdApp");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MonsterPage ma = new MonsterPage();
				ma.initialize();
				markaSec(beyazEsya,beyazEsyaTree);
				
				
			}
		});
		btnNewButton.setBounds(10, 214, 168, 115);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sound");
		btnNewButton_1.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SesPage ss = new SesPage();
				ss.initialize();
				markaSec(ses,sesTree);
			}
		});
		btnNewButton_1.setBounds(430, 354, 168, 93);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Heating Cooling");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				IsýtaSogutmaPage arr = new IsýtaSogutmaPage();
				arr.initialize();
				markaSec(isitmaSogutma,isitmaSogutmaTree);
				
			}
		});
		
		btnNewButton_2.setBounds(221, 214, 174, 115);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("TV");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_3.setBackground(new Color(0, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LenovoPage al = new LenovoPage();
				al.initialize();
				markaSec(televizyon,televizyonTree);
				
			}
		});
		btnNewButton_3.setBounds(430, 214, 168, 115);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Display");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_4.setBackground(new Color(0, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GoruntuPage go = new GoruntuPage();
				go.initialize();
				markaSec(goruntu,goruntuTree);
				
			}
		});
		btnNewButton_4.setBounds(10, 354, 168, 93);
		frame.getContentPane().add(btnNewButton_4);
		frame.setVisible(true);
	}

}
