import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void zeroRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }   
        }
    }
    public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for(int i = 0; i < pixels.length; i++){
        for(int j =0; j < pixels[i].length; j++){
        pixels[i][j].setBlue(255);
        }
    
    }
    
    }
    
    public void zeroGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        //     for (Pixel[] rowArray : pixels)
        //     {
        //       for (Pixel pixelObj : rowArray)
        //       {
        //         pixelObj.setGreen(0);
        //       }
        //     }
        for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setGreen(255);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void grayScale(){
    Pixel[][] pixels = this.getPixels2D();
    for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                int n = (pixels[i][j].getRed() + pixels[i][j].getBlue() + pixels[i][j].getGreen())/3;
                pixels[i][j].setGreen(n);
                pixels[i][j].setRed(n);
                pixels[i][j].setBlue(n);
            }
        }
    }
    public void negate()
    {
    Pixel[][] pixels = this.getPixels2D();
    for (int i = 0; i < pixels.length; i++)
        {
            for (int j = 0; j < pixels[i].length; j++)
            {
                pixels[i][j].setRed(255 - pixels[i][j].getRed());
                pixels[i][j].setBlue(255 - pixels[i][j].getBlue());
                pixels[i][j].setGreen(255 - pixels[i][j].getGreen());
            }
        }

    }
    public void mirrorVertical(){
            Pixel[][] pixels = this.getPixels2D();
            Pixel leftPixel = null;
            Pixel rightPixel = null;
            int width = pixels[0].length;
            for (int row = 0; row < pixels.length; row++)
            {
                for (int col = 0; col < width / 2; col++)
                {
                    leftPixel = pixels[row][col];
                    rightPixel = pixels[row][width - 1 - col];
                    rightPixel.setColor(leftPixel.getColor());
}
}}
    /** Mirror just part of a picture of a temple */
    public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
            Pixel bottomPixel = null;
            Pixel topPixel = null;
            int width = pixels.length;
            for (int row = 0; row < pixels.length; row++)
            {
                for (int col = 0; col < width / 2; col++)
                {
                    bottomPixel = pixels[row][col];
                    topPixel = pixels[row][width - 1 - col];
                    topPixel.setColor(bottomPixel.getColor());
                }}
            Pixel[][] pixel2 = pixels;
            Pixel leftPixel = null;
            Pixel rightPixel = null;
            width = pixel2[0].length;
            for (int row = 0; row < pixel2.length; row++)
            {
                for (int col = 0; col < width / 2; col++)
                {
                    leftPixel = pixel2[row][col];
                    rightPixel = pixel2[row][width - 1 - col];
                    rightPixel.setColor(leftPixel.getColor());
    }}}
    public void mirrorHorizontal(){
            Pixel[][] pixel = this.getPixels2D();
            Pixel bottomPixel = null;
            Pixel topPixel = null;
            for(int i = 0; i < pixel.length; i++){
            for(int j = 0; j < pixel[i].length; i++){
            bottomPixel = pixel[i][j];
            topPixel = pixel[pixel.length][pixel[0].length];
            topPixel.setRed(bottomPixel.getRed());
            } 
            }
        
            }
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 27; row < 97; row++)

        {

            // loop from 13 to just before the mirror point

    for (int col = 13; col < mirrorPoint; col++)

    {



        leftPixel = pixels[row][col];

        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];

        rightPixel.setColor(leftPixel.getColor());
        count++;
    }}}

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,int startRow, int startCol)
    {
        
    }
    public void mirrorArms(){
        Pixel[][] pixel = this.getPixels2D();
        Pixel[][] pixel2 = this.getPixels2D();
        Pixel[][] pixel3 = this.getPixels2D();
        Pixel[][] pixel4 = this.getPixels2D();
        pixel = pixel[170][235];
        pixel2 = pixel2[196][240];
        pixel3 = pixel3[157][104];
        pixel4 = pixel4[197][167];
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();
        for (int row = 27; row < 97; row++)

        {

    for (int col = 13; col < mirrorPoint; col++)

    {



        leftPixel = pixels[row][col];

        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];

        rightPixel.setColor(leftPixel.getColor());
        count++;
    }}
    
    
    
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {

    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {

    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("imgres.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
