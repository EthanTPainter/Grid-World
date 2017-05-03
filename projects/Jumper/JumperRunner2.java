import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.*;
import java.util.ArrayList;
import java.awt.Color;
import cs1.Keyboard;

public class JumperRunner2
{
    public static void main(String[] args) {
		int caseNum = 0;
		while(caseNum != -1){
			caseNum = Keyboard.readInt();
			if(caseNum == -1){
				System.exit(1);
			}
			switch (caseNum) {
				case 1: test1();
						break;
				case 2: test2();
						break;
				case 3: test3();
						break;
				case 4: test4();
						break;
				case 5: test5();
						break;
				case 6: test6();
						break;
				case 7: test7();
						break;
				case 8: test8();
						break;
			}
		}
    }

	public static void test1() {
		ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		Jumper jason = new Jumper();
		bob.setColor(Color.ORANGE);
		jason.setColor(Color.RED);
		world.add(new Location(2,0), bob);
		world.add(new Location(1,0), new Rock());
        world.show();
	}
	public static void test2(){
        ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		world.add(new Location(9,4), bob);
		world.add(new Location(8,4), new Flower());
        world.show();
	}
	public static void test3(){
        ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		Jumper jason = new Jumper();
		bob.setColor(Color.ORANGE);
		jason.setColor(Color.RED);
		world.add(new Location(3,2), bob);
		world.add(new Location(4,3), jason);
		world.add(new Location(1,2), new Rock());
		world.add(new Location(0,2), new Rock());
		world.add(new Location(2,2), new Rock());
        world.show();
	}
	public static void test4(){
        ActorWorld world = new ActorWorld();
		Jumper nick = new Jumper();
		Jumper tom = new Jumper();
		world.add(new Location(0,0), nick);
		world.add(new Location(7,5), tom);
        world.show();
	}
	public static void test5(){
        ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		Jumper jason = new Jumper();
		bob.setColor(Color.ORANGE);
		jason.setColor(Color.RED);
		world.add(new Location(2,0), bob);
		world.add(new Location(0,0), new Rock());
        world.show();
	}
	public static void test6(){
        ActorWorld world = new ActorWorld();
		Jumper nick = new Jumper();
		world.add(new Location(0,0), nick);
        world.show();
	}
	public static void test7(){
        ActorWorld world = new ActorWorld();
		Jumper bob = new Jumper();
		Jumper jason = new Jumper();
		bob.setColor(Color.ORANGE);
		jason.setColor(Color.RED);
		world.add(new Location(4,5), bob);
		world.add(new Location(3,5), new Rock());
		world.add(new Location(2,5), new Rock());
        world.show();
	}
	public static void test8(){
        ActorWorld world = new ActorWorld();
		Jumper nick = new Jumper();
		Jumper tom = new Jumper();
		world.add(new Location(4,2), nick);
		world.add(new Location(4,7), tom);
		nick.setColor(new Color(25, 205, 255));
		tom.setColor(new Color(255,153,204));
		nick.setDirection(90);
		tom.setDirection(270);
        world.show();
	}
}
