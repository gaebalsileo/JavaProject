package paycheck;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import account_pay.account_chocie;
import card_pay.card_choice;
import money_pay.money_choice;

import javax.swing.JLabel;
import java.awt.Toolkit;

public class pay_choice {

	public JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay_choice window = new pay_choice();
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
	public pay_choice() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrderMe = new JFrame();
		frmOrderMe.setIconImage(Toolkit.getDefaultToolkit().getImage("사진/로고.jpg"));
		frmOrderMe.setTitle("Order me!");
		frmOrderMe.getContentPane().setBackground(new Color(113, 153, 255));
		frmOrderMe.getContentPane().setLayout(null);

		
		JLabel lblNewLabel = new JLabel("\uACB0\uC81C \uC218\uB2E8 \uC120\uD0DD");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 44));
		lblNewLabel.setBounds(125, 26, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card_choice c1 = new card_choice();
				c1.frmOrderMe.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("사진/카드 이거다.jpg"));
		button.setBounds(107, 305, 320, 97);
		frmOrderMe.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				account_chocie p1 = new account_chocie();
				p1.frmOrderMe.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon("사진/10 계좌.jpg"));
		button_1.setBounds(107, 574, 320, 97);
		frmOrderMe.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money_choice mm1 =new money_choice();
				mm1.frmOrderMe.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon("사진/궁합 안 본다는 현금.jpg"));
		button_2.setBounds(107, 441, 320, 97);
		frmOrderMe.getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(139, 172, 320, 43);
		frmOrderMe.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(139, 230, 320, 43);
		frmOrderMe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(139, 200, 320, 43);
		frmOrderMe.getContentPane().add(lblNewLabel_3);

		JLabel label = new JLabel("New label");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(316, 102, 195, 43);
		try { //음식
			   String s; 
			   String[] array;
			   BufferedReader br = new BufferedReader(new FileReader("주문음식.txt")); 
			   while ((s = br.readLine()) != null) { 
			     array = s.split("/");
			     lblNewLabel_1.setText(array[0]);
			     lblNewLabel_2.setText(array[1]);
			     lblNewLabel_3.setText(array[2]);
			   br.close(); 
			   }
		}catch (IOException e2) { 
			   e2.printStackTrace(); 
		}
		try { //금액
			   String s;
			   int sum=0;
			   String[] array; 
			   BufferedReader br = new BufferedReader(new FileReader("주문내역.txt")); 
			   while ((s = br.readLine()) != null) { 
			     array = s.split("/");
			     for(int i = 0; i<=2; i++)
			     sum += Integer.parseInt(array[i]);
			   } 
			   label.setText(sum + "원");
			   br.close(); 
		}
		catch (IOException e2) { 
			   e2.printStackTrace(); 
		}
		frmOrderMe.getContentPane().add(label);
		
		JLabel lblNewLabel_4 = new JLabel("\uCD1D \uC8FC\uBB38 \uAE08\uC561 : ");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(154, 106, 242, 35);
		frmOrderMe.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC8FC\uBB38 \uB0B4\uC5ED");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 21));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(204, 149, 109, 25);
		frmOrderMe.getContentPane().add(lblNewLabel_5);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
