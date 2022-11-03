package com.filehandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_01 {
	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		
		File f = new File("demo2.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p.load(fis);
		
		p.list(System.err);
		
		













	}

}
