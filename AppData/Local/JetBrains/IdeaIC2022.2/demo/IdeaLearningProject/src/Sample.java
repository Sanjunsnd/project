class Demo {
    public static void main {
        boolean array = false;
        int length = array.length;
        for (int j = 0; j < length - 1; j++)
            for (int i = 0; i < length - j - 1; i++)
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
    }
}
