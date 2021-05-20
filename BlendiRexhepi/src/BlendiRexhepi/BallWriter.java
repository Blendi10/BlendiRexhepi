package BlendiRexhepi;

import java.awt.Color;
import java.awt.Graphics;

public class BallWriter 
{
	private CannonBall ball;
	private Color ball_color;
	private Box box;
	
	public BallWriter(CannonBall b, Color c, Box B)
	{
		ball=b;
		ball_color=c;
		box=B;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(ball_color);
		int radius = ball.radiusOf();
		if(ball.yPosition()>= box.sizeOf()-radius)
		{
			g.fillOval(ball.xPosition() - radius, ball.yPosition() + radius/2+2, radius*4, radius/2);
		}
		else if (ball.yPosition()<= radius)
		{
			g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius-1, radius*4, radius/2);
		}
		else if (ball.xPosition() <= radius)
		{
			g.fillOval(ball.xPosition() -radius-2 , ball.yPosition() - radius, radius/2, radius*4);
		}
		else if (ball.xPosition()>= box.sizeOf()*3/2-radius)
		{
			g.fillOval(ball.xPosition() + radius/2+1 , ball.yPosition() - radius, radius/2, radius*4);
		}
		else
		{
			g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius*2, radius*2);
		}
	}
}
