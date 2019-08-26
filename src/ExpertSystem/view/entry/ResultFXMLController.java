/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpertSystem.view.entry;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import ExpertSystem.Core;
import ExpertSystem.database.Connector;
import ExpertSystem.model.KnowledgeEntity;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Szaman
 */
public class ResultFXMLController
{
    @FXML
    private ImageView polska;
    @FXML
    private Label result;
    @FXML
    private Button zakopaneButton;
    @FXML
    private Button gdanskButton;
    @FXML
    private Button mikolajkiButton;
    @FXML
    private Button radomButton;
    @FXML
    private Button ciechocinekButton;
    @FXML
    private Button wloclawekButton;
    @FXML
    private Button gizyckoButton;
    @FXML
    private Button kazimierzButton;
    @FXML
    private Button turekButton;
    @FXML
    private Button lublinButton;
    @FXML
    private Button sandomierzButton;
    @FXML
    private Button krakowButton;
    @FXML
    private Button warszawaButton;
    @FXML
    private Button lodzButton;
    @FXML
    private Button wieliczkaButton;
    
    
    //private final ObservableList<KnowledgeEntity> dataGatherer = FXCollections.observableArrayList();
    private KnowledgeEntity dataGatherer;
    
    private Core mainApp; 
    private Connector connector;
    
    int answer1;
    int answer2;
    int answer3;
    int answer4; 
    int answer5;
    int answer6;
    int answer7;
    int answer8;
    int answer9;
    int answer10;
    
    private int bestEntityIndex = 0;
    
    public void setMainApp(Core mainApp,
                           int answer1,
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
        
        connector = new Connector();
        dataGatherer = new KnowledgeEntity();
        
        Image imageURL = new Image("ExpertSystem/pictures/polska.jpg"); //Tworzenie obiektu Image i podanie mu adresu, w ktorym sie znajduje obrazek (URL).
        this.mainApp = mainApp;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
        
        zakopaneButton.setOpacity(0.0);
        zakopaneButton.setDisable(true);
        
        gdanskButton.setOpacity(0.0);
        gdanskButton.setDisable(true);
        
        mikolajkiButton.setOpacity(0.0);
        mikolajkiButton.setDisable(true);
        
        radomButton.setOpacity(0.0);
        radomButton.setDisable(true);
        
        ciechocinekButton.setOpacity(0.0);
        ciechocinekButton.setDisable(true);
        
        wloclawekButton.setOpacity(0.0);
        wloclawekButton.setDisable(true);
        
        gizyckoButton.setOpacity(0.0);
        gizyckoButton.setDisable(true);
        
        kazimierzButton.setOpacity(0.0);
        kazimierzButton.setDisable(true);
        
        turekButton.setOpacity(0.0);
        turekButton.setDisable(true);
        
        lublinButton.setOpacity(0.0);
        lublinButton.setDisable(true);
        
        sandomierzButton.setOpacity(0.0);
        sandomierzButton.setDisable(true);
        
        krakowButton.setOpacity(0.0);
        krakowButton.setDisable(true);
        
        warszawaButton.setOpacity(0.0);
        warszawaButton.setDisable(true);
        
        lodzButton.setOpacity(0.0);
        lodzButton.setDisable(true);
        
        wieliczkaButton.setOpacity(0.0);
        wieliczkaButton.setDisable(true);
        
        bestEntityIndex = connector.parseKnowledge(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10);
        //result.setText(answer1 + " " + answer2 +  " " + answer3 +  " " + answer4 + " " + answer5 + " " + answer6 + " " + answer7 +  " " + answer8 + " " + answer9 + " " + answer10 + " Najblizej ma: " + bestEntityIndex);
        
        connector.selectDetailsOfBestEntity(dataGatherer, bestEntityIndex);
        
        if(bestEntityIndex == 1)
        {
            zakopaneButton.setOpacity(1.0);
            zakopaneButton.setDisable(false);
        }
        if(bestEntityIndex == 2)
        {
            gdanskButton.setOpacity(1.0);
            gdanskButton.setDisable(false);
        }
        if(bestEntityIndex == 3)
        {
            mikolajkiButton.setOpacity(1.0);
            mikolajkiButton.setDisable(false);
        }
        if(bestEntityIndex == 4)
        {
            radomButton.setOpacity(1.0);
            radomButton.setDisable(false);
        }
        if(bestEntityIndex == 5)
        {
            ciechocinekButton.setOpacity(1.0);
            ciechocinekButton.setDisable(false);
        }
        if(bestEntityIndex == 6)
        {
            wloclawekButton.setOpacity(1.0);
            wloclawekButton.setDisable(false);
        }
        if(bestEntityIndex == 7)
        {
            gizyckoButton.setOpacity(1.0);
            gizyckoButton.setDisable(false);
        }
        if(bestEntityIndex == 8)
        {
            kazimierzButton.setOpacity(1.0);
            kazimierzButton.setDisable(false);
        }
        if(bestEntityIndex == 9)
        {
            turekButton.setOpacity(1.0);
            turekButton.setDisable(false);
        }
        if(bestEntityIndex == 10)
        {
            lublinButton.setOpacity(1.0);
            lublinButton.setDisable(false);
        }
        if(bestEntityIndex == 11)
        {
            sandomierzButton.setOpacity(1.0);
            sandomierzButton.setDisable(false);
        }
        if(bestEntityIndex == 12)
        {
            krakowButton.setOpacity(1.0);
            krakowButton.setDisable(false);
        }
        if(bestEntityIndex == 13)
        {
            warszawaButton.setOpacity(1.0);
            warszawaButton.setDisable(false);
        }
        if(bestEntityIndex == 14)
        {
            lodzButton.setOpacity(1.0);
            lodzButton.setDisable(false);
        }
        if(bestEntityIndex == 15)
        {
            wieliczkaButton.setOpacity(1.0);
            wieliczkaButton.setDisable(false);
            
        }
        
        polska.setOpacity(0.0);
        showAnimation(imageURL);
        
    }
    
    private void showAnimation(Image imageURL)
    {
        polska.setImage(imageURL); //Rzutowanie obiektu Image na ImageView.
        
        FadeTransition showMap = new FadeTransition(Duration.millis(500), polska);
        showMap.setFromValue(0.0);
        showMap.setToValue(1.0);
        ParallelTransition showSequence = new ParallelTransition(showMap); //Rownorzedne znikanie.
        showSequence.play();
    }
    
    //Skrypt dla guzika Register.
    @FXML
    private void handleDetails(ActionEvent event) 
    {
        System.out.println("Details detected!"); //kontrola, czy dziala interakcja.
        mainApp.showDetails(dataGatherer);
    }
            
    //Skrypt dla guzika BackToEntry.
    @FXML
    private void handleBackToEntry(ActionEvent event)
    {
        System.out.println("BackToEntry detected!"); //kontrola, czy dziala interakcja.
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Powrót do formularza");
        alert.setHeaderText(null);
        alert.setContentText("Na pewno?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            System.out.println("BackToEntryOK detected!"); //kontrola, czy dziala interakcja.
            mainApp.showEntryPanel();
        } 
        else 
        {
            System.out.println("BackToEntryCancel detected!"); //kontrola, czy dziala interakcja.
            alert.close();
        }
    }
    
    //Skrypt dla guzika Back.
    @FXML
    private void handleBack(ActionEvent event)
    {
        System.out.println("Back detected!"); //kontrola, czy dziala interakcja.
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Powrót do menu");
        alert.setHeaderText(null);
        alert.setContentText("Na pewno?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            System.out.println("BackOK detected!"); //kontrola, czy dziala interakcja.
            mainApp.showWelcome();
        } 
        else 
        {
            System.out.println("BackCancel detected!"); //kontrola, czy dziala interakcja.
            alert.close();
        }
    }
}
