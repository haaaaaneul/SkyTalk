package chatting;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;


public class chatPanel extends JPanel {
	
	private ChatFrame cf;
	private JLabel profile;
	private JTextPane textPaneChat;
	private TextField txtWrite;
	private JButton btnNewButton;
	private JScrollPane chatScroll;

	public chatPanel(ChatFrame cf) {
		
		this.cf = cf;
		
		setLayout(null);
		setSize(600,850);
		setBackground(new Color(168,218,255));
		
		profile = new JLabel(" User1");
		profile.setBounds(15, 20, 565, 40);
		profile.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		profile.setOpaque(true);
		profile.setForeground(Color.white);
		profile.setBackground(new Color(0,0,0,122));
		cf.add(profile);
		
		textPaneChat = new JTextPane();
		textPaneChat.setEditable(false);
		textPaneChat.setBounds(15, 60, 565, 670);
		textPaneChat.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		//textPaneChat.setHorizontalAlignment(textPaneChat.RIGHT_ALIGNMENT);
		//cf.add(textPaneChat);
		
		chatScroll = new JScrollPane(textPaneChat);
		chatScroll.setBounds(15, 60, 565, 670);
		cf.add(chatScroll);
	
		txtWrite = new TextField();

		txtWrite.setBounds(15, 740, 490, 50);
		txtWrite.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
	    cf.add(txtWrite);

		btnNewButton = new JButton("send");

		btnNewButton.setBounds(510, 740, 70, 50);
		cf.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPaneChat.setText(textPaneChat.getText() +"[Kim Ha Neul] : " + txtWrite.getText() + "\n");
				txtWrite.setText("");
				txtWrite.requestFocus();
			}
		});
	}
}
