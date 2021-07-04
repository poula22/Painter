/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;



import java.awt.Color;
import java.awt.Graphics;





/**
 *
 * @author george
 */
public abstract class Shape extends Jframe2 {
      int x1,x2,y1,y2;//two points axses
      Color c;//color of object
      boolean b;// boolean to check filled or not
      
       //setter and getter
      
    public void setFilled(boolean b) {
        this.b = b;//filled or not
    }
     
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2; 
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getShapeColor() {
        return c;
    }

    public void setShapeColor(Color c) {
        this.c = c;
    }
//-----------------------------------------------------------------------------------------------------------
    
    public boolean isFilled(){
    return b;//return filled or not
    }
    
    //abstract Methods
    public abstract void draw(Graphics g) ;//draw unfilled shape
    public abstract void fill(Graphics gg);//draw filled shape
    public abstract Shape addNewShape();// creat new object
     
     }
     
    

