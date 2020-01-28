
package account_pay;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import Mianmenu.mainmenu;
import begin.begin;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class account_end {
	JLabel msg;
	JFrame frmOrderMe;
	static String x = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					account_end window = new account_end(x);
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
	public account_end(String x) {
		this.x = x;
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
		
		JLabel label = new JLabel("\uACB0\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4!");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		label.setBounds(106, 27, 373, 148);
		frmOrderMe.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("»çÁø/³×¸ð °èÁÂ.jpg"));
		btnNewButton.setBounds(112, 167, 306, 267);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uC778 \uBA54\uB274\uB85C \uB3CC\uC544\uAC00\uAE30");
		btnNewButton_1.setIcon(new ImageIcon("»çÁø/½ÃÀÛÈ­¸éÀ¸·Î µ¹¾Æ°¡±â.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				begin b1 = new 	begin();
				b1.frmOrderMe.setVisible(true);
         			}
		});		
		
		
		
		
		btnNewButton_1.setBounds(144, 638, 256, 49);
		frmOrderMe.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel(": 525-0505-2222-855");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(196, 601, 246, 21);
		frmOrderMe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		JLabel label_3 = new JLabel();
		label_3.setText(x);
		label_3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_3.setForeground(Color.WHITE);
		
		try {
			   String s; 
			   String[] array; 
			   BufferedReader br = new BufferedReader(new FileReader("ÀÔ±Ý°èÁÂ.txt")); 
			   while ((s = br.readLine()) != null) { 
			     array = s.split("/"); 
			     lblNewLabel_2.setText("ÀÔ±ÝÀÚ¸í : " + array[0]);
			   } 
			   br.close(); 
		}
		catch (IOException e2) { 
			   e2.printStackTrace(); 
		}
		lblNewLabel_2.setBounds(125, 458, 283, 33);
		frmOrderMe.getContentPane().add(lblNewLabel_2);
		label_3.setBounds(245, 502, 283, 33);
		frmOrderMe.getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("\uC544\uB798\uC758 \uACC4\uC88C\uB85C 1\uC2DC\uAC04 \uC774\uB0B4 \uACB0\uC81C \uD574\uC8FC\uC2ED\uC2DC\uC624!");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(128, 553, 351, 33);
		frmOrderMe.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC785\uAE08\uD560 \uC740\uD589: ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label_2.setBounds(124, 499, 217, 39);
		frmOrderMe.getContentPane().add(label_2);
		
		JLabel label_4 = new JLabel();
		label_4.setText(x);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("µ¸¿ò", Font.PLAIN, 18));
		label_4.setBounds(106, 595, 283, 33);
		frmOrderMe.getContentPane().add(label_4);
		frmOrderMe.setBackground(new Color(113, 153, 255));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}