/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src.classObjects;

import constants.ClassTypes;
import src.DiagramObject;

/**
 *
 * @author
 * fvega
 */
public class ConcreteClassObject extends ClassObject {

    @Override
    public String draw() {
        return ClassTypes.CONCRETE + " " + this.name;
    }
    
}