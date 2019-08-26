/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExpertSystem.view;

// Laczenie z reszta wlasnych klas //

import ExpertSystem.Core;

// Reszta klas //

/**
 *
 * @author Szaman
 */

public class MainWindowFXMLController 
{
    //Referencja do glownej aplikacji.
    private Core mainApp;

    //Referencja glownego pliku do samego siebie.
    public void setMainApp(Core mainApp) 
    {
        this.mainApp = mainApp;
    }
}