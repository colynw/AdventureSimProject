/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventureSimulator;

import java.util.Scanner;

/**
 *
 * @author eboon
 */
public interface Classes {
    //variables//
    static dice die = new dice();
    static Scanner scan = new Scanner(System.in);

    public abstract void setStats();
    
    public abstract String getChar_class();
    public abstract int getMaxhp();
    public abstract int getPlayerhp();
    public abstract int getPlayer_melee_dmg();
    public abstract int getXp();
    public abstract int getLevel();
    public abstract String getName();
    public default int getMana() {
        return 0;
    }

    public default int getMaxmana() {
        return 0;
    }
    
    public abstract void setChar_class(String char_class);
    public abstract void setMaxhp(int maxhp);
    public abstract void setPlayerhp(int playerhp);
    public abstract void setPlayer_melee_dmg(int player_melee_dmg);
    public abstract void setXp(int xp);
    public abstract void setLevel(int level);
    public abstract void setName(String name);
    public default void setMana(int mana) {}
    public default void setMaxmana(int maxmana) {}
}
