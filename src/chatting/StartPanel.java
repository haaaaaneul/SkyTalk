package chatting;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class StartPanel extends JPanel{
	
	private friendPanel friendPanel;
	private chatPanel chatPanel;
	private ButtonPanel buttonPanel;
	private ChatListPanel chatlistPanel;
	
	private MainFrame f;
	
	public StartPanel(MainFrame f) {
		
		this.f = f;
		buttonPanel = new ButtonPanel(f);
		friendPanel = new friendPanel(f);
		chatlistPanel = new ChatListPanel(f);
		
		friendPanel.setBounds(0, 50, 600, 850);
		chatlistPanel.setBounds(0, 50, 600, 850);
		
		f.add(friendPanel);

		buttonPanel.getChatBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.remove(friendPanel);
				f.add(chatlistPanel);
				f.revalidate();
				f.repaint();
			}
		});

		buttonPanel.getFriendBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.remove(chatlistPanel);
				f.add(friendPanel);
				f.revalidate();
				f.repaint();
				
			}
		});
		
		buttonPanel.getSetBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ChatFrame a = new ChatFrame();
			}
		});
		
		
	}

	
}
