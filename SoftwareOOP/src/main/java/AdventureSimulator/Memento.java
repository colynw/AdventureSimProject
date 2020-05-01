package AdventureSimulator;

public class Memento	{
	
	private int hp;

	private int xp;

	public Memento(Classes player)	{
		
		this.hp = player.getPlayerhp();

		this.xp = player.getXp();
	}
	
	public String getHP()	{
		
		return this.hp;

	}

	public String getXP()	{

		return this.xp;
	}


}

