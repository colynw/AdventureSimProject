package AdventureSimulator;

public class Memento	{
	
	private int hp;

	private int xp;

        
        private int enemyhp;
	public Memento(Classes player, Enemies Enemy)	
        {
		
		this.hp = player.getPlayerhp();

		this.xp = player.getXp();
                
                this.enemyhp = Enemy.getEnemyHP();
	}

    Memento(int savedhp, int savedxp, int enemyHP) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public int getHP()	
        {
		
		return this.hp;

	}

	public int getXP()	{

		return this.xp;
	}
        public int getEnemyHP()
        {
            return this.enemyhp;
        }


}

