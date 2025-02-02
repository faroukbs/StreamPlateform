/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.nebulagaming.views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author msi
 */
public class MenuFarahController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane AP;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadPage("PostulerCandidature");
    }    
    
    private void loadPage(String page){          
        Parent root = null;
        try {
        root = FXMLLoader.load(getClass().getResource(page+".fxml"));

        } catch (Exception ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE,null,ex);
        }
        bp.setCenter(root);
    }

    @FXML
    private void domaininter(ActionEvent event) {
    loadPage("GererDomaine");
    }

    @FXML
    private void InterOffre(ActionEvent event) {
    loadPage("AjouterOffre");
        }

    @FXML
    private void interPostulerCandidature(ActionEvent event) {
    loadPage("PostulerCandidature");
    }

    @FXML
    private void interMesCandidature(ActionEvent event) {
    loadPage("MesCandidatures");
    }

    


}
