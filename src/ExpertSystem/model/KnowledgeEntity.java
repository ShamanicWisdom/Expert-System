/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpertSystem.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Szaman
 */
public class KnowledgeEntity 
{
    /*      Dane obiektu     */
    
    private final StringProperty entityID;
    private final StringProperty stat1;
    private final StringProperty stat2;
    private final StringProperty stat3;
    private final StringProperty stat4;
    private final StringProperty stat5;
    private final StringProperty stat6;
    private final StringProperty stat7;
    private final StringProperty stat8;
    private final StringProperty stat9;
    private final StringProperty stat10;
    
    private final StringProperty entityName;
    private final StringProperty entityDescription;
    private final StringProperty entityPicture;
 
    /*      GETTERY      */
    
    public String getEntityID() 
    {
        return entityID.get();
    }
    
    public String getStat1() 
    {
        return stat1.get();
    }
    
    public String getStat2() 
    {
        return stat2.get();
    }
        
    public String getStat3() 
    {
        return stat3.get();
    }
            
    public String getStat4() 
    {
        return stat4.get();
    }
                
    public String getStat5() 
    {
        return stat5.get();
    }
    
    public String getStat6() 
    {
        return stat6.get();
    }
    
    public String getStat7() 
    {
        return stat7.get();
    }
    
    public String getStat8() 
    {
        return stat8.get();
    }
    
    public String getStat9() 
    {
        return stat9.get();
    }
    
    public String getStat10() 
    {
        return stat10.get();
    }
    
    public String getEntityName() 
    {
        return entityName.get();
    }
    
    public String getEntityDescription() 
    {
        return entityDescription.get();
    }
    
    public String getEntityPicture() 
    {
        return entityPicture.get();
    }
    
    public void setFirstName(String entityID) 
    {
        this.entityID.set(entityID);
    }
    
    /*      SETTERY      */
    
    public void setEntityID(String entityID) 
    {
        this.entityID.set(entityID);
    }
    
    public void setStat1(String stat1) 
    {
        this.stat1.set(stat1);
    }
    
    public void setStat2(String stat2) 
    {
        this.stat2.set(stat2);
    }
    
    public void setStat3(String stat3) 
    {
        this.stat3.set(stat3);
    }
    
    public void setStat4(String stat4) 
    {
        this.stat4.set(stat4);
    }
    
    public void setStat5(String stat5) 
    {
        this.stat5.set(stat5);
    }
    
    public void setStat6(String stat6) 
    {
        this.stat6.set(stat6);
    }
    
    public void setStat7(String stat7) 
    {
        this.stat7.set(stat7);
    }
    
    public void setStat8(String stat8) 
    {
        this.stat8.set(stat8);
    }
    
    public void setStat9(String stat9) 
    {
        this.stat9.set(stat9);
    }
    
    public void setStat10(String stat10) 
    {
        this.stat10.set(stat10);
    }
    
    public void setEntityName(String entityName) 
    {
        this.entityName.set(entityName);
    }
    
    public void setEntityDescription(String entityDescription)
    {
        this.entityDescription.set(entityDescription);
    }
        
    public void setEntityPicture(String entityPicture) 
    {
        this.entityPicture.set(entityPicture);
    }
    
    /*      Property        */
    
    public StringProperty entityIDProperty() 
    {
        return entityID;
    }
    
    public StringProperty stat1Property() 
    {
        return stat1;
    }
    
    public StringProperty stat2Property() 
    {
        return stat2;
    }
    
    public StringProperty stat3Property() 
    {
        return stat3;
    }
    
    public StringProperty stat4Property() 
    {
        return stat4;
    }
    
    public StringProperty stat5Property() 
    {
        return stat5;
    }
    
    public StringProperty stat6Property() 
    {
        return stat6;
    }
    
    public StringProperty stat7Property() 
    {
        return stat7;
    }
    
    public StringProperty stat8Property() 
    {
        return stat8;
    }
    
    public StringProperty stat9Property() 
    {
        return stat9;
    }
    
    public StringProperty stat10Property() 
    {
        return stat10;
    }
    
    public StringProperty entityNameProperty() 
    {
        return entityName;
    }
    
    public StringProperty entityDescriptionProperty() 
    {
        return entityDescription;
    }
    
    public StringProperty entityPictureProperty() 
    {
        return entityPicture;
    }
 
    /*      Konstruktory obiektu     */
    
    public KnowledgeEntity() 
    {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    public KnowledgeEntity(String entityID,
                           String stat1, 
                           String stat2, 
                           String stat3, 
                           String stat4, 
                           String stat5, 
                           String stat6, 
                           String stat7, 
                           String stat8, 
                           String stat9, 
                           String stat10, 
                           String entityName, 
                           String entityDescription,
                           String entityPicture) 
    {
        this.entityID = new SimpleStringProperty(entityID);
        this.stat1 = new SimpleStringProperty(stat1);
        this.stat2 = new SimpleStringProperty(stat2);
        this.stat3 = new SimpleStringProperty(stat3);
        this.stat4 = new SimpleStringProperty(stat4);
        this.stat5 = new SimpleStringProperty(stat5);
        this.stat6 = new SimpleStringProperty(stat6);
        this.stat7 = new SimpleStringProperty(stat7);
        this.stat8 = new SimpleStringProperty(stat8);
        this.stat9 = new SimpleStringProperty(stat9);
        this.stat10 = new SimpleStringProperty(stat10);
        this.entityName = new SimpleStringProperty(entityName);
        this.entityDescription = new SimpleStringProperty(entityDescription);
        this.entityPicture = new SimpleStringProperty(entityPicture);
    }
}