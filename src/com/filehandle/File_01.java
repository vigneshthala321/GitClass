package com.filehandle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_01 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("vignesh.text");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Thulasidass Vignesh");
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String readUTF = dis.readUTF();
		System.out.println(readUTF);
		
		
	}

}
