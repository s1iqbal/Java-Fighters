//package com.game.src.main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {
 
 public Rectangle playButton = new Rectangle (41, 225, 131, 69);
 public Rectangle optionsButton = new Rectangle (41, 312, 131, 69);
 public Rectangle exitButton = new Rectangle ( 41, 400, 131, 69);
 
 public void render (Graphics g) {
     Graphics2D g2d = (Graphics2D) g;
     g2d.draw(playButton);
     g2d.draw(optionsButton);
     g2d.draw(exitButton);
     
  
 }
}
