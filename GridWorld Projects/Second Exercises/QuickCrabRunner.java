import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;
public class QuickCrabRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		QuickCrab qc = new QuickCrab();
		world.add(new Location(4,4), qc);
		world.add(new Location(4,5), new Rock());
		world.add(new Location(4,6), new Rock());
		world.show();
	}
}