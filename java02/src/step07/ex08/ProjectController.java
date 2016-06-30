
package step07.ex08;

import java.util.*;

public class ProjectController {
  static Scanner keyScanner;
  Project[] projects = new Project[100];
  int i = 0;
  String projectName;

  public ProjectController() {}

  public ProjectController(String projectName) {
    this.projectName = projectName;
  }

  public  void service() {
    String command;

    label1: while (true) {
      System.out.printf("메인/%s> ", projectName);
      command = keyScanner.nextLine();

      switch (command) {
      case "main":
        break label1;
      case "add":
        this.add();
        break;
      case "list":
        this.list();
        break;
      case "detail":
        this.detail();
        break;
      case "update":
        this.update();
        break;
      case "delete":
        this.delete();
        break;
      default:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
  }

  void list() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%d, %s, %s, %s, %s, %d\n",
          x, this.projects[x].title, this.projects[x].description,
          this.projects[x].startDate, this.projects[x].endDate, this.projects[x].status);
    }
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if(answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

 
  void add() {

    Project project = new Project();
    System.out.print("제목? ");
    project.title = keyScanner.nextLine();
    System.out.print("설명? ");
    project.description = keyScanner.nextLine();
    System.out.print("시작일? ");
    project.startDate = keyScanner.nextLine();
    System.out.print("마감일? ");
    project.endDate = keyScanner.nextLine();
    this.projects[this.i++] = project;
  }
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }

    Project project = this.projects[no];
    System.out.printf("제목: %s\n", project.title);
    System.out.printf("설명: %s\n", project.description);
    System.out.printf("시작일: %s\n", project.startDate);
    System.out.printf("마감일: %s\n", project.endDate);
    System.out.printf("진행상태: %d\n", project.status);
  }
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    Project project = this.projects[no];
    System.out.printf("제목(%s)?", project.title);
    project.title = keyScanner.nextLine();
    System.out.printf("설명(%s)? ", project.description);
    project.description = keyScanner.nextLine();
    System.out.printf("진행상태(%d)?", project.status);
    project.status = Integer.parseInt(keyScanner.nextLine());
  }

  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    if (no < 0 || no >= i) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    for (int x = no; x < this.i; x++) {
      this.projects[x] = this.projects[x + 1];
    }
    this.i--;
  }
}



/*
 */