package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import modelo.ListaDePersonas;
import modelo.Persona;

import modeloDeAplicacion.PersonasTableModel;

public class PersonasTableFrame extends JFrame
{
    protected JTable table;
    protected ListaDePersonas listaDePersonas;

    public void MVCTestFrame()
    {
        setSize(400, 300);
        setTitle("PersonasTableModel");
        initData();
        initUI();
        setVisible(true);
    }

    protected void initData()
    {
        listaDePersonas = new ListaDePersonas();
        //Datos ejemplo
        listaDePersonas.agregarPersona(new Persona("Julio", "Perez", "3949345 PT", "4295453"));
        listaDePersonas.agregarPersona(new Persona("Alfredo", "Lopez", "3554352 LP", "591-4-4481353"));
        listaDePersonas.agregarPersona(new Persona("Ricardo", "Loiza", "4002321 CB", "591-2-6227587"));
        listaDePersonas.agregarPersona(new Persona("Elena", "Mendoza", "3443432 CB", "591-4-4443211"));
    }

    protected void initUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(5, 5));
        PersonasTableModel tableModel;
        tableModel = new PersonasTableModel(listaDePersonas);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        getContentPane().add(tableScrollPane, BorderLayout.CENTER);
    }

}
