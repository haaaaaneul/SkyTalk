package chatting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class friendPanel extends JPanel {

	private MainFrame f;
	int i;

	private Vector<String> friendVector = new Vector<String>();
	private JButton addBtn = new JButton("眠啊");
	private JLabel[] friendLabel;
	private JLabel Myprofile;
	private JLabel[] friendImg;
	private JLabel MyImg;
	private TextField searchFriend;
	private JPanel friendList;
	private JScrollPane friendScroll;
	
	final String defaultImg = "/src/images/userIcon.png";
	
	public friendPanel(MainFrame f) {

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
		addBtn.setBounds(500, 0, 100, 30);
		add(addBtn);
		
		Myprofile = new JLabel(" Kim Ha Neul");
		Myprofile.setBounds(80, 40, 505, 70);
		Myprofile.setFont(new Font("Tmon阁家府 Black", Font.PLAIN, 20));
		Myprofile.setOpaque(true);
		Myprofile.setBackground(Color.WHITE);
		add(Myprofile);
		
		MyImg = new JLabel(new ImageIcon(defaultImg));
		MyImg.setBounds(10, 40, 70, 70);
		MyImg.setOpaque(true);
		add(MyImg);
		
		for(int j=0;j<7;j++) {
		friendVector.add(" User " + (j+1));
		}
		
		friendLabel = new JLabel[friendVector.size()];
		friendImg = new JLabel[friendVector.size()];
		
		for (i = 0; i < friendVector.size(); i++) {
			friendLabel[i] = new JLabel(friendVector.get(i));
			friendImg[i] = new JLabel(new ImageIcon(defaultImg));
			friendImg[i].setBounds(10, 120 + (i*71), 70, 70);
			friendImg[i].setOpaque(true);
			
			friendLabel[i].setBounds(80, 120 + (i*71), 505, 70);
			friendLabel[i].setFont(new Font("Tmon阁家府 Black", Font.PLAIN, 20));
			friendLabel[i].setOpaque(true);
			friendLabel[i].setBackground(Color.WHITE);
			
			friendLabel[i].addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					JLabel friendName = (JLabel) e.getSource();
					ChatFrame a = new ChatFrame(friendName.getText());
					System.out.println(friendName.getText());
				}
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

			});
			add(friendLabel[i]);
			add(friendImg[i]);
			
			/*friendScroll = new JScrollPane();
			friendScroll.setBounds(0, 50, 600, 850);
			add(friendScroll);*/
			
			
		}
	}
}
