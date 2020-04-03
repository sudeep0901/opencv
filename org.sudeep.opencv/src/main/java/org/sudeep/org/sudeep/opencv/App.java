package org.sudeep.org.sudeep.opencv;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        System.out.println( "Hello World!" );
        System.out.println("Welcome to OpenCV " + Core.VERSION);
        System.out.println(System.getProperty("java.library.path"));
         Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());
        
    }
}
