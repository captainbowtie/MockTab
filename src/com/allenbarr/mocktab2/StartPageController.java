/*
 * Copyright (C) 2015 captainbowtie
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.allenbarr.mocktab2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author captainbowtie
 */
public class StartPageController implements Initializable {
    
    @FXML
    private TextField tournamentNameField;
    @FXML
    private TextField numberTeamsField;
    @FXML
    private AnchorPane rootPane;
    
    @FXML
    private void handleLoadButton(ActionEvent event) {
        //TODO: write loading methods (lolz)
    }
    @FXML
    private void handleContinueButton(ActionEvent event){
        if(validateInputs()){
            final String tournamentName=tournamentNameField.getText();
            final Integer numberTeams=Integer.parseInt(numberTeamsField.getText());
            tournamentNameField.getScene().getWindow().hide();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    private boolean validateInputs(){
        //TODO: write input validation
        return true;
    }
}
