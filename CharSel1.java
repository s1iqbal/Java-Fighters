//package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class CharSel1 {
  
 public Rectangle backButton = new Rectangle (22, 535, 67, 42);
 public Rectangle saadButton= new Rectangle (244, 24, 379-244, 270-24);
 public Rectangle bondButton= new Rectangle (410, 24, 379-244, 270-24);
 
 public void render (Graphics g) {
  Graphics2D g2d = (Graphics2D) g;
  g2d.draw(backButton);
  g2d.draw(saadButton);
  g2d.draw(bondButton);
  
  if (Game.State == Game.STATE.CHARSEL1){
   g.setFont(new Font ("Arial", Font.BOLD,20));
   g.setColor(Color.white);
   g.drawString("Player 1 select.", 320, 340);
  }
  else if (Game.State == Game.STATE.CHARSEL2){
   g.setFont(new Font ("Arial", Font.BOLD,20));
   g.setColor(Color.white);
   g.drawString("Player 2 select.", 320, 340);
  }
  
  
 }

}
