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
import Access.DataHolder;
import Access.DataHolder.Data;
import org.neuroph.core.NeuralNetwork;

import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.neuroph.imgrec.ImageRecognitionPlugin;
import org.neuroph.imgrec.ImageSizeMismatchException;
/*
Class for performing all the logical and analytical operations
*/
public class ImageAnalyzer {
    
    private final String netPath="neuralnetwork.nnet";
    private String nnetFileName=null;
     
    //constructor gets path of the nural network file
//     public ImageAnalyzer(String path){
//      //  this.netPath=path; // set path of the neural network file to netPath
//     }
     public ImageAnalyzer(String nnetFileName){
         this.nnetFileName=nnetFileName;
     }
     
     //method to get neural network object from the given path (selected neural network file)
     private NeuralNetwork loadNeuralNetwork(){
         return NeuralNetwork.load(nnetFileName);
     }
     
    
     // method to get the result set given by the neural network for the image given by the user
     public HashMap getResultSet(String imagePath){
         HashMap <String,Double>resultSet=null; // hashmap to keep the result set given by the neuralnetwork
         NeuralNetwork nnet=loadNeuralNetwork(); // getting neural network object reffering the neural network file
         ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin) nnet.getPlugin(ImageRecognitionPlugin.class); // get the image recognition plugin from neural network
                 
         ImageRecognitionPlugin irp=(ImageRecognitionPlugin)nnet.getPlugin(ImageRecognitionPlugin.class); 
        try {
            resultSet=irp.recognizeImage(new File(imagePath)); // get result set for the given image 
            
        } catch (IOException ex) {
            //Logger.getLogger(ImageAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (ImageSizeMismatchException ex) {
            
            Logger.getLogger(ImageAnalyzer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("result set :"+resultSet.toString()); // print the result set to the console as a string
        return resultSet; // return result set as a hashmap
     }
    
    // method to get the rating for the image provided by the user 
    public double getRating(String imagePath){
        HashMap resultSet=getResultSet(imagePath); // getting result set provided by the neuralnetwork
        int rating=0;
        DecimalFormat df = new DecimalFormat("#0.00");
        Set list=resultSet.keySet(); // keep key values of the resultSet hashmap in a set
        Iterator i=list.iterator(); // iterator for moving through the set elemets
        double max=0; // variable to keep the max value for the rating
        
        //going through the result set
        while(i.hasNext()){
            Double val=(Double) resultSet.get(i.next());
            if(max<val){
                max=val; // attempt to get the max result set value for the rating
            }
        }        
        return Double.parseDouble(df.format(max));   // return the max value.This value is taking to calculate  rating for the image        
    }
}
