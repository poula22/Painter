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
public class Pen extends Shape{
      public Pen(){
      b=true;//set filled to true
      }
   
    @Override
    public void draw(Graphics g) {
       
     g.fillOval(getX2(), getY2(),20, 20);//to ensure that paint will draw
      
    }

    @Override
    public void fill(Graphics gg) {

        gg.fillOval(getX2(), getY2(),20, 20);//to draw points
        
    }

    @Override
    public Shape addNewShape() {
        return new Pen();//new object
    }
   

 
    
    
}
