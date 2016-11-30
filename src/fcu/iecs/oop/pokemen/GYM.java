package fcu.iecs.oop.pokemen;

import java.util.Random;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2)
	{
		Random r=new Random();
		if(r.nextInt(100)%2==0)
		{
			System.out.println("Winner is "+p1.getName());
			p1.setCp(p1.getCp());
		}
		else
		{
			System.out.println("Winner is "+p2.getName());
			p2.setCp(p2.getCp());
		}
	}


}
