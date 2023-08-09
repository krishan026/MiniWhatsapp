package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class ConversationPanel 
{
	//---Instance Variable---//	
	private JPanel mainPanel;

	//---Singleton Pattern---//
	private static ConversationPanel singleInstance;	
	public static ConversationPanel getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new ConversationPanel();
		}
		return singleInstance;
	}
	
	//--- it will return conversation panel---//
	public JPanel getConversationPanel()
	{
		return mainPanel;
	}		
	private ConversationPanel() 
	{			
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setBounds(0, 0, 335, 590);		
		mainPanel.setLayout(null);
		
		//---Header ---//
		JPanel conversationPanelHeader = new JPanel();	
		conversationPanelHeader.setBackground(new Color(0, 108, 97));
		conversationPanelHeader.setBounds(0, 0, 334, 50);
		mainPanel.add(conversationPanelHeader);
		conversationPanelHeader.setLayout(null);	
		
		JLabel back = new JLabel();
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setIcon(new ImageIcon(ConversationPanel.class.getResource("/img/back-arrow.png")));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				MainFrame.getInstance().activateChatContainer();
			}
		});
		back.setBounds(0, 0, 41, 50);
		conversationPanelHeader.add(back);
		
		JLabel nameLabel = new JLabel("Krish");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameLabel.setBounds(93, 0, 165, 28);
		conversationPanelHeader.add(nameLabel);
		
		JLabel onlineStatus = new JLabel("Online");
		onlineStatus.setForeground(Color.WHITE);
		onlineStatus.setBounds(93, 28, 165, 22);
		conversationPanelHeader.add(onlineStatus);	
		
		JLabel profileIcon = new JLabel();
		profileIcon.setIcon(new ImageIcon(ConversationPanel.class.getResource("/img/contactDP.png")));
		
		profileIcon.setBounds(38, 0, 41, 50);
		conversationPanelHeader.add(profileIcon);
		
		//--- incoming panel ---//
		JPanel incoming = new JPanel();	
		incoming.setLayout(new BorderLayout());
		incoming.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(incoming);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 50, 348, 490);
		mainPanel.add(scrollPane);
		
		//--- outgoing panel---//
		JPanel outgoingPanel = new JPanel();
		outgoingPanel.setBackground(Color.WHITE);
		outgoingPanel.setBounds(0, 545, 334, 35);
		mainPanel.add(outgoingPanel);
		outgoingPanel.setLayout(null);
		
		JTextField outgoing = new JTextField();
		outgoing.setOpaque(false);
		outgoing.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 102, 51)));
		outgoing.setBounds(42, 7, 261, 25);
		outgoingPanel.add(outgoing);
		outgoing.setColumns(10);		
		
		
		JLabel sendButton = new JLabel("Send");
		sendButton.setIcon(new ImageIcon(ConversationPanel.class.getResource("/img/send_button.png")));
		sendButton.setHorizontalAlignment(SwingConstants.CENTER);
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{	
				JOptionPane.showMessageDialog(null,"message sent");
			}
				
		});
		sendButton.setBounds(305, 0, 41, 32);
		outgoingPanel.add(sendButton);
		
		JLabel attachmentButton = new JLabel("");
		attachmentButton.setIcon(new ImageIcon(ConversationPanel.class.getResource("/img/add24px.png")));
		attachmentButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				JOptionPane.showMessageDialog(null,"attachment");
			}
		});
		attachmentButton.setHorizontalAlignment(SwingConstants.CENTER);
		attachmentButton.setBounds(3, 0, 41, 32);
		outgoingPanel.add(attachmentButton);	
	}
}
