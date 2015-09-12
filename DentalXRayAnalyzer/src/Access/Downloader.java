/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Access.DataHolder.Data;
import Utilities.HttpDownloadUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Minudika
 */
public class Downloader {

    private String nnetFileName = null;
    private Connector connector = null;
    private String modelVersion = null;
    private ArrayList<String> nameList = null;
    private ArrayList<DataSet> dataset = null;

    public Downloader() {
        connector = new Connector();
    }

    //method to download the neural network file (.nnet) from the server
    public boolean download_nnet() throws JSONException, IOException {
        String fileURL = getURL_model();
        //String saveDir = ".\\data\\model\\";
        try {
            nnetFileName = HttpDownloadUtility.downloadFile(fileURL, Data.directoryPath_downloadNnet);
            File file=new File(Data.directoryPath_downloadNnet+nnetFileName);
            file.renameTo(new File(Data.filePath_downloadNnet));
            return true;
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println(Data.error_modelDownloadFailed);
        }
        return false;
    }

  

    public String getURL_news(int level) throws JSONException, IOException {
        String url = null;
        JSONObject json = null;
        switch(level)
        {
            case 1:
                json=readJsonFromUrl(Data.url_news_story1);
                break;
            case 2:
                json=readJsonFromUrl(Data.url_news_story2);
                break;
            case 3:
                json=readJsonFromUrl(Data.url_news_story3);
                break;                
        }
        
        System.out.println(json.toString());
        // System.out.println(json.get("model"));
        return url;
    }

    public ArrayList<DataSet> get_newsSet(int level) throws JSONException, IOException {
        ArrayList<DataSet> list = new ArrayList<DataSet>();
        JSONObject json = null;
        System.out.println(level);
        switch(level){
            case 1:
                json=readJsonFromUrl(Data.url_news_story1);
                break;
            case 2:
                json=readJsonFromUrl(Data.url_news_story2);
                break;
            case 3:
                json=readJsonFromUrl(Data.url_news_story3);
                break;
        }
        if(!json.equals(null))
        System.out.println(json.toString());

        int len = json.length();
        int i;
        for (i = 0; i < len; i++) {
            JSONObject jObject = json.getJSONObject(Integer.toString(i));
            String urlB = jObject.getString(Data.id_imageBefore);
            String urlA = jObject.getString(Data.id_imageAfter);
            String docName = jObject.getString(Data.id_doctorName);
            String hosName = jObject.getString(Data.id_hospitalName);
            String hosContact = jObject.getString(Data.id_hospitalContact);

            DataSet ds = new DataSet(urlB, urlA, docName, hosName, hosContact);
           // System.out.println("doc name :" + ds.getDoctorName());
            list.add(ds);
        }

        return list;
    }
    
    private int getLevelofImage(double rating){
        int x=(int) (rating*100);
        if(x>66)
            return 3;
        else if(x>33)
            return 2;
        else
            return 1;
    }

    public ArrayList<String> downloadImageSet(double rating) throws JSONException, IOException {
        nameList = new ArrayList<String>();
        dataset = get_newsSet(getLevelofImage(rating));
        int i;
        for (i = 0; i < dataset.size(); i++) {
            String nameA = downloadImage(dataset.get(i).getImageUrl_after());
            String nameB = downloadImage(dataset.get(i).getImageUrl_before());

            nameList.add(nameB);
            nameList.add(nameA);

            System.out.println("downloaded!!!!!");
        }
        return nameList;
    }

    public String downloadImage(String url) {
        String name = null;
        String saveDir = Data.filePath_downloadImage;
        try {
            name = HttpDownloadUtility.downloadFile(url, saveDir);
        } catch (IOException ex) {
            //ex.printStackTrace();
            System.out.println(Data.error_downloadingImage);
        }
        return name;
    }

    public String getURL_model() throws JSONException, IOException {
        //String url ="http://nodejs-orthodontic.rhcloud.com";
        String url = null;
        JSONObject json = readJsonFromUrl(Data.url_nnet);
        System.out.println(json.toString());
        url = json.get("model").toString();
        modelVersion = json.getString("version");
        System.out.println(json.get("model"));
        return url;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
    
    public void createDirectories() throws IOException{
        Path path_nnet=Paths.get(Data.directoryPath_downloadNnet);
        Path path_news=Paths.get(Data.directoryPath_downloadNews );
        Files.createDirectories(path_nnet);
        Files.createDirectories(path_news);
        System.out.println("created");
    }

    public String getFileName_nnet() {
        return nnetFileName;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public ArrayList<DataSet> getDataset() {
        return dataset;
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }
}
