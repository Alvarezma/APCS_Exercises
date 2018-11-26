class ArraySameElements {
    public static boolean sameElts( int[] a, int[] b )  {
        boolean[] used = new boolean[b.length];
        for (int i = 0; i < a.length; i++)  {
            for (int n = 0; n < b.length; n++)  {
                if (a[i] == b[n] && used[n] == false)   {
                    used[n] = true;
                }
            }
        }
        boolean same = true;
        for (int i = 0; i < used.length; i++)  {
            if (used[i] != true)   {
                same = false;
            }
        }
        return same;
    }

    public static void main ( String[] args )   {

        int[] arrayA = { 1, 2, 3, 4, 2 };
        int[] arrayB = { 4, 2, 3, 2, 1 };

        if ( sameElts( arrayA, arrayB ) ) {
            System.out.println( "Same Elements" );
        } else  {
            System.out.println( "DIFFERENT elements" );      
        }
    }
}