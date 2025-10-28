package dk.easv.wordsearch.BLL;

import dk.easv.wordsearch.Be.NeedNewName;
import dk.easv.wordsearch.DAL.FileData;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    FileData file = new FileData();
    NeedNewName be = new NeedNewName();

    public boolean dataExist(String filePath){
        return file.fileExists(filePath);
    }

    public ArrayList<String> readFile(String path) throws IOException {
        ArrayList<String> data = file.readFile(path);
        be.setData(data);
        return data;
    }

    public String getFileExtention(String filePath){
        String fileExtention = file.getFileExtension(filePath);
        return fileExtention;
    }
}
