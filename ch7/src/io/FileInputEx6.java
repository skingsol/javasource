package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {
	public static void main(String[] args) {
		// copy ( C:\\temp\\file1.txt => C:\\temp\\file2.txt)
		

		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
			FileOutputStream fos = new FileOutputStream("c:\\temp\\iucopy.mp4")){

			int data = 0;
			
			long start = System.currentTimeMillis(); // 시작시간
			
			while((data=fis.read())!=-1) {
			
			}
			
			long end = System.currentTimeMillis();  // 종료시간

			System.out.println("InputStream / OutputStream 걸린시간 "+(end-start)+"ms");
			
			} catch (IOException e) {
				e.printStackTrace();
				}
		
		//두줄로도 가능
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\iu.mp4"))
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\iucopy.mp4"))
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("c:\\temp\\iucopy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int data = 0;
			
			byte b[] = new byte[8192]; //8kb
			
			long start = System.currentTimeMillis(); // 시작시간
			
			while((data=fis.read(b))!=-1) {
			
			}
			
			long end = System.currentTimeMillis();  // 종료시간

			System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte 걸린시간 "+(end-start)+"ms");
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		
		
	}
}
	