package game.object;

public class Piece {

    private int val1, val2;

    public Piece() {
        generatePiece();
    }

    private void generatePiece() {
        WeightedRandomBag<Integer> possibleVals = new WeightedRandomBag<>();
        possibleVals.addEntry(1, 0.5);
        possibleVals.addEntry(2, 0.45);
        possibleVals.addEntry(3, 0.05);

        val1 = possibleVals.getRandom();
        val2 = possibleVals.getRandom();
        if (val2 == val1) {
            val2 = possibleVals.getRandom();
        }
    }

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

}
