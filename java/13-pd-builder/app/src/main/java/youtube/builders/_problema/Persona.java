package youtube.builders._problema;

public class Persona
{
    private final String nombre;
    private final String apellido;
    private final String email; // Optional
    private final String telefono;
    private final int edad;// Optional

    public Persona(String nombre, String apellido, String email, String telefono, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido)
    {
        this(nombre, apellido, null, null, 0);
    }

    public Persona(String nombre, String apellido, String email)
    {
        this(nombre, apellido, email, null, 0);
    }

    public Persona(String nombre, String apellido, String email, String telefono)
    {
        this(nombre, apellido, email, telefono, 0);
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getEmail()
    {
        return email;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }
}