package step09.test;

public class Student {
  String userId;
  String password;
  String name;
  String email;
  String tel;
  boolean working;
  int birthYear;
  String school;

  public Student() {}

  public Student(String userId, String password, String name, String tel) {
    this.userId = userId;
    this.password = password;
    this.name = name;
    this.tel = tel;
  }
}
