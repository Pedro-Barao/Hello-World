/*

Nome: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barao
Data: 25/09/2025
Objetivo: Fazer uma calculadora

 */


package projetocalculadora;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ProjetoCalculadora extends Application {
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        
        Parent root = FXMLLoader.load(
                
            getClass().getResource("/projetocalculadora/FXMLDocument.fxml")
                
        );

        
        stage.setScene(new Scene(root, 530, 430));
        stage.setTitle("Calculadora");
        stage.show();
        
    }
    
    
    public static void main(String[] args) 
    { 
        
        launch(args); 
        
    }
    
}

