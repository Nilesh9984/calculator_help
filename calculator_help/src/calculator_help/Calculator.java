package calculator_help;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Calculator
{
	private JFrame frame;
	
	
	public static void main(String []Arg)
	EventQueue.invokeLater(new Runnable()
			{
			public void run()
			{
				try {
					Calculator window=new Calculator();
					window.frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			} );
	
}
