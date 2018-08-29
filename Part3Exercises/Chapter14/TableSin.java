import java.text.*;

public class TableSin {

    public static void main( String[] args ) {
        
        double angle, val;
        DecimalFormat angform = new DecimalFormat(" 00.0;-00.0");
        DecimalFormat valform = new DecimalFormat(" 0.000000;-0.000000");

        System.out.println("Angle\tsine");

        angle = -90.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = -75.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = -60.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = -45.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = -30.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = -15.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 0.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 15.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 30.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 45.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 60.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 75.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

        angle = 90.0;
        val = Math.sin( angle * (Math.PI/180) );
        System.out.println(angform.format(angle) + "\t" + valform.format(val));

    }
}