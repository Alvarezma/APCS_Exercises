class SquareCubeNoRepeats {

    public static boolean repeats( int[] a, int[] b )  {
        boolean repeat = false;
        int[] allDigits = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)    {
            allDigits[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)    {
            allDigits[i + a.length] = b[i];
        }

        for (int i = 0; i < allDigits.length; i++)    {
            for (int n = 0; n < allDigits.length; n++)    {
                if ( i != n && allDigits[i] == allDigits[n])    {
                    repeat = true;
                }
            }
        }
        return repeat;
    }

    public static void main ( String[] args )   {

        for (int i = 1; i <= 10; i++)   {
            int sq = i * i;
            int cube = i * i * i;

            int[] sqList = new int[String.valueOf(sq).length()];
            int[] cubeList = new int[String.valueOf(cube).length()];

            for (int n = 0; n < sqList.length; n++)    {
                sqList[n] = sq / (int)(Math.pow(10, n));
            }
            for (int n = 0; n < cubeList.length; n++)    {
                cubeList[n] = cube / (int)(Math.pow(10, n));
            }

            if ( repeats(sqList, cubeList) )    {
                System.out.println( i + " repeats" );
            } else  {
                System.out.println( i + "   no repeats" );
            }
        }
    }
}