package AboutMe;

public class AboutMe {
  final String Name;
  String School;
  int Age;

  public AboutMe(String name, String school, int age) {
    this.Name = name;
    this.School = school;
    this.Age = age;
  }

  public String getName() {
    return this.Name;
  }

  public String getSchool() {
    return this.School;
  }

  public int getAge() {
    return this.Age;
  }
}