package dk.easv.wordsearch.GUI;

import dk.easv.wordsearch.BLL.FileManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class SearchWindowController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView lvWordList;
    @FXML
    private TextField txtWordSearchInput;
    @FXML
    private ListView lvAWorsList;
    @FXML
    private ListView lvNWordList;
    @FXML
    private ListView lvHistorySearch;
    @FXML
    private Label lblTotalWordCount;
    @FXML
    private Label lblSearchResult;

    public SearchWindowController() throws IOException {
        loadData();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void onClickSearch(ActionEvent actionEvent) {
    }

    @FXML
    private void onClickClearHistory(ActionEvent actionEvent) {
    }

    private void loadData() throws IOException {
        FileManager fileManager = new FileManager();
        ArrayList<String> data = fileManager.readFile("src/main/resources/dk/easv/wordsearch/brit-a-z.txt");
        for(String word : data){
            System.out.println(word);
        }
    }

}
