import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> all_rows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for(int i = 0; i < numRows; i++) {
            row.add(0, 1);

            for(int j = 1; j < row.size() - 1; j++){
                row.set(j, row.get(j) + row.get(j + 1));
            }

            all_rows.add(new ArrayList<Integer>(row));
        }

        return all_rows;
    }

    public static void main(String[] args) {
        int numRows = 6;

        System.out.print("Pascals triangle with " + numRows + 
        " rows would look like: \n" + generate(numRows));
    }
}