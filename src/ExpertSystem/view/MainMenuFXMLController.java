/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExpertSystem.view;

import java.util.Optional;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import ExpertSystem.Core;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;

/**
 *
 * @author Szaman
 */
public class MainMenuFXMLController
{
    
    @FXML
    private Label label;
    
    
    //Referencja do glownej aplikacji.
    private Core mainApp;
        

    //Referencja glownego pliku do samego siebie.
    public void setMainApp(Core mainApp)
    {
        
        this.mainApp = mainApp;
    }
    
    //Konstruktor WelcomeFXMLController().
    public MainMenuFXMLController() 
    {
    }
    
    //Skrypt dla guzika Entry.
    @FXML
    private void handleEntry(ActionEvent event)
    {
        System.out.println("Entry detected!"); //kontrola, czy dziala interakcja.
        mainApp.showEntryPanel(); //showUserWelcome inicjalizowane jest w Core.java. getEmail oddaje maila, z ktorego sie logujemy.
    }
    
    //Skrypt dla guzika Knowledge.
    @FXML
    private void handleKnowledge(ActionEvent event)
    {
        System.out.println("Knowledge detected!"); //kontrola, czy dziala interakcja.
        mainApp.showKnowledgePanel(); //showUserWelcome inicjalizowane jest w Core.java. getEmail oddaje maila, z ktorego sie logujemy.
    }
    
        //Skrypt dla guzika About.
    @FXML
    private void handleAbout(ActionEvent event)
    {
        System.out.println("About detected!"); //kontrola, czy dziala interakcja.
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Twórcy");
        alert.setHeaderText("O aplikacji:");
        alert.setContentText(
                "System Ekspercki" + "\n" +
                "Twórcy:" + "\n" +
                "Kamil Wielgus - Wiedza Ekspercka" + "\n" +
                "Szymon Zawadzki - Aplikacja");
        alert.showAndWait();
        System.out.println("About-OK detected!"); //kontrola, czy dziala interakcja.
                
    }
    
    //Skrypt dla guzika Exit.
    @FXML
    public void handleExit()
    {
        System.out.println("Exit detected!"); //kontrola, czy dziala interakcja.
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Wyjście");
        alert.setHeaderText(null);
        alert.setContentText("Na pewno?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            System.out.println("Exit-OK detected!"); //kontrola, czy dziala interakcja.
            System.exit(0);
        } 
        else 
        {
            System.out.println("Exit-Cancel detected!"); //kontrola, czy dziala interakcja.
            alert.close();
        }
    }
    
}
