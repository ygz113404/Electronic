import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Pc extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pc window = new Pc();
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
	public Pc() {
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
		lblNewLabel.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 53, 588, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Monster");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MonsterPage ma = new MonsterPage();
				ma.initialize();
				markaSec(monster,monsterTree);
				
			}
		});
		btnNewButton.setBounds(10, 214, 131, 121);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Acer");
		btnNewButton_1.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AcerPage ac = new AcerPage();
				ac.initialize();
				markaSec(acer,acerTree);
			}
		});
		btnNewButton_1.setBounds(158, 214, 131, 121);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Asus");
		btnNewButton_2.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AsusPage as = new AsusPage();
				as.initialize();
				markaSec(asus,asusTree);
				
			}
		});
		
		btnNewButton_2.setBounds(319, 214, 131, 121);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Lenevo");
		btnNewButton_3.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LenovoPage al = new LenovoPage();
				al.initialize();
				markaSec(lenova,lenovaTree);
				
			}
		});
		btnNewButton_3.setBounds(460, 214, 131, 121);
		frame.getContentPane().add(btnNewButton_3);
		frame.setVisible(true);
	}
	
}
