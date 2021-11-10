package labs_examples.input_output.labs;

public class FamilyMember {

    private String name;
    private String rank;
    private String favColor;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "family_member{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", favColor='" + favColor + '\'' +
                ", age=" + age +
                '}';
    }
}
