package Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class loginscreen extends JFrame{//�α���ȭ��
	public loginscreen()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\82107\\Desktop\\\uB124\uBAA8\uCE5C\uAD6C.jpg"));
		setTitle("Order me ");
		
		JPanel p = new JPanel();
		p.setBackground(new Color(113, 153, 255));
		p.setForeground(new Color(255, 255, 255));
        p.setLayout(null);
		
		getContentPane().add(p);
		JButton cancel = new JButton("ȸ�� ���� �����ϱ�");
		cancel.setIcon(new ImageIcon("����/ȸ����������.jpg"));
		p.add(cancel);
		cancel.setBounds(88, 329, 320, 86);
		JButton input = new JButton("ȸ�� ���� �Է��ϱ�");
		input.setIcon(new ImageIcon("����/ȸ�� ���� �Է�.jpg"));
		p.add(input);
		input.setBounds(88, 430, 320, 86);
		Label label2 = new Label("�� ���α׷��� ȸ������ �Է� ��");
		label2.setFont(new Font("������������� Light", Font.PLAIN, 25));
		p.add(label2);
		label2.setBounds(67,117, 432, 118);
		
		Label label_1 = new Label("\uC0AC\uC6A9\uC774 \uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		label_1.setFont(new Font("������������� Light", Font.PLAIN, 25));
		label_1.setBounds(135, 194, 432, 118);
		p.add(label_1);
		
		JLabel lblNewLabel = new JLabel("Order me!");
		lblNewLabel.setFont(new Font("���׷�ü", Font.PLAIN, 21));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(17, 15, 139, 37);
		p.add(lblNewLabel);
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				join f2= new join();
			}
		});
		
				cancel.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e4) {
						
						change f4 = new change();
					}
				});
		
		setSize(531, 811);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);;
	}
}

