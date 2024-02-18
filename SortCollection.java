import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {
    public static class Player implements Comparable<Player>{
        private String name;
        private int ranking;
        private int age;

        public Player(String name, int ranking, int age) {
            this.name = name;
            this.ranking = ranking;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getRanking() {
            return ranking;
        }
        public int getAge() {
            return age;
        }
        public String setName(String name) {
            return this.name = name;
        }
        public int setRanking(int ranking) {
            return this.ranking = ranking;
        }
        public int setAge(int age) {
            return this.age = age;
        }

        @Override
        public int compareTo(Player otherPlayer) {
            return Integer.compare(getRanking(), otherPlayer.ranking);
        }
    }
    public static void main(String[] args) {
        List<Player> footballPlayers = new ArrayList<>();
        Player p1 = new Player("Messi", 3, 34);
        Player p2 = new Player("Ronaldo", 1, 36);
        Player p3 = new Player("Neymar", 2, 29);
        footballPlayers.add(p1);
        footballPlayers.add(p2);
        footballPlayers.add(p3);
        //without implementing comparable interface and overriding the compareTo method, the sort method would not work
        System.out.println("Before sorting: " + footballPlayers);
        Collections.sort(footballPlayers);
        System.out.println("After sorting: " + footballPlayers);

    }
   

}