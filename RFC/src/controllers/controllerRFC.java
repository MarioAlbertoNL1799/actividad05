/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelRFC;
import views.ViewRFC;
import extras.DataValidation;

public class controllerRFC {
    ModelRFC modelRFC;
    ViewRFC viewRFC;
    DataValidation dataValidation = new DataValidation();
    
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== viewRFC.jb_obtener)
                jb_obtener_actionPerformed();
        }
    };
    
    public void jb_obtener_actionPerformed(){
        modelRFC.setAnio(dataValidation.string2Int(viewRFC.jtf_anio.getText()));
        String numero_dia = (String) viewRFC.jcb_dia.getSelectedItem();
        modelRFC.setDia(Integer.parseInt(numero_dia));
        modelRFC.setMes(viewRFC.jcb_mes.getSelectedIndex());
        modelRFC.setNombre(viewRFC.jtf_nombre.getText());
        modelRFC.setApePat(viewRFC.jtf_apepat.getText());
        modelRFC.setApeMat(viewRFC.jtf_apemat.getText());
        viewRFC.resultado.setText("Tu RFC es "+ modelRFC.Siglas()+ modelRFC.numeros());
    }

    public controllerRFC(ModelRFC modelRFC, ViewRFC viewRFC) {
        this.modelRFC = modelRFC;
        this.viewRFC = viewRFC;
        this.viewRFC.jb_obtener.addActionListener(al);
        initComponents();
    }
    
    public void initComponents(){
        this.viewRFC.setVisible(true);
    }
}
