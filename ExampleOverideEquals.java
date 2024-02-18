import java.util.HashSet;
public class ExampleOverideEquals {
   public static class Student {
      int id;
      String name;
      int age;
      public Student(int id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
      }
   
   public int getID() {
      return id;
   }
   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }

   //overriding the equals method alone will make hashing data structures fail
   @Override
   public boolean equals(Object obj) {
      if (obj == null || obj.getClass() != this.getClass()) {
         return false;
      }
      if (obj == this) {
         return true;
      }
      return this.getID() == ((Student) obj).getID() && this.getName().equals(((Student) obj).getName()) && this.getAge() == ((Student) obj).getAge();

   } 
   //overriding the hashcode method alone is not enough to make the equals method work
   //for two objects to be equal, their hashcodes must be equal
   //if two hashcodes are equal, it does not mean that the two objects are equal
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + getID();
      return result;
   }
}

   
    public static void main(String[] args) {
        ExampleOverideEquals obj = new ExampleOverideEquals();
        Student s1 = new Student(1, "John", 22);
        Student s2 = new Student(1, "John", 22);
        //hash codes are different yet the equals method returns true
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        //equals method returns true
        System.out.println(s1.equals(s2));

        HashSet<Student> students = new HashSet<Student>();
        students.add(s1);
        students.add(s2);
        //without hashcode method, the size of the hashset would be 2 instead of 1
        System.out.println("HashSet size = " + students.size());
        //without hashcode method, the contains method would return false instead of true
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "John", 22)));
    }
}


