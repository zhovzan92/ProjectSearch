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
    private ListView lvNWordList;
    @FXML
    private ListView lvHistorySearch;
    @FXML
    private Label lblTotalWordCount;
    @FXML
    private Label lblSearchResult;
    @FXML
    private ListView lvAWordsList;

    ArrayList<String> data;
    FileManager fileManager = new FileManager();

    public void initialize() throws IOException {
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

    @FXML
    private void onClickShowAWords(ActionEvent actionEvent) {
    }

    @FXML
    private void onClickShowNWord(ActionEvent actionEvent) {
    }
    /*private WordsLogic wordsLogic=new WordsLogic()*/

    private void loadData() throws IOException {
        data = fileManager.readFile("src/main/resources/dk/easv/wordsearch/brit-a-z.txt");
        generateWordList();
    }

    private void generateWordList(){
        for(String word : data){
            lvWordList.getItems().add(word);
        }
    }
}
