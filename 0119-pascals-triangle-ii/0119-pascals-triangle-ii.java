class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int k = 1; k <= rowIndex; k++) {
            long val = (long) row.get(k - 1) * (rowIndex - k + 1) / k;
            row.add((int) val);
        }
        
        return row;
    }
}