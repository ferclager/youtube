package youtube.builders.oscuro1;

// Dark arts level 1, interface chaining, mandatory firstName then lastName
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

    public static NombreStep builder()
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

    public interface NombreStep
    {
        ApellidoStep nombre(String nombre);
    }

    public interface ApellidoStep {
        OptionalStep apellido(String apellido);
    }

    public interface OptionalStep {
        OptionalStep edad(int edad);
        OptionalStep email(String email);
        OptionalStep telefono(String telefono);
        Persona build();
    }

    private static class Builder implements NombreStep, ApellidoStep, OptionalStep
    {
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
        private int edad;

        @Override
        public Builder nombre(String nombre)
        {
            this.nombre = nombre;
            return this;
        }

        @Override
        public Builder apellido(String apellido)
        {
            this.apellido = apellido;
            return this;
        }

        @Override
        public Builder email(String email)
        {
            this.email = email;
            return this;
        }

        @Override
        public Builder telefono(String telefono)
        {
            this.telefono = telefono;
            return this;
        }

        @Override
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
