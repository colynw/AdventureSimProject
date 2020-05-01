package AdventureSimulator;

public class Originator	{
	
		private int hp;

		private int xp;
                
                private int enemyHP;
                


	public void setState(int myhp,int myxp, int enemyHP)	{
		
		this.hp = myhp;

		this.xp = myxp;
                
                this.enemyHP = enemyHP;
	}


	public Memento save()	{
		
		int savedhp = this.hp;

		int savedxp = this.xp;
                
                int enemyHP = this.enemyHP;
	
		return new Memento(savedhp,savedxp, enemyHP);	
	}

	public int restoreHP()	{
		
		return this.hp;

	}

	public int restoreXP()	{
		
		return this.xp;

	}
        public int restoreEnemyHP()
        {
            return this.enemyHP;
        }

}
