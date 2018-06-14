package com.demo.ImageReader;
import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class ToastReader {
	
	
public static void getToastMessage() {
		
		String filePath=System.getProperty("user.dir")+"\\ScreenShot";
        File file = new File(filePath+"\\simpleToast.png");
        file.mkdir();
        ITesseract instance = new Tesseract();

        File tessDataFolder = LoadLibs.extractTessResources("tessdata"); 
                      
        instance.setDatapath(tessDataFolder.getAbsolutePath()); 
                      // path

        
        
       
        
        try {
         
        String result = instance.doOCR(file);
        System.out.println(result);
         
        } catch (TesseractException e) {
        System.err.println(e.getMessage());
        }
       
	}
	
	public static void main(String args[])
	{
		getToastMessage();
	}

}
