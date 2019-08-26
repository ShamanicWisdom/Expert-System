/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpertSystem.view.entry;

import ExpertSystem.model.KnowledgeEntity;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 187852
 */
public class DetailsFXMLController
{
    @FXML
    private Label stat1Label;
    @FXML
    private Label stat2Label;
    @FXML
    private Label stat3Label;
    @FXML
    private Label stat4Label;
    @FXML
    private Label stat5Label;
    @FXML
    private Label stat6Label;
    @FXML
    private Label stat7Label;
    @FXML
    private Label stat8Label;
    @FXML
    private Label stat9Label;
    @FXML
    private Label stat10Label;
    @FXML
    private Label entityNameLabel;
    @FXML
    private TextArea entityDescriptionArea;
    @FXML
    private ImageView entityPicture;
    
    private Stage dialogStage;
    private KnowledgeEntity entity;
    
    //Inicjalizacja.
    @FXML
    private void initialize() 
    {
    }
    
    //Przypisanie okna dialogowego.
    public void setDialogStage(Stage dialogStage) 
    {
        this.dialogStage = dialogStage;
    }
    
    //Zbieranie danych odnosnie nowego konta.
    public void getDetails(KnowledgeEntity entity) 
    {
        //this.entity = entity;
        entityNameLabel.setText("Dane o mieście: " + entity.getEntityName());
        stat1Label.setText(entity.getStat1());
        stat2Label.setText(entity.getStat2());
        stat3Label.setText(entity.getStat3());
        stat4Label.setText(entity.getStat4());
        stat5Label.setText(entity.getStat5());
        stat6Label.setText(entity.getStat6());
        stat7Label.setText(entity.getStat7());
        stat8Label.setText(entity.getStat8());
        stat9Label.setText(entity.getStat9());
        stat10Label.setText(entity.getStat10());
        
        Image imageURL = new Image(entity.getEntityPicture()); //Tworzenie obiektu Image i podanie mu adresu, w ktorym sie znajduje obrazek (URL).
        entityPicture.setImage(imageURL);
        
        entityDescriptionArea.setText(entity.getEntityDescription());  
        entity.getEntityPicture();  
    }
    
    //Skrypt dla guzika OK.
    @FXML
    private void handleOk()
    {
        dialogStage.close();
    }
}
