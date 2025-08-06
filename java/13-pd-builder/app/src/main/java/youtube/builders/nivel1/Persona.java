package youtube.builders.nivel1;

// Level 1: basic builder
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

    public static Builder builder()
    {
        return new Builder();
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

    public int getEdad()
    {
        return edad;
    }

    public static class Builder
    {
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private int edad;

        public Builder nombre(String nombre)
        {
            this.nombre = nombre;
            return this;
        }

        public Builder apellido(String apellido)
        {
            this.apellido = apellido;
            return this;
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
