import java.awt.*;
import java.awt.event.*;
import java.lang.*;
class Age extends WindowAdapter implements ActionListener
{
	Frame f;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	TextField t1,t2,t3,t4,t5,t6;
	Button b;
	Age()
	{
		f=new Frame("AGE");
		f.setBackground(Color.magenta);
		l1=new Label("Date-Of-Birth");
		//l1.setBackground(Color.magenta);
		l1.setFont(new Font("Arial",Font.PLAIN,15));
		l1.setBounds(90,50,90,25);
		l2=new Label("Today-Date");
		l2.setBounds(100,100,80,25);
		l2.setFont(new Font("Arial",Font.PLAIN,15));
		//t1=new TextField(2);
		//t1.setBounds(130,50,5,25);
		t1=new TextField();
		t1.setBounds(180,50,23,23);
		t1.setBackground(Color.cyan);
		l4=new Label("-");
		l4.setBounds(203,50,10,20);
		l4.setFont(new Font("Arial",Font.PLAIN,20));
		t2=new TextField();
		t2.setBounds(214,50,23,23);
		t2.setBackground(Color.cyan);
		l5=new Label("-");
		l5.setBounds(237,50,10,20);
		l5.setFont(new Font("Arial",Font.PLAIN,20));
		t3=new TextField();
		t3.setBounds(248,50,40,23);
		t3.setBackground(Color.cyan);
		
		
		t4=new TextField();
		t4.setBounds(180,100,23,23);
		t4.setBackground(Color.cyan);
		l6=new Label("-");
		l6.setBounds(203,100,10,20);
		l6.setFont(new Font("Arial",Font.PLAIN,20));
		t5=new TextField();
		t5.setBounds(214,100,23,23);
		t5.setBackground(Color.cyan);
		l7=new Label("-");
		l7.setBounds(237,100,10,20);
		l7.setFont(new Font("Arial",Font.PLAIN,20));
		t6=new TextField();
		t6.setBounds(248,100,40,23);
		t6.setBackground(Color.cyan);
		b=new Button("Age");
		b.setBounds(170,150,50,25);
		b.setBackground(Color.pink);
		l8=new Label();
		l8.setBounds(50,200,300,40);
		l8.setBackground(Color.yellow);
		l10=new Label();
		l10.setBounds(50,240,300,40);
		l10.setBackground(Color.yellow);
		
		l3=new Label();
		f.addWindowListener(this);
		//f.addActionListener(this);
		f.add(l1);
		f.add(t1);
		f.add(l4);
		f.add(t2);
		f.add(l5);
		f.add(t3);
		
		f.add(l2);
		f.add(t4);
		f.add(l6);
		f.add(t5);
		f.add(l7);
		f.add(t6);
		f.add(b);
		b.addActionListener(this);
		f.add(l8);
		f.add(l10);
		
		f.add(l3);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void actionPerformed(ActionEvent e)
	{
		int d1,m1,y1,d2,m2,y2,z,z1,z2,q,q1,q2,w,w1,w2,i,j,cm=0,cd=0,da,mo,ye;
		if(e.getSource()==b)
		{
			if(t1.getText()=="")
			{
				l8.setText("adfgh");
			}
			d1=Integer.parseInt(t1.getText());
			
			m1=Integer.parseInt(t2.getText());
			y1=Integer.parseInt(t3.getText());
			d2=Integer.parseInt(t4.getText());
			m2=Integer.parseInt(t5.getText());
			y2=Integer.parseInt(t6.getText());			
			w=d1;
			q=d2;
			da=Math.abs(q-w);
			w1=m1;
			q1=m2;
			i=q1;
			while(i!=w1)
			{
				if(i==12)
				{
					i=0;
				}
				i++;
				cm++;
			}
			j=q;
			while(j!=w)
			{
				if(q1==1||q1==3||q1==5||q1==7||q1==8||q1==10||q1==12)
				{
					if(j==31)
					{
						j=0;
					}
				}
				else if(q1==2)
				{
					if(j==28)
					{
						j=0;
					}
				}
				else
				{
					if(j==30)
					{
						j=0;
					}
				}
				j++;
				cd++;
			}
			mo=Math.abs(q1-w1);
			w2=y1;
			q2=y2;
			ye=Math.abs(q2-w2);
			if(q2==w2)
			{
				if(q1==w1)
				{
					if(q<w)
					{
						l8.setText("Give valid date of birth");
						l10.setText("");
						return;
					}
				}
				else if(q1<w1){
					l8.setText("Give valid date of birth");
					l10.setText("");
					return;
				}
			}
			else if(q2<w2)
			{
				l8.setText("Give valid date of birth");
				l10.setText("");
				return;
			}
			if(q2==w2)
			{
				if(q1==w1)
				{
					l8.setText("your Age is "+da+" days");
					l10.setText("After "+cd+" days your age will be "+cm+1+" month ");
				}
				else{
					if(mo==1)
					l8.setText("your Age is "+mo+" month");
					else
					l8.setText("your Age is "+mo+" months ");
					if(cd==0)
					{
						if(cm==1)
						l10.setText("After "+cm+" month your age will be "+ye+1+" year");
						else
						l10.setText("After "+cm+" months your age will be "+ye+1+" year");
					}   
					else
					l10.setText("After "+cm+" months "+cd+" days your age will be "+ye+1+" year");
				}
				
			}

			else if(cm==0 && cd==0)
			{
				l8.setText("your Age is "+ye+" years");
				l10.setText("");
			}
			else
			{
				int ye1=ye-1;
				l8.setText("your Age is "+ye1+" years");
				if(cm==0)
				l10.setText("After "+cd+" days your age will be "+ye+" years");
				else if(cd==0)
				{
					if(cm==1)
					{
						l10.setText("After "+cm+" month your age will be "+ye+" years");
					}
					else
					l10.setText("After "+cm+" months your age will be "+ye+" years");
				}
				else
				{
					if(cm==1)
					l10.setText("After "+cm+" month "+cd+" days your age will be "+ye+" years");
					else
					l10.setText("After "+cm+" months "+cd+" days your age will be "+ye+" years");
				}
			}
		}
	}
	public static void main(String args[])
	{
		Age a=new Age();
	}
}
