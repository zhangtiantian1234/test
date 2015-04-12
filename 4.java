//第四题
/*
 * 在主窗口显示"Hello World"，并能用鼠标拖动
 * @author  张甜甜
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo04 {
	private int x = 100;
	private int y = 250;

	public void ShowJframe() {
		JFrame jframe = new JFrame("移动的文字");
		@SuppressWarnings("serial")
		final JPanel jpanel = new JPanel() {
			public void paint(Graphics g) {
				Graphics2D graphics = (Graphics2D) g;
				graphics.setColor(Color.white);
				graphics.fillRect(0, 0, 400, 500);
				graphics.setFont(new Font("黑体", Font.BOLD, 20));
				graphics.setColor(Color.red);
				graphics.drawString("Hello World", x, y);
			}
		};
		jpanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				jpanel.repaint();

			}
		});
		jframe.add(jpanel);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(200, 300, 400, 500);
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
		new Demo04().ShowJframe();
	}

}