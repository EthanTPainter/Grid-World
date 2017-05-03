import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import java.awt.Color;
public class ChameleonKidRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		ChameleonKid ck = new ChameleonKid();
		world.add(new Location(4,5), ck);
		world.show();
	}
}