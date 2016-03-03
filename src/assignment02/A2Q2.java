/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author howen2217
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    
    Robot ted = new Robot(kw, 2, 0, Direction.EAST);
    
    new Wall(kw, 2, 0, Direction.SOUTH);
    new Wall(kw, 2, 1, Direction.SOUTH);
    new Wall(kw, 2, 2, Direction.SOUTH);
    new Wall(kw, 2, 3, Direction.SOUTH);
    new Wall(kw, 2, 4, Direction.SOUTH);
    new Wall(kw, 2, 5, Direction.SOUTH);
    new Wall(kw, 2, 6, Direction.SOUTH);
    new Wall(kw, 2, 7, Direction.SOUTH);
    new Wall(kw, 2, 8, Direction.SOUTH);
    new Wall(kw, 2, 0, Direction.EAST);
    new Wall(kw, 2, 1, Direction.EAST);
    new Wall(kw, 2, 3, Direction.EAST);
    new Wall(kw, 2, 6, Direction.EAST);
    
    new Thing(kw, 2, 8);
    
    while(!ted.canPickThing()){
        if(ted.frontIsClear()){
            ted.move();
            }
        if(!ted.frontIsClear()){
            ted.turnLeft();
            ted.move();
            ted.turnLeft();
            ted.turnLeft();
            ted.turnLeft();
            ted.move();
            ted.turnLeft();
            ted.turnLeft();
            ted.turnLeft();
            ted.move();
            ted.turnLeft();
            
        }
        
    }   
    }
    
}
