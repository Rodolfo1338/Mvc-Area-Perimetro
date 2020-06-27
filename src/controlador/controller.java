
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Model;
import vista.Frmvista;


public class controller implements ActionListener{
    
    private Model mod;
    private Frmvista vist;

    public controller(Model mod, Frmvista vist) {
        this.mod = mod;
        this.vist = vist;
        this.vist.btnarea.addActionListener(this);
        this.vist.btnperimetro.addActionListener(this);
    }
    
    public void iniciar(){
        vist.setTitle("Area Y Perimetro MVC");
        vist.setLocationRelativeTo(null);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int tipo=vist.cmbfiguras.getSelectedIndex();
        mod.setBase(Float.parseFloat(vist.txtbase.getText()));
        if(vist.txtaltura.getText().equals("")){
            mod.setAltura(1);
        }else{
           mod.setAltura(Float.parseFloat(vist.txtaltura.getText())); 
        }
        
        if(e.getSource()==vist.btnarea){
            mod.area(tipo);
            vist.txtresultado.setText(mod.getA()+" Centimetros Cuadrados");
            terminator();
        }else if(e.getSource()==vist.btnperimetro){
            mod.perimetro(tipo);
            vist.txtresultado.setText(mod.getP()+" Centimetros");
            terminator();
        }
        
    }

    private void terminator() {
        vist.btnarea.removeActionListener(this);
        vist.btnarea.addActionListener(this);
        vist.btnperimetro.removeActionListener(this);
        vist.btnperimetro.addActionListener(this);
    }
    
}
