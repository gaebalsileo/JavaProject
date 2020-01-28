package Login;


import javax.swing.*;

import Mianmenu.mainmenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class change extends JFrame{
	public change(){
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\82107\\Desktop\\\uB124\uBAA8\uCE5C\uAD6C.jpg"));
	JPanel p = new JPanel();
	p.setBackground(new Color(113, 153, 255));
    p.setLayout(null);

    Label name02 = new Label("이름 : ");
    Label num02 = new Label("번호 : ");
    Label address02 = new Label("주소 : ");

    getContentPane().add(name02);
    getContentPane().add(num02);
    getContentPane().add(address02);

    TextField name_02 = new TextField();
    TextField num_02 = new TextField();
    TextField address_02 = new TextField();
    name_02.setEnabled(true);
    num_02.setEnabled(true);
    address_02.setEnabled(true);
    getContentPane().add(name_02);
    getContentPane().add(num_02);
    getContentPane().add(address_02);
    name_02.setEditable(true);
    num_02.setEditable(true);
    address_02.setEditable(true);
    JButton change = new JButton("수정");
    JButton close = new JButton("닫기");
    getContentPane().add(change);
    getContentPane().add(close);
    name02.setBounds(40, 10, 40, 40);
    num02.setBounds(40, 50, 40, 40);
    address02.setBounds(40,90,60,40);
    name_02.setBounds(120, 10, 200, 30);
    num_02.setBounds(120, 50, 200, 30);
    address_02.setBounds(120, 90, 200, 30);
    change.setBounds(125, 330, 80, 30);
    close.setBounds(240, 330, 80, 30);
getContentPane().add(p);
setSize(500,500);
setTitle("Oder me! \uD68C\uC6D0\uC815\uBCF4 \uC218\uC815");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setResizable(false);
setVisible(true);
try {
	   String s; 
	   String[] array; 
	   BufferedReader br = new BufferedReader(new FileReader("회원명단.txt")); 
	   while ((s = br.readLine()) != null) { 
	     array = s.split("/"); 
	     name_02.setText(array[0]);
	     num_02.setText(array[1]);
	     address_02.setText(array[2]);
	   } 
	   br.close(); 
	   } catch (IOException e2) { 
	   e2.printStackTrace(); 
	}
change.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e77) {
		try{
			BufferedWriter bo = new BufferedWriter(new FileWriter("회원명단.txt"));
			bo.write(name_02.getText()+"/");
			bo.write(num_02.getText()+"/");
			bo.write(address_02.getText()+"\r\n");
			bo.close();
			
			 JOptionPane.showMessageDialog(null, "저장하였습니다."); 
        } catch (Exception ex) { 
        JOptionPane.showMessageDialog(null, "저장에 실패하였습니다."); 
     } 
		}
});
close.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		//LoginScreen c = new LoginScreen();
		dispose();
		mainmenu b1 = new mainmenu();
		b1.frmOrderMe.setVisible(true);
	}

});


	}
}
