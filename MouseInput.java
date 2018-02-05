//package com.game.src.main;

import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MouseInput implements MouseListener {
 private int choiceP1, choiceP2;
 
 public void mouseReleased(MouseEvent e){}
  
 public void mouseClicked(MouseEvent e){}
 
 public void mouseEntered(MouseEvent e){}
 
 public void mouseExited(MouseEvent e){}
 
 public void mousePressed (MouseEvent e) {
  int mx = e.getX();
  int my = e.getY();
  if (Game.State == Game.STATE.MENU){
   if (mx >= 41 && mx <=172) {
       if (my >= 225 && my <= 294) {
        //play button
        Game.State = Game.STATE.CHARSEL1;
        //System.out.println("play clicked");
              
     try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   }
       }
      }
      if (mx >= 41 && mx <=172) {
       if (my >= 312 && my <= 381) {
           //options
        }
      }
      if (mx >= 41 && mx <=172) {
       if (my >= 400 && my <= 469) {
        System.exit(1);
          //exit
       }
      }
  }
  
  //FIRST PLAYER SELECT
  else if (Game.State == Game.STATE.CHARSEL1){
     if (my >= 535 && my <= 577) {
   if (mx >= 22 && mx <=89) {
          //back button
          Game.State = Game.STATE.MENU;
               try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   } 
          
        }
  }
  if (my >= 24 && my <= 270) {
   if (mx >= 244 && mx <=379) {
          //back button
          Game.State = Game.STATE.CHARSEL2;
          Game.ChoiceP1 = Game.CHOICEP1.SAADP1;
           //choiceP1 = 0;
    try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   }
         
        }
  }
  if (my >= 24 && my <= 270) {
   if (mx >= 410 && mx <=545) {
         //back button
         Game.State = Game.STATE.CHARSEL2;
         Game.ChoiceP1 = Game.CHOICEP1.BONDP1;
     try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   }
         //choiceP1 = 1;

   }
  }
    }
    
    //SECOND PLAYER SELECT
    else if (Game.State == Game.STATE.CHARSEL2){
     if (my >= 535 && my <= 577) {
      if (mx >= 22 && mx <=89) {
             //back button
             Game.State = Game.STATE.MENU;
    
    try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   }   // plays select sound
   
           }
     }
     if (my >= 24 && my <= 270) {
      if (mx >= 244 && mx <=379) {
             Game.State = Game.STATE.CHOOSE;
             Game.ChoiceP2 = Game.CHOICEP2.SAADP2;
                   //choiceP2 = 0
    try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
   catch(Exception ex)
   {
   } // plays select sound
             
       } 
     }
     if (my >= 24 && my <= 270) {
      if (mx >= 410 && mx <=545) {
             Game.State = Game.STATE.CHOOSE;
             Game.ChoiceP2 = Game.CHOICEP2.BONDP2;
             //choiceP2 = 1;
             
    try{
    AudioInputStream audioInputStream =
    AudioSystem.getAudioInputStream(
    this.getClass().getResource("/music/select.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    } 
    catch(Exception ex)
    {
    } // plays select sound
            
      }
     }
      
    }

    
 } 


 
 /*
 public int getChoiceP1() {
  return choiceP1;
 }
 public int getChoiceP2() {
  return choiceP2;
 }*/
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}