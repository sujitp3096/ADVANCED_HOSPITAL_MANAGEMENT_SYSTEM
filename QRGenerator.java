import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class QRGenerator {

    public static void generateQR(String text, String fileName) {
        int size = 250;

        BufferedImage img = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, size, size);

        g.setColor(Color.BLACK);
        g.drawString("TOKEN QR", 90, 20);
        g.drawString(text, 50, 120)

        g.dispose();

        try {
            ImageIO.write(img, "png", new File(fileName));
        } catch (Exception e)
            {
            e.printStackTrace();
            }
    }
}


