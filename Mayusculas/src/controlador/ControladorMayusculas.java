package controlador;

import javax.swing.JTextField;

import modelo.Mayuscula;

public class ControladorMayusculas
{
    public ControladorMayusculas()
    {
        super();
    }
    public static void transformar(String texto, JTextField area)
    {
        String str = Mayuscula.transformar(texto);
        area.setText(str);
        System.out.println(str);
    }
}
