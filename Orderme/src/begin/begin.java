package begin;

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

import Login.loginscreen;
import Mianmenu.mainmenu;

import javax.swing.JLabel;

public class begin {

	public JFrame frmOrderMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					begin window = new begin();
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
	public begin() {
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
		
		JLabel label = new JLabel("*\uC571\uC744 \uC2E4\uD589\uD558\uB824\uBA74 \uB85C\uACE0\uB97C \uB20C\uB7EC\uC8FC\uC138\uC694!");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		label.setBounds(86, 578, 487, 158);
		frmOrderMe.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginscreen s1 = new loginscreen();
			}
		});
		btnNewButton.setIcon(new ImageIcon("»çÁø/·Î°í.jpg"));
		btnNewButton.setBounds(64, 176, 410, 387);
		frmOrderMe.getContentPane().add(btnNewButton);
	
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}