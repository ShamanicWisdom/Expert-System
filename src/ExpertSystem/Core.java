/*
 * System Ekspercki - zaliczenie Szymon Zawadzki.
*/

package ExpertSystem;

import ExpertSystem.model.KnowledgeEntity;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//Wlasne klasy

import ExpertSystem.view.MainMenuFXMLController;
import ExpertSystem.view.MainWindowFXMLController;
import ExpertSystem.view.entry.DetailsFXMLController;
import ExpertSystem.view.entry.QuestionPanelFXMLController;
import ExpertSystem.view.entry.ResultFXMLController;
import ExpertSystem.view.knowledge.KnowledgePanelFXMLController;
import javafx.stage.Modality;

/**
 *
 * @author Szaman
 */
public class Core extends Application 
{
    
    private Stage primaryStage;
    public BorderPane root;
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        this.primaryStage = primaryStage;

        initiallizeMainWindow();       
    }
    
    //Inicjalizacja glownego okna.
    public void initiallizeMainWindow()
    {
        try //Proba wczytania pliku, stworzenia obiektu BorderPane, wskazania kontrolera do FXML i ustanowienie pliku jako glowne okno aplikacji.
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/MainWindowFXML.fxml"));
            root = (BorderPane) loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            MainWindowFXMLController controller;
            controller = loader.getController();
            controller.setMainApp(this);
            primaryStage.show();                                                //Wyswietlenie primaryStage.
            primaryStage.setResizable(false);                                   //Zablokowanie opcji rozciagania okna.
            primaryStage.setTitle("System Ekspercki v0.75");                    //Nadanie nazwy okna.
            showWelcome();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    //Ekran startowy.
    public void showWelcome()
    {
        try //Proba wczytania pliku, stworzenia obiektu AnchorPane, wskazania kontrolera do FXML i rzutowania pliku na glowne okno aplikacji
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/MainMenuFXML.fxml"));
            AnchorPane welcome = (AnchorPane) loader.load();
            root.setCenter(welcome);
            MainMenuFXMLController controller = loader.getController();
            controller.setMainApp(this);
        } 
        catch (IOException e) 
        {
           e.printStackTrace();
        }
    }
    
    //Ekran z pytaniami.
    public void showEntryPanel()
    {
        try //Proba wczytania pliku, stworzenia obiektu AnchorPane, wskazania kontrolera do FXML i rzutowania pliku na glowne okno aplikacji
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/entry/QuestionPanelFXML.fxml"));
            AnchorPane welcome = (AnchorPane) loader.load();
            root.setCenter(welcome);
            QuestionPanelFXMLController controller = loader.getController();
            controller.setMainApp(this);
        } 
        catch (IOException e) 
        {
           e.printStackTrace();
        }
    }
    
    //Ekran z pytaniami.
    public void showResult(int answer1, 
                           int answer2, 
                           int answer3, 
                           int answer4, 
                           int answer5, 
                           int answer6, 
                           int answer7, 
                           int answer8, 
                           int answer9, 
                           int answer10)
    {
        try //Proba wczytania pliku, stworzenia obiektu AnchorPane, wskazania kontrolera do FXML i rzutowania pliku na glowne okno aplikacji
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/entry/ResultFXML.fxml"));
            AnchorPane welcome = (AnchorPane) loader.load();
            root.setCenter(welcome);
            ResultFXMLController controller = loader.getController();
            controller.setMainApp(this,
                                  answer1,
                                  answer2,
                                  answer3,
                                  answer4,
                                  answer5,
                                  answer6,
                                  answer7,
                                  answer8,
                                  answer9,
                                  answer10);
        } 
        catch (IOException e) 
        {
           e.printStackTrace();
        }
    }
    
    //Okno z informacjami o mieście.
    public void showDetails(KnowledgeEntity entity) 
    {
        try 
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/entry/DetailsFXML.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Informacje o mieście");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.setResizable(false);
            DetailsFXMLController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.getDetails(entity);
            dialogStage.showAndWait();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    //Ekran z wiedza.
    public void showKnowledgePanel()
    {
        try //Proba wczytania pliku, stworzenia obiektu AnchorPane, wskazania kontrolera do FXML i rzutowania pliku na glowne okno aplikacji
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Core.class.getResource("view/knowledge/KnowledgePanelFXML.fxml"));
            AnchorPane welcome = (AnchorPane) loader.load();
            root.setCenter(welcome);
            KnowledgePanelFXMLController controller = loader.getController();
            controller.setMainApp(this);
        } 
        catch (IOException e) 
        {
           e.printStackTrace();
        }
    }
}
