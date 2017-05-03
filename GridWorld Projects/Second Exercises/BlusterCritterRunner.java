import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class BlusterCritterRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		BlusterCritter bc = new BlusterCritter(5);
		world.add(new Location(4,4), bc);
		world.show();
	}
}