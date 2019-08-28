package com.fang.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static int add(int a, int b) {
    	return a + b;
    }
    
    public static int plus(int c,int d) {
    	return c*d;
    }
    
    public void readTxtFile(File src) {
		Reader reader = null;
		//创建流
		try {
			reader = new FileReader(src);
			
			char[] flush = new char[1024];
			
			int len = 0;
			
			try {
				while(-1 != (len = reader.read(flush))) {
					//将字符数组转换为字符串
					String str = new String(flush,0,len);
					System.out.println(str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("cannot read the src file");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cannot find the src file");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		} finally {
//			if(null != reader) {
//				try {
//					reader.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					System.out.println("cannot close the file");
//				}
//			}
//		}
	}
}
