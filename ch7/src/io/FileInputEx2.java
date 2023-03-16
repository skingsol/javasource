package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx2 {
	public static void main(String[] args) {
		// copy ( C:\\temp\\file1.txt => C:\\temp\\file2.txt)
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		
//		// 원본 파일 읽기
//		try {
////			fis= new FileInputStream("c:\\temp\\filre1.txt");
////			fos = new FileOutputStream("c:\\temp\\filre2.txt");
//			
//			fis= new FileInputStream("c:\\temp\\iu.mp4");
//			fos = new FileOutputStream("c:\\temp\\iucopy.mp4");
//			
//			int data = 0;
//			while((data=fis.read())!=-1) {
//				fos.write(data);
//			}
//			
//			// FileNotFoundException 은 IOException 이 처리 가능
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		
		// 원본 파일 읽기
		try (FileInputStream fis = new FileInputStream("c:\\temp\\iu.mp4");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\iucopy.mp4")){
//			fis= new FileInputStream("c:\\temp\\filre1.txt");
//			fos = new FileOutputStream("c:\\temp\\filre2.txt");
			
//			fis= new FileInputStream("c:\\temp\\iu.mp4");
//			fos = new FileOutputStream("c:\\temp\\iucopy.mp4");
			
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			} catch (IOException e) {
				e.printStackTrace();
				}
			
			
		}
		
		
	
}
	