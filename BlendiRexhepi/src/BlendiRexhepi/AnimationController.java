package BlendiRexhepi;

public class AnimationController 
{
	private CannonBall ball;
	private AnimationWriter writer;
	private Box box;
	
	public AnimationController(CannonBall b, AnimationWriter w, Box B)
	{
		ball=b;
		writer=w;
		box = B;
	}
	
	private void delay(int how_long)
	{
		try { Thread.sleep( how_long);}
		catch (InterruptedException e) {}
	}
	
	public void runAnimation()
	{
		double time_unit=0.2;
		int painting_delay=30;
		boolean proc = true;
		while(proc)
		{
			delay(painting_delay);
			ball.move(time_unit); 
			System.out.println(ball.xPosition()+","+ball.yPosition());
			writer.repaint();
			if(ball.yPosition()>= box.sizeOf() - ball.radiusOf() || ball.yPosition()<= ball.radiusOf() 
					|| ball.xPosition() >= box.sizeOf()*3/2 - ball.radiusOf() || ball.xPosition() <= ball.radiusOf())
				proc=false;
		}
	}
}