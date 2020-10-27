public class SortedQuick implements Isort {
    private int[] list;

    public SortedQuick() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 50));
        }
        list=array;
        System.out.println("Array for sorted Quick");
        for(int i: list){
            System.out.print(" "+i);

        }
        System.out.println();
    }

    @Override
    public void sort() {

        quickSort(list, 0, list.length - 1);
        System.out.println("Sorted :");
        for (int i : list) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("_________");
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int supportElement = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }

            while (array[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
