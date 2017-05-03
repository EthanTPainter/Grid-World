import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class DarkChameleonCritterRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		DarkerChameleonCritter dcc = new DarkerChameleonCritter();
		world.add(new Location(4,5), dcc);
		world.show();
	}
}