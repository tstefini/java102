package java102;

import java.util.ArrayList;

public class Grid<T> {
    private final ArrayList<ArrayList<T>> grid;
    public final int sideLength;

    // Static field to track the maximum side length
    private static int maxSideLength = 0;

    // Constructor to initialize the grid
    public Grid(int sideLength, T defaultVal) {
        this.sideLength = sideLength;
        this.grid = new ArrayList<>(sideLength);
        
        // Initialize the grid with the given default value
        for (int i = 0; i < sideLength; i++) {
            grid.add(new ArrayList<>(sideLength));
            for (int j = 0; j < sideLength; j++) {
                grid.get(i).add(defaultVal);
            }
        }

        // Update the maximum side length if necessary
        if (sideLength > maxSideLength) {
            maxSideLength = sideLength;
        }
    }

    // Method to get the value at a specific position
    public T get(int row, int col) {
        return grid.get(row).get(col);
    }

    // Method to set a value at a specific position
    public void set(int row, int col, T val) {
        grid.get(row).set(col, val);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (ArrayList<T> row : grid) {
            for (T element : row) {
                str.append(element).append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    // Method to get the primary diagonal
    public ArrayList<T> diagonal() {
        ArrayList<T> diagonalElements = new ArrayList<>();
        for (int i = 0; i < sideLength; i++) {
            diagonalElements.add(grid.get(i).get(i));  // Add element at [i][i] (primary diagonal)
        }
        return diagonalElements;
    }

    // Static method to get the largest side length of any Grid created
    public static int maxSideLength() {
        return maxSideLength;
    }
}
