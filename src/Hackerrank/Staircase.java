package Hackerrank;

public class Staircase {
    public static void main(String[] args) {
        int stairHeight = 6;
        StringBuilder spaces = new StringBuilder();
        spaces.append(" ".repeat(stairHeight - 1));
        String aLine = "#";

        for (int i = 0; i < stairHeight; i++) {
            System.out.println(spaces + aLine);
            aLine += "#";
            spaces.delete(0, 1);
        }
    }
}
