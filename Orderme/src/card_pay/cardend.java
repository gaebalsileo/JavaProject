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
import begin.begin;

import javax.swing.JLabel;

public class cardend {

	JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cardend window = new cardend();
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
	public cardend() {
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
		label.setFont(new Font("빙그레체", Font.BOLD, 30));
		label.setBounds(106, 101, 373, 148);
		frmOrderMe.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC120\uD0DD\uD55C \uACB0\uC81C \uC218\uB2E8 : \uB9CC\uB098\uC11C \uCE74\uB4DC \uACB0\uC81C");
		label_1.setFont(new Font("빙그레체", Font.PLAIN, 20));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(93, 199, 384, 108);
		frmOrderMe.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("사진/네모 만카.jpg"));
		btnNewButton.setBounds(106, 287, 306, 267);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JLabel label_2 = new JLabel("\uC8FC\uBB38\uC774 \uC811\uC218\uB418\uC5C8\uC2B5\uB2C8\uB2E4!");
		label_2.setFont(new Font("빙그레체", Font.PLAIN, 20));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(145, 569, 334, 43);
		frmOrderMe.getContentPane().add(label_2);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uC778 \uBA54\uB274\uB85C \uB3CC\uC544\uAC00\uAE30");
		btnNewButton_1.setIcon(new ImageIcon("사진/시작화면으로 돌아가기.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				begin b1 = new 	begin();
				b1.frmOrderMe.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(132, 627, 256, 49);
		frmOrderMe.getContentPane().add(btnNewButton_1);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
