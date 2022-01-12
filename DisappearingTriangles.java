//Russell Deady
//A visual that starts with many triangles and then shows them disappearing frame by frame
//Started on 1/12/22

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DisappearingTriangles extends JPanel implements ActionListener{

   private static JFrame frame;
   private static int flag = 1;
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      
      //creating the random and g2D objects
      Random rand = new Random();
      Graphics2D g2D = (Graphics2D) g;
            
      //declaring the variables      
      int x[] = {0,0,0};
      int y[] = {0,0,0};
     
      int thickness;
      
      if (flag == 1){
         //for loop to create each different triangle
         for (int i = 0; i < 150; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 2){
         //for loop to create each different triangle
         for (int i = 0; i < 110; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 3){
         //for loop to create each different triangle
         for (int i = 0; i < 90; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 4){
         //for loop to create each different triangle
         for (int i = 0; i < 60; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 5){
         //for loop to create each different triangle
         for (int i = 0; i < 45; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 6){
         //for loop to create each different triangle
         for (int i = 0; i < 30; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 7){
         //for loop to create each different triangle
         for (int i = 0; i < 20; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 8){
         //for loop to create each different triangle
         for (int i = 0; i < 10; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 9){
         //for loop to create each different triangle
         for (int i = 0; i < 5; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 10){
         //for loop to create each different triangle
         for (int i = 0; i < 3; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 11){
         //for loop to create each different triangle
         for (int i = 0; i < 2; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
      else if (flag == 12){
         //for loop to create each different triangle
         for (int i = 0; i < 1; i++){
            //nested loop to randomize each point of the triangle
            for (int j = 0; j < 3; j++){
             x[j] = rand.nextInt(getWidth());
             y[j] = rand.nextInt(getHeight());
            }
            //randomize how thick the triangle is
            thickness = rand.nextInt(10) + 1;
            g2D.setStroke(new BasicStroke(thickness));
   
            //randomize the color of the triangle
            g2D.setPaint(new Color(rand.nextInt(256), 
                           rand.nextInt(256), 
                           rand.nextInt(256)));
            
            //draws the triangle using the three randomly generated points in the frame
            g2D.drawPolygon(x, y, 3);  
         }   
      }
    
   } //end of paintComponent method
   
   public static void main(String[] args){
      //create and set the defaults for the JFrame
      frame = new JFrame("Disappearing Triangles Visual");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1000,800);
      frame.setLocationRelativeTo(null);
      
      DisappearingTriangles dt = new DisappearingTriangles();
      
      JPanel panel = new JPanel();
      frame.add(panel);
      frame.add(dt);
      
      int delay = 500;
      Timer time = new Timer(delay, dt);
      time.start();
   
      frame.setVisible(true);
   } //end of main
   
   public void actionPerformed(ActionEvent e){
      repaint();
            
      if (flag == 1){
         flag = 2;
      }
      else if (flag == 2){
         flag = 3;
      }
      else if (flag == 3){
         flag = 4;
      } 
      else if (flag == 4){
         flag = 5;
      }
      else if (flag == 5){
         flag = 6;
      }
      else if (flag == 6){
         flag = 7;
      }
      else if (flag == 7){
         flag = 8;
      }
      else if (flag == 8){
         flag = 9;
      }
      else if (flag == 9){
         flag = 10;
      }
      else if (flag == 10){
         flag = 11;
      }
      else if (flag == 11){
         flag = 12;
      }
      else {
         flag = 1;
      }
      
   }
   
}


/*  Alternative visual that could be used 
//code for drawing random lines
   int x1 = 0;
   int y1 = 0;
      
   int x2 = 0;
   int y2 = 0;
   for (int i = 0; i < 70; i++){
      x1 = rand.nextInt(getWidth());
      y1 = rand.nextInt(getHeight());
      x2 = rand.nextInt(getWidth());
      y2 = rand.nextInt(getHeight());
            
      //randomize how thick the rectangle is
      thickness = rand.nextInt(8) + 1;
      g2D.setStroke(new BasicStroke(thickness));
   
      //randomize the color of the rectangle
      g2D.setPaint(new Color(rand.nextInt(256), 
                      rand.nextInt(256), 
                      rand.nextInt(256)));
            
      //draws the random line
      g2D.drawLine(x1, y1, x2, y2);
   }
*/
