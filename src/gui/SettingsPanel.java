package gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class SettingsPanel 
{
	//---Instance Variables---//
	private JPanel settingsPanel;
	
	//---Singleton pattern---//
	private static SettingsPanel singleInstance;
	public static SettingsPanel getInstance()
	{
		if(singleInstance==null)
		{
			singleInstance= new SettingsPanel();
			return singleInstance;
		}
		return singleInstance;
	}
	 
	//--- it will return settings panel---//
	public JPanel getSettingsPanel()
	{
		return settingsPanel;
	}	
	public SettingsPanel() 
	{
		settingsPanel= new JPanel();
		settingsPanel.setBounds(0, 0, 335, 590);
		settingsPanel.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 335, 50);
		header.setBackground(new Color(0, 108, 97));
		settingsPanel.add(header);
		header.setLayout(null);
		
		JLabel back = new JLabel();
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{				
				MainFrame.getInstance().activateChatContainer();
			}
		});
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setIcon(new ImageIcon(SettingsPanel.class.getResource("/img/back-arrow.png")));
		back.setBounds(0, 0, 49, 50);
		header.add(back);
		
		JLabel heading = new JLabel("Settings");
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.BOLD, 14));
		heading.setBounds(59, 0, 266, 50);
		header.add(heading);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 50, 335, 523);
		settingsPanel.add(panel);
		panel.setLayout(null);
		
		JLabel profilePicLabel = new JLabel("");
		profilePicLabel.setIcon(new ImageIcon(SettingsPanel.class.getResource("/img/chatDP.png")));
		profilePicLabel.setBounds(103, 31, 120, 131);
		panel.add(profilePicLabel);
		
		JLabel nameHeading = new JLabel("Name");
		nameHeading.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameHeading.setBounds(10, 195, 325, 22);
		panel.add(nameHeading);
		
		JLabel userName = new JLabel("UserName");
		userName.setFont(new Font("Tahoma", Font.BOLD, 14));
		userName.setBounds(10, 216, 325, 38);
		panel.add(userName);
		
		JLabel aboutHeading = new JLabel("About");
		aboutHeading.setFont(new Font("Tahoma", Font.PLAIN, 14));
		aboutHeading.setBounds(10, 257, 325, 22);
		panel.add(aboutHeading);
		
		JTextArea about = new JTextArea("ABOUT");
		about.setFont(new Font("Tahoma", Font.BOLD, 14));
		about.setLineWrap(true);
		about.setWrapStyleWord(true);
		about.setEditable(false);
		about.setOpaque(false);
		about.setBorder(null);
		about.setBounds(10, 278, 290, 56);
		panel.add(about);
		
		JLabel phoneHeading = new JLabel("Phone");
		phoneHeading.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phoneHeading.setBounds(10, 345, 315, 22);
		panel.add(phoneHeading);
		
		JLabel phone = new JLabel("phone number");
		phone.setFont(new Font("Tahoma", Font.BOLD, 14));
		phone.setBounds(10, 366, 315, 38);
		panel.add(phone);
		
		JLabel appName = new JLabel("Mini Whatsapp");
		appName.setIcon(new ImageIcon(SettingsPanel.class.getResource("/img/chat (4).png")));
		appName.setFont(new Font("Tahoma", Font.BOLD, 14));
		appName.setHorizontalAlignment(SwingConstants.CENTER);
		appName.setBounds(0, 461, 335, 38);
		appName.setForeground(new Color(0, 108, 97));
		panel.add(appName);
		
		JLabel theme = new JLabel("Theme");
		theme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		theme.setBounds(10, 415, 64, 22);
		panel.add(theme);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 108, 97));
		separator.setBackground(new Color(0, 108, 97));
		separator.setBounds(10, 252, 315, 10);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 108, 97));
		separator_1.setBackground(new Color(0, 108, 97));
		separator_1.setBounds(10, 333, 315, 10);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 108, 97));
		separator_2.setBackground(new Color(0, 108, 97));
		separator_2.setBounds(10, 402, 315, 10);
 		panel.add(separator_2);
		
		JLabel editPicture = new JLabel("Edit");
		editPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				JOptionPane.showMessageDialog(null,"edit profile pic");
			}
		});
		editPicture.setHorizontalAlignment(SwingConstants.TRAILING);
		editPicture.setBounds(174, 148, 49, 14);
		panel.add(editPicture);
		
		JLabel editAbout = new JLabel("Edit");
		editAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				JOptionPane.showMessageDialog(null,"edit about");
			}
		});
		editAbout.setHorizontalAlignment(SwingConstants.TRAILING);
		editAbout.setBounds(276, 308, 49, 14);
		panel.add(editAbout);
		
		JRadioButton lightTheme = new JRadioButton("Light");
		lightTheme.setSelected(true);
		lightTheme.setFont(new Font("Tahoma", Font.BOLD, 12));
		lightTheme.setBounds(80, 415, 64, 23);
		lightTheme.setOpaque(false);		
			
		JRadioButton darkTheme = new JRadioButton("Dark");
		darkTheme.setFont(new Font("Tahoma", Font.BOLD, 12));
		darkTheme.setBounds(153, 415, 64, 23);
		darkTheme.setOpaque(false);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(lightTheme);
		bg.add(darkTheme);
		
		panel.add(lightTheme);
		panel.add(darkTheme);
	}	
}