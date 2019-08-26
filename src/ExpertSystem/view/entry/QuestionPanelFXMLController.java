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
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Szaman
 */

public class QuestionPanelFXMLController
{    
    /*          SUWAKI          */
    @FXML
    private Slider slider1;
    @FXML
    private Slider slider2;
    @FXML
    private Slider slider3;
    @FXML
    private Slider slider4;
    @FXML
    private Slider slider5;
    @FXML
    private Slider slider6;
    @FXML
    private Slider slider7;
    @FXML
    private Slider slider8;
    @FXML
    private Slider slider9;
    @FXML
    private Slider slider10;
    
    /*          GUZIKI          */
    
    /*          BACK            */
    @FXML
    private Button backToQuestion1;
    @FXML
    private Button backToQuestion2;
    @FXML
    private Button backToQuestion3;
    @FXML
    private Button backToQuestion4;
    @FXML
    private Button backToQuestion5;
    @FXML
    private Button backToQuestion6;
    @FXML
    private Button backToQuestion7;
    @FXML
    private Button backToQuestion8;
    @FXML
    private Button backToQuestion9;
    
    /*          NEXT            */
    
    @FXML
    private Button goToQuestion2;
    @FXML
    private Button goToQuestion3;
    @FXML
    private Button goToQuestion4;
    @FXML
    private Button goToQuestion5;
    @FXML
    private Button goToQuestion6;
    @FXML
    private Button goToQuestion7;
    @FXML
    private Button goToQuestion8;
    @FXML
    private Button goToQuestion9;
    @FXML
    private Button goToQuestion10;
    @FXML
    private Button proceed;
    
    /*          PYTANIA         */
    @FXML
    private Label question2;
    @FXML
    private Label question3;
    @FXML
    private Label question4;
    @FXML
    private Label question5;
    @FXML
    private Label question6;
    @FXML
    private Label question7;
    @FXML
    private Label question8;
    @FXML
    private Label question9;
    @FXML
    private Label question10;
    
    /*    WARTOSCI ODPOWIEDZI      */
    
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
    
    //Obiekt zrodla.
    private Core mainApp; 
        
    //Inicjalizacja.
    public void setMainApp(Core mainApp) 
    {
        this.mainApp = mainApp;
        
        //2 wiersz z pytaniami.
        slider1.setOpacity(1);
        goToQuestion2.setDisable(false);
        goToQuestion2.setOpacity(1);
        
        //2 wiersz z pytaniami.
        slider2.setOpacity(0);
        question2.setOpacity(0);
        backToQuestion1.setDisable(true);
        backToQuestion1.setOpacity(0);
        goToQuestion3.setDisable(true);
        goToQuestion3.setOpacity(0);
        
        //3 wiersz z pytaniami.
        slider3.setOpacity(0);
        question3.setOpacity(0);
        backToQuestion2.setDisable(true);
        backToQuestion2.setOpacity(0);
        goToQuestion4.setDisable(true);
        goToQuestion4.setOpacity(0);
        
        //4 wiersz z pytaniami.
        slider4.setOpacity(0);
        question4.setOpacity(0);
        backToQuestion3.setDisable(true);
        backToQuestion3.setOpacity(0);
        goToQuestion5.setDisable(true);
        goToQuestion5.setOpacity(0);
        
        //5 wiersz z pytaniami.
        slider5.setOpacity(0);
        question5.setOpacity(0);
        backToQuestion4.setDisable(true);
        backToQuestion4.setOpacity(0);
        goToQuestion6.setDisable(true);
        goToQuestion6.setOpacity(0);
        
        //6 wiersz z pytaniami.
        slider6.setOpacity(0);
        question6.setOpacity(0);
        backToQuestion5.setDisable(true);
        backToQuestion5.setOpacity(0);
        goToQuestion7.setDisable(true);
        goToQuestion7.setOpacity(0);
        
        //7 wiersz z pytaniami.
        slider7.setOpacity(0);
        question7.setOpacity(0);
        backToQuestion6.setDisable(true);
        backToQuestion6.setOpacity(0);
        goToQuestion8.setDisable(true);
        goToQuestion8.setOpacity(0);
        
        //8 wiersz z pytaniami.
        slider8.setOpacity(0);
        question8.setOpacity(0);
        backToQuestion7.setDisable(true);
        backToQuestion7.setOpacity(0);
        goToQuestion9.setDisable(true);
        goToQuestion9.setOpacity(0);
        
        //9 wiersz z pytaniami.
        slider9.setOpacity(0);
        question9.setOpacity(0);
        backToQuestion8.setDisable(true);
        backToQuestion8.setOpacity(0);
        goToQuestion10.setDisable(true);
        goToQuestion10.setOpacity(0);
        
        //10 wiersz z pytaniami.
        slider10.setOpacity(0);
        question10.setOpacity(0);
        backToQuestion9.setDisable(true);
        backToQuestion9.setOpacity(0);
        proceed.setDisable(true);
        proceed.setOpacity(0);
        
    }
    
    /*KOLEJNE PYTANIA (NEXT)*/
    @FXML
    private void handleQuestion2(ActionEvent event)
    {
        handleNextQuestion(goToQuestion2, goToQuestion2, backToQuestion1, goToQuestion3, slider1, slider2, question2);
        answer1 = (int)slider1.getValue();
    }
    
    @FXML
    private void handleQuestion3(ActionEvent event)
    {
        handleNextQuestion(backToQuestion1, goToQuestion3, backToQuestion2, goToQuestion4, slider2, slider3, question3);
        answer2 = (int)slider2.getValue();
    }
    
    @FXML
    private void handleQuestion4(ActionEvent event)
    {
        handleNextQuestion(backToQuestion2, goToQuestion4, backToQuestion3, goToQuestion5, slider3, slider4, question4);
        answer3 = (int)slider3.getValue();
    }
    
    @FXML
    private void handleQuestion5(ActionEvent event)
    {
        handleNextQuestion(backToQuestion3, goToQuestion5, backToQuestion4, goToQuestion6, slider4, slider5, question5);
        answer4 = (int)slider4.getValue();
    }
        @FXML
    private void handleQuestion6(ActionEvent event)
    {
        handleNextQuestion(backToQuestion4, goToQuestion6, backToQuestion5, goToQuestion7, slider5, slider6, question6);
        answer5 = (int)slider5.getValue();
    }
    
    @FXML
    private void handleQuestion7(ActionEvent event)
    {
        handleNextQuestion(backToQuestion5, goToQuestion7, backToQuestion6, goToQuestion8, slider6, slider7, question7);
        answer6 = (int)slider6.getValue();
    }
    
    @FXML
    private void handleQuestion8(ActionEvent event)
    {
        handleNextQuestion(backToQuestion6, goToQuestion8, backToQuestion7, goToQuestion9, slider7, slider8, question8);
        answer7 = (int)slider7.getValue();
    }
    
    @FXML
    private void handleQuestion9(ActionEvent event)
    {
        handleNextQuestion(backToQuestion7, goToQuestion9, backToQuestion8, goToQuestion10, slider8, slider9, question9);
        answer8 = (int)slider8.getValue();
    }
    
    @FXML
    private void handleQuestion10(ActionEvent event)
    {
        handleNextQuestion(backToQuestion8, goToQuestion10, backToQuestion9, proceed, slider9, slider10, question10);
        answer9 = (int)slider9.getValue();
    }
    
    @FXML
    private void handleProceed(ActionEvent event)
    {
        answer10 = (int)slider10.getValue();
        System.out.println(answer1 + " " + answer2 + " " + answer3 + " " + answer4 + " " + answer5 + " " + answer6 + " " + answer7 + " " + answer8 + " " + answer9 + " " + answer10);
        mainApp.showResult(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10);
    }
    
    /*      POPRZEDNIE PYTANIA (PREV)       */
    
    @FXML
    private void backToQuestion1(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion1, goToQuestion2, backToQuestion1, goToQuestion3, slider2, slider1, question2);
    }
    
    @FXML
    private void backToQuestion2(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion1, goToQuestion3, backToQuestion2, goToQuestion4, slider3, slider2, question3);
    }
    
    @FXML
    private void backToQuestion3(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion2, goToQuestion4, backToQuestion3, goToQuestion5, slider4, slider3, question4);
    }
    
    @FXML
    private void backToQuestion4(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion3, goToQuestion5, backToQuestion4, goToQuestion6, slider5, slider4, question5);
    }
    
    @FXML
    private void backToQuestion5(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion4, goToQuestion6, backToQuestion5, goToQuestion7, slider6, slider5, question6);
    }
    
    @FXML
    private void backToQuestion6(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion5, goToQuestion7, backToQuestion6, goToQuestion8, slider7, slider6, question7);
    }
    
    @FXML
    private void backToQuestion7(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion6, goToQuestion8, backToQuestion7, goToQuestion9, slider8, slider7, question8);
    }
    
    @FXML
    private void backToQuestion8(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion7, goToQuestion9, backToQuestion8, goToQuestion10, slider9, slider8, question9);
    }
    
    @FXML
    private void backToQuestion9(ActionEvent event)
    {
        
        handlePreviousQuestion(backToQuestion8, goToQuestion10, backToQuestion9, proceed, slider10, slider9, question10);
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
    
    private void handleNextQuestion(Button prevFromPrevQuestion, Button nextFromPrevQuestion, Button backToPrevQuestion, Button actualNextQuestionButton, Slider actualSlider, Slider nextSlider, Label nextQuestion)
    {
        actualSlider.setDisable(true);                  //Blokowanie i odblokowywanie odpowiednich 
        backToPrevQuestion.setDisable(false);           //Guzikow w celu zabezpieczenia danych
        actualNextQuestionButton.setDisable(false);     //I zapewnienia kolejnosci wyborow usera
        nextFromPrevQuestion.setDisable(true);          //
        prevFromPrevQuestion.setDisable(true);          //
        FadeTransition showNextSlider = new FadeTransition(Duration.millis(500), nextSlider);   //Event pozwalajacy na 'pojawienie sie' odpowiednich
        showNextSlider.setFromValue(0.0);                                                       //Ukrytych (opacity: 0) elementow.
        showNextSlider.setToValue(1.0);                                                         //
        FadeTransition showNextQuestion = new FadeTransition(Duration.millis(500), nextQuestion);
        showNextQuestion.setFromValue(0.0);
        showNextQuestion.setToValue(1.0);
        FadeTransition showPrevButton = new FadeTransition(Duration.millis(500), backToPrevQuestion);
        showPrevButton.setFromValue(0.0);
        showPrevButton.setToValue(1.0);
        FadeTransition showNextButton = new FadeTransition(Duration.millis(500), actualNextQuestionButton);
        showNextButton.setFromValue(0.0);
        showNextButton.setToValue(1.0);
        //Sekwencja pozwala na synchronizacje pojawiajacych sie elementow.
        ParallelTransition showSequence = new ParallelTransition(showNextSlider, showNextQuestion, showPrevButton, showNextButton); //Rownorzedne znikanie.
        showSequence.play();
    }
    
    private void handlePreviousQuestion(Button prevFromPrevQuestion, Button nextFromPrevQuestion, Button backToPrevQuestion, Button actualNextQuestionButton, Slider actualSlider, Slider previousSlider, Label actualQuestion)
    {
        previousSlider.setDisable(false);
        actualSlider.setValue(1.0);
        nextFromPrevQuestion.setDisable(false);
        prevFromPrevQuestion.setDisable(false);
        backToPrevQuestion.setDisable(true);
        actualNextQuestionButton.setDisable(true);
        FadeTransition fadeActualSlider = new FadeTransition(Duration.millis(500), actualSlider);
        fadeActualSlider.setFromValue(1.0);
        fadeActualSlider.setToValue(0.0);
        FadeTransition fadeActualQuestion = new FadeTransition(Duration.millis(500), actualQuestion);
        fadeActualQuestion.setFromValue(1.0);
        fadeActualQuestion.setToValue(0.0);
        FadeTransition fadeActualPrevButton = new FadeTransition(Duration.millis(500), backToPrevQuestion);
        fadeActualPrevButton.setFromValue(1.0);
        fadeActualPrevButton.setToValue(0.0);
        FadeTransition fadeActualNextButton = new FadeTransition(Duration.millis(500), actualNextQuestionButton);
        fadeActualNextButton.setFromValue(1.0);
        fadeActualNextButton.setToValue(0.0);
        
        ParallelTransition fadeSequence = new ParallelTransition(fadeActualSlider, fadeActualQuestion, fadeActualPrevButton, fadeActualNextButton); //Rownorzedne znikanie.
        fadeSequence.play();
    }
}
