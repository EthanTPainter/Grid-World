import info.gridworld.actor.Bug;
public class DancingBug extends Bug
{
 	private int[] turnList;
 	private int currentStep;

 	public DancingBug(int[] turns)
 	{
 		turnList = turns;
 		currentStep = 0;
 	}

 	public void turn(int times)
 	{
 		for(int j = 1; j <= times; j++)
 		{
 			turn();
 		}
 	}

 	public void act()
 	{
 		turn(turnList[currentStep%turnList.length]);
 		currentStep++;
 		super.act();
 	}
}