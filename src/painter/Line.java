/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;


import java.awt.Graphics;


/**
 *
 * @author george
 */
public class Line extends Shape{
    
  
   
  
    @Override
    public void draw(Graphics g) {

        g.drawLine(this.x1, this.y1, this.x2, this.y2);
        
    }  

    @Override
    public void fill(Graphics gg) {
        gg.drawLine(this.x1, this.y1, this.x2, this.y2);
    }

    @Override
    public Shape addNewShape() {
        return new Line();
    }
    
    
}
