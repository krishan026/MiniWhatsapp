package gui;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ChatsContainer 
{
	//---Instance Variables---//
	private JScrollPane scrollPane;
	private static JPanel mainPanel;
	private int i=1;
	
	//---Singleton Pattern---//	
	private static ChatsContainer singleInstance;	
	public static ChatsContainer getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new ChatsContainer();
		}
		return singleInstance;
	}
	
	//---It will return calls panel---//
	public JScrollPane getChatsContainer()
	{
		return scrollPane; 
	}
	
	//---Constructor---//
	private ChatsContainer()
	{
		mainPanel = new JPanel();		
		//mainPanel.setBackground(Color.DARK_GRAY);
		scrollPane = new JScrollPane();		
		scrollPane.setViewportView(mainPanel);
		scrollPane.setBounds(0, 110, 334, 470);
		mainPanel.setLayout(null);	
	}
	
	private JPanel addChatPanel(int num, String chatName, String time, String chat, String number, String about, BufferedImage image)
	{
		ChatPanel cp = new ChatPanel(num,chatName,time,chat,number,about,image);
		JPanel temp = cp.getChatPanel();
		return temp;
	}
	public void setChatOnGUI(String chatName,String time, String chat,String number,String about)
	{
		BufferedImage dummyImage;
		try
		{
			dummyImage = ImageIO.read(ChatsContainer.class.getResource("/img/chatDP.png"));
			mainPanel.add(addChatPanel(i,chatName,time,chat,number,about,dummyImage));
			i++;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}