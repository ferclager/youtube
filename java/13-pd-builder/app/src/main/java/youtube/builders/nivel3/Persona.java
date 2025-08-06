package youtube.builders.nivel3;

// Level 3: required fields
public class Persona
{
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final int edad;

    private Persona(Builder builder)
    {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.edad = builder.edad;
    }

    public static Builder builder(String firstName, String lastName)
    {
        return new Builder(firstName, lastName);
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

    public static class Builder
    {
        private final String nombre;
        private final String apellido;
        private String email;
        private String telefono;
        private int edad;

        public Builder(String nombre, String apellido)
        {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public Builder email(String email)
        {
            this.email = email;
            return this;
        }

        public Builder telefono(String telefono)
        {
            this.telefono = telefono;
            return this;
        }

        public Builder edad(int edad)
        {
            this.edad = edad;
            return this;
        }

        public Persona build()
        {
            return new Persona(this);
        }
    }
}
