class Weight    {
    private int[] data;

    // Constructor
    public Weight(int[] init) {
        // Make data the same length
        // as the array referenced by init.
        data = new int[init.length];

        // Copy values from the 
        // input data to data.
        for (int j = 0; j < init.length; j++)    {
            data[j] = init[j];
        }
    }

    public int average()    {
        int sum = 0;

        for (int i = 0; i < data.length; i++)   {
            sum += data[i];
        }

        return sum / data.length;
    }

    public int subAverage(int start, int end)   {

    }

    //Print
    public String toString()  {
        String str = "Data: \n";

        for (int i = 0; i < data.length; i++)   {
            str += "Place " + i + ": " + data[i] + "\n";
        }

        return str;

    }
}