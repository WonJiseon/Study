
package step07.ex09;

import java.util.*;

public class ProjectController {
  static Scanner keyScanner;
  ProjectDao projectDao = new ProjectDao();
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
    Project[] projects = projectDao.selectList();
    
    for (int i = 0; i < projects.length; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %d\n",
          i, 
          projects[i].title, 
          projects[i].description,
          projects[i].startDate, 
          projects[i].endDate, 
          projects[i].status);
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
    projectDao.insert(project);
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Project project = projectDao.selectOne(no);
    
    if (project == null) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    System.out.printf("제목: %s\n", project.title);
    System.out.printf("설명: %s\n", project.description);
    System.out.printf("시작일: %s\n", project.startDate);
    System.out.printf("마감일: %s\n", project.endDate);
    System.out.printf("진행상태: %d\n", project.status);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Project originProject = projectDao.selectOne(no);
    if (originProject == null) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    Project newProject = projectDao.selectOne(no);
    System.out.printf("제목(%s)?", originProject.title);
    newProject.title = keyScanner.nextLine();
    System.out.printf("설명(%s)? ", originProject.description);
    newProject.description = keyScanner.nextLine();
    System.out.printf("진행상태(%d)?", originProject.status);
    newProject.status = Integer.parseInt(keyScanner.nextLine());
  }

  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());

    System.out.print("삭제하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      int count = projectDao.delete(no);
      if (count > 0) {
        System.out.println("삭제하였습니다");
    } else {
      System.out.println("해당 게시물이 없습니다.");
    }
  } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
}



/*
 */