import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*; 

public class CalculatorApp 
{
	public static void main(String args[])
	{
		calculator obj=new calculator();
	}
}
class calculator extends JFrame
{
	String s;
	JPanel jp;
	JButton clear,backspace,percentage,plus,minus,multiply,divide,equalsTo,decimal,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JTextField t;
	double num1,num2,result;
	String operation;
	char prev_operation;
	char curr_operation;

	public calculator()
	{
		jp=new JPanel();
		jp.setBackground(Color.LIGHT_GRAY);
		jp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
		t=new JTextField(20);
		t.setBounds(10, 10, 348, 100);
		t.setHorizontalAlignment(JTextField.RIGHT);
		Font f = new Font("SansSerif", Font.BOLD, 20);
		t.setFont(f);
		add(t);
		
		//Clear Button
		clear=new JButton("C");
		clear.addActionListener(new ActionListener()
				{
			    @Override
			    public void actionPerformed(ActionEvent e) 
			     {
			    	t.setText("");
			     }
				});
		clear.setBounds(10, 112, 85, 50);
		clear.setFont(new Font("Arial", Font. PLAIN, 20));
		add(clear);
		
		//Backspace Button
		backspace=new JButton("DEL");
		backspace.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		    	   String str=t.getText();
		    	   int length=str.length();
		    	   if(length>0)
		    	   {
		    		   str=str.substring(0,length-1);
		    		   
		    	   }
		    	   t.setText(str);
		        }
				});
		backspace.setBounds(98, 112, 85, 50);
		backspace.setFont(new Font("Arial", Font. PLAIN, 20));
		add(backspace);
		
		//Percentage Button
		percentage=new JButton("%");
		percentage.addActionListener(new ActionListener()
		{
	    @Override
        public void actionPerformed(ActionEvent e) 
        {
    	   double val=Double.parseDouble(t.getText());
    	   val=val/100;
    	   t.setText(val+"");
        }
		});
        percentage.setBounds(186, 112, 85, 50);
        percentage.setFont(new Font("Arial", Font. PLAIN, 20));
        add(percentage);
        
        //Plus Button
      	plus=new JButton("+");
      	plus.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	String str=t.getText();
        	int length_of_str= str.length();
        	if(length_of_str>1)
        	{
        	prev_operation=str.charAt(length_of_str-2);
        	if(prev_operation=='+' || prev_operation=='-' || prev_operation=='*'||prev_operation=='/')
        	{
        		str=str.substring(0,length_of_str-3);
        		str=str + " + ";
        		t.setText(str);
        	}
        	else
        	{
          	    t.setText(t.getText()+ " + ");
        	}
        	}
        		
        	else
        	{
          	    t.setText(t.getText()+ " + ");
        	}
        }
      	});
        plus.setBounds(274, 112, 85, 50);
        plus.setFont(new Font("Arial", Font. PLAIN, 20));
        add(plus);
        
        //7 Button
      	b7=new JButton("7");
      	b7.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          	String str=t.getText();
            str=str+"7";
          	t.setText(str);
        }
      	});
        b7.setBounds(10, 165, 85, 50);
        b7.setFont(new Font("Arial", Font. PLAIN, 20));
        add(b7);
        
		//8 Button
		b8=new JButton("8");
		b8.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"8";
		          	t.setText(str);		    	   
		        }
				});
		b8.setBounds(98, 165, 85, 50);
		b8.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b8);
		
		//9 Button
		b9=new JButton("9");
		b9.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"9";
		          	t.setText(str);		    	   
		        }
				});
		b9.setBounds(186, 165, 85, 50);
		b9.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b9);
		
        //Minus Button
      	minus=new JButton("-");
      	minus.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	String str=t.getText();
        	int length_of_str= str.length();
        	if(length_of_str>1)
        	{
        	prev_operation=str.charAt(length_of_str-2);
        	if(prev_operation=='+' || prev_operation=='-' || prev_operation=='*'||prev_operation=='/')
        	{
        		str=str.substring(0,length_of_str-3);
        		str=str + " - ";
        		t.setText(str);
        	}
        	else
        	{
          	    t.setText(t.getText()+ " - ");
        	}
        	}
        		
        	else
        	{
          	    t.setText(t.getText()+ " - ");
        	}
        }
      	});
        minus.setBounds(274, 165, 85, 50);
        minus.setFont(new Font("Arial", Font. PLAIN, 20));
        add(minus);
        
        //4 Button
      	b4=new JButton("4");
      	b4.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          	String str=t.getText();
            str=str+"4";
          	t.setText(str);
        }
      	});
        b4.setBounds(10, 218, 85, 50);
        b4.setFont(new Font("Arial", Font. PLAIN, 20));
        add(b4);
        
		//5 Button
		b5=new JButton("5");
		b5.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"5";
		          	t.setText(str);		    	   
		        }
				});
		b5.setBounds(98, 218, 85, 50);
		b5.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b5);
		
		//6 Button
		b6=new JButton("6");
		b6.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"6";
		          	t.setText(str);		    	   
		        }
				});
		b6.setBounds(186, 218, 85, 50);
		b6.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b6);
		
        //Multiply Button
      	multiply=new JButton("*");
      	multiply.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	String str=t.getText();
        	int length_of_str= str.length();
        	if(length_of_str>1)
        	{
        	prev_operation=str.charAt(length_of_str-2);
        	if(prev_operation=='+' || prev_operation=='-' || prev_operation=='*'||prev_operation=='/')
        	{
        		str=str.substring(0,length_of_str-3);
        		str=str + " * ";
        		t.setText(str);
        	}
        	else
        	{
          	    t.setText(t.getText()+ " * ");
        	}
        	}
        		
        	else
        	{
          	    t.setText(t.getText()+ " * ");
        	}
        }
      	});
        multiply.setBounds(274, 218, 85, 50);
        multiply.setFont(new Font("Arial", Font. PLAIN, 20));
        add(multiply);

        //1 Button
      	b1=new JButton("1");
      	b1.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          	String str=t.getText();
            str=str+"1";
          	t.setText(str);
        }
      	});
        b1.setBounds(10, 271, 85, 50);
        b1.setFont(new Font("Arial", Font. PLAIN, 20));
        add(b1);
        
		//2 Button
		b2=new JButton("2");
		b2.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"2";
		          	t.setText(str);		    	   
		        }
				});
		b2.setBounds(98, 271, 85, 50);
		b2.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b2);
		
		//3 Button
		b3=new JButton("3");
		b3.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+"3";
		          	t.setText(str);		    	   
		        }
				});
		b3.setBounds(186, 271, 85, 50);
		b3.setFont(new Font("Arial", Font. PLAIN, 20));
		add(b3);
		
        //Divide Button
      	divide=new JButton("/");
      	divide.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	String str=t.getText();
        	int length_of_str= str.length();
        	if(length_of_str>1)
        	{
        	prev_operation=str.charAt(length_of_str-2);
        	if(prev_operation=='+' || prev_operation=='-' || prev_operation=='*'||prev_operation=='/')
        	{
        		str=str.substring(0,length_of_str-3);
        		str=str + " / ";
        		t.setText(str);
        	}
        	else
        	{
          	    t.setText(t.getText()+ " / ");
        	}
        	}
        		
        	else
        	{
          	    t.setText(t.getText()+ " / ");
        	}
        }
      	});
        divide.setBounds(274, 271, 85, 50);
        divide.setFont(new Font("Arial", Font. PLAIN, 20));
        add(divide);
        
        //0 Button
      	b0=new JButton("0");
      	b0.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          	String str=t.getText();
            str=str+"0";
          	t.setText(str);
        }
      	});
        b0.setBounds(10, 324, 173, 50);
        b0.setFont(new Font("Arial", Font. PLAIN, 20));
        add(b0);
        
		//Decimal Button
		decimal=new JButton(".");
		decimal.addActionListener(new ActionListener()
				{
			    @Override
		        public void actionPerformed(ActionEvent e) 
		        {
		          	String str=t.getText();
		            str=str+".";
		          	t.setText(str);		    	   
		        }
				});
		decimal.setBounds(186, 324, 85, 50);
		decimal.setFont(new Font("Arial", Font. BOLD, 20));
		add(decimal);
		
        //EqualsTo Button
      	equalsTo=new JButton("=");
      	equalsTo.addActionListener(new ActionListener()
      	{
        @Override
        public void actionPerformed(ActionEvent e) 
        {
        	s=t.getText();
    		s=s+" ";
    		String arr[]=s.split(" ");
    		int length=arr.length;

    		result=0.0;
    		int flag=0;
    		double double_val=0.0;
    		double value;
    		int answer;
    		if(length==1)
    		{
    			num1=Double.parseDouble(arr[0]);
    			double_val=Math.floor(num1);
    			value=num1-double_val;
    			if(value==0.0)
    			{
    				answer=(int)num1;
    				t.setText(answer+"");
    			}
    			else
    			{
    				t.setText(num1+"");
    				
    			}
    		}
    		else if(length==2)
    		{
    			num1=Double.parseDouble(arr[0]);
    			double_val=Math.floor(num1);
    			value=num1-double_val;
    			if(value==0.0)
    			{
    				answer=(int)num1;
    				t.setText(answer+"");
    			}
    			else
    			{
    				t.setText(num1+"");
    				
    			}

    		}
    		else
    		{
	        	num1=Double.parseDouble(arr[0]);
	        	operation=arr[1];		
	        	num2=Double.parseDouble(arr[2]);
	    		if(length%2!=0)
	    		{
	    		
		    		//For performing multiple operations
		    		for(int i=3;i<length-1;i=i+2)
		    		{
		    			switch(operation)
		    			{
		    			case "+":result=num1+num2;
		    			      break;
		    			case "-":result=num1-num2;
		    			      break;
		    			case "*":result=num1*num2;
		    			      break;
		    			case "/":
		          		    if(num2!=0)
		          		    {
		          			  result=num1/num2;
		          		    }
		          		    else
		          		    {
		          			  String str="Can't Divide By Zero";
		          			  t.setText(str);
		          		    }
		    			    break;
		    			}
		    			num1=result;
		    			operation=arr[i];
		    			num2=Double.parseDouble(arr[i+1]);
		    		}
	    		}
	    		
	    		  		
	    		else
	    		{
	        		for(int i=3;i<length-3;i=i+2)
	        		{
	        			switch(operation)
	        			{
	        			case "+":result=num1+num2;
	        			      break;
	        			case "-":result=num1-num2;
	        			      break;
	        			case "*":result=num1*num2;
	        			      break;
	        			case "/":
	              		    if(num2!=0)
	              		    {
	              			  result=num1/num2;
	              		    }
	              		    else
	              		    {
	              			  String str="Can't Divide By Zero";
	              			  t.setText(str);
	              		    }
	        			    break;
	        			}
	        			num1=result;
	        			operation=arr[i];
	        			num2=Double.parseDouble(arr[i+1]);
	    		     }
	    		}
	  
	    		if(operation.equals("+"))
	    		{
	    			result=num1+num2;
	    		}
	    		else if(operation.equals("-"))
	    		{
	    			result=num1-num2;
	    		}
	    		else if(operation.equals("*"))
	    		{
	    			result=num1*num2;
	    		}
	    		else if(operation.equals("/"))
	    		{
	      		    if(num2!=0)
	      		    {
	      			  result=num1/num2;
	      		    }
	      		    else
	      		    {
	      			  String str="Can't Divide By Zero";
	      			  flag=1;
	      			  t.setText(str);
	      		    }
	    		}
	    		
	    		//To display the result in double or int
	    		if(flag==0)
	    		{
	    			double_val=Math.floor(result);
	    			value=result-double_val;
	    			if(value==0.0)
	    			{
	    				answer=(int)result;
	    				t.setText(answer+"");
	    			}
	    			else
	    				t.setText(result+"");	
	    		}
    	}

        }
    	
    	});
      	equalsTo.setBounds(274, 324, 85, 50);
      	equalsTo.setFont(new Font("Arial", Font. PLAIN, 20));
        add(equalsTo);
        
		add(jp);
		
		setVisible(true);
		setSize(383, 420);
		setDefaultCloseOperation(3);
		setResizable(false);
		setTitle("Calculator");
	}
}

