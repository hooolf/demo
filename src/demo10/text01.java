package demo10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件与流
 * Java。io包
 * 1.文件
 * File类提供了一个指定文件全路径的构造方法，用来创建对应文件的引用，用来操作文件内容
 * 
 * \反斜杠和/正斜杠 区别
 * \windows系统的文件路径
 * /linux系统的文件路径
 * +File.separator+  适配不同系统斜杠
 * 
 * 
 * 
 * 流
 * 根据传输类型的不同分为：字符流，字节流
 * 根据传输功能的不同分为：节点流，处理流
 * 根据传输方向的不同分为：输入流，输出流
 * 
 * 类型→功能→方向
 * 
 * 字节流
 *     节点流
 *         输入流
 *              FileInputStream read()一次读一个字节，没有东西可读返回-1
 *         
 *         输出流
 *     处理流
 *         输入流
 *         输出流
 * 字符流  
 *     节点流
 *         输入流
 *         输出流
 *     处理流
 *         输入流
 *         输出流
 *         
 *         
 * 对象序列化        
 *        objectInputStream
 *        objectOutputStream 
 *         
 *         
 *         
 *         
 *         
 *         
 *         
 */

public class text01 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:"+File.separator+"work"+File.separator+"ccc.txt");
		File file2=new File("D:"+File.separator+"work"+File.separator+"aaa.txt");
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream=null;
		
		try {
			if(!file.exists()){
			file.createNewFile();
			}
			fileInputStream=new FileInputStream(file);
			
			int available = fileInputStream.available();
			byte[] bt=new byte[available];
			FileInputStream fileInputStream1= new FileInputStream(file);
			int read=fileInputStream1.read(bt);
			fileOutputStream.write(bt);
//			while(read!=-1){
//				for(byte item:bt){
//				System.out.print((char)read);
//			}
//			read=fileInputStream1.read(bt);
//		    }//需要转型成char才能输出内容，不然时输出ascll
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		
		
		
		
		
		
//		
		
//        try {
//        	if(file.exists()){//判断文件是否存在
        		
//        	}
//        		System.out.println("文件存在");
//        		file.delete();//删除文件
//        	}
//			file.createNewFile();//创建文件
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
	}

}
