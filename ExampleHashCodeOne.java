public class ExampleHashCodeOne {
   public class Student {
      int id;
      String name;
      int age;
      public Student(int id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
      }
   }
    public static void main(String[] args) {
        ExampleHashCodeOne obj = new ExampleHashCodeOne();
        Student s1 = obj.new Student(1, "John", 22);
        Student s2 = obj.new Student(1, "John", 22);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}