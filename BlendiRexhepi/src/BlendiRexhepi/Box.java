package BlendiRexhepi;

public class Box {
	
private int box_size;

public Box( int size)
{
	box_size = size;
}

public boolean yInNegativePosition(int y_position, int radius)
{
	return (y_position <= radius);
}

public boolean xInNegativePosition(int x_position, int radius)
{
	return (x_position <= radius);
}

public boolean yOverSizePosition(int y_position, int radius)
{
	return (y_position >= box_size - radius);
}

public boolean xOverSizePosition(int x_position, int radius)
{
	return (x_position >= box_size*3/2 - radius);
}

public int sizeOf()
{ return box_size; }

}