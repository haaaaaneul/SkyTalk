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
	
	private MainFrame f;
	
	public StartPanel(MainFrame f) {
		
		this.f = f;
		buttonPanel = new ButtonPanel(f);
		friendPanel = new friendPanel(f);
		//chatPanel = new chatPanel(f);
		friendPanel.setBounds(0, 50, 600, 850);
		f.add(friendPanel);

		buttonPanel.getChatBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*f.remove(friendPanel);
				f.add(chatPanel);
				f.revalidate();
				f.repaint();*/
				ChatFrame a = new ChatFrame();
			}
		});

		buttonPanel.getFriendBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//f.remove(chatPanel);
				f.add(friendPanel);
				f.revalidate();
				f.repaint();
				
			}
		});
		
		buttonPanel.getSetBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChatFrame a = new ChatFrame();
			}
		});
		
		
	}

	
}
