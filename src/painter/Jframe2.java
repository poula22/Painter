/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


/**
 *
 * @author george
 */

public class Jframe2 extends javax.swing.JFrame {

    /**
     * Creates new form Jframe2
     */
    public Jframe2() {
        initComponents();
        g=getGraphics();//set g as frame graphics
       
    }
   private Shape s;
   private Graphics g;// frame graphics
   private Image dbImage;//Double Buffering Image(second frame)
   private static ArrayList<Shape> shapes =new ArrayList<>(); // Array of shapes
   private static final MP3Player song =new MP3Player(new File("Musics/Sound.mp3"));// sound track
   

    @Override
    public void paint(Graphics g) {
        // method of  Double Buffering
        dbImage=createImage(getWidth(),getHeight());//creat Image with Frame Scale
        this.g=dbImage.getGraphics();// drawing second frame
        paintComponents(this.g);//draw components on second frame 
        g.drawImage(dbImage, 0, 0, this);//replace frame with double buffering frame(second Frame)
        
    }

    
   
     @Override
    public  void paintComponents(Graphics g) {
      
        //method of drawing
        
          super.paintComponents(g);//drawing frame graphics
          
         
         if(shapes.isEmpty()==false  ){
            g=this.g;
         
           
              for (Shape s2 : shapes) {
                  
                  g.setColor(s2.getShapeColor());//set current color to shape color
              //filled or not condtion...
                  if(s2.isFilled())
                      s2.fill(g);//draw filled shape
                   else
                      s2.draw(g);//draw unfilled shape
                   
                      
              }
              
              
              }
    
       
         }
    
    
           
         
             
    
    
  
    
    
    
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        jMenuItem1.setText("jMenuItem1");

        jButton8.setText("jButton8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Line");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Ovil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Rec");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("choose Color");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("undo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setText("Play MUSIC to Relax");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Pen");
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("rubber");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Clear All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Fill");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton10)
                    .addComponent(jButton9)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 596, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
         s=new Line();//creat Line
           jButton10.setBackground(g.getColor());//set choose button color to current color
        } catch(NullPointerException E){
         JOptionPane.showMessageDialog(rootPane, "Select Shapes");
      
      }  
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
      try{
        s.setFilled(jCheckBox1.isSelected());//set object to filled or not
        if(s!=null){
        //first point
        s.setX1(evt.getX());
       s.setY1(evt.getY());
       if( (s instanceof Pen) || s instanceof Rubber ){
           s.setFilled(true);//pen is filled shape always
           //pen has one point to draw at
        s.setX2(evt.getX());
       s.setY2(evt.getY());
          //-----------------------------
       }
      shapes.add(s);
      
    
       
        
        }
      
     
      }
      catch(NullPointerException E){
         JOptionPane.showMessageDialog(rootPane, "Select Shapes");
      
      }  
        
       

    }//GEN-LAST:event_formMousePressed
 
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
  
           if(s!=null ){  
               //second point
             s.setX2(evt.getX());
           s.setY2(evt.getY());
           //-------------------
              repaint();//paint
             s=s.addNewShape();//make s refer to new object
             s.setShapeColor(jButton10.getBackground());
            
         }
      
     
          
       
   
        

     
       
    }//GEN-LAST:event_formMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
            s=new Ovil();//creat ovil
            jButton10.setBackground(g.getColor());//set choose button color
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
          s=new Rectangular();//creat Rectangular
          jButton10.setBackground(g.getColor());//set choose button color
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

         if(s!=null && !(s instanceof Pen) && !(s instanceof Rubber)){ 
             //second point 
           s.setX2(evt.getX());
           s.setY2(evt.getY());  
           //---------------------
            repaint();  //paint
            
         }
         if(s instanceof Pen || s instanceof Rubber){
             //set location of every point
           s.setX2(evt.getX());
           s.setY2(evt.getY());
            //-----------------------------
             shapes.add(s);//add every point of drawing shape
             repaint();//paint
             s=s.addNewShape();//creat new object
          
         
            }
     
 
           
         
    }//GEN-LAST:event_formMouseDragged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         if(shapes.isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "draw something","ERROR",JOptionPane.ERROR_MESSAGE);
         }
         else if(!(shapes.get(shapes.size()-1) instanceof Pen) && !(shapes.get(shapes.size()-1) instanceof Pen) ) {
              
        shapes.remove(shapes.size()-1);//remove last shape
       s=null;//set s to null before painting
         repaint();//paint
         
         }
         
      else  if( shapes.get(shapes.size()-1) instanceof Pen ){
            for(int i=shapes.size()-1;shapes.get(shapes.size()-1) instanceof Pen&& shapes.size()>0 ;i--){
                
                shapes.remove(i);//remove
               if(shapes.size()==1 && shapes.get(shapes.size()-1) instanceof Pen){
                   shapes.remove(0);//remove last shape if it was created from pen
               break;// end of loop
               }
            }//remove last freeStyle shape drown
                
            }
          s=null;//set s to null before painting
             repaint();//paint
             jButton10.setBackground(getBackground());//set choose color to default color 
         
        
    
  
         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      try{
          
        JColorChooser color=new JColorChooser();
       Color c= color.showDialog(this,"choose Your color",Color.BLACK);
         s.setShapeColor(c);
         jButton10.setBackground(c);
            } catch(NullPointerException E){
         JOptionPane.showMessageDialog(rootPane, "Select Shapes");
       
            }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

        if(jCheckBox2.isSelected()){
           song.play();//play music
        }
        else{
            song.stop();//stop music
        
        }
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    s=new Pen();//creat new pen
    jButton10.setBackground(g.getColor());//set choose button color
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        s=new Rubber();//creat new rubber
        s.setShapeColor(getBackground());// set color to Background color

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(shapes.isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "draw something","ERROR",JOptionPane.ERROR_MESSAGE);
         }
         else  {    
        shapes.removeAll(shapes);//remove All
        s=null;//set s to null
         jButton10.setBackground(getBackground());//set choose color to default color 
        repaint();//paint
         }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
       
      
             //set location of every point
           s.setX2(evt.getX());
           s.setY2(evt.getY());
            //-----------------------------
             shapes.add(s);//add every point of drawing shape
             repaint();//paint
            
          
         
    }//GEN-LAST:event_jButton4MouseMoved

    
    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Jframe2 f= new Jframe2();  
                f.setVisible(true);
                
            }
           
        });
        
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
