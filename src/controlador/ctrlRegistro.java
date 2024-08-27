package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.frmRegistro;

public class ctrlRegistro implements MouseListener{
    
    //1. mando a llamar a las otras capas
    frmRegistro vista;
    
    
    //2.constructor
    public ctrlRegistro(frmRegistro Vista){
        //solo pido la vista
        this.vista = Vista;
        
        vista.btnRegistrar.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()== vista.btnRegistrar) {
            //validamos los campos
            //1-campos vacios
            
            if(vista.txtNombre.getText().isEmpty()){
                //esto es un alert
                JOptionPane.showMessageDialog(vista, "Llene todos los campos");
            }
            
            //validacion del correo(el "!" es para decir "si no")
            if(!vista.txtCorreo.getText().contains("@") || !vista.txtCorreo.getText().contains(".com")){
                JOptionPane.showMessageDialog(vista, "Correo no válido");
            }
            
            
            
            //validar longitud de contraseña
            if(vista.txtContraseña.getText().length()< 6){
                JOptionPane.showMessageDialog(vista, "La contraseña es muy corta");
            }
            
            //edad
            try {
                int edadNumerica = Integer.parseInt(vista.txtEdad.getText());
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Ingrese números");
                
               
            }
            
            
            
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
