import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter
{
	private int courageLevel;

	public BlusterCritter(int c)
	{
		super();
		courageLevel = c;
	}

	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();

		Location loc = getLocation();
		for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++)
		{
			for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
			{
				Location tempLocation = new Location(r,c);
				if(getGrid().isValid(tempLocation))
				{
					Actor a = getGrid().get(tempLocation);
					if(a != null && a!= this)
					{
						actors.add(a);
					}
				}
			}
		}
		return actors;
	}

	public void processActors(ArrayList<Actor> actors)
	{
		int counter = 0;
		for(Actor a: actors)
		{
			if(a instanceof Critter)
			{
				counter++;
			}
			if(counter < courageLevel)
			{
				lighten();
			}
			else
				darken();
		}
	}
	public void darken()
	{
		Color col = getColor();
		int red = col.getRed();
		int green = col.getGreen();
		int blue = col.getBlue();

		if(red > 0)
		{
			red--;
		}
		if(green > 0)
		{
			green--;
		}
		if(blue > 0)
		{
			blue--;
		}

		setColor(new Color(red, green, blue));
	}

	public void lighten()
	{
		Color color = getColor();
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();

		if(red > 225)
		{
			red++;
		}
		if(green > 225)
		{
			green++;
		}
		if(blue > 225)
		{
			blue++;
		}

		setColor(new Color(red, green, blue));
	}
}