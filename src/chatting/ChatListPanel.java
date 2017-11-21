package chatting;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChatListPanel extends JPanel{
	private JLabel Myprofile;
	private JLabel friendImg;
	private JLabel MyImg;
	private TextField searchFriend;
	
	private MainFrame f;
	
	public ChatListPanel(MainFrame f) {
		this.f = f;
		setLayout(null);
		setSize(600, 850);
		setBackground(new Color(168,218,255));
		
		/*friendList = new JPanel();
		friendList.setBounds(0, 50, 600, 850);*/

		searchFriend = new TextField();
		searchFriend.setBounds(0, 0, 500, 30);
		searchFriend.setText("模备 八祸");
		add(searchFriend);
		/*addBtn.setBounds(500, 0, 100, 30);
		add(addBtn);*/
		
		Myprofile = new JLabel(" Kim Ha Neul");
		Myprofile.setBounds(80, 40, 505, 70);
		Myprofile.setFont(new Font("Tmon阁家府 Black", Font.PLAIN, 20));
		Myprofile.setOpaque(true);
		Myprofile.setBackground(Color.WHITE);
		add(Myprofile);
		
	}

}
