import info.gridworld.actor.Bug;
public class SpiralBug extends Bug
{
	 private int sideLength;
	 private int steps;

	 public SpiralBug(int n)
	 {
	 	sideLength = n;
	 	steps = 0;
	 }

	 public void act()
	 {
	 	if (steps < sideLength && canMove())
	 	{
	 		move();
	 		steps++;
	 	}
	 	else
	 	{
	 		turn();
	 		turn();
	 		steps = 0;
		 	sideLength++;
	 	}
	}
}