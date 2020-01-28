

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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import paycheck.pay_choice;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;

public class account_type {

	JFrame frmOrderMe;
	private JTextField textField;
	String x;
	JComboBox comboBox = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					account_type window = new account_type();
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
	public account_type() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOrderMe = new JFrame();
		frmOrderMe.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\82107\\Desktop\\\uB124\uBAA8\uCE5C\uAD6C.jpg"));
		frmOrderMe.setTitle("Order me!");
		frmOrderMe.getContentPane().setBackground(new Color(113, 153, 255));
		frmOrderMe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACC4\uC88C \uC774\uCCB4 \uACB0\uC81C");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ Light", Font.PLAIN, 40));
		lblNewLabel.setBounds(143, 28, 317, 65);
		frmOrderMe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC785\uAE08\uC790 \uC774\uB984 :");
		lblNewLabel_1.setFont(new Font("³ª´®¹Ù¸¥°íµñ Light", Font.BOLD, 23));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(44, 130, 304, 104);
		frmOrderMe.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(243, 161, 209, 43);
		frmOrderMe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\uC785\uAE08\uD560 \uC740\uD589 \uC785\uB825 :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("³ª´®¹Ù¸¥°íµñ Light", Font.BOLD, 23));
		label.setBounds(31, 219, 304, 104);
		frmOrderMe.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				BufferedWriter bos = new BufferedWriter(new FileWriter("ÀÔ±Ý°èÁÂ.txt",true));
				bos.write(textField.getText()+"/");
				bos.close();
		        } catch (Exception ex) { 
		     }
				x = comboBox.getSelectedItem().toString();
				account_end a1 =new account_end(x);
				a1.frmOrderMe.setVisible(true);
				}
		});
		btnNewButton.setBounds(97, 446, 129, 65);
		frmOrderMe.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pay_choice b1 = new pay_choice();
				b1.frmOrderMe.setVisible(true);
			}
		});
		button.setBounds(298, 446, 129, 65);
		frmOrderMe.getContentPane().add(button);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC120\uD0DD\uD558\uC138\uC694", "\uC2E0\uD55C\uC740\uD589", "\uAD6D\uBBFC\uC740\uD589", "\uB18D\uD611\uC740\uD589", "\uC6B0\uB9AC\uC740\uD589", "\uAE30\uC5C5\uC740\uD589", "KEB\uD558\uB098\uC740\uD589", "\uB300\uAD6C\uC740\uD589", "\uBD80\uC0B0\uC740\uD589", "\uC6B0\uCCB4\uAD6D", "SC\uC81C\uC77C\uC740\uD589", "\uAD11\uC8FC\uC740\uD589", "\uACBD\uB0A8\uC740\uD589"}));
		comboBox.setBounds(243, 249, 209, 43);
		frmOrderMe.getContentPane().add(comboBox);
		frmOrderMe.setBackground(new Color(100, 149, 237));
		frmOrderMe.setBounds(100, 100, 534, 811);
		frmOrderMe.setResizable(false);
		frmOrderMe.setLocationRelativeTo(null);
		System.out.println(x);
		frmOrderMe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}