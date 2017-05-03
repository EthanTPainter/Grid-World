import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
public class SpiralBugRunner
{
	public static void main (String[] args)
	{
		ActorWorld world = new ActorWorld();
		SpiralBug spi = new SpiralBug(3);
		spi.setColor(Color.ORANGE);
		world.add(new Location(7, 8), spi);
        world.show();
	}
}