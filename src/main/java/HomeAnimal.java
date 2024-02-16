public class HomeAnimal {
    private String animalType;
    private String bark;
    private int age;
    private boolean gender;

    public HomeAnimal(String animalType, String bark, int age, boolean gender) {
        this.animalType = animalType;
        this.bark = bark;
        this.age = age;
        this.gender = gender;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        if (this.bark.isEmpty()) {
            this.bark = bark;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
