/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;


import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author george
 */
public class Ovil extends Shape{
  

    @Override
    public void draw (Graphics g){
       
     
    g.drawOval(Math.min(getX1(),getX2()), Math.min(getY1(),getY2()),Math.abs( getX2()-getX1()), Math.abs(getY2()-getY1()));
    
    }//draw unfilled ovil
   @Override
     public  void fill(Graphics gg){
   
   gg.fillOval(Math.min(getX1(),getX2()), Math.min(getY1(),getY2()),Math.abs( getX2()-getX1()), Math.abs(getY2()-getY1()));
   
    }//draw filled rectangle

    @Override
    public Shape addNewShape() {
      return new Ovil();//new object
    }
    
}
