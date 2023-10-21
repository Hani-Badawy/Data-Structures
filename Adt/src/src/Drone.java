/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author hmohamme
 */
public class Drone implements Vehicle{
    
    int x;
    int y;
    int z;
    
    @Override
    public void move() {
        x++;
        y++;
        z++;
    }
    
}
