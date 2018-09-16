/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelRFC;
import views.ViewRFC;
import controllers.controllerRFC;

public class MAIN {
    public static void main(String[] args) {
        ModelRFC modelRFC = new ModelRFC();
        ViewRFC viewRFC = new ViewRFC();
        controllerRFC controllersRFC = new controllerRFC(modelRFC,viewRFC);
    }
}
