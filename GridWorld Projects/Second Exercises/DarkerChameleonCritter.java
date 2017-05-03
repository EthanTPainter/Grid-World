import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class DarkerChameleonCritter extends Critter
{
	private static final double darkNum = .10;

    public void processActors(ArrayList<Actor> actors)
    {
        int n = actors.size();
        if (n == 0)
        {
            darken();
            return;
		}
        int r = (int) (Math.random() * n);
        Actor other = actors.get(r);
        setColor(other.getColor());
    }
    public void darken()
    {
		Color col = getColor();
		int red = (int)(col.getRed()*(1 - darkNum));
		int blue = (int)(col.getBlue()*(1 - darkNum));
		int green = (int)(col.getGreen()*(1 - darkNum));

		setColor(new Color(red, blue, green));
	}
}
