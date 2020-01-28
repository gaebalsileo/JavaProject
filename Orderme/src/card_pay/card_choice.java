package card_pay;

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

import Mianmenu.mainmenu;
import paycheck.pay_choice;

import javax.swing.JLabel;

public class card_choice {

	public JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					card_choice window = new card_choice();
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
	public card_choice() {
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
		
		JLabel lblNewLabel = new JLabel("\uB9CC\uB098\uC11C \uCE74\uB4DC \uACB0\uC81C\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("나눔바른고딕 Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(131, 27, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("New button");
		button.setIcon(new ImageIcon("사진/네모 만카.jpg"));
		button.setBounds(109, 126, 317, 266);
		frmOrderMe.getContentPane().add(button);
		
		JLabel label = new JLabel("\uB9CC\uB098\uC11C \uCE74\uB4DC \uACB0\uC81C\uB97C \uC120\uD0DD\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		label.setFont(new Font("굴림", Font.BOLD, 22));
		label.setForeground(Color.WHITE);
		label.setBounds(80, 407, 431, 47);
		frmOrderMe.getContentPane().add(label);
		
		JButton button_1 = new JButton("\uACB0\uC81C \uC9C4\uD589\uD558\uAE30");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardend c1 = new cardend();
				c1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("사진/결제하기.jpg"));
		button_1.setBounds(156, 469, 213, 65);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uACB0\uC81C \uC218\uB2E8 \uC7AC\uC120\uD0DD");
		button_2.setIcon(new ImageIcon("사진/결제 재선택.jpg"));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay_choice b1 = new pay_choice();
				b1.frmOrderMe.setVisible(true);
			}
		});
		button_2.setBounds(156, 558, 213, 65);
		frmOrderMe.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\uBA54\uB274 \uB2E4\uC2DC \uC120\uD0DD\uD558\uAE30");
		button_3.setIcon(new ImageIcon("사진/메뉴화면으로돌아가기.jpg"));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu g1 = new mainmenu();
				g1.frmOrderMe.setVisible(true);
			}
		});
		button_3.setBounds(156, 649, 213, 65);
		frmOrderMe.getContentPane().add(button_3);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
