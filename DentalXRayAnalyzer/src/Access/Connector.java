/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Access.DataHolder.Data;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Minudika
 * 
 * This class handles accessing to the server and its files and directories
 */
public class Connector {
    
    //method to get connection to the neural network in the server
    public URLConnection getConnection_nnet(){
        URLConnection con=null;
        URL url=null;
        try {
            url=new URL(Data.url_nnet); //url for neural network file in the server
            try {
                con=url.openConnection(); //opening connection with the server
            } catch (IOException ex) {
                Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; // return connection 
    }
    
    //method to get connection to the files for the news feed in the server
     public URLConnection getConnection_news(){
        URLConnection con=null;
        URL url=null;
        try {
            url=new URL(Data.url_news); //url for directory contains newsfeed items in the server
            try {
                con=url.openConnection(); // opening connection with the server
            } catch (IOException ex) {
                Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; // return conneciton
     }
    
}
