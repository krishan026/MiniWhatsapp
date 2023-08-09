package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CallsContainer 
{
	//---Instance Variables---//
	private JScrollPane scrollPane;
	private static JPanel mainPanel;
	
	//---Singleton Pattern---//	
	private static CallsContainer singleInstance;	
	public static CallsContainer getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new CallsContainer();
		}
		return singleInstance;
	}
	
	//---It will return calls panel---//
	public JScrollPane getCallsContainer()
	{
		return scrollPane; 
	}
	
	//---Constructor---//
	private CallsContainer()
	{
		mainPanel = new JPanel();		
		//mainPanel.setBackground(Color.BLACK);
		scrollPane = new JScrollPane();		
		scrollPane.setViewportView(mainPanel);
		scrollPane.setBounds(0, 110, 334, 470);
		mainPanel.setLayout(null);	
	}
}