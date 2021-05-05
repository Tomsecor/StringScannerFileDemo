import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        String myString = "CMPSC-221";

        System.out.println(myString.toLowerCase().substring( 0, 5 ));
        System.out.println(myString);

        System.out.println( "Enter a number: " );
        Scanner scan = new Scanner( System.in );

        if( scan.hasNextInt() )
        {
            int num = scan.nextInt();
            System.out.println( num + " was the integer." );
        }
        else
        {
            System.out.println( "That was not a number" );
        }

        System.out.println( "Poetry" );

        File file = new File( "/Users/trossi/Documents/Penn State/Year Two/Spring 2019/CMPSC 221/Week 7/Lecture/StringScannerFileDemo/src/sampleFile.txt" );

        try
        {
            Scanner fileScan = new Scanner( file );

            while ( fileScan.hasNextLine() )
            {
                System.out.println( fileScan.nextLine() );
            }
        }
        catch ( FileNotFoundException fnfe )
        {
            fnfe.printStackTrace();
        }
    }
}
