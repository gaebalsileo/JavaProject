package Login;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;

import Mianmenu.mainmenu;

import java.awt.*;
public class join extends JFrame {
	public join(){
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\82107\\Desktop\\\uB124\uBAA8\uCE5C\uAD6C.jpg"));
		
		setTitle("Orderme - ȸ�� ���� �Է�");
       
		  	JPanel p = new JPanel();
		  	p.setBackground(new Color(113, 153, 255));
		  	
		  	Label name = new Label("�̸� : ");	
	        Label num = new Label("��ȣ : ");
	        Label address = new Label("�ּ� : ");        
	        TextField name01 = new TextField();
	        TextField num01 = new TextField();
	        TextField address01 = new TextField();
	        JButton save = new JButton("����");
	        JButton cancel = new JButton("���");
	        
	        getContentPane().add(name);
	        getContentPane().add(num);
	        getContentPane().add(address);
	        getContentPane().add(name01);
	        getContentPane().add(num01);
	        getContentPane().add(address01);
	        getContentPane().add(save);
	        getContentPane().add(cancel);
	        
	        name.setBounds(40, 10, 40, 40);
	        num.setBounds(40, 50, 40, 40);
	        address.setBounds(40, 90, 60, 40);
	        name01.setBounds(120, 10, 200, 30);
	        num01.setBounds(120, 50, 200, 30);
	        address01.setBounds(120, 90, 200, 30);
	        save.setBounds(125, 330, 80, 30);
	        cancel.setBounds(240, 330, 80, 30); 
	         
	    getContentPane().add(p);
		setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		setResizable(false);
        setVisible(true);
       
       save.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent T) {
			try{
				BufferedWriter bos = new BufferedWriter(new FileWriter("ȸ�����.txt",true));
				bos.write(name01.getText()+"/");
				bos.write(num01.getText()+"/");
				bos.write(address01.getText()+"/");
				bos.close();
				JOptionPane.showMessageDialog(null, "���� �Է��� �Ϸ�Ǿ����ϴ�!!");
				dispose();
				mainmenu g = new mainmenu();
				g.frmOrderMe.setVisible(true);
			}catch (Exception ex){
				JOptionPane.showMessageDialog(null, "���� �Է¿� �����Ͽ����ϴ�.");
			}
		}
	});
       
	}    
}

