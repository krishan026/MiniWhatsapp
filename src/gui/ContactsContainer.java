package gui;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContactsContainer 
{
	
	//---Instance Variables---//
	private JScrollPane scrollPane;
	private static JPanel mainPanel;
	private int i=1;
	
	//---Singleton Pattern---//	
	private static ContactsContainer singleInstance;	
	public static ContactsContainer getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new ContactsContainer();
		}
		return singleInstance;
	}
	
	//---It will return calls panel---//
	public JScrollPane getContactsContainer()
	{
		return scrollPane; 
	}
	
	//---Constructor---//
	private ContactsContainer()
	{
		mainPanel = new JPanel();		
		//mainPanel.setBackground(Color.YELLOW);
		scrollPane = new JScrollPane();		
		scrollPane.setViewportView(mainPanel);
		scrollPane.setBounds(0, 110, 334, 470);
		mainPanel.setLayout(null);	
	}
	
	private JPanel addContactPanel(int num,String number,String name,String about,BufferedImage image)
	{

		ContactPanel cp = new ContactPanel(num,number,name,about,image);
		JPanel temp = cp.getContactPanel();
		return temp;
	}
	public void setContactOnGUI(String name,String number,String about)
	{
		BufferedImage dummyImage;
		try
		{
			dummyImage = ImageIO.read(ContactsContainer.class.getResource("/img/contactDP.png"));
			mainPanel.add(addContactPanel(i,number,name,about,dummyImage));
			i++;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}