/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.handle;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import javax.imageio.ImageIO;

/**
 *
 * @author kunbo
 */
public class ImageHandle {

    private final static ImageHandle _instance = new ImageHandle();

    private ImageHandle() {
    }

    public static ImageHandle getInstance() {
        return _instance;
    }

    public Image resize(Image originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        return resultingImage;
    }

    public Image resize(BufferedImage originalBufferedImage, int targetWidth, int targetHeight) {
        return resize((Image) originalBufferedImage, targetWidth, targetHeight);
    }

    public byte[] toByteArray(Image img, String type) {
        try {
            BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);

            Graphics2D g = bimage.createGraphics();
            g.drawImage(img, 0, 0, null);
            g.dispose();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bimage, type, baos);

            byte[] imageInByte;
            imageInByte = baos.toByteArray();

            return imageInByte;
        } catch (IOException | java.lang.NullPointerException e) {
            System.out.println("File nulll");
            return null;
        }
    }

    public Image createImageFromByteArray(byte[] data, String type) throws IOException {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            BufferedImage bImage = ImageIO.read(bis);
            Image img = bImage.getScaledInstance(bImage.getWidth(), bImage.getHeight(), Image.SCALE_SMOOTH);
            return img;
        } catch (javax.imageio.IIOException | java.lang.NullPointerException e) {
            return null;
        }
    }

    public Image createImageFromBlob(Blob b) {
        try {
            byte[] imagebytes = b.getBytes(1, (int) b.length());
            return createImageFromByteArray(imagebytes, "jpg");
        } catch (SQLException | IOException | java.lang.NullPointerException e) {
            return null;
        }
    }

    public byte[] BlobToByteArray(Blob b) throws SQLException {
        int myblobLength = (int) b.length();
        byte[] myblobAsBytes = b.getBytes(1, myblobLength);
        return myblobAsBytes;
    }

    public Image readImage(String URL) {
        try {
            File f = new File(URL);
            Image img = ImageIO.read(f);
            return img;
        } catch (IOException | java.lang.NullPointerException e) {
            System.out.println("Không timg thấy ảnh");
            return null;
        }
    }
}
