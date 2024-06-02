package imageProcessing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageProcessing {

	public static void main(String[] args) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("bug.jpg"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		int height = img.getHeight();
		int width = img.getWidth();
		
		for(int y = 0; y<height; y++) {
			for(int x = 0; x<width; x++) {
				int pixel = img.getRGB(x, y);
				int a = (pixel >> 24) & 0xff;
				int r = 255 - ((pixel >> 16) & 0xff);
				int g = 255 - ((pixel >> 8) & 0xff);
				int b = 255 - ((pixel) & 0xff);
				pixel = (a << 24) | (r << 16) | (g << 8) | (b);
				img.setRGB(x, y, pixel);
			}
		}
		
		try {
		File outputfile = new File("newbug.jpg");
		ImageIO.write(img, "jpg", outputfile);
		System.out.println("Image inverted successfully");
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
