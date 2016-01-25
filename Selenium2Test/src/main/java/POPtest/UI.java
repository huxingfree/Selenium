package POPtest;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class UI extends JFrame implements ActionListener
{
	private JButton tcreate, tcompiler ,tall, tjava, tphp, tpy, tnode, tbaepy, delete;
	private LoadPOP load;
	public UI()
	{
		super("POPtest");
		this.setSize(240, 300);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new GridLayout(7,1));
		
		tall = new JButton("test all");
		tall.addActionListener(this);
		tall.setBackground(Color.black);
		tall.setForeground(Color.WHITE);
		this.add(tall);
		
		tjava = new JButton("test java");
		tjava.addActionListener(this);
		tjava.setBackground(Color.black);
		tjava.setForeground(Color.WHITE);
		this.add(tjava);
		
		tphp = new JButton("test php");
		tphp.addActionListener(this);
		tphp.setBackground(Color.black);
		tphp.setForeground(Color.WHITE);
		this.add(tphp);
		
		tpy = new JButton("test python");
		tpy.addActionListener(this);
		tpy.setBackground(Color.black);
		tpy.setForeground(Color.WHITE);
		this.add(tpy);
		
		tnode = new JButton("test node.js");
		tnode.addActionListener(this);
		tnode.setBackground(Color.black);
		tnode.setForeground(Color.WHITE);
		this.add(tnode);
		
		tbaepy = new JButton("test bae python");
		tbaepy.addActionListener(this);
		tbaepy.setBackground(Color.black);
		tbaepy.setForeground(Color.WHITE);
		this.add(tbaepy);
		
		delete = new JButton("delete all the runner");
		delete.addActionListener(this);
		delete.setBackground(Color.black);
		delete.setForeground(Color.WHITE);
		this.add(delete);
		
		load = new LoadPOP();
		this.setVisible(true);
	}
	public void testALL()
	{
		TestJAVA.test(load.driver);
		TestPHP.test(load.driver);
		TestPYTHON.test(load.driver);
		DeleteRunner.delete(load.driver);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == tall)
		{
			testALL();
		}
		if(e.getSource() == tjava)
		{
			TestJAVA.test(load.driver);
		}
		if(e.getSource() == tphp)
		{
			TestPHP.test(load.driver);
		}
		if(e.getSource() == tpy)
		{
			TestPYTHON.test(load.driver);
		}
		if(e.getSource() == delete)
		{
			DeleteRunner.delete(load.driver);
		}
	}
	public static void main(String[] args)
	{
		UI ui = new UI();
	}
}
