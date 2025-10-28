package dk.easv.wordsearch.DAL;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;             // Import the Scanner class to read text files

    public class FileData {


        public boolean fileExists(String filePath){
            File file = new File(filePath);
            return file.exists();
        }

        public ArrayList<String> readFile(String path) throws IOException {

            try
            {
                ArrayList<String> dataArray = new ArrayList<String>();

                BufferedReader myBuffReader = new BufferedReader(new FileReader(path));
                String line;
                while ((line = myBuffReader.readLine()) != null)
                {
                    //System.out.println(line);
                    dataArray.add(line);
                }
                return dataArray;
            }
            catch (FileNotFoundException e)
            {
                System.out.println("An error occured");
                e.printStackTrace();
                return null;
            }
        }

        /*
        Method that tells the file type (txt or rtf)
         */
        public String getFileExtension(String filePath)
        {
            File file = new File(filePath);
            int dotIndex = file.getName().lastIndexOf('.');

            return (dotIndex > 0) ? file.getName().substring(dotIndex + 1) : "";
        }
    }
