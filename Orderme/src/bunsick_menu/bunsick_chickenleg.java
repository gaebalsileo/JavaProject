package bunsick_menu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
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

public class bunsick_chickenleg {

	JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bunsick_chickenleg window = new bunsick_chickenleg();
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
	public bunsick_chickenleg() {
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
		btnNewButton.setFont(new Font("���׷�ü", Font.PLAIN, 30));
		btnNewButton.setIcon(new ImageIcon("����/�߹�.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(127, 227, 274, 268);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC7A5\uBC14\uAD6C\uB2C8");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("�����ٸ���� Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(178, 33, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JLabel lblice = new JLabel("4.\uCC38\uC22F \uBF08\uC5C6\uB294 \uB2ED\uBC1C");
		lblice.setFont(new Font("���׷�ü", Font.PLAIN, 25));
		lblice.setForeground(Color.WHITE);
		lblice.setBounds(153, 113, 309, 65);
		frmOrderMe.getContentPane().add(lblice);
		
		JLabel label = new JLabel("\uC744(\uB97C) \uC7A5\uBC14\uAD6C\uB2C8\uC5D0 \uB123\uC5C8\uC2B5\uB2C8\uB2E4!");
		label.setFont(new Font("���׷�ü", Font.PLAIN, 22));
		label.setForeground(Color.WHITE);
		label.setBounds(112, 113, 381, 153);
		frmOrderMe.getContentPane().add(label);
		
		JButton button_1 = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					BufferedWriter bos = new BufferedWriter(new FileWriter("�ֹ�����.txt",true));
					bos.write(15000+"/");
					bos.close();
					BufferedWriter bo = new BufferedWriter(new FileWriter("�ֹ�����.txt",true));
					bo.write("���� ������ �߹�"+"/");
					bo.close();
				}catch (Exception ex){
				}
				pay_choice b1 = new pay_choice();
				b1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("����/�����ϱ�.jpg"));
		button_1.setBounds(142, 599, 241, 65);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu gt = new mainmenu();
				gt.frmOrderMe.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("����/�޴�ȭ�����ε��ư���.jpg"));
		button.setBounds(142, 519, 241, 65);
		frmOrderMe.getContentPane().add(button);
		
		JButton button_2 = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					BufferedWriter bos = new BufferedWriter(new FileWriter("�ֹ�����.txt",true));
					bos.write(15000+"/");
					bos.close();
					BufferedWriter bo = new BufferedWriter(new FileWriter("�ֹ�����.txt",true));
					bo.write("���� ������ �߹�"+"/");
					bo.close();
					mainmenu b1 = new mainmenu();
					b1.frmOrderMe.setVisible(true);
				}catch (Exception ex){
				}
			}
		});
		button_2.setIcon(new ImageIcon("����/�߰� ����.jpg"));
		button_2.setBounds(142, 679, 241, 65);
		frmOrderMe.getContentPane().add(button_2);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}