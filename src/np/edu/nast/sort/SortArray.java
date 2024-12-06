package np.edu.nast.sort;

public class SortArray {
    public static void main(String[] args) {

        ArraySort sort = new ArraySort();
        //taking user input
        int[] arry= {1,3,2,8,5,4,6};
        Integer[] arry2= {1,3,2,8,5,4,6};

        sort.ascending(arry);
        sort.descending(arry2);
    }
}
