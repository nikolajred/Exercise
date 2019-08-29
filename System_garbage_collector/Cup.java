package System_garbage_collector;

public class Cup {
    Spoon spoon;

    Cup(Spoon spoon) {
        this.spoon = spoon;
    }

    public static void main(String[] args) {
        Cup cup = new Cup(new Spoon());
        cup = null;
        System.gc();
    }
}
