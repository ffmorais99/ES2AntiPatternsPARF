import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    public void test1(){
        Animal animal = new Animal("batman", "mamifero",3);
        animal.setNome("Popeye");
        assertEquals("Popeye", animal.getNome());
    }

    @Test
    public void test2(){
        Animal animal = new Animal("batman", "mamifero",3);
        animal.setClasse("reptil");
        assertEquals("reptil", animal.getClasse());
    }

    @Test
    public void test3(){
        Animal animal = new Animal("batman", "mamifero",3);
        animal.setIdade(10);
        assertEquals(10, animal.getIdade());
    }

}

