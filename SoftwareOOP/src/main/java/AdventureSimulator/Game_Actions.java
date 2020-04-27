/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventureSimulator;

import static AdventureSimulator.Classes.die;
import static AdventureSimulator.Classes.scan;



public class Game_Actions 
{
    public static boolean fighting = false;
    String PlayerTxt;
    String lvlTxt;
    int enemyhp = 0;
    int enemy_melee_dmg = 0;
    
    
    
    public String Display_status(Classes player) //displays player status
    {
        String text = (player.getName() + "\nhp: " + player.getPlayerhp() + "\nmana: " + player.getMana() + "\ndamage: " + player.getPlayer_melee_dmg() + "\nxp: " + player.getXp() + "\n");
        return text;
    }
    
    
    
    public void fight(Classes player, Enemies enemy) //initiates combat
    {
        String action;
        String spellAction = null;
        //System.out.println("An enemy approaches");
        
        
        fighting = true;

            //System.out.println("Press 'a' to attack\nPress 'i' for info");
            if(player.getChar_class().equals("Wizard"))
            {
                System.out.print("Press 's' for spells \n");
            }
            //action = scan.nextLine();
            /*if(action.charAt(0)== 'a')
            {*/
                fighting = attack(player,enemy);
                if(fighting == false)
                {
                    switch(player.getLevel())
                    {
                        case 1:
                            player.setXp(player.getXp() + 4);
                            break;
                        case 2:
                            player.setXp(player.getXp() + 6);
                            break;
                        case 3:
                            player.setXp(player.getXp() + 9);
                            break;
                        case 4:
                            player.setXp(player.getXp() + 12);
                            break;
                    }
                    System.out.println("You earned :" + player.getXp() + " xp");
                    lvlTxt = ("You Earned: " +player.getXp()+ " xp");
                    checkLevelUp(player);
                    return;
                }
                enemy.enemyattack(player,enemy);
            //}
            /*if(action.charAt(0) == 'i')
                {
                        Display_status(player);
                        enemy.printEnemyStats();
          
                    
                }*/
            /*if(action.charAt(0) == 's')
            {
                System.out.println("Press 'f' for fireball\nPress 'h' to heal\n");
                spellAction = scan.nextLine();
                                if(spellAction.charAt(0) == 'f'){
                    if(die.roll10() > 2){
                        player.mana = player.mana - 10;
                        if(player.mana <0){
                            System.out.println("You don't have enough mana...");
                            player.mana = player.mana + 10;
                        }else{
                            int k = die.roll10();
                            System.out.println("You hit for " + k + " damage!");
                            enemy.enemyhp = enemy.enemyhp - k;
                            if(enemy.enemyhp <= 0){
                                System.out.println("You Won!");
                                switch(player.level){
                                    case 1:
                                        player.xp = player.xp + 4;
                                        break;
                                    case 2:
                                        player.xp = player.xp + 6;
                                        break;
                                    case 3:
                                        player.xp = player.xp + 9;
                                        break;
                                    case 4:
                                        player.xp = player.xp + 12;
                                        break;
                                }
                                System.out.println("You earned :" + player.xp + " xp");
                                checkLevelUp(player);
                                return;
                            }
                            enemy.enemyattack(player, enemy);
                        }
                    }
                    else{
                        System.out.println("You miss!");
                        enemy.enemyattack(player,enemy);
                    }
                }
            }
                    
                
        }*/
        
        
    }
    public boolean attack(Classes player,Enemies enemy)
    {
        if(die.roll6() >2)
        {
            System.out.println("You hit!");
            PlayerTxt = ("You hit!");
            enemy.enemyhp = enemy.enemyhp - player.getPlayer_melee_dmg();
            if(enemy.enemyhp <= 0)
            {
                System.out.println("You Won!");
                PlayerTxt = ("You Won!");
                return false;
            }
            
        }
        else
            {
                System.out.println("You miss!");
                PlayerTxt = ("You Miss!");
            }   
        return true;
    }
    public static void gameover(Classes player)
    {
        System.out.println(player.getName() + " Died!") ;
        System.out.println("GAME OVER!");
        System.exit(0);
        return;
    }
    
 
    
    
    protected void checkLevelUp(Classes player) 
        {
        if(player.getXp() >= 1000 && player.getLevel() == 6){
            System.out.println("Level 7!");
            lvlTxt = ("Level 7!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 25);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard")){
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 3);
            Display_status(player);
        }else
        if(player.getXp() >= 400 && player.getLevel() == 5){
            System.out.println("Level 6!");
            lvlTxt = ("Level 6!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 25);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard")){
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 3);
            Display_status(player);
        }else
        if(player.getXp() >= 100 && player.getLevel() == 4){
            System.out.println("Level 5!");
            lvlTxt = ("Level 5!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 25);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard")){
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 3);
            Display_status(player);
        }else
        if(player.getXp() >= 50 && player.getLevel() == 3){
            System.out.println("Level 4!");
            lvlTxt = ("Level 4!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 20);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard")){
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 2);
            Display_status(player);
        }else
        if(player.getXp() >= 25 && player.getLevel() == 2){
            System.out.println("Level 3!");
            lvlTxt = ("Level 3!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 10);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard")){
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 2);
            Display_status(player);
        }else
        if(player.getXp() >= 10 && player.getLevel() == 1){
            System.out.println("Level 2!");
            lvlTxt = ("Level 2!");
            player.setLevel(player.getLevel() + 1);
            player.setMaxhp(player.getMaxhp() + 5);
            player.setPlayerhp(player.getMaxhp());
            if(player.getChar_class().equals("wizard"))
            {
                player.setMaxmana(player.getMaxmana() + 7);
                player.setMana(player.getMaxmana());
            }
            player.setPlayer_melee_dmg(player.getPlayer_melee_dmg() + 1);
            Display_status(player);
        }

    }
}
