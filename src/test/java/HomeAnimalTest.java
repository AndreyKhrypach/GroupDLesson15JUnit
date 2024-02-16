import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeAnimalTest {
    HomeAnimal animal;

    @BeforeEach
    void setUp() {
        animal = new HomeAnimal("Dog", "Pyke", 4, true);
    }

    @AfterEach
    void tearDown() {
        animal = null;
    }

    @Test
    void getAnimalType() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        assertEquals("Dog", animal.getAnimalType());
    }

    @Test
    void setAnimalType() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        animal.setAnimalType("Super Dog");
        assertEquals("Super Dog", animal.getAnimalType());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Cat", "Dog", "Bird", "Fish"})
    @NullSource
    void getAnimalType(String animalType) {
        animal.setAnimalType(animalType);
        assertEquals(animalType, animal.getAnimalType());
    }

    @Test
    void getBark() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        assertEquals("Pyke", animal.getBark());
    }

    @Test
    void setBark() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        animal.setBark("Sharik");
        assertEquals("Pyke", animal.getBark());
    }

    @Test
    void setBarkIfEmpty() {
        HomeAnimal animalEmptyBark = new HomeAnimal("Dog", "", 4, true);
        animalEmptyBark.setBark("Sharik");
        assertEquals("Sharik", animalEmptyBark.getBark());
    }

    @Test
    void getAge() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        assertEquals(4, animal.getAge());
    }

    @Test
    void setAge() {
        // HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        animal.setAge(5);
        assertEquals(5, animal.getAge());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5})
    void getAge(int animalAge) {
        HomeAnimal animalFoAges = new HomeAnimal("Dog", "Pyke", animalAge, true);
        assertEquals(animalAge, animalFoAges.getAge());
    }

    @Test
    void isGender() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        assertTrue(animal.isGender());
    }

    @Test
    void setGender() {
        //HomeAnimal animal = new HomeAnimal("Dog", "Pyke", 4, true);
        animal.setGender(false);
        assertFalse(animal.isGender());
    }
}