package modelo;


public class Persona
{
    protected String nombre;
    protected String apellido;
    protected String carnet;
    protected String telefono;

    public Persona(String aNombre, String aApellido, String aCarnet, String aTelefono)
    {
        nombre = aNombre;
        apellido = aApellido;
        carnet = aCarnet;
        telefono = aTelefono;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getCarnet()
    {
        return carnet;
    }

    public String getTelefono()
    {
        return telefono;
    }

}
