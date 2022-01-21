
package logica;

import gui.TBAutovalidador;

public class LogicaTBAutovalidador {
    
    //ENVIAR MENSAJE DE VALIDACION AL LABEL
    
    public void validar(TBAutovalidador tba){
        
        switch(tba.getTipoValidacion())
        {
            case("telefono"):
            
              if(tba.getjTextField1().getText().length()!=9)
              {
                tba.getjLabel1().setText("el numero debe ser de 9 digitos");
                tba.correcto=false;
                tba.mensaje="numero erroneo";
              }
              else
              {
                tba.getjLabel1().setText("");
                tba.correcto=true;
              }
            break;
            
            case("cp"):
                
                if(tba.getjTextField1().getText().length()!=5)
                {
                    tba.getjLabel1().setText("el numero debe ser de 5 digitos");
                    tba.correcto=false;
                    tba.mensaje="codigo postal erroneo";
                }
                else
                {
                    tba.getjLabel1().setText("");
                    tba.correcto=true;
                }
            break;
            
        }
    }
    
    
}
