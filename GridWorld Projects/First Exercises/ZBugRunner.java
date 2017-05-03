import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class ZBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		ZBug zzz = new ZBug(6);
		zzz.setColor(Color.ORANGE);
		world.add(new Location(1, 2), zzz);
        world.show();
	}
}