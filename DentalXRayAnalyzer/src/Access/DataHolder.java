/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

/**
 *
 * @author Minudika
 */
public class DataHolder {
    public static class Data{
        
        public static String url_nnet="http://nodejs-orthodontic.rhcloud.com/model";
        
        public static String url_news_story1="http://nodejs-orthodontic.rhcloud.com/story1";
        public static String url_news_story2="http://nodejs-orthodontic.rhcloud.com/story2";
        public static String url_news_story3="http://nodejs-orthodontic.rhcloud.com/story3";
        
        public static String url_news="http://localhost/xray/newsfeed";
        
        public static String fileName_nnet="neuralnetwork.nnet";
        public static String fileName_newsfeed="newsfeed";
        public static String filePath_downloadImage=".\\data\\news_set\\";
        public static String directoryPath_downloadNnet=".\\data\\model\\";
        public static String directoryPath_downloadNews=".\\data\\news_set\\";
        public static String filePath_downloadNnet=".\\data\\model\\neuralnetwork.nnet";
        
        public static String id_imageBefore="imgbefor";
        public static String id_imageAfter="imgafter";
        public static String id_doctorName="doctor";
        public static String id_hospitalName="hospital";
        public static String id_hospitalContact="hospitalno";
        
        //public static String downloadDirectory=""
        
        public static String error_newsImagesDownloadFailed="Downloading news feed images : Failed";
        
        public static String newsDownloading="Downloading news..";
        public static String newsDownloaded="Downloading news : Completed";
        public static String newsDownloadFailed="Downloading news : Failed";
        
        public static String error_modelDownloadFailed="Downloading model file : Failed";
        
        public static String modelUpdating="Updating Model..";
        public static String modelUpdated="Updating Model : Completed";
        public static String modelUpdateFailed="Updating Model : Failed";
        
        public static String error_downloadingImage="Downloading image : Failed";
        
       public static String error_createDirectories="Creating Directories : Failed";
       
       public static String message_modelNotFoundatLocal="Model can not be found. Download the latest version of model?";
        
        
        
        //public static String 
}
}
