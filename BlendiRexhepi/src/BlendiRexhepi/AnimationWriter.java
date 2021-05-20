package BlendiRexhepi;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AnimationWriter extends JPanel
{
private BoxWriter box_writer;
private BallWriter ball_writer;

public AnimationWriter(BoxWriter b, BallWriter l, int size)
{
	box_writer=b;
	ball_writer=l;
	JFrame f = new JFrame();
	f.setTitle("CannonBall");
	f.getContentPane().add(this);
	f.setSize(size*3/2+20, size+45);
	f.setLocationRelativeTo(null); 
	f.setVisible(true);
}

public void paintComponent(Graphics g)
{
	box_writer.paint(g);
	ball_writer.paint(g);
}
}