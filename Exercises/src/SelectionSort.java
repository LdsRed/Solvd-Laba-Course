public class SelectionSort {

    public static void main(String[] args) {


        int[] arr = {64, 25, 12, 22, 11};

        selectionSortAlgorithm(arr);

        for (int value:
             arr) {
            System.out.println(value);
        }
    }

    static void selectionSortAlgorithm(int[] arrays) {


        for (int i = 0; i < arrays.length - 1; i++) {

            int min_value = i;
            for (int j = i + 1; j < arrays.length; j++)
                if (arrays[j] < arrays[min_value])
                    min_value = j;

            int temp_element = arrays[min_value];
            arrays[min_value] = arrays[i];
            arrays[i] = temp_element;

        }
    }
}

