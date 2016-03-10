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
        RobotSE dag = new RobotSE(kw, 5, 7, Direction.WEST);

        while (dag.getAvenue() > 0) {

            if (dag.getDirection() == Direction.WEST) {
                dag.move();
            } else {
                dag.turnLeft();
            }
        }
        
        while (dag.getStreet() > 0) {

            if (dag.getDirection() == Direction.NORTH) {
                dag.move();
            } else {
                dag.turnLeft();
            }
        }
        dag.turnRight();
    }
}
