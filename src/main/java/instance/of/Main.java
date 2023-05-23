package instance.of;

public class Main {
  public static void main(String[] args) {
    Parent parent = new Child(true);
    if (parent instanceof Child child && child.childField) {
      System.out.println(parent.parentField);
    }
  }
}