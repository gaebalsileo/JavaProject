package dessert_menu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class dessert_mainmenu {

	public JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dessert_mainmenu window = new dessert_mainmenu();
					window.frmOrderMe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public dessert_mainmenu() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrderMe = new JFrame();
		frmOrderMe.setTitle("Order me!");
		frmOrderMe.getContentPane().setBackground(new Color(113, 153, 255));
		frmOrderMe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC911\uC2DD");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 30));
		btnNewButton.setIcon(new ImageIcon("»çÁø/¾Æ¸Þ¸®Ä«³ë.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert_americano m2 = new dessert_americano();
				m2.frmOrderMe.setVisible(true);
			}
		});
		btnNewButton.setBounds(44, 131, 178, 165);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uBD84\uC2DD");
		button.setIcon(new ImageIcon("»çÁø/Ä«¶ó¸á¸¶³¢¾ÆÅä.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert_makiyato m4 = new dessert_makiyato();
				m4.frmOrderMe.setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 30));
		button.setBackground(Color.WHITE);
		button.setBounds(301, 131, 178, 165);
		frmOrderMe.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uCE58\uD0A8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dessert_latte m1 = new dessert_latte();
				m1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("»çÁø/Ä«Æä¶ó¶¼.jpg"));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 30));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(44, 347, 178, 165);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uB514\uC800\uD2B8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert_cake m5 = new dessert_cake();
				m5.frmOrderMe.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon("»çÁø/Æ¼¶ó¹Ì¼ö.jpg"));
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 30));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(301, 347, 178, 165);
		frmOrderMe.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\uD53C\uC790");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert_greentea m3 = new dessert_greentea();
				m3.frmOrderMe.setVisible(true);
			}
		});
		button_3.setIcon(new ImageIcon("»çÁø/³ìÂ÷¶ó¶¼.jpg"));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 30));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(44, 561, 178, 165);
		frmOrderMe.getContentPane().add(button_3);
		
		JLabel lblNewLabel = new JLabel("\uCE74\uD398(\uB514\uC800\uD2B8)");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(162, 15, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JLabel lblice = new JLabel("1.\uC544\uBA54\uB9AC\uCE74\uB178(ice)");
		lblice.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 21));
		lblice.setForeground(Color.WHITE);
		lblice.setBounds(44, 95, 192, 21);
		frmOrderMe.getContentPane().add(lblice);
		
		JLabel label = new JLabel("4.\uCE74\uB77C\uBA5C\uB9C8\uB07C\uC544\uD1A0");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 21));
		label.setBounds(301, 81, 192, 48);
		frmOrderMe.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2.\uCE74\uD398\uB77C\uB5BC");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 21));
		label_1.setBounds(44, 303, 192, 36);
		frmOrderMe.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("5.\uD2F0\uB77C\uBBF8\uC218");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 21));
		label_2.setBounds(301, 307, 192, 29);
		frmOrderMe.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("3.\uB179\uCC28\uB77C\uB5BC");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("ºù±×·¹Ã¼", Font.PLAIN, 21));
		label_3.setBounds(44, 527, 192, 29);
		frmOrderMe.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("*\uC2E4\uC81C \uC74C\uC2DD\uC740 \uC0AC\uC9C4\uACFC \uB2E4\uB97C \uC218\uB3C4 \uC788\uC2B5\uB2C8\uB2E4!");
		label_4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(94, 594, 589, 312);
		frmOrderMe.getContentPane().add(label_4);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
