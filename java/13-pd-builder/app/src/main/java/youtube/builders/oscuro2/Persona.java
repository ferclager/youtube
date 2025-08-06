package youtube.builders.oscuro2;

// Dark arts level 2, interface chaining with multiple paths
// Either: firstName then lastName, then anything
// Or: email, then anything
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

    public static NombreOEmailStep builder()
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

    public interface NombreOEmailStep
    {
        ApellidoStep nombre(String nombre);

        NombreUOptionalStep email(String email);
    }

    public interface ApellidoStep
    {
        EmailUOptionalStep apellido(String apellido);
    }

    public interface EmailUOptionalStep extends OptionalStep
    {
        OptionalStep email(String email);
    }

    public interface NombreUOptionalStep extends OptionalStep
    {
        ApellidoLuegoOptionalStep nombre(String nombre);
    }

    public interface ApellidoLuegoOptionalStep
    {
        OptionalStep apellido(String apellido);
    }

    public interface OptionalStep
    {
        OptionalStep telefono(String telefono);

        OptionalStep edad(int edad);

        Persona build();
    }

    private static class Builder implements NombreOEmailStep, ApellidoStep, EmailUOptionalStep, NombreUOptionalStep, ApellidoLuegoOptionalStep, OptionalStep
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
