package youtube.builders.nivel2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonaTest
{
    @Test
    void should_create_valid_person_when_using_builder_with_required_fields()
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
    void should_throw_exception_when_building_person_without_first_name()
    {
        Persona.Builder builder = Persona.builder()
                .telefono("666-123-456");

        assertThatThrownBy(builder::build)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Nombre obligatorio");
    }

    @Test
    void should_throw_exception_when_building_person_without_last_name()
    {
        Persona.Builder builder = Persona.builder()
                .nombre("Fer")
                .telefono("666-123-456");

        assertThatThrownBy(builder::build)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Apellido obligatorio");
    }
}