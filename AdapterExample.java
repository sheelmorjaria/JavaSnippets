public class AdapterExample{
    public static class SquarePeg {
        public void insert(String str){
            System.out.println("SquarePeg insert(): " + str);
        }
    }
    public static class RoundPeg {
        public void  insertIntoHole(String str){
            System.out.println("RoundPeg insertIntoHole(): " + str);
        }
    }
    //adapter enables objects with different interfaces to communicate with each other
    public  static class RoundToSquarePegAdapter extends SquarePeg{
        private RoundPeg roundPeg;
        public RoundToSquarePegAdapter(RoundPeg roundPeg){
            this.roundPeg = roundPeg;
        }
        public void insert(String str){
            roundPeg.insertIntoHole(str);
        }
    }
    public static void main(String[] args){
        SquarePeg squarePeg = new SquarePeg();
        RoundPeg roundPeg = new RoundPeg();
        RoundToSquarePegAdapter adapter = new RoundToSquarePegAdapter(roundPeg);
        squarePeg.insert("Inserting square peg");
        adapter.insert("Inserting round peg");
    }
}
