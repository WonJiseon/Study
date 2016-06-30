package step07.ex09;

public class ContactDao {
  Contact[] contacts = new Contact[100];
  int length = 0;
  
  void insert(Contact contact) {
    this.contacts[this.length++] = contact;
  }
  Contact[] selectList() {
    Contact[] dataArray = new Contact[this.length];
    for (int i = 0; i < this.length; i++) {
      dataArray[i] = contacts[i];
    }
    return dataArray;
  }
  Contact selectOne(int no) {
    if(no >=0 && no < this.length) {
      return this.contacts[no];
    }
    return null;
  }
  void update(int no, Contact contact) {
    this.contacts[no] = contact;
  }
  int delete(int no) {
    if (no >= 0 && no < this.length) {
      for(int i = no; i < this.length; i++) {
        this.contacts[i] = this.contacts[i + 1];
      }
      this.length--;
      return 1;
    }
    return 0;
  }
  int size() {
    return this.length;
  }
}
