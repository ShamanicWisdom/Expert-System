/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpertSystem.view.knowledge;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import ExpertSystem.Core;
import ExpertSystem.database.Connector;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import ExpertSystem.model.KnowledgeEntity;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author Szaman
 */
public class KnowledgePanelFXMLController
{
    @FXML
    private TextArea entityDescriptionArea;
    @FXML
    private Label entityIDLabel;
    @FXML
    private Label entityPictureLabel;
    @FXML
    private Label entityNameLabel;
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
    private TableView<KnowledgeEntity> modelTable;
    @FXML
    private TableColumn<KnowledgeEntity, String> modelColumn;
    
    private final ObservableList<KnowledgeEntity> dataGatherer = FXCollections.observableArrayList();
    
    private KnowledgeEntity knowledge; 
    
    private Core mainApp; 
    private Connector connector;
        
    //Inicjalizacja danych do tabeli.
    @FXML
    private void initialize() 
    {
        modelColumn.setCellValueFactory(cellData -> cellData.getValue().entityNameProperty());
        modelTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> knowledgeDetails(newValue));
    }
        
    public void setMainApp(Core mainApp) 
    {
        connector = new Connector();
        //connector.insertEntity("8", "9", "6", "10", "10", "10", "10", "5", "5", "10", "Zakopane", "Zakopane – miasto w województwie małopolskim, siedziba powiatu tatrzańskiego. Zakopane jest największym ośrodkiem miejskim w bezpośrednim otoczeniu Tatr, dużym ośrodkiem sportów zimowych, od dawna nazywane nieformalnie zimową stolicą Polski.", "ExpertSystem/pictures/zakopane.jpg");
        //connector.insertEntity("10", "10", "9", "10", "8", "10", "10", "8", "8", "10", "Gdańsk", "Gdańsk – miasto na prawach powiatu w północnej Polsce w województwie pomorskim, położone nad Morzem Bałtyckim u ujścia Motławy do Wisły nad Zatoką Gdańską.", "ExpertSystem/pictures/gdansk.jpg");
        //connector.insertEntity("6", "6", "4", "4", "7", "6", "8", "1", "4", "4", "Mikołajki", "Mikołajki – miasto w województwie warmińsko-mazurskim, w powiecie mrągowskim, siedziba gminy miejsko-wiejskiej Mikołajki. Położone w Krainie Wielkich Jezior Mazurskich, nad jeziorami: Tałty i Jeziorem Mikołajskim.", "ExpertSystem/pictures/mikolajki.jpg");
        //connector.insertEntity("2", "2", "2", "2", "1", "2", "2", "1", "3", "1", "Radom", "Radom – miasto na prawach powiatu w centralno-wschodniej Polsce, w województwie mazowieckim, położone nad rzeką Mleczną, historycznie w Małopolsce. Największy ośrodek miejski w widłach Wisły i Pilicy. Czternaste co do wielkości miasto w Polsce.", "ExpertSystem/pictures/radom.jpg");
        //connector.insertEntity("3", "1", "3", "2", "4", "4", "3", "1", "5", "4", "Ciechocinek", "Ciechocinek – miasto w województwie kujawsko-pomorskim, w powiecie aleksandrowskim, na Kujawach.", "ExpertSystem/pictures/ciechocinek.jpg");
        //connector.insertEntity("7", "4", "4", "6", "7", "7", "4", "5", "6", "7", "Włocławek", "Włocławek – miasto na prawach powiatu w województwie kujawsko-pomorskim, nad Wisłą, przy ujściu Zgłowiączki, siedziba powiatu włocławskiego. Jedno z głównych miast województwa, historyczna stolica Kujaw.", "ExpertSystem/pictures/wloclawek.jpg");
        //connector.insertEntity("5", "3", "4", "3", "7", "7", "7", "3", "4", "3", "Giżycko", "Giżycko jest nazywane stolicą żeglarstwa w Polsce[3]. Jest jednym z głównych portów na szlaku wielkich jezior mazurskich i jednym z polskich ośrodków turystycznych i wypoczynkowych.", "ExpertSystem/pictures/gizycko.jpg");
        //connector.insertEntity("1", "3", "4", "5", "6", "6", "7", "3", "7", "8", "Kazimierz Dolny", "Kazimierz Dolny – miasto w województwie lubelskim, w powiecie puławskim, nad Wisłą, w Małopolskim Przełomie Wisły, w zachodniej części Płaskowyżu Nałęczowskiego. Historycznie położony jest w Małopolsce.", "ExpertSystem/pictures/kazimierz.jpg");
        //connector.insertEntity("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "Turek", "Turek – miasto w województwie wielkopolskim, siedziba powiatu tureckiego i gminy Turek, w Kaliskiem, na ziemi sieradzkiej, na Wysoczyźnie Tureckiej, nad Kiełbaską.", "ExpertSystem/pictures/turek.jpg");
        //connector.insertEntity("5", "4", "9", "5", "8", "7", "7", "8", "7", "6", "Lublin", "Lublin – miasto na prawach powiatu we wschodniej Polsce, stolica województwa lubelskiego i centralny ośrodek aglomeracji lubelskiej. Dziewiąte co do wielkości populacji miasto w Polsce, drugie w Małopolsce oraz największe w kraju na wschód od Wisły", "ExpertSystem/pictures/lublin.jpg");
        //connector.insertEntity("8", "2", "2", "4", "5", "6", "4", "1", "5", "7", "Sandomierz", "Sandomierz – miasto w województwie świętokrzyskim, w powiecie sandomierskim, położone nad Wisłą, na siedmiu wzgórzach. Sandomierz jest usytuowany w Nizinie Nadwiślańskiej i rozciąga się od Wyżyny Sandomierskiej po Równinę Tarnobrzeską.", "ExpertSystem/pictures/sandomierz.jpg");
        //connector.insertEntity("10", "6", "10", "3", "6", "10", "6", "7", "10", "6", "Kraków", "Kraków – miasto położone w południowej Polsce nad Wisłą, drugie w kraju pod względem liczby mieszkańców i powierzchni, stolica Polski do 1795 r. i miasto koronacyjne oraz nekropolia królów Polski.", "ExpertSystem/pictures/krakow.jpg");
        //connector.insertEntity("10", "10", "10", "2", "5", "10", "5", "10", "10", "3", "Warszawa", "Warszawa, miasto stołeczne Warszawa – stolica Polski i województwa mazowieckiego, największe miasto kraju, położone w jego środkowo-wschodniej części, na Nizinie Środkowomazowieckiej, na Mazowszu, nad Wisłą.", "ExpertSystem/pictures/warszawa.jpg");
        //connector.insertEntity("10", "1", "10", "1", "5", "10", "7", "10", "10", "10", "Łódź", "Łódź – miasto na prawach powiatu w środkowej Polsce, a także siedziba władz województwa łódzkiego, powiatu łódzkiego wschodniego oraz gminy Nowosolna, przejściowa siedziba władz państwowych w 1945 roku. Ośrodek akademicki, kulturalny i przemysłowy.", "ExpertSystem/pictures/lodz.jpg");
        //connector.insertEntity("3", "1", "1", "2", "4", "4", "3", "1", "5", "4", "Wieliczka", "Wieliczka – miasto powiatowe w województwie małopolskim, w powiecie wielickim, siedziba władz gminy miejsko-wiejskiej Wieliczka oraz władz powiatu.", "ExpertSystem/pictures/wieliczka.jpg");
        connector.selectAllKnowledgeEntities(dataGatherer);
        this.mainApp = mainApp;
        modelTable.setItems(dataGatherer);
    }
    
        //Metoda do wyswietlenia wszystkich danych o uzytkowniku.
    private void knowledgeDetails(KnowledgeEntity entity) 
    {
        if (entity != null) 
        {
            entityIDLabel.setText(entity.getEntityID());
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
            entityNameLabel.setText(entity.getEntityName());
            entityDescriptionArea.setText(entity.getEntityDescription());
            entityPictureLabel.setText(entity.getEntityPicture());
        } 
        else 
        {
            entityIDLabel.setText("");
            stat1Label.setText("");
            stat2Label.setText("");
            stat3Label.setText("");
            stat4Label.setText("");
            stat5Label.setText("");
            stat6Label.setText("");
            stat7Label.setText("");
            stat8Label.setText("");
            stat9Label.setText("");
            stat10Label.setText("");
            entityNameLabel.setText("");
            entityDescriptionArea.setText("");
            entityPictureLabel.setText("");          
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
