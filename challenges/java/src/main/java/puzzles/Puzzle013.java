package puzzles;

// Animal Farm
public class Puzzle013 {
        public static void main(String[ ] args) {
            final String pig = "length: 10";
            final String dog = "length: " + pig.length( );
            System.out.println("Animals are equal: " + pig == dog);
        }
}
