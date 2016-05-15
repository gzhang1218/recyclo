/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recyclo;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Gaming
 */
public class Inputs {
    public ArrayList<Image>imageList; 
    public String[]keyAnswers; 
    
    public Inputs(){
        imageList = new ArrayList<>();
        keyAnswers = new String[30];
    }
    
    public ArrayList<Image> getImages(){
        try {
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/MilkJug.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/CreditCard.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/PackingPeanuts.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Cutlery.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Legos.png")));//8
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/GlassBottle.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/BeerBottle.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Nails.png")));//12
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/AluminumCan.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/LeadBattery.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/LithiumIonBattery.png")));//16
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/MotorOil.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Cardboard.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Newspaper.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash1.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash2.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash3.png")));//24
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash4.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash6.png")));
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash7.png")));//28
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Trash8.png")));
            
            imageList.add(ImageIO.read(Inputs.class.getResource("Graphics/Background.png")));//30
            return imageList;
            
            
        }
        catch (IOException ex){
            System.out.println("Fuck, the images didn't import");
        }
        return null;
    }
    public String[] getAnswers(){
        keyAnswers[0] = "1";
        keyAnswers[1] = "1";
        keyAnswers[2] = "1";
        keyAnswers[3] = "1";
        keyAnswers[4] = "1";
        keyAnswers[5] = "1";
        keyAnswers[6] = "1";
        keyAnswers[7] = "1";
        keyAnswers[8] = "1";
        keyAnswers[9] = "1";
        keyAnswers[10] = "1";
        keyAnswers[11] = "1";
        keyAnswers[12] = "1";
        keyAnswers[13] = "1";
        keyAnswers[14] = "Space";
        keyAnswers[15] = "Space";
        keyAnswers[16] = "Space";
        keyAnswers[17] = "Space";
        keyAnswers[18] = "Space";
        keyAnswers[19] = "Space";
        
        return keyAnswers;
    }  
}
