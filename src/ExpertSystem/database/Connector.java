/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExpertSystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
 
import ExpertSystem.model.KnowledgeEntity;
import javafx.collections.ObservableList;
 
public class Connector
{
    public static final String databaseDriver = "org.sqlite.JDBC";
    public static final String databaseURL = "jdbc:sqlite:src/ExpertSystem/database/knowledgeBase.db";
 
    private Connection connection;
    private Statement statement;
 
    public Connector() 
    {
        try 
        {
            Class.forName(Connector.databaseDriver);
        } 
        catch (ClassNotFoundException e) 
        {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
 
        try 
        {
            connection = DriverManager.getConnection(databaseURL);
            statement = connection.createStatement();
        } 
        catch (SQLException e) 
        {
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
 
        createTables();
    }
 
    public boolean createTables()  
    {
        String createTable = 
                "CREATE TABLE IF NOT EXISTS knowledgeTable "
                + "(entityID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "stat1 VARCHAR(5), "
                + "stat2 VARCHAR(5), "
                + "stat3 VARCHAR(5), "
                + "stat4 VARCHAR(5), "
                + "stat5 VARCHAR(5), "
                + "stat6 VARCHAR(5), "
                + "stat7 VARCHAR(5), "
                + "stat8 VARCHAR(5), "
                + "stat9 VARCHAR(5), "
                + "stat10 VARCHAR(5), "
                + "entityName VARCHAR(100), "
                + "entityDescription VARCHAR(1000), "
                + "entityPicture VARCHAR(200))";
        
        try 
        {
            statement.execute(createTable);
        } 
        catch (SQLException e) 
        {
            System.err.println("Blad przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    public boolean insertEntity(String stat1,
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
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO knowledgeTable VALUES "
                    + "(NULL, " //autoincrement
                    + "?, "     //stat1
                    + "?, "     //stat2
                    + "?, "     //stat3
                    + "?, "     //stat4
                    + "?, "     //stat5
                    + "?, "     //stat6
                    + "?, "     //stat7
                    + "?, "     //stat8
                    + "?, "     //stat9
                    + "?, "     //stat10
                    + "?, "     //entityName
                    + "?, "     //entityDescription
                    + "?);");   //entityPicture
            preparedStatement.setString(1, stat1);
            preparedStatement.setString(2, stat2);
            preparedStatement.setString(3, stat3);
            preparedStatement.setString(4, stat4);
            preparedStatement.setString(5, stat5);
            preparedStatement.setString(6, stat6);
            preparedStatement.setString(7, stat7);
            preparedStatement.setString(8, stat8);
            preparedStatement.setString(9, stat9);
            preparedStatement.setString(10, stat10);
            preparedStatement.setString(11, entityName);
            preparedStatement.setString(12, entityDescription);
            preparedStatement.setString(13, entityPicture);
            preparedStatement.execute();
        } 
        catch (SQLException e) 
        {
            System.err.println("Blad przy wstawianiu obiektu");
            e.printStackTrace();
            return false;
        }
        return true;
    }
 
    public List<KnowledgeEntity> selectAllKnowledgeEntities(ObservableList entities) 
    {
        try 
        {
            ResultSet result = statement.executeQuery("SELECT * FROM knowledgeTable");
            String id;
            String stat1;
            String stat2;
            String stat3;
            String stat4;
            String stat5;
            String stat6;
            String stat7;
            String stat8;
            String stat9;
            String stat10;
            String entityName;
            String entityDescription;
            String entityPicture;
            while(result.next()) 
            {
                id = result.getString("entityID");
                
                stat1 = result.getString("stat1");
                stat2 = result.getString("stat2");
                stat3 = result.getString("stat3");
                stat4 = result.getString("stat4");
                stat5 = result.getString("stat5");
                stat6 = result.getString("stat6");
                stat7 = result.getString("stat7");
                stat8 = result.getString("stat8");
                stat9 = result.getString("stat9");
                stat10 = result.getString("stat10");
                
                entityName = result.getString("entityName");
                entityDescription = result.getString("entityDescription");
                entityPicture = result.getString("entityPicture");         
                
                entities.add(new KnowledgeEntity(id,
                                                 stat1,
                                                 stat2,
                                                 stat3,
                                                 stat4,
                                                 stat5,
                                                 stat6,
                                                 stat7,
                                                 stat8,
                                                 stat9,
                                                 stat10,
                                                 entityName,
                                                 entityDescription,
                                                 entityPicture));
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
        return entities;
    }
    
    public KnowledgeEntity selectDetailsOfBestEntity(KnowledgeEntity entity, int index) 
    {
        try 
        {
            ResultSet result = statement.executeQuery("SELECT * FROM knowledgeTable where entityID = " + index);
            while(result.next()) 
            {     
                entity.setEntityID(result.getString("entityID"));
                entity.setStat1(result.getString("stat1"));
                entity.setStat2(result.getString("stat2"));
                entity.setStat3(result.getString("stat3"));
                entity.setStat4(result.getString("stat4"));
                entity.setStat5(result.getString("stat5"));
                entity.setStat6(result.getString("stat6"));
                entity.setStat7(result.getString("stat7"));
                entity.setStat8(result.getString("stat8"));
                entity.setStat9(result.getString("stat9"));
                entity.setStat10(result.getString("stat10"));
                entity.setEntityName(result.getString("entityName"));
                entity.setEntityDescription(result.getString("entityDescription"));
                entity.setEntityPicture(result.getString("entityPicture"));
                
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
        return entity;
    }
    
    public int parseKnowledge(int answer1, int answer2, int answer3, int answer4, int answer5, int answer6, int answer7, int answer8, int answer9, int answer10) 
    {
        int mostAccurateEntityID = 0;
        try 
        {
            ResultSet result = statement.executeQuery("SELECT stat1, stat2, stat3, stat4, stat5, stat6, stat7, stat8, stat9, stat10, entityID FROM knowledgeTable");
            
            String name = "";
            int overallResult;
            int bestResult = -1;
            int id;
            int stat1;
            int stat2;
            int stat3;
            int stat4;
            int stat5;
            int stat6;
            int stat7;
            int stat8;
            int stat9;
            int stat10;
            
            while(result.next()) 
            {
                id = result.getInt("entityID");
                
                stat1 = result.getInt("stat1");
                stat2 = result.getInt("stat2");
                stat3 = result.getInt("stat3");
                stat4 = result.getInt("stat4");
                stat5 = result.getInt("stat5");
                stat6 = result.getInt("stat6");
                stat7 = result.getInt("stat7");
                stat8 = result.getInt("stat8");
                stat9 = result.getInt("stat9");
                stat10 = result.getInt("stat10");
                
                System.out.println(stat1);
                
                overallResult = Math.abs(answer1 - stat1) 
                              + Math.abs(answer2 - stat2)
                              + Math.abs(answer3 - stat3)
                              + Math.abs(answer4 - stat4)
                              + Math.abs(answer5 - stat5)
                              + Math.abs(answer6 - stat6)
                              + Math.abs(answer7 - stat7)
                              + Math.abs(answer8 - stat8)
                              + Math.abs(answer9 - stat9)
                              + Math.abs(answer10 - stat10);
                
                if(bestResult == -1)
                {
                    bestResult = overallResult;
                }
                else
                {
                    if(overallResult < bestResult)
                    {
                        bestResult = overallResult;
                        mostAccurateEntityID = id;
                    }
                }
                
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return 0;
        }
        return mostAccurateEntityID;
    }
 
    public void closeConnection() 
    {
        try 
        {
            connection.close();
        } 
        catch (SQLException e) 
        {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }
}