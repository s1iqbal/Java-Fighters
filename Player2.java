//package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player2 {
 private double xp2;
 private double yp2;
public int facingp2 = 0; //left
 
 private boolean jumpingP2;
 private boolean hasChosen = false;
 
 private double velXp2 = 0;
 private double velYp2 = 0;
 
 public boolean punchP2 = false;
 public boolean kickP2 = false;
 public boolean specialP2 = false; 
 public boolean strafeP2 = false;
 public boolean inActionP2 = false;
 
 Texture tex = Game.getInstance();
 
 private Animation playerWalk, playerWalkLeft, playerJump, playerJumpLeft, playerStillLeft, playerStill; //movements
 private Animation playerPunch, playerPunchLeft, playerKick, playerKickLeft, playerSpecial, playerSpecialLeft; //attacks
 
 public Player2(double xp2, double yp2) {
  this.xp2 = xp2;
  this.yp2 = yp2;
  
  if (!hasChosen){
   if (Game.ChoiceP2 == Game.CHOICEP2.SAADP2) {
       System.out.println("Player 2 has chosen Saad"); 
       playerWalk = new Animation(
      5, tex.saad[0], tex.saad[1], tex.saad[2], tex.saad[3], tex.saad[4], tex.saad[5], tex.saad[6]
        );
    playerWalkLeft = new Animation(
      5,tex.saad[7], tex.saad[8], tex.saad[9], tex.saad[10], tex.saad[11], tex.saad[12]
        );
    playerJump = new Animation(
      15, tex.saad_jump[0], tex.saad_jump[1], tex.saad_jump[2], tex.saad_jump[3], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[4], tex.saad_jump[5],
      tex.saad_jump[6], tex.saad_jump[7], tex.saad_jump[8]  
      );
    playerJumpLeft = new Animation(
      15, tex.saad_jump[9], tex.saad_jump[10], tex.saad_jump[11], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[12], tex.saad_jump[13],
      tex.saad_jump[14], tex.saad_jump[15], tex.saad_jump[16], tex.saad_jump[17]
        );
    playerStillLeft = new Animation (1, tex.saad[0]);
    playerStill = new Animation (1, tex.saad[7]);
    
    playerPunch = new Animation (
      3, tex.saad_punch[0], tex.saad_punch[1], tex.saad_punch[2], tex.saad_punch[3], tex.saad_punch[4], tex.saad_punch[5], tex.saad_punch[6], tex.saad_punch[7],
      tex.saad_punch[8]
      );
    playerPunchLeft = new Animation (
      3, tex.saad_punch[9], tex.saad_punch[10], tex.saad_punch[11], tex.saad_punch[12], tex.saad_punch[13], tex.saad_punch[14], tex.saad_punch[15], tex.saad_punch[16],
       tex.saad_punch[17]
      );
    playerKick = new Animation (
      3, tex.saad_kick[0], tex.saad_kick[1], tex.saad_kick[2], tex.saad_kick[3], tex.saad_kick[4], tex.saad_kick[5], tex.saad_kick[6], tex.saad_kick[7], tex.saad_kick[8]
      );
    playerKickLeft = new Animation (
      3, tex.saad_kick[9], tex.saad_kick[10], tex.saad_kick[11], tex.saad_kick[12], tex.saad_kick[13], tex.saad_kick[14], tex.saad_kick[15], tex.saad_kick[16], 
      tex.saad_kick[17]
      );
    playerSpecial = new Animation (
      7, tex.saad_special[0], tex.saad_special[1], tex.saad_special[2], tex.saad_special[3], tex.saad_special[4], tex.saad_special[5], tex.saad_special[6],
      tex.saad_special[7], tex.saad_special[8]
      );
    playerSpecialLeft= new Animation (
      7, tex.saad_special[9], tex.saad_special[10], tex.saad_special[11], tex.saad_special[12], tex.saad_special[13], tex.saad_special[14], tex.saad_special[15],
      tex.saad_special[16], tex.saad_special[17]
      ); 
   }
   else if (Game.ChoiceP2 == Game.CHOICEP2.BONDP2) {
    System.out.println("Player 2 has chosen Bond");
    playerWalk = new Animation(
      5, tex.bond[0], tex.bond[1], tex.bond[2], tex.bond[3], tex.bond[4], tex.bond[5], tex.bond[6], tex.bond[7]
        );
    playerWalkLeft = new Animation(
      5,tex.bond[8], tex.bond[9], tex.bond[10], tex.bond[11], tex.bond[12], tex.bond[13], tex.bond[14], tex.bond[15]
        );
    playerJump = new Animation(
      15, tex.bond_jump[0], tex.bond_jump[1], tex.bond_jump[2], tex.bond_jump[3], tex.bond_jump[4], tex.bond_jump[4], tex.bond_jump[4], 
      tex.bond_jump[4], tex.bond_jump[5], tex.bond_jump[6]
        );
    playerJumpLeft = new Animation(
      15, tex.bond_jump[7], tex.bond_jump[8], tex.bond_jump[9], tex.bond_jump[10], tex.bond_jump[11], tex.bond_jump[12], tex.bond_jump[13]
        ); 
    playerStillLeft = new Animation (1, tex.bond[0]);
    playerStill = new Animation (1, tex.bond[8]);
    
    playerPunch = new Animation (
      3, tex.bond_punch[0], tex.bond_punch[1], tex.bond_punch[2], tex.bond_punch[3], tex.bond_punch[4], tex.bond_punch[5], 
      tex.bond_punch[6], tex.bond_punch[7]
        );
    playerPunchLeft = new Animation (
      3, tex.bond_punch[8], tex.bond_punch[9], tex.bond_punch[10], tex.bond_punch[11], tex.bond_punch[12], tex.bond_punch[13], 
      tex.bond_punch[14], tex.bond_punch[15]
      );
    playerKick = new Animation (
      3, tex.bond_kick[0], tex.bond_kick[1], tex.bond_kick[2], tex.bond_kick[3], tex.bond_kick[4], tex.bond_kick[5], tex.bond_kick[6]
      );
    playerKickLeft = new Animation (
      3, tex.bond_kick[7], tex.bond_kick[8], tex.bond_kick[9], tex.bond_kick[10], tex.bond_kick[11], tex.bond_kick[12]
      );
    playerSpecial = new Animation (
      7, tex.bond_special[0], tex.bond_special[1] , tex.bond_special[2] , tex.bond_special[3] , tex.bond_special[4] , 
      tex.bond_special[5] , tex.bond_special[6] , tex.bond_special[7]  
      );
    playerSpecialLeft= new Animation (
      7, tex.bond_special[8], tex.bond_special[9], tex.bond_special[10], tex.bond_special[11], tex.bond_special[12],
      tex.bond_special[13], tex.bond_special[14], tex.bond_special[15]
      );
   }
   hasChosen = true;
  }
 }
 
 public void init(){  
 }
 
 
 public void tick(){
  xp2+= velXp2;
  yp2+= velYp2;
  if (yp2 <= 340) {
   velYp2 ++;
   jumpingP2= true;
  }
  if (xp2 <= 0) {xp2=0;}
  if (xp2 >= 725) {xp2=725;}
  if (yp2 >= 400) {
   yp2=400;
   jumpingP2 = false;
  }
  if (yp2 <= 0) {yp2=0;}
  if (velXp2 <0){
   facingp2 = 0;
  }
  else if (velXp2 > 0){facingp2 = 1;}
  
  playerWalk.runAnimation();
  playerWalkLeft.runAnimation();
  playerJump.runAnimation();
  playerJumpLeft.runAnimation();
  playerStill.runAnimation();
  playerStillLeft.runAnimation();
  playerPunch.runAnimation();
  playerPunchLeft.runAnimation();
  playerKick.runAnimation();
  playerKickLeft.runAnimation();
  playerSpecial.runAnimation();
  playerSpecialLeft.runAnimation();
 }
 
 public void render(Graphics g){
  if (jumpingP2 && facingp2 == 1) {
   playerJump.drawAnimation(g, (int)xp2, (int)yp2);  
  }

  else if (jumpingP2 && facingp2 == 0) {
   playerJumpLeft.drawAnimation(g, (int)xp2, (int)yp2);
  }
  else if (jumpingP2 && facingp2 == 1 && specialP2) {
   playerSpecial.drawAnimation(g, (int)xp2, (int)yp2);
  }
  else if (jumpingP2 && facingp2 == 0 && specialP2) {
   playerSpecialLeft.drawAnimation(g, (int)xp2, (int)yp2);
  }
  else {
   if (!inActionP2 && velXp2 < 0){ //left
    playerWalkLeft.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (!inActionP2 && velXp2 > 0){
    playerWalk.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (kickP2 && facingp2 == 1){
    playerKick.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (kickP2 && facingp2 == 0){
    playerKickLeft.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (punchP2 && facingp2 == 1){
    playerPunch.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (punchP2 && facingp2 == 0){
    playerPunchLeft.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (specialP2 && facingp2 == 1){
    playerSpecial.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else if (specialP2 && facingp2 == 0){
    playerSpecialLeft.drawAnimation(g, (int)xp2, (int)yp2);
   }
   else {
    if (facingp2 == 0) {
     playerStill.drawAnimation(g, (int)xp2, (int)yp2);
    }
    else if (facingp2 == 1){
     playerStillLeft.drawAnimation(g, (int)xp2, (int)yp2);
    }
   }
  }
 }
 
 public double getX2p2(){
  return xp2;
 }
 public double getY2p2(){
  return yp2;
 }
 public boolean isJumpingp2(){
  return jumpingP2;
 }
 public void setXp2(double xp2){
  this.xp2 = xp2;
 }
 public void setYp2(double yp2){
  this.yp2 = yp2;
 }
 public void setVelXp2(double velXp2){
  this.velXp2 = velXp2;
 }
 public void setVelYp2(double velYp2){
  this.velYp2 = velYp2;
 }
 
}
