package step07.ex09;

public class Member {
  String name;
  String email;
  String password;
  java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
  String str = today.toString();
  String signedUpDate = str;
  
  public Member() {}
  
  public Member(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }
}
