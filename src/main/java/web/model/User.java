package web.model;




import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Size(min = 2,max = 30, message = "Имя должно быть от 2 до 30 символов")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    @Size(min = 2,max = 30, message = "Фамилия должно быть от 2 до 30 символов")
    private String lastName;

    @Min(value = 0, message = "Возраст должен быть больше чем ноль")
    @Max(value = 120, message = "Возраст должен быть меньше чем 120")
    @Column(name = "age")
    private byte age;

    public User() {
    }

    public User(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
