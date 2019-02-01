package snippet;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageTest {
	 public static String path = "E:\\test";      
	  
	    public static void main(String[] args) throws IOException {  
	        File file1 = new File(path, "qian.jpg");  
	        File file2 = new File(path, "fanmian.jpg");  
	        mergeImage(file1, file2);  
	    }  
	    public static void mergeImage(File file1, File file2) throws IOException {        
	        BufferedImage image1 = ImageIO.read(file1);  
	        BufferedImage image2 = ImageIO.read(file2);  
	  
	        BufferedImage combined = new BufferedImage(image1.getWidth()>image2.getWidth()?image1.getWidth():image2.getWidth() , image1.getHeight()* 2, BufferedImage.TYPE_INT_RGB);  
	  
	        Graphics g = combined.getGraphics();  
	        g.drawImage(image1, 0, 0, null);  
	        g.drawImage(image2, 0, image1.getHeight()+16, null);  
	          
	        ImageIO.write(combined, "JPG", new File(path, "3.jpg"));  
	    }  
}
