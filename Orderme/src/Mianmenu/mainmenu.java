package Mianmenu;


import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
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
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Chicken_menu.chicken_mainmenu;
import China_menu.china_mainmenu;
import Login.loginscreen;
import bunsick_menu.bunsick_mainmenu;
import dessert_menu.dessert_mainmenu;
import pizza_menu.pizza_mainmenu;
import start.start;

import javax.swing.JLabel;

public class mainmenu {

	public JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainmenu window = new mainmenu();
					window.frmOrderMe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainmenu() {
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
		frmOrderMe.setIconImage(Toolkit.getDefaultToolkit().getImage("사진/로고.jpg"));
		
		JButton btnNewButton = new JButton("\uC911\uC2DD");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("빙그레체", Font.PLAIN, 30));
		btnNewButton.setIcon(new ImageIcon("사진/하얀 중식.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				china_mainmenu c1 = new china_mainmenu ();
				c1.frmOrderMe.setVisible(true);
			}
		});
		btnNewButton.setBounds(44, 144, 178, 165);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uBD84\uC2DD");
		button.setIcon(new ImageIcon("사진/하얀 분식.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bunsick_mainmenu b1 = new bunsick_mainmenu();
				b1.frmOrderMe.setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("빙그레체", Font.PLAIN, 30));
		button.setBackground(Color.WHITE);
		button.setBounds(301, 144, 178, 165);
		frmOrderMe.getContentPane().add(button);
		
		JButton button_1 = new JButton("\uCE58\uD0A8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chicken_mainmenu c1 = new chicken_mainmenu();
				c1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("사진/하얀 치킨.jpg"));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("빙그레체", Font.PLAIN, 30));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(44, 336, 178, 165);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uB514\uC800\uD2B8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dessert_mainmenu w = new dessert_mainmenu();
				w.frmOrderMe.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon("사진/하얀 디저트.jpg"));
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("빙그레체", Font.PLAIN, 30));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(301, 336, 178, 165);
		frmOrderMe.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\uD53C\uC790");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pizza_mainmenu p1 = new pizza_mainmenu();
				p1.frmOrderMe.setVisible(true);
			}
		});
		button_3.setIcon(new ImageIcon("사진/하얀 피자.jpg"));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("빙그레체", Font.PLAIN, 30));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(44, 538, 178, 165);
		frmOrderMe.getContentPane().add(button_3);
		
		JLabel lblNewLabel = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC138\uC694!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("나눔바른고딕 Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(107, 40, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JButton button_4 = new JButton("\uB514\uC800\uD2B8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginscreen s1 =new loginscreen();
				
			}
		});
		button_4.setIcon(new ImageIcon("사진/네모회원정보수정하기.jpg"));
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("빙그레체", Font.PLAIN, 30));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(301, 538, 178, 165);
		frmOrderMe.getContentPane().add(button_4);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
