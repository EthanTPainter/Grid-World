import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;
public class KingCrabRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		KingCrab kc = new KingCrab();
		world.add(new Location(4,4), kc);
		world.add(new Location(3,4), new Rock());
		world.show();
	}
}