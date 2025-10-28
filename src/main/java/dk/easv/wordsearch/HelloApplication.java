package dk.easv.wordsearch;

import dk.easv.wordsearch.BLL.FileManager;
import dk.easv.wordsearch.Be.NeedNewName;
import dk.easv.wordsearch.DAL.FileData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WordSearch.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("WordSearch");
        stage.setScene(scene);
        stage.show();

        FileManager fileManager = new FileManager();
        ArrayList<String> data = fileManager.readFile("src/main/resources/dk/easv/wordsearch/brit-a-z.txt");
        for(String word : data){
            System.out.println(word);
        }
    }
}
