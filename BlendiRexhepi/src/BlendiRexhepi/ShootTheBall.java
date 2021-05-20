package BlendiRexhepi;

import java.awt.Color;

import javax.swing.JOptionPane;

public class ShootTheBall
{
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		int box_size = 500;
		new JOptionPane();
		double angle = new Double(JOptionPane.showInputDialog("Type angle as a number:"));
		double velocity = new Double(JOptionPane.showInputDialog("Type initial velocity as a positive number:"));
		while (velocity <= 0)
			velocity = new Double(JOptionPane.showInputDialog("ShootTheBall error: negative velocity, type again:"));
		double gravity = new Double(JOptionPane.showInputDialog("Type gravity as a positive number:"));
		while (gravity < 0)
			gravity = new Double(JOptionPane.showInputDialog("ShootTheBall error: negative gravity, type again:"));
		Box box = new Box(box_size);
		CannonBall ball = new CannonBall(11, box_size-11, box);
		ball.Shoot(angle, velocity, gravity);
		BallWriter ball_writer = new BallWriter(ball, Color.red, box);
		BoxWriter box_writer = new BoxWriter(box);
		AnimationWriter writer = new AnimationWriter(box_writer, ball_writer, box_size);
		new AnimationController(ball, writer, box).runAnimation();
	}
}
