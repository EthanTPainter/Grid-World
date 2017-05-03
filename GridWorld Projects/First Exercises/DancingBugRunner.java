import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class DancingBugRunner
{
 	public static void main(String[] args)
 	{
 		ActorWorld world = new ActorWorld();

 		int[] turnDat = {1,3,4,2,1,3,1};
 		DancingBug twitch = new DancingBug(turnDat);
 		twitch.setColor(Color.BLACK);
 		world.add(new Location(9,9), twitch);

		int[] breakTurns = {1,2,3,1,3,2,1,2,1};
		//int[] breakTurns2 = {1,2,3,1,0};
 		DancingBug breakDancer = new DancingBug(breakTurns);
 		DancingBug backUpDancer = new DancingBug(breakTurns);

 		world.add(new Location(0,0), breakDancer);
 		world.add(new Location(9,0), backUpDancer);

 		world.show();
 	}
}