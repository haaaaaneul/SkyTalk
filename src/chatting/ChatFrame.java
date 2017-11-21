package chatting;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ChatFrame extends JFrame{

	public ChatFrame(String friendName) {
		setTitle("SKY TALK- chatting");
		setSize(600, 850);
		setResizable(false);
		
		/*setUndecorated(true);
		setBackground(new Color(0,0,0,122));*/

		setLayout(null);
		
		Dimension frameSize = this.getSize(); // ������ ������
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // ����� ������

		this.setLocation((screenSize.width - frameSize.width), (screenSize.height - screenSize.height)); // ȭ�� ���� ���

		Container c = getContentPane();
		
		c.add(new chatPanel(this,friendName));
		
		setVisible(true);
	}
}
