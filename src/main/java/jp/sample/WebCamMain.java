package jp.sample;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

/**
 * 
 * Webカメラ使用
 *
 */
public class WebCamMain {

	private static final String OUTPUTDIR = "out\\";

	public static void main(String[] args) throws Exception {
		String path = "cam.png";
		Webcam cam = Webcam.getDefault();
		System.out.println(cam.getName());

		// カメラ起動
		cam.open();
		// 撮影
		BufferedImage image = cam.getImage();
		// 出力
		ImageIO.write(image, "png", new File(OUTPUTDIR, path));
		cam.close();
	}
}
