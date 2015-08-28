/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Minudika
 */
import org.neuroph.core.NeuralNetwork;

import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neuroph.imgrec.ImageRecognitionPlugin;
import org.neuroph.imgrec.ImageSizeMismatchException;
/*
Class for performing all the logical and analytical operations
*/
public class ImageAnalyzer {
    
    String netPath;
     
    //constructor gets path of the nural network file
     public ImageAnalyzer(String path){
         this.netPath=path; // set path of the neural network file to netPath
     }
     
     //method to get neural network object from the given path (selected neural network file)
     private NeuralNetwork loadNeuralNetwork(){
         return NeuralNetwork.load(netPath);
     }
     
     
     public HashMap getResultSet(String imagePath){
         HashMap <String,Double>resultSet=null;
         NeuralNetwork nnet=loadNeuralNetwork();
         ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin) nnet.getPlugin(ImageRecognitionPlugin.class); // get the image recognition plugin from neural network
                 
         ImageRecognitionPlugin irp=(ImageRecognitionPlugin)nnet.getPlugin(ImageRecognitionPlugin.class);
        try {
            resultSet=irp.recognizeImage(new File(imagePath));
            
        } catch (IOException ex) {
            Logger.getLogger(ImageAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ImageSizeMismatchException ex) {
            Logger.getLogger(ImageAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("result set :"+resultSet.toString());
        return resultSet;
     }
    
    public double getRating(String imagePath){
        HashMap resultSet=getResultSet(imagePath);
        int rating=0;
        
        Set list=resultSet.keySet();
        Iterator i=list.iterator();
        double max=0;
        
        while(i.hasNext()){
            Double val=(Double) resultSet.get(i.next());
            if(max<val){
                max=val;
            }
        }        
        return max;      
        
    }
}
