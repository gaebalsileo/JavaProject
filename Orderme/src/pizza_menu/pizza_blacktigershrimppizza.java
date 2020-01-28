package pizza_menu;

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
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Mianmenu.mainmenu;
import paycheck.pay_choice;

import javax.swing.JLabel;

public class pizza_blacktigershrimppizza {

	JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				pizza_blacktigershrimppizza window = new pizza_blacktigershrimppizza();
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
	public pizza_blacktigershrimppizza() {
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
		btnNewButton.setIcon(new ImageIcon("사진/타이거피자.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(127, 227, 274, 268);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC7A5\uBC14\uAD6C\uB2C8");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("나눔바른고딕 Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(182, 33, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JLabel lblice = new JLabel("4.\uBE14\uB799 \uD0C0\uC774\uAC70 \uC288\uB9BC\uD504 \uD53C\uC790");
		lblice.setFont(new Font("빙그레체", Font.PLAIN, 25));
		lblice.setForeground(Color.WHITE);
		lblice.setBounds(116, 113, 299, 65);
		frmOrderMe.getContentPane().add(lblice);
		
		JLabel label = new JLabel("\uC744(\uB97C) \uC7A5\uBC14\uAD6C\uB2C8\uC5D0 \uB123\uC5C8\uC2B5\uB2C8\uB2E4!");
		label.setFont(new Font("빙그레체", Font.PLAIN, 22));
		label.setForeground(Color.WHITE);
		label.setBounds(112, 113, 381, 153);
		frmOrderMe.getContentPane().add(label);
		
		JButton button_1 = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					BufferedWriter bos = new BufferedWriter(new FileWriter("주문내역.txt",true));
					bos.write(19000+"/");
					bos.close();
					BufferedWriter bo = new BufferedWriter(new FileWriter("주문음식.txt",true));
					bo.write("블랙타이거슈림프피자"+"/");
					bo.close();
				}catch (Exception ex){
				}
				pay_choice b1 = new pay_choice();
				b1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("사진/결제하기.jpg"));
		button_1.setBounds(142, 599, 241, 65);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainmenu gt = new mainmenu();
				gt.frmOrderMe.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("사진/메뉴화면으로돌아가기.jpg"));
		button.setBounds(142, 519, 241, 65);
		frmOrderMe.getContentPane().add(button);
		
		JButton button_2 = new JButton("\uACB0\uC81C\uD558\uAE30\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					BufferedWriter bos = new BufferedWriter(new FileWriter("주문내역.txt",true));
					bos.write(19000+"/");
					bos.close();
					BufferedWriter bo = new BufferedWriter(new FileWriter("주문음식.txt",true));
					bo.write("블랙타이거슈림프피자"+"/");
					bo.close();
					mainmenu b1 = new mainmenu();
					b1.frmOrderMe.setVisible(true);
				}catch (Exception ex){
				}
			}
		});
		button_2.setIcon(new ImageIcon("사진/추가 선택.jpg"));
		button_2.setBounds(142, 679, 241, 65);
		frmOrderMe.getContentPane().add(button_2);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


