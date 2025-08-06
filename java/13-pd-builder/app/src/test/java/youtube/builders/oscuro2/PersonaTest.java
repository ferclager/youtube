package youtube.builders.oscuro2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonaTest
{
    @Test
    void should_create_person_with_correct_attributes_when_using_builder_with_name_and_phone()
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
        assertThat(persona.getEdad()).isEqualTo(0);
    }

    @Test
    void should_create_person_with_email_when_using_builder_with_only_email()
    {
        Persona persona = Persona.builder()
                .email("fer.clager@email.com")
                .build();

        assertThat(persona.getNombre()).isNull();
        assertThat(persona.getApellido()).isNull();
        assertThat(persona.getEmail()).isEqualTo("fer.clager@email.com");
        assertThat(persona.getTelefono()).isNull();
        assertThat(persona.getEdad()).isEqualTo(0);
    }

//    @Test
//    void should_not_compile_when_trying_to_create_person_without_starting_path()
//    {
//        Persona persona = Persona.builder()
//                .telefono("666-123-456") // doesn't compile
//                .build();
//    }
}