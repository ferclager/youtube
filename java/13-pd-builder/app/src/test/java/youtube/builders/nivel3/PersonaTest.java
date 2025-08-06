package youtube.builders.nivel3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonaTest
{
    @Test
    void should_create_person_with_correct_attributes_when_using_builder_with_required_parameters()
    {
        Persona persona = Persona.builder("Fer", "Clager")
                .telefono("666-123-456")
                .build();

        assertThat(persona.getNombre()).isEqualTo("Fer");
        assertThat(persona.getApellido()).isEqualTo("Clager");
        assertThat(persona.getEmail()).isNull();
        assertThat(persona.getTelefono()).isEqualTo("666-123-456");
    }
}