import java.io.*;
import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args){
		File f=new File("/home/azmi/LearnJava");
		try{
			FileInputStream fis=new FileInputStream(f);
			int data;
			while((data=fis.read())!=-1){
			System.out.print((char)data);
			}
			System.out.println();
		}catch(Exception e){}
	}
}
