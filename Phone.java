import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Phone extends ElectronicStore {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Phone window = new Phone();
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
	public Phone() {
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
		lblNewLabel.setBackground(new Color(0, 191, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Roboto Slab", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 53, 588, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Samsung");
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SamsungPage sa = new SamsungPage();
				sa.initialize();
				markaSec(samsung,samsungTree);
				
				
			}
		});
		btnNewButton.setBounds(10, 214, 131, 94);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xiomi");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				XiomiPage sr = new XiomiPage();
				sr.initialize();
				markaSec(xiaomi,xiaomiTree);
				
			}
		});
		btnNewButton_1.setBounds(10, 343, 131, 94);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Iphone");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		btnNewButton_2.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				IphonePage Ip = new IphonePage();
				Ip.initialize();
				markaSec(iphone,iphoneTree);
				
				
			}
		});
		
		btnNewButton_2.setBounds(238, 214, 131, 94);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Huwai");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Roboto Slab", Font.BOLD, 17));
		btnNewButton_3.setBackground(new Color(0, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				HuaweiPage hr = new HuaweiPage();
				hr.initialize();
				markaSec(huawei,huaweiTree);
				
			}
		});
		btnNewButton_3.setBounds(460, 214, 131, 94);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("Oppo");
		btnNewButton_1_1.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(0, 255, 255));
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OppoPage op = new OppoPage();
				op.initialize();
				markaSec(oppo,oppoTree);
				
			}
		});
		btnNewButton_1_1.setBounds(460, 343, 131, 94);
		frame.getContentPane().add(btnNewButton_1_1);
		frame.setVisible(true);
	}
}
