
import javax.swing.*;    
    import java.awt.event.*; 
    import java.util.*;   
    class jbutton extends JFrame implements ActionListener{    
    JRadioButton rb1,rb2,rb4,rb3,invisible;    
    JLabel l1,l2;
    JButton b1,b2,b3;
    int[]p = new int[4];
   
    jbutton(){
     
    super("Voting Panel");  
    JLabel l1 = new JLabel("Welcome to Voting Portal!", SwingConstants.CENTER);
    l1.setBounds(100,20, 250,50);  
    JLabel l2 = new JLabel("Please cast your vote:", SwingConstants.LEFT); 
    l2.setBounds(50,80, 250,20); 
    rb1=new JRadioButton("AAP");    
    rb1.setBounds(50,110,100,30);      
    rb2=new JRadioButton("SP");    
    rb2.setBounds(50,140,100,30);
    rb3=new JRadioButton("BJP");    
    rb3.setBounds(50,170,100,30);   
    rb4=new JRadioButton("BSP");  
    rb4.setBounds(50,200,100,30);
    invisible=new JRadioButton();
    invisible.setVisible(false);       
    ButtonGroup bg=new ButtonGroup();    
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);
    bg.add(rb4);
    bg.add(invisible);   
    b1=new JButton("Cast Vote");    
    b1.setBounds(50,260,120,25);
    b2=new JButton("Result");
    b2.setBounds(190,260,100,25);
    b3=new JButton("Reset");    
    b3.setBounds(320,260,100,25);
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    b3.addActionListener(this); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    add(l1);
    add(l2);
    add(rb1);
    add(rb2);
    add(rb3);
    add(rb4);
    add(invisible);
    add(b1);
    add(b2);
    add(b3);  
    setSize(450,450);    
    setLayout(null);   
    setVisible(true);    
    }    
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b1)
    {    
     if(rb1.isSelected()){    
     int a=JOptionPane.showConfirmDialog(this,"Are you sure"); 
        if(a==JOptionPane.YES_OPTION)
    	    { JOptionPane.showMessageDialog(this,"You have voted for AAP.Thanks for voting!");
    	     p[0]++;}
    	  else
    	  	JOptionPane.showMessageDialog(this,"You didn't cast any vote");
    	
        }
       else if(rb2.isSelected()){    
     int a=JOptionPane.showConfirmDialog(this,"Are you sure"); 
        if(a==JOptionPane.YES_OPTION)
    	   { JOptionPane.showMessageDialog(this,"You have voted for SP.Thanks for voting!");
    	     p[1]++;}
    	  else
    	  	JOptionPane.showMessageDialog(this,"You didn't cast any vote");
    	
        }
      else if(rb3.isSelected()){    
     int a=JOptionPane.showConfirmDialog(this,"Are you sure"); 
        if(a==JOptionPane.YES_OPTION)
    	    {JOptionPane.showMessageDialog(this,"You have voted for BJP.Thanks for voting!");
    	     p[2]++;}
    	  else
    	  	JOptionPane.showMessageDialog(this,"You didn't cast any vote");
    	
     }
     else if(rb4.isSelected()){    
     int a=JOptionPane.showConfirmDialog(this,"Are you sure"); 
        if(a==JOptionPane.YES_OPTION)
    	    {JOptionPane.showMessageDialog(this,"You have voted for BSP.Thanks for voting!");
    	     p[3]++;}
    	  else
    	  	JOptionPane.showMessageDialog(this,"You didn't cast any vote");
    	
     }
     invisible.setSelected(true);
    }  
 else if(e.getSource()==b2)
{ int max=p[0],j=0,c=0;
  for(int i=1;i<4;i++)
	{if(max<p[i])
		{max=p[i];j=i;}
    }
  for(int i=1;i<4;i++)
   {if(j!=i && p[i]==max)
      {JOptionPane.showMessageDialog(this,"No party got majority votes.Its a tie");
       c=1;
       break;
      }
   }
    if(c==0)
    {if(j==0)
    	JOptionPane.showMessageDialog(this,"AAP won with "+max+" votes");
     if(j==1)
     	JOptionPane.showMessageDialog(this,"SP won with "+max+" votes");
     if(j==2)
     	JOptionPane.showMessageDialog(this,"BJP won with "+max+" votes");
     if(j==3)
     	JOptionPane.showMessageDialog(this,"BSP won with "+max+" votes");
    }
    for(int i=0;i<4;i++)
 p[i]=0;

}
else if(e.getSource()==b3)
{for(int i=0;i<4;i++)
 p[i]=0;
}
}

  public static void main(String args[]){    
    new jbutton();    
    }
} 