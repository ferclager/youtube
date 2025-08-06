package youtube.builders.nivel0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonaTest
{
    @Test
    void should_create_person_with_correct_attributes_when_setting_first_last_name_and_phone()
    {
        Persona persona = new Persona();
        persona.setNombre("Fer");
        persona.setApellido("Clager");
        persona.setTelefono("666-123-456");

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isEqualTo("666-123-456");
    }

    @Test
    void should_create_person_with_null_attributes_when_using_default_constructor()
    {
        Persona persona = new Persona();

        assertThat(persona.getNombre()).isNull(); // should be required!
        assertThat(persona.getApellido()).isNull();
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isNull();
    }

    @Test
    void should_allow_mutation_when_changing_person_attributes()
    {
        Persona persona = new Persona();
        persona.setNombre("Fer");
        persona.setApellido("Clager");

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");

        persona.setNombre("Carmen");
        persona.setApellido("Rodríguez");

        assertThat(persona.getNombre()).isEqualTo("Carmen");
        assertThat(persona.getApellido()).isEqualTo("Rodríguez");
    }
}