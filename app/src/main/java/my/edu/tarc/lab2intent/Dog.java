package my.edu.tarc.lab2intent;

public class Dog {

    int image;

    String name, profile;

    public Dog(int image, String name, String profile) {
        this.image = image;
        this.name = name;
        this.profile = profile;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getProfile() {
        return profile;
    }
}
