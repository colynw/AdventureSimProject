/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventureSimulator;

/**
 *
 * @author eboon
 */
public class Knight implements Classes {

protected String char_class;
protected int maxhp;
protected int playerhp;
protected int player_melee_dmg;
protected int xp;
protected int level;
protected String Name;

    
    @Override
    public void setStats() {
        char_class = "Knight";
        maxhp = 20;
        playerhp = 20;
        player_melee_dmg = 4;
        xp = 0;
        level = 1;
    }
    @Override
    public void setName(String name) {
        Name = name;
    }

    public void setChar_class(String char_class) {
        this.char_class = char_class;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public void setPlayerhp(int playerhp) {
        this.playerhp = playerhp;
    }

    public void setPlayer_melee_dmg(int player_melee_dmg) {
        this.player_melee_dmg = player_melee_dmg;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getChar_class() {
        return char_class;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public int getPlayerhp() {
        return playerhp;
    }

    public int getPlayer_melee_dmg() {
        return player_melee_dmg;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return Name;
    }
    
}
