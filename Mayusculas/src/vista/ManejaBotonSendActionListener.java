package vista;

import controlador.ControladorMayusculas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ManejaBotonSendActionListener implements ActionListener
{
    JTextField tf;
    JTextField ta;

    public ManejaBotonSendActionListener(JTextField tf, JTextField ta)
    {
        this.tf=tf;
        this.ta = ta;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("ocurrió una acción:" + tf.getText());
        ControladorMayusculas.transformar(tf.getText(), ta);
    }
}
