package youtube.builders.nivel1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonaTest
{
    @Test
    void should_create_person_with_correct_attributes_when_using_builder_with_all_data()
    {
        Persona persona = Persona.builder()
                .nombre("Fer")
                .apellido("Clager")
                .telefono("666-123-456")
                .build();

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isEqualTo("666-123-456");
    }

    @Test
    void should_create_person_with_null_name_when_using_builder_without_name()
    {
        Persona persona = Persona.builder()
                .telefono("666-123-456")
                .build();

        assertThat(persona.getNombre()).isNull(); // Should be required
        assertThat(persona.getApellido()).isNull(); // Should be required
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isEqualTo("666-123-456");
    }
}