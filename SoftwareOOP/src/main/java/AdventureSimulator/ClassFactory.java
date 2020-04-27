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
public class ClassFactory {

    public Classes getClass(String classType) {
        if (classType == null) {
            return null;
        } else if (classType == "Rogue") {
            return new Rogue();
        } else if (classType == "Berserker") {
            return new Berserker();
        } else if (classType == "Knight") {
            return new Knight();
        } else if (classType == "Wizard") {
            return new Wizard();
        }

        return null;
    }
}
