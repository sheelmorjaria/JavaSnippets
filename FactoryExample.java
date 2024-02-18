
public class FactoryExample{
    public static void main(String[] args) {
        FactoryExample fe = new FactoryExample();
        Namer n = fe.getNamer("Ed Williams");
        System.out.println("First name: " + n.getFirst());
        System.out.println("Last name: " + n.getLast());
        n = fe.getNamer("Smith, John");
        System.out.println("First name: " + n.getFirst());
        System.out.println("Last name: " + n.getLast());

    }
    public class Namer {
        protected String last;
        protected String first;
        public String getLast() {
        return last;
        }
        public String getFirst() {
            return first;
        }
    }
    public Namer getNamer(String entry) {
        int i = entry.indexOf(",");//comma means last name first
        if (i > 0) {
            return new LastFirst(entry);
        } else {
            return new FirstFirst(entry);
        }
    }
    public class FirstFirst extends Namer {
        public FirstFirst(String s){
            int i = s.lastIndexOf(" ");//find separating space
            if (i > 0) {
            //left is first name
                first = s.substring(0, i).trim();
            //right is last name
                last = s.substring(i+1).trim();
            } else {
                first = "";
                last = s;
            }
        }

    }
    public class LastFirst extends Namer{
        public LastFirst(String s){
            int i = s.indexOf(",");//find comma
            if(i>0){
                last = s.substring(0, i).trim();
                first = s.substring(i+1).trim();
            } else {
                last = s;
                first = "";
            }
        }
    }
}
