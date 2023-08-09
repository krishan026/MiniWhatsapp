package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame 
{
	//---Single instance---//
	private static MainFrame singleInstance;	
	public static MainFrame getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new MainFrame();
		}
		return singleInstance;
	}

	//---Instance Variables---//
	JFrame frame;
	JPanel panel;
	
	//---Private Constructor---//
	private MainFrame()
	{
		frame = new JFrame();		
		frame.setTitle("Mini Whatsapp");
		frame.getContentPane();
		frame.setBounds(100, 70, 350, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 340, 580);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		//frame.setVisible(true);
	}
	
	//---Ribbon---//
	public void addRibbon()
	{
		panel.add(Ribbon.getInstance().getRibbon());
	}
	//---CallsContainer---//
	public void addCallsContainer()
	{
		panel.add(CallsContainer.getInstance().getCallsContainer());
	}
	//---ChatsContainer---//
	public void addChatsContainer()
	{
		panel.add(ChatsContainer.getInstance().getChatsContainer());
	}
	//---ContactsContainer---//
	public void addContactsContainer()
	{
		panel.add(ContactsContainer.getInstance().getContactsContainer());
	}
	//---Verification Panel---//
	public void addVerificationPanel()
	{
		panel.add(VerificationPanel.getInstance().getVerificationPanel());
	}
	//---Registration Panel---//
	public void addRegistrationPanel()
	{
		panel.add(RegistrationPanel.getInstance().getRegistrationPanel());
	}
	//---Conversation Panel---//
	public void addConversationPanel()
	{
		panel.add(ConversationPanel.getInstance().getConversationPanel());
	}
	//---Settings Panel---//
	public void addSettingsPanel()
	{
		panel.add(SettingsPanel.getInstance().getSettingsPanel());
	}
	
	//---Activators---//
	public void activateCallsContainer()
	{
		Ribbon.getInstance().getRibbon().setVisible(true);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(true);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}
	
	public void activateChatContainer()
	{
		Ribbon.getInstance().getRibbon().setVisible(true);
		ChatsContainer.getInstance().getChatsContainer().setVisible(true);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}

	public void activateContactContainer()
	{
		Ribbon.getInstance().getRibbon().setVisible(true);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(true);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}
	
	public void activateVerificationPanel()
	{
		Ribbon.getInstance().getRibbon().setVisible(false);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(true);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}
	
	public void activateRegistrationPanel()
	{
		Ribbon.getInstance().getRibbon().setVisible(false);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(true);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}
	
	public void activateConversationPanel()
	{
		Ribbon.getInstance().getRibbon().setVisible(false);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(true);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(false);
	}
	
	public void activateSettingsPanel()
	{
		Ribbon.getInstance().getRibbon().setVisible(false);
		ChatsContainer.getInstance().getChatsContainer().setVisible(false);
		CallsContainer.getInstance().getCallsContainer().setVisible(false);
		ContactsContainer.getInstance().getContactsContainer().setVisible(false);
		VerificationPanel.getInstance().getVerificationPanel().setVisible(false);
		RegistrationPanel.getInstance().getRegistrationPanel().setVisible(false);
		ConversationPanel.getInstance().getConversationPanel().setVisible(false);
		SettingsPanel.getInstance().getSettingsPanel().setVisible(true);
	}
	
	//---Main method to start App---//
	public static void main(String[] args) 
	{
		MainFrame mf = MainFrame.getInstance();
		mf.addRibbon();
		mf.addCallsContainer();
		mf.addChatsContainer();
		mf.addContactsContainer();
		


        //---Dummy---//
		//Chats---
		ChatsContainer.getInstance().setChatOnGUI("Hanuman","10:45","Ram Ram","1234","Jai Shree Ram");
		ChatsContainer.getInstance().setChatOnGUI("Gopal","11:45","Radhe Radhe","4321","Jai Shree krishna");
		//Contacts---
		ContactsContainer.getInstance().setContactOnGUI("Hanuman","1234","Jai Shree Ram");
		ContactsContainer.getInstance().setContactOnGUI("Gopal","4321","Jai Shree Krishna");
		ContactsContainer.getInstance().setContactOnGUI("Krish","5678","Har Har Mahadev");
		//------//

		
		mf.addVerificationPanel();
		mf.activateVerificationPanel();
		mf.addRegistrationPanel();
		mf.addConversationPanel();
		
		mf.addSettingsPanel();		
		
		//For Updated JDK v11+
		mf.frame.setVisible(true);
	}
}