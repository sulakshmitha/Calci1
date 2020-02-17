package calci;


	import java.awt.event.*;
	import java.util.Scanner;
	import java.lang.*;
	import javax.swing.*; 
	import java.awt.*; 
	public class calculate extends JFrame implements ActionListener {  
	    static JFrame f;  
	    static JTextField l;  
	    String s0, s1, s2;  
	    calculate() 
	    { 
	    	 s0 = s1 = s2 = ""; 	
	     }  
	    public static void main(String args[]) 
	    {  
	    	presentation.present();
	     } 
	    public void actionPerformed(ActionEvent e) 
	    { 
	        String s = e.getActionCommand(); 
	        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
	            if (!s1.equals("")) 
	                s2 = s2 + s; 
	            else
	                s0 = s0 + s; 
	            presentation.l.setText(s0 + s1 + s2); 
	        } 
	        else if (s.charAt(0) == 'C') { 
	            s0 = s1 = s2 = " ";
	            presentation.l.setText(s0 + s1 + s2); 
	        } 
	        else if (s.charAt(0) == '=') { 
	  
	            double te;  
	            if (s1.equals("+")) 
	                te = add.adds(Double.parseDouble(s0),Double.parseDouble(s2)); 
	            else if (s1.equals("-")) 
	                te = sub.subs(Double.parseDouble(s0) , Double.parseDouble(s2)); 
	            else if (s1.equals("/")) 
	                te = div.divs(Double.parseDouble(s0) , Double.parseDouble(s2)); 
	            else
	                te = mul.muls(Double.parseDouble(s0) , Double.parseDouble(s2)); 
	            presentation.l.setText(s0 + s1 + s2 + "=" + te);
	            s0 = Double.toString(te); 
	  
	            s1 = s2 = ""; 
	        } 
	        else { 
	            if (s1.equals("") || s2.equals("")) 
	                s1 = s; 
	            
	            else { 
	                double te; 
	  
	                if (s1.equals("+")) 
	                    te = add.adds(Double.parseDouble(s0) ,Double.parseDouble(s2)); 
	                else if (s1.equals("-")) 
	                    te = sub.subs(Double.parseDouble(s0) , Double.parseDouble(s2)); 
	                else if (s1.equals("/")) 
	                    te = div.divs(Double.parseDouble(s0) ,Double.parseDouble(s2)); 
	                else
	                    te = mul.muls(Double.parseDouble(s0) ,Double.parseDouble(s2)); 
	                s0 = Double.toString(te);  
	                s1 = s; 
	                s2 = ""; 
	            }  
	            presentation.l.setText(s0 + s1 + s2); 
	        } 
	    } 
	} 



