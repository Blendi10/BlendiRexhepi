package BlendiRexhepi;

public class CannonBall 
{
	private double x_position;
	private double y_position;
	private int radius=10;
	private double x_velocity;
	private double y_velocity;
	private double gravity;
	private Box container;
	
	public CannonBall(int x_initial, int y_initial, Box box)
	{
		x_position=x_initial;
		y_position=y_initial;
		container=box;
	}
	
	public void Shoot(double angle, double initial_velocity, double g)
	{
		x_velocity = initial_velocity * Math.cos(Math.toRadians(angle));
		y_velocity = initial_velocity * Math.sin(Math.toRadians(angle));
		gravity = g;
	}
	
	public void move(double time_units)
	{
		x_position = x_position + x_velocity*time_units;
		y_position = y_position - (y_velocity*time_units-gravity*time_units*time_units*0.5);
		y_velocity = y_velocity - gravity*time_units;
		
		if (container.yInNegativePosition((int)y_position, radius))
		{
			y_position=radius;
			x_velocity=0;
		}
		
		if (container.xInNegativePosition((int)x_position, radius))
		{
			x_position=radius;
			y_velocity=0;
			gravity=0;
		}
		
		if (container.yOverSizePosition((int)y_position, radius))
		{
			y_position=container.sizeOf()-radius;
			x_velocity=0;
		}
		
		if (container.xOverSizePosition((int)x_position, radius))
		{
			x_position=container.sizeOf()*3/2-radius;
			y_velocity=0;
			gravity=0;
		}
	}
	
	public int xPosition()
	{
		return (int)x_position;
	}

	public int yPosition()
	{
		return (int)y_position;
	}
	
	public int radiusOf()
	{
		return radius;
	}
}
