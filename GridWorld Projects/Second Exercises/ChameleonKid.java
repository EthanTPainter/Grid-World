import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter
{
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] directions = {Location.AHEAD, Location.HALF_CIRCLE};
		for (Location loc: getLocationsInDirections(directions))
		{
			Actor acta = getGrid().get(loc);
			if(acta != null)
			{
				actors.add(acta);
			}
		}
		return actors;
	}
	public ArrayList<Location> getLocationsInDirections(int[] directions)
	{
		ArrayList<Location> homieG = new ArrayList<Location>();
		Grid grid = getGrid();
		Location locate = getLocation();

		for(int d: directions)
		{
			Location neighborHomie = locate.getAdjacentLocation(getDirection() + d);
			if(grid.isValid(neighborHomie));
			{
				homieG.add(neighborHomie);
			}
		}
		return homieG;
	}
}