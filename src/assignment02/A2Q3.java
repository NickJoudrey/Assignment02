/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author howen2217
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.EAST);
        
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        
        RobotSE dag = new RobotSE (kw, 0, 0, Direction.EAST);
        
        dag.move();
        
        while(dag.frontIsClear()){
            dag.move();
            dag.turnRight();
            dag.move();
            
            if(!dag.frontIsClear()){
                dag.turnLeft();
                dag.move();
                dag.turnLeft();
                
            }
        }
        
        
        
        
        
        
    }
}
