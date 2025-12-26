import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class management extends JFrame implements ActionListener,MouseListener
{
	JButton b,b1,b2,b3,b4,b5,b6;
	ImageIcon food=new ImageIcon("food.png");
	JLabel l1,l6;
	Cursor c1;
	JPanel p1;
    ImageIcon img20;
	ImageIcon back=new ImageIcon(".\\Images\\backButton.png");
	
	public management()
	{
		//Frame
		super("Management");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(1920,1080));
		this.setLocationRelativeTo(null);
		
		img20 = new ImageIcon("Foodflow logo.png");
		this.setIconImage(img20.getImage());
		
		c1 = new Cursor(Cursor.HAND_CURSOR);
		
		l6=new JLabel();
		l6.setIcon(back);
		l6.setBounds(30, 30, 33, 33);
		l6.addMouseListener(this);
		this.add(l6);
		
        p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(new Color(255,255,255));
		p1.setLayout(null);
  		this.add(p1);
		
		
		b2=new JButton("Restaurant Management");
		b2.setFont(new Font("Tahoma",Font.BOLD,17));
		b2.setForeground(Color.black);
		b2.setBounds(210,70,250,150);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		b2.addActionListener(this);
		b2.setFocusable(false);
		b2.setCursor(c1);
		p1.add(b2);
		
		b3=new JButton("Employee Management");
		b3.setFont(new Font("Tahoma",Font.BOLD,18));
		b3.setForeground(Color.black);
		b3.setBounds(80,270,250,150);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		b3.setFocusable(false);
		b3.addActionListener(this);
		b3.setCursor(c1);
		p1.add(b3);
		
		b4=new JButton("FoodItem Management");
		b4.setFont(new Font("Tahoma",Font.BOLD,18));
		b4.setForeground(Color.black);
		b4.setBounds(350,270,250,150);
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		b4.setFocusable(false);
		b4.addActionListener(this);
		b4.setCursor(c1);
		p1.add(b4);
		
		b5=new JButton("Waiter Management");
		b5.setFont(new Font("Tahoma",Font.BOLD,20));
		b5.setForeground(Color.black);
		b5.setBounds(80,470,250,150);
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		b5.setFocusable(false);
		b5.addActionListener(this);
		b5.setCursor(c1);
		p1.add(b5);
		
		b6=new JButton("Chief Management");
		b6.setFont(new Font("Tahoma",Font.BOLD,20));
		b6.setForeground(Color.black);
		b6.setBounds(350,470,250,150);
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		b6.setFocusable(false);
		b6.addActionListener(this);
		b6.setCursor(c1);
		p1.add(b6);
		
		//Label
		l1=new JLabel(new ImageIcon("Owner Mananagement (3).gif"));
		l1.setBounds(70,20,1152,648);
		p1.add(l1);
		
		this.setVisible(true);
		
	}
	 public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==l6) {
			this.setVisible(false);
			Owner o1=new Owner();
			o1.setVisible(true);
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
			l6.setForeground(Color.WHITE);
		}
		
	}
	public void actionPerformed(ActionEvent e) {
		/*if(e.getSource()==b1){
			this.setVisible(false);
			Order o=new Order();
			o.setVisible(true);
		}*/
	    if(e.getSource()==b2)
		{
			this.setVisible(false);
			Restaurant_management i=new Restaurant_management();
			i.setVisible(true);
		}
		else if(e.getSource()==b3)
		{
			this.setVisible(false);
			Employee_management em=new Employee_management();
			em.setVisible(true);
		}
		else if(e.getSource()==b4)
		{
			this.setVisible(false);
			Fooditem_management fi=new Fooditem_management();
			fi.setVisible(true);
		}
		else if(e.getSource()==b5)
		{
			this.setVisible(false);
			Waiter w=new Waiter();
			w.setVisible(true);
		}
		else if(e.getSource()==b6)
		{
			this.setVisible(false);
			Cheif_management c=new Cheif_management();
			c.setVisible(true);
		}
		/*else if(e.getSource()==b){
			this.setVisible(false);
			Owner o1=new Owner();
			o1.setVisible(true);
		}*/

	}
	public static void main(String[]args) {
		management form=new management();
		form.show();
	}
	
}