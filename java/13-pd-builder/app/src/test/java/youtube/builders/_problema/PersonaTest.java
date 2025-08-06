package youtube.builders._problema;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonaTest
{
    @Test
    void should_create_person_with_correct_attributes_when_given_just_first_and_last_name()
    {
        Persona persona = new Persona("Fer", "Clager");

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isNull();
    }

    @Test
    void should_set_phone_as_email_when_passing_phone_into_email_field()
    {
        Persona persona = new Persona("Fer", "Clager", "666-123-456"); // oops, wrong constructor

        assertThat(persona.getEmail()).isEqualTo("666-123-456");
        assertThat(persona.getTelefono()).isNull();
    }

    @Test
    void should_create_person_with_phone_when_given_first_last_name_and_phone()
    {
        Persona persona = new Persona("Fer", "Clager", null, "666-123-456");

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isEqualTo("666-123-456");
    }

    @Test
    void should_create_person_with_age_when_given_first_middle_name_and_age()
    {
        Persona persona = new Persona("María", "García-López", null, null, 28);

        assertThat(persona.getNombre()).isEqualTo("María");
        assertThat(persona.getApellido()).isEqualTo("García-López");
        assertThat(persona.getEdad()).isEqualTo(28);
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isNull();
    }
}