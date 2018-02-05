//package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player {
 private double x;
 private double y;
 
 private boolean hasChosen = false;
 
 private boolean jumping;
 private boolean attacking = false;
 
 private double velX = 0;
 private double velY = 0;
 
 public int facing = 1;//right
 public boolean punch = false;
 public boolean kick = false;
 public boolean special = false; 
 public boolean strafe = false;
 public boolean inAction = false;
 
 Texture tex = Game.getInstance();
 
 private Animation playerWalk, playerWalkLeft, playerJump, playerJumpLeft, playerStillLeft, playerStill; //movements
 private Animation playerPunch, playerPunchLeft, playerKick, playerKickLeft, playerSpecial, playerSpecialLeft; //attacks
 
 public Player(double x, double y) {
  this.x = x;
  this.y = y;
  if (!hasChosen){
  if (Game.ChoiceP1 == Game.CHOICEP1.SAADP1) {
      System.out.println("Player 1 has chosen Saad"); 
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
  else if (Game.ChoiceP1 == Game.CHOICEP1.BONDP1) {
   System.out.println("Player 1 has chosen Bond");
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
  x+= velX;
  y+= velY;
  if (y <= 340) {
   velY ++;
   jumping= true;
  }
  if (x <= 0) {x=0;}
  if (x >= 725) {x=725;}
  if (y >= 400) {
   y=400;
   jumping = false;
  }
  if (y <= 0) {y=0;}
  
  if (velX <0){
   facing = 0;
  }
  else if (velX > 0){facing = 1;}
  
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
  
  if (jumping && facing == 1) {
   playerJump.drawAnimation(g, (int)x, (int)y);  
  }

  else if (jumping && facing == 0) {
   playerJumpLeft.drawAnimation(g, (int)x, (int)y);
  }
  else if (jumping && facing == 1 && special) {
   playerSpecial.drawAnimation(g, (int)x, (int)y);
  }
  else if (jumping && facing == 0 && special) {
   playerSpecialLeft.drawAnimation(g, (int)x, (int)y);
  }
  else {
   if (!inAction && velX < 0){ //left
    playerWalkLeft.drawAnimation(g, (int)x, (int)y);
   }
   else if (!inAction && velX > 0){
    playerWalk.drawAnimation(g, (int)x, (int)y);
   }
   else if (kick && facing == 1){
    playerKick.drawAnimation(g, (int)x, (int)y);
   }
   else if (kick && facing == 0){
    playerKickLeft.drawAnimation(g, (int)x, (int)y);
   }
   else if (punch && facing == 1){
    playerPunch.drawAnimation(g, (int)x, (int)y);
   }
   else if (punch && facing == 0){
    playerPunchLeft.drawAnimation(g, (int)x, (int)y);
   }
   else if (special && facing == 1){
    playerSpecial.drawAnimation(g, (int)x, (int)y);
   }
   else if (special && facing == 0){
    playerSpecialLeft.drawAnimation(g, (int)x, (int)y);
   }
   else {
    if (facing == 0) {
     playerStill.drawAnimation(g, (int)x, (int)y);
    }
    else if (facing == 1){
     playerStillLeft.drawAnimation(g, (int)x, (int)y);
    }
   }
  }
 }
 
 public double getX(){
  return x;
 }
 public double getY(){
  return y;
 }
 public boolean isJumping(){
  return jumping;
 }
 public void setX(double x){
  this.x = x;
 }
 public void setY(double y){
  this.y = y;
 }
 public void setVelX(double velX){
  this.velX = velX;
 }
 public void setVelY(double velY){
  this.velY = velY;
 }
 
}
