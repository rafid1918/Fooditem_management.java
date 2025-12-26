import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Fooditem_management extends JFrame implements ActionListener,MouseListener
{
	    JLabel l,l1,l2,l3,l4,l5,l6;
		JTextField t1,t2,t3,t4,t5;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		DefaultTableModel d;
		Cursor c1;
		JTable tb;
		String[] columns = {"Food Name","Food Id","Available Quantity","Price","Catagory"};
		String[] rows = new String [5];
		JScrollPane sc;
		ImageIcon img20;
		ImageIcon back = new ImageIcon(".\\Images\\back1.png");
		
		public Fooditem_management()
		{
		super("Food item Management");
		this.setSize(1920,1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		img20 = new ImageIcon("Foodflow logo.png");
		this.setIconImage(img20.getImage());
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(new Color(28,28,28));
		p1.setLayout(null);
        
		l6=new JLabel();
		l6.setIcon(back);
		l6.setBounds(30, 30, 33, 33);
		l6.addMouseListener(this);
		p1.add(l6);
		
		tb = new JTable();
		d = new DefaultTableModel();
		d.setColumnIdentifiers(columns);
		
		tb.setSelectionBackground(Color.LIGHT_GRAY);
		tb.setModel(d);
		tb.setFont(new Font("Times New Roman",Font.BOLD,15));

		tb.setBackground(Color.Green);
		tb.setRowHeight(40);

		sc = new JScrollPane(tb);
		sc.setBounds(200,360,950,280);
		p1.add(sc);

        l = new JLabel("Fooditem Management");
		l.setFont(new Font("Monotype Corsiva",Font.BOLD,40));
		l.setForeground(Color.green);
		l.setBounds(500,60,500,50);
		p1.add(l);
		
		
		t1 = new MyTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t1.setForeground(Color.green);
		t1.setOpaque(false);
		t1.setBounds(110,160,200,30);
		((MyTextField) t1).setHint("Food Name");
		p1.add(t1);
		
		t2 = new MyTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t2.setForeground(Color.Green);
		t2.setOpaque(false);
		t2.setBounds(340,160,200,30);
		((MyTextField) t2).setHint("Food Id");
		p1.add(t2);
		
		t3 = new MyTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t3.setForeground(Color.	Green);
		t3.setOpaque(false);
		t3.setBounds(570,160,200,30);
		((MyTextField) t3).setHint("Food Name");
		p1.add(t3);
		
		t4 = new MyTextField();
		t4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t4.setForeground(Color.Green);
		t4.setOpaque(false);
		t4.setBounds(820,160,200,30);
		((MyTextField) t4).setHint("Food Id");
		p1.add(t4);
		
		t5 = new MyTextField();
		t5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t5.setForeground(Color.green);
		t5.setOpaque(false);
		t5.setBounds(1050,160,200,30);
		((MyTextField) t5).setHint("Food Id");
		p1.add(t5);
		
        c1 = new Cursor(Cursor.HAND_CURSOR);
		
		b1 = new MyButton();
		b1.setText("Insert");
		b1.setFocusPainted(false);
		b1.setBounds(200,250,150,35);
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.setCursor(c1);
		((MyButton) b1).setRedius(8);
		b1.setBorder(null);;
		p1.add(b1);
		b1.addActionListener(this);
		b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b1.setBackground(new Color(28,28,28));
                b1.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                b1.setForeground(new Color(28,28,28));
                b1.setBackground(new Color(255, 255, 255));
            }
        });
		b2 = new MyButton();
		b2.setText("Clear");
		b2.setFocusPainted(false);
		b2.setBounds(400,250,150,35);
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setCursor(c1);
		((MyButton) b2).setRedius(8);
		b2.setBorder(null);;
		p1.add(b2);
		b2.addActionListener(this);
		b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b2.setBackground(new Color(28,28,28));
                b2.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                b2.setForeground(new Color(28,28,28));
                b2.setBackground(new Color(255, 255, 255));
            }
        });
		b3 = new MyButton();
		b3.setText("Update");
		b3.setFocusPainted(false);
		b3.setBounds(600,250,150,35);
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setCursor(c1);
		((MyButton) b3).setRedius(8);
		b3.setBorder(null);;
		p1.add(b3);
		b3.addActionListener(this);
		b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b3.setBackground(new Color(28,28,28));
                b3.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                b3.setForeground(new Color(28,28,28));
                b3.setBackground(new Color(255, 255, 255));
            }
        });
		b4 = new MyButton();
		b4.setText("Remove");
		b4.setFocusPainted(false);
		b4.setBounds(800,250,150,35);
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setCursor(c1);
		((MyButton) b4).setRedius(8);
		b4.setBorder(null);;
		p1.add(b4);
		b4.addActionListener(this);
		b4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b4.setBackground(new Color(28,28,28));
                b4.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                b4.setForeground(new Color(28,28,28));
                b4.setBackground(new Color(255, 255, 255));
            }
        });
		
        this.add(p1);	
       	
        tb.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent m)
			{
				int numberOfRow = tb.getSelectedRow();
				
				String RName = d.getValueAt(numberOfRow,0).toString();
				String RId = d.getValueAt(numberOfRow,1).toString();
				String RLo= d.getValueAt(numberOfRow,2).toString();
				String RCo= d.getValueAt(numberOfRow,3).toString();
				String RC= d.getValueAt(numberOfRow,4).toString();
				
				
				t1.setText(RName);
				t2.setText(RId);
				t3.setText(RLo);
				t4.setText(RCo);
				t5.setText(RC);
			}
		});		
		}
		public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==l6) {
			this.setVisible(false);
			management ma=new management();
			ma.setVisible(true);
		}
		
	}
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==l6) {
			l6.setForeground(Color.BLACK);
		}
		
	}
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==l6) {
			l6.setForeground(Color.Green);
		}
		
	}	
	
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
			   rows[0] = t1.getText();
			   rows[1] = t2.getText();
			   rows[2] = t3.getText();
			   rows[3] = t4.getText();
			   rows[4] = t5.getText();
			   d.addRow(rows);
		    }
			else if(e.getSource()==b2)
			{
			    t1.setText("");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t5.setText("");
		    }
			else if(e.getSource()==b5)
			{
			this.setVisible(false);
			management ma=new management();
			ma.setVisible(true);
			}
			else if(e.getSource()==b4)
			{
			 int numberOfRow = tb.getSelectedRow();
			 
			 if(numberOfRow>=0)
			 {
				 d.removeRow(numberOfRow);
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null,"No row has been selected","This is a massage box",0);
			 }
			}
			else if(e.getSource()==b3)
			{
			    int numberOfRow = tb.getSelectedRow();
				
				String RName = t1.getText();
				String RId = t2.getText();
				String RLo = t3.getText();
				String RCo = t4.getText();
				String RC = t5.getText();
				
				d.setValueAt(RName,numberOfRow,0);
				d.setValueAt(RId,numberOfRow,1);
				d.setValueAt(RLo,numberOfRow,2);
				d.setValueAt(RCo,numberOfRow,3);
				d.setValueAt(RC,numberOfRow,4);
		    }
		}
	
	public static void main(String [] args)
	{
		Fooditem_management form = new Fooditem_management();
		form.show();
		//form.setVisible(true);
	}	
}