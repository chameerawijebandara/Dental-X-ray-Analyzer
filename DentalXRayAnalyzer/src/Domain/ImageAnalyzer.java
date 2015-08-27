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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neuroph.imgrec.ImageRecognitionPlugin;
import org.neuroph.imgrec.ImageSizeMismatchException;
public class ImageAnalyzer {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) throws IOException {
//
//        // load trained neural network saved with Neuroph Studio (specify some existing neural network file here)
//        NeuralNetwork nnet = NeuralNetwork.load("research_net.nnet"); // load trained neural network saved with Neuroph Studio
//        // get the image recognition plugin from neural network
//        ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin) nnet.getPlugin(ImageRecognitionPlugin.class); // get the image recognition plugin from neural network
//        HashMap<String, Double> output = imageRecognition.recognizeImage(new File("class_7.png"));
//        System.out.println(output.toString());
//    }
    
    String netPath;
     
     public ImageAnalyzer(String path){
         this.netPath=path;
     }
     private NeuralNetwork loadNeuralNetwork(){
         return NeuralNetwork.load(netPath);
     }
     private HashMap getResultSet(String imagePath){
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
        
        return resultSet;
     }
    
    public double getRating(String imagePath){
        HashMap resultSet=getResultSet(imagePath);
        int rating=0;
        
        Set list=resultSet.keySet();
        String []array=(String[]) list.toArray();
        double max=0;
        String maxS;
        for(String s:array){
            double val=(double) resultSet.get(s);
            if(max<val){
                max=val;
                maxS=s;
            }
        }
        
        return max;      
        
    }
}
