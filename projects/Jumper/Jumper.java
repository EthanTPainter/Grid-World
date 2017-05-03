import java.awt.Color;
import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.util.ArrayList;

public class Jumper extends Bug
{
	public void move()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location two = next.getAdjacentLocation(getDirection());

		if (gr.isValid(next) || gr.isValid(two))
			if(gr.get(next)==null){
				moveTo(next);
			}
			else if(gr.get(two)==null){
				moveTo(two);
			}
		else
		removeSelfFromGrid();
	}

	public boolean canMove()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location two = next.getAdjacentLocation(getDirection());
		if ((!gr.isValid(next) && !gr.isValid(two))){
			return false;
		}
		Actor neighbor = gr.get(next);
		return (neighbor == null) || (gr.isValid(two)) && neighbor != null && gr.get(two) == null;
    }
    public void act(){
		if(canMove()){
			move();
		}
		else{
			turn();
		}
	}
}


