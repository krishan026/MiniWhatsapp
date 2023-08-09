package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Ribbon 
{
	//---Singleton Pattern---//
	private static Ribbon singleInstance;
	public static Ribbon getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance = new Ribbon();
		}
		return singleInstance;
	}
	
	//---Panel on which every component will reside---//
	private JPanel mainPanel;
	
	//---Instance Variables---//
	JLabel calls;
	JLabel chats;
	JLabel contacts;
	
	public JPanel getRibbon()
	{
		return mainPanel;
	}
	
	//---Constructor---//
	private Ribbon()
	{
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setBounds(0, 0, 340, 110);
		mainPanel.setLayout(null);

		JPanel upperPanel = new JPanel();
		upperPanel.setBackground(new Color(0, 108, 97));
		upperPanel.setBounds(0, 0, 334, 55);
		upperPanel.setLayout(null);
		JLabel WhatsApp = new JLabel("Mini Whatsapp");
		WhatsApp.setForeground(Color.WHITE);
		WhatsApp.setFont(new Font("Roboto", Font.BOLD, 16));
		WhatsApp.setBounds(15, 15, 155, 22);
		upperPanel.add(WhatsApp);
		
		JLabel options = new JLabel("");
		options.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked (MouseEvent e)
			{
				MainFrame.getInstance().activateSettingsPanel();
			}
		});
		options.setIcon(new ImageIcon(Ribbon.class.getResource("/img/three_dots.png")));
		options.setBounds(290, 11, 34, 33);
		upperPanel.add(options);
		
		mainPanel.add(upperPanel);

		JPanel lowerPanel = new JPanel();
		lowerPanel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(192, 192, 192)));
		lowerPanel.setBackground(new Color(0, 108, 97));
		lowerPanel.setBounds(0, 55, 334, 55);
		lowerPanel.setLayout(null);

		//---Call Tab---//
		calls = new JLabel("CALLS");
		calls.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				switchTab(1);
			}
		});
		calls.setForeground(Color.WHITE);
		calls.setHorizontalAlignment(SwingConstants.CENTER);
		calls.setFont(new Font("Roboto", Font.BOLD, 14));
		calls.setBounds(0, 0, 111, 55);
		lowerPanel.add(calls);

		//---Chat tab---//
		chats = new JLabel("CHATS");
		chats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				switchTab(2);
			}
		});		
		chats.setHorizontalAlignment(SwingConstants.CENTER);
		chats.setForeground(Color.WHITE);
		chats.setFont(new Font("Roboto", Font.BOLD, 14));
		chats.setBounds(112, 0, 111, 55);
		lowerPanel.add(chats);

		//---Contact tab---//
		contacts = new JLabel("CONTACTS");
		contacts.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{			
				switchTab(3);
			}
		});		
		contacts.setHorizontalAlignment(SwingConstants.CENTER);
		contacts.setForeground(Color.WHITE);
		contacts.setFont(new Font("Roboto", Font.BOLD, 14));
		contacts.setBounds(223, 0, 111, 55);
		lowerPanel.add(contacts);
		mainPanel.add(lowerPanel);
	}
	
	public void switchTab(int num)
	{
		if(num==1)
		{
			calls.setBorder(new MatteBorder(0, 0, 6, 0, (Color) new Color(255, 255, 255)));
			chats.setBorder(null);
			contacts.setBorder(null);
			MainFrame.getInstance().activateCallsContainer();
		}
		if(num==2)
		{
			calls.setBorder(null);
			chats.setBorder(new MatteBorder(0, 0, 6, 0, (Color) new Color(255, 255, 255)));			
			contacts.setBorder(null);
			MainFrame.getInstance().activateChatContainer();
		}
		if(num==3)
		{
			calls.setBorder(null);
			chats.setBorder(null);
			contacts.setBorder(new MatteBorder(0, 0, 6, 0, (Color) new Color(255, 255, 255)));
			MainFrame.getInstance().activateContactContainer();
		}
	}
}