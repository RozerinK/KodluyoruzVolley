package volley.com.kodluyoruzvolley.viewmodel;

/**
 * Created by Rozerin on 6.05.2017.
 */

public class InfoViewModel {
    private String name;
    private int age;

  //  @SerializedName("E-mail");
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
