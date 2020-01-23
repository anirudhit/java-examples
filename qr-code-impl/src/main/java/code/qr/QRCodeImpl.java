package code.qr;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeImpl {
	public static void main(String[] args) throws IOException {
		
		String details = "Anirudh Bellamkonda -> https://www.banirudh.com";
		ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
		
		File f = new File("C:\\Anirudh\\github\\Java\\java-examples\\qr-code-impl\\src\\main\\resources\\MyWebsite.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
		
		fos.close();
	}
}
