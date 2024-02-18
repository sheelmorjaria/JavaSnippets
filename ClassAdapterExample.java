public class ClassAdapterExample {
    public interface IRoundPeg{
        public void insertIntoHole(String msg);
    }    

    public interface ISquarePeg{
        public void insert(String str);
    }   
    public static class SquarePeg  implements ISquarePeg{
        public void insert(String str){
            System.out.println("SquarePeg insert(): " + str);
        }
    }
    public static class RoundPeg implements IRoundPeg{
        public void  insertIntoHole(String str){
            System.out.println("RoundPeg insertIntoHole(): " + str);
        }
    }


    public static class PegAdapter implements ISquarePeg, IRoundPeg{
        private RoundPeg roundPeg;
        private SquarePeg squarePeg;

        public PegAdapter(RoundPeg peg){
            this.roundPeg = peg;
        }
        public PegAdapter(SquarePeg peg){
            this.squarePeg = peg;
        }

        public void insert(String str){
            roundPeg.insertIntoHole(str);
        }
        public void insertIntoHole(String msg){
            squarePeg.insert(msg);
        }
    }

    public static void main(String[] args){
        RoundPeg roundPeg = new RoundPeg();
        SquarePeg squarePeg = new SquarePeg();

        squarePeg.insert("Inserting square peg...");
        roundPeg.insertIntoHole("Inserting round peg...");

        ISquarePeg squarePegAdapter = new PegAdapter(roundPeg);
        squarePegAdapter.insert("Inserting round peg using square peg adapter...");
        IRoundPeg roundPegAdapter = new PegAdapter(squarePeg);
        roundPegAdapter.insertIntoHole("Inserting square peg using round peg adapter...");
    }
}
