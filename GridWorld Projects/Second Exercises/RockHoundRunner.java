import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;
public class RockHoundRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		RockHound rh = new RockHound();
		world.add(new Location(4,5), rh);
		world.add(new Location(3,4), new Rock());
		world.add(new Location(4,6), new Rock());
		world.show();
	}
}
