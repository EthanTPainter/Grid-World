import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class CircleBugRunner // Really an octagon Runner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		CircleBug circ = new CircleBug(10);
		circ.setColor(Color.RED);
		world.add(new Location(7,7), circ);
		world.show();
	}
}