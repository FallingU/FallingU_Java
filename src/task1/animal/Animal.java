package task1.animal;
/**
 * 动物类实现Comparable接口使得可以通过年龄进行排序
 */
public class Animal implements Comparable<Animal>{
    private String type;
    private String gender;
    private Integer age;
    private Integer id;
    private static int count;

    public Animal(String type, String gender, Integer age) {
        this.type = type;
        this.gender = gender;
        this.age = age;
        id = ++count;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.age-o.getAge();
    }
}
