//package com.game.src.main;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class Texture {
 SpriteSheet bs,ss;
 private BufferedImage saad_sheet = null;
 private BufferedImage bond_sheet = null;
 
 public BufferedImage[] bond = new BufferedImage[16];
 public BufferedImage[] bond_jump = new BufferedImage[14];
 public BufferedImage[] bond_punch= new BufferedImage[16];
 public BufferedImage[] bond_kick= new BufferedImage[13];
 public BufferedImage[] bond_special= new BufferedImage[16]; 
 
 public BufferedImage[] saad = new BufferedImage[14];
 public BufferedImage[] saad_jump = new BufferedImage[18];
 public BufferedImage[] saad_punch = new BufferedImage[18];
 public BufferedImage[] saad_kick = new BufferedImage[18];
 public BufferedImage[] saad_special = new BufferedImage[18];
 
 public Texture(){
  
  BufferedImageLoader loaderBond = new BufferedImageLoader();
  BufferedImageLoader loaderSaad = new BufferedImageLoader();
  
  try {
   saad_sheet = loaderSaad.loadImage("/res/SAADSHEET.png");
   bond_sheet = loaderBond.loadImage("/res/BONDSHEET.png");
  } catch (IOException e) {
   e.printStackTrace();
  }
  
  
  
  // THIS PLAYS THE THEME SONG 
        try{
    AudioInputStream audioInputStream =
        AudioSystem.getAudioInputStream(
            this.getClass().getResource("/music/menu.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
    }
   
   catch(Exception ex)
   {
   }
  //
  
  
  ss = new SpriteSheet(saad_sheet);
  bs = new SpriteSheet(bond_sheet);
  
  getTextures();
  
 }
 
 public void getTextures(){
  
  //looking right
  bond[0] = bs.grabImage(1,1,100,150);
  bond[1] = bs.grabImage(2,1,100,150);
  bond[2] = bs.grabImage(3,1,100,150);
  bond[3] = bs.grabImage(4,1,100,150);
  bond[4] = bs.grabImage(5,1,100,150);
  bond[5] = bs.grabImage(6,1,100,150);
  bond[6] = bs.grabImage(7,1,100,150);
  bond[7] = bs.grabImage(8,1,100,150);
  
  //looking left
  bond[8] = bs.grabImage(1,7,100,150);
  bond[9] = bs.grabImage(2,7,100,150);
  bond[10] = bs.grabImage(3,7,100,150);
  bond[11] = bs.grabImage(4,7,100,150);
  bond[12] = bs.grabImage(5,7,100,150);
  bond[13] = bs.grabImage(6,7,100,150);
  bond[14] = bs.grabImage(7,7,100,150);
  bond[15] = bs.grabImage(8,7,100,150);
  
  //bond jump
  bond_jump[0] = bs.grabImage(1,3,100,150);
  bond_jump[1] = bs.grabImage(2,3,100,150);
  bond_jump[2] = bs.grabImage(3,3,100,150);
  bond_jump[3] = bs.grabImage(4,3,100,150);
  bond_jump[4] = bs.grabImage(5,3,100,150);
  bond_jump[5] = bs.grabImage(6,3,100,150);
  bond_jump[6] = bs.grabImage(7,3,100,150);
  
  //bond jump left
  bond_jump[7] = bs.grabImage(1,9,100,150);
  bond_jump[8] = bs.grabImage(2,9,100,150);
  bond_jump[9] = bs.grabImage(3,9,100,150);
  bond_jump[10] = bs.grabImage(4,9,100,150);
  bond_jump[11] = bs.grabImage(5,9,100,150);
  bond_jump[12] = bs.grabImage(6,9,100,150);
  bond_jump[13] = bs.grabImage(7,9,100,150);
  
  //bond punch right
  bond_punch[0] = bs.grabImage(1,2,100,150);
  bond_punch[1] = bs.grabImage(2,2,100,150);
  bond_punch[2] = bs.grabImage(3,2,100,150);
  bond_punch[3] = bs.grabImage(4,2,100,150);
  bond_punch[4] = bs.grabImage(5,2,100,150);
  bond_punch[5] = bs.grabImage(6,2,100,150);
  bond_punch[6] = bs.grabImage(7,2,100,150);
  bond_punch[7] = bs.grabImage(1,2,100,150); 
  
  //bond punch left
  bond_punch[8] = bs.grabImage(1,8,100,150);
  bond_punch[9] = bs.grabImage(2,8,100,150);
  bond_punch[10] = bs.grabImage(3,8,100,150);
  bond_punch[11] = bs.grabImage(4,8,100,150);
  bond_punch[12] = bs.grabImage(5,8,100,150);
  bond_punch[13] = bs.grabImage(6,8,100,150);
  bond_punch[14] = bs.grabImage(7,8,100,150);
  bond_punch[15] = bs.grabImage(8,8,100,150); 
  
  //bond kick right
  bond_kick[0] = bs.grabImage(1,4,100,150);
  bond_kick[1] = bs.grabImage(2,4,100,150);
  bond_kick[2] = bs.grabImage(3,4,100,150);
  bond_kick[3] = bs.grabImage(4,4,100,150);
  bond_kick[4] = bs.grabImage(5,4,100,150);
  bond_kick[5] = bs.grabImage(6,4,100,150);
  bond_kick[6] = bs.grabImage(7,4,100,150);
  
  //bond kick left
  bond_kick[7] = bs.grabImage(1,10,100,150);
  bond_kick[8] = bs.grabImage(2,10,100,150);
  bond_kick[9] = bs.grabImage(3,10,100,150);
  bond_kick[10] = bs.grabImage(4,10,100,150);
  bond_kick[11] = bs.grabImage(5,10,100,150);
  bond_kick[12] = bs.grabImage(6,10,100,150);
  
  //bond special right
  bond_special[0] = bs.grabImage(1, 6, 100,150);
  bond_special[1] = bs.grabImage(2, 6, 100,150);
  bond_special[2] = bs.grabImage(3, 6, 100,150);
  bond_special[3] = bs.grabImage(4, 6, 100,150);
  bond_special[4] = bs.grabImage(5, 6, 100,150);
  bond_special[5] = bs.grabImage(6, 6, 100,150);
  bond_special[6] = bs.grabImage(7, 6, 100,150);
  bond_special[7] = bs.grabImage(8, 6, 100,150);
  
  //bond special right
  bond_special[8] = bs.grabImage(1, 12, 100,150);
  bond_special[9] = bs.grabImage(2, 12, 100,150);
  bond_special[10] = bs.grabImage(3, 12, 100,150);
  bond_special[11] = bs.grabImage(4, 12, 100,150);
  bond_special[12] = bs.grabImage(5, 12, 100,150);
  bond_special[13] = bs.grabImage(6, 12, 100,150);
  bond_special[14] = bs.grabImage(7, 12, 100,150);
  bond_special[15] = bs.grabImage(8, 12, 100,150);
  
  //SAAD STUFF  
  //saad looking right
  saad[0] = ss.grabImage(1,1,100,150);
  saad[1] = ss.grabImage(2,1,100,150);
  saad[2] = ss.grabImage(3,1,100,150);
  saad[3] = ss.grabImage(4,1,100,150);
  saad[4] = ss.grabImage(5,1,100,150);
  saad[5] = ss.grabImage(6,1,100,150);
  saad[6] = ss.grabImage(7,1,100,150);
  
  //saad looking left
  saad[7] = ss.grabImage(1,7,100,150);
  saad[8] = ss.grabImage(2,7,100,150);
  saad[9] = ss.grabImage(3,7,100,150);
  saad[10] = ss.grabImage(4,7,100,150);
  saad[11] = ss.grabImage(5,7,100,150);
  saad[12] = ss.grabImage(6,7,100,150);
  
  //saad  jump
  saad_jump[0] = ss.grabImage(1,3,100,150);
  saad_jump[1] = ss.grabImage(2,3,100,150);
  saad_jump[2] = ss.grabImage(3,3,100,150);
  saad_jump[3] = ss.grabImage(4,3,100,150);
  saad_jump[4] = ss.grabImage(5,3,100,150);
  saad_jump[5] = ss.grabImage(6,3,100,150);
  saad_jump[6] = ss.grabImage(7,3,100,150);
  saad_jump[7] = ss.grabImage(8,3,100,150);
  saad_jump[8] = ss.grabImage(9,3,100,150);
  
  
  //saad jump left
  saad_jump[9] = ss.grabImage(1,9,100,150);
  saad_jump[10] = ss.grabImage(2,9,100,150);
  saad_jump[11] = ss.grabImage(3,9,100,150);
  saad_jump[12] = ss.grabImage(4,9,100,150);
  saad_jump[13] = ss.grabImage(5,9,100,150);
  saad_jump[14] = ss.grabImage(6,9,100,150);
  saad_jump[15] = ss.grabImage(7,9,100,150);
  saad_jump[16] = ss.grabImage(8,9,100,150);
  saad_jump[17] = ss.grabImage(9,9,100,150);
  
  //saad punch right
  saad_punch[0] = ss.grabImage(1,2,100,150);
  saad_punch[1] = ss.grabImage(2,2,100,150);
  saad_punch[2] = ss.grabImage(3,2,100,150);
  saad_punch[3] = ss.grabImage(4,2,100,150);
  saad_punch[4] = ss.grabImage(5,2,100,150);
  saad_punch[5] = ss.grabImage(6,2,100,150);
  saad_punch[6] = ss.grabImage(7,2,100,150);
  saad_punch[7] = ss.grabImage(8,2,100,150);
  saad_punch[8] = ss.grabImage(9,2,100,150);
  
  //saad punch left
  saad_punch[9] = ss.grabImage(1,8,100,150);
  saad_punch[10] = ss.grabImage(2,8,100,150);
  saad_punch[11] = ss.grabImage(3,8,100,150);
  saad_punch[12] = ss.grabImage(4,8,100,150);
  saad_punch[13] = ss.grabImage(5,8,100,150);
  saad_punch[14] = ss.grabImage(6,8,100,150);
  saad_punch[15] = ss.grabImage(7,8,100,150);
  saad_punch[16] = ss.grabImage(8,8,100,150);
  saad_punch[17] = ss.grabImage(9,8,100,150);
  
  //saad kick right
  saad_kick[0] = ss.grabImage(1,4,100,150);
  saad_kick[1] = ss.grabImage(2,4,100,150);
  saad_kick[2] = ss.grabImage(3,4,100,150);
  saad_kick[3] = ss.grabImage(4,4,100,150);
  saad_kick[4] = ss.grabImage(5,4,100,150);
  saad_kick[5] = ss.grabImage(6,4,100,150);
  saad_kick[6] = ss.grabImage(7,4,100,150);
  saad_kick[7] = ss.grabImage(8,4,100,150);
  saad_kick[8] = ss.grabImage(9,4,100,150);
  
  //saad kick right
  saad_kick[9] = ss.grabImage(1,10,100,150);
  saad_kick[10] = ss.grabImage(2,10,100,150); 
  saad_kick[11] = ss.grabImage(3,10,100,150); 
  saad_kick[12] = ss.grabImage(4,10,100,150); 
  saad_kick[13] = ss.grabImage(5,10,100,150); 
  saad_kick[14] = ss.grabImage(6,10,100,150); 
  saad_kick[15] = ss.grabImage(7,10,100,150); 
  saad_kick[16] = ss.grabImage(8,10,100,150); 
  saad_kick[17] = ss.grabImage(9,10,100,150); 
  
  //saad special right
  saad_special[0] = ss.grabImage(1,6,100,150);
  saad_special[1] = ss.grabImage(2,6,100,150);
  saad_special[2] = ss.grabImage(3,6,100,150);
  saad_special[3] = ss.grabImage(4,6,100,150);
  saad_special[4] = ss.grabImage(5,6,100,150);
  saad_special[5] = ss.grabImage(6,6,100,150);
  saad_special[6] = ss.grabImage(7,6,100,150);
  saad_special[7] = ss.grabImage(8,6,100,150);
  saad_special[8] = ss.grabImage(9,6,100,150);
  
  //saad special left
  saad_special[9] = ss.grabImage(1,12,100,150); 
  saad_special[10] = ss.grabImage(2,12,100,150);
  saad_special[11] = ss.grabImage(3,12,100,150); 
  saad_special[12] = ss.grabImage(4,12,100,150); 
  saad_special[13] = ss.grabImage(5,12,100,150); 
  saad_special[14] = ss.grabImage(6,12,100,150); 
  saad_special[15] = ss.grabImage(7,12,100,150); 
  saad_special[16] = ss.grabImage(8,12,100,150);
  saad_special[17] = ss.grabImage(9,12,100,150); 
 }
 
}
