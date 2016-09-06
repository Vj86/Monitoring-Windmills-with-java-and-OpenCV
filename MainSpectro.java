import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.opencv.core.Core;        
import org.opencv.highgui.VideoCapture;
import org.bytedeco.javacpp.opencv_core.CvMat;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

import javax.swing.JOptionPane;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacpp.opencv_core.CvMat;
import org.bytedeco.javacpp.opencv_core.IplImage;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;




import java.io.*;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.RenderedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.OpenCVFrameConverter;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


















import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.CvType;

    public class MainSpectro
    {        
    	
    	
        

    	public static void main(String[] args) throws Exception, IOException {
        {        
        	
		//	String path = JOptionPane.showInputDialog("Digit the directory");
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
			
			

	        Mat frame = new Mat();
	        Mat in = new Mat();
	        Mat out1= new Mat();
	        CvSeq lines = new CvSeq(); 
	        
	       int count=0; 
	        
	        
	        VideoCapture cap = new VideoCapture("C:\\Users\\vittorio\\Desktop\\COPENHAGEN\\project\\Videos\\video1.mp4");
	        Size sz = new Size(768, 432);
	        int i = 0;
	        
	        while (cap.read(frame) != false) {
	        	
	    //    	in = new Mat(frame.size(), CvType.CV_8UC1);
	        	
	        	/**
	        	 * Down sample the image by factor of 2
	        	 */
				Imgproc.pyrDown(frame, out1);
				
				/**apply Canny to detect the edges.
				 * remember we're re-using the output as in
				 * 10 and 100 to be more accurate
				 */
				Imgproc.Canny(out1, frame, 10, 2800, 5, true); 
				
				/** applying the houghLinesP 
				 */
				 Mat lines1 = new Mat();
				
			
				Show im = new Show();
				
			 BufferedImage image=im.MatToBufferedImage(frame);
				
				
				
				 
				 
				 JFrame fr = new JFrame();
				 fr.getContentPane().setLayout(new FlowLayout());
				 fr.getContentPane().add(new JLabel(new ImageIcon(image)));
				 fr.pack();
				 fr.setVisible(true);
				 fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X button to close the app
			
				  
				 
	
		
					
				count++;
				
			
				
				 

			
				
				
				
				
	        	
	        }
	        
	        
	        
			
			
        	
		
	
    		    }
        
	
	
    	}}
    
    
    
    
    
    
    
    
    



    
    
    
    
    
    
    
    
    
    

