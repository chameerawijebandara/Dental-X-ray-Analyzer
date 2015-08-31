/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Access.DataHolder.Data;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

/**
 *
 * @author Minudika
 */
public class Downloader {

   
    private Connector connector = null;

    public Downloader() {
        connector = new Connector();
    }

    //method to download the neural network file (.nnet) from the server
    public boolean download_nnet() {

        int i;
        try {

            URLConnection con = connector.getConnection_nnet();
            File file = new File(Data.fileName_nnet);

            BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));

            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            bos.flush();
            bis.close();
            return true;

        } catch (MalformedInputException malformedInputException) {

            malformedInputException.printStackTrace();
            return false;

        } catch (IOException ioException) {

            ioException.printStackTrace();
            return false;

        }
        
    }
    
    //method to download fiels for the newsfeed from the server
    public boolean download_news() {
        int i;
        try {
            URLConnection con = connector.getConnection_nnet();
            File file = new File(Data.fileName_newsfeed);

            BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));

            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            bos.flush();
            bis.close();
            return true;

        } catch (MalformedInputException malformedInputException) {

            malformedInputException.printStackTrace();
            return false;

        } catch (IOException ioException) {

            ioException.printStackTrace();
            return false;

        }
        
    }
}
