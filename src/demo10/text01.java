package demo10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ�����
 * Java��io��
 * 1.�ļ�
 * File���ṩ��һ��ָ���ļ�ȫ·���Ĺ��췽��������������Ӧ�ļ������ã����������ļ�����
 * 
 * \��б�ܺ�/��б�� ����
 * \windowsϵͳ���ļ�·��
 * /linuxϵͳ���ļ�·��
 * +File.separator+  ���䲻ͬϵͳб��
 * 
 * 
 * 
 * ��
 * ���ݴ������͵Ĳ�ͬ��Ϊ���ַ������ֽ���
 * ���ݴ��书�ܵĲ�ͬ��Ϊ���ڵ�����������
 * ���ݴ��䷽��Ĳ�ͬ��Ϊ���������������
 * 
 * ���͡����ܡ�����
 * 
 * �ֽ���
 *     �ڵ���
 *         ������
 *              FileInputStream read()һ�ζ�һ���ֽڣ�û�ж����ɶ�����-1
 *         
 *         �����
 *     ������
 *         ������
 *         �����
 * �ַ���  
 *     �ڵ���
 *         ������
 *         �����
 *     ������
 *         ������
 *         �����
 *         
 *         
 * �������л�        
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
//		    }//��Ҫת�ͳ�char����������ݣ���Ȼʱ���ascll
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		
		
		
		
		
		
//		
		
//        try {
//        	if(file.exists()){//�ж��ļ��Ƿ����
        		
//        	}
//        		System.out.println("�ļ�����");
//        		file.delete();//ɾ���ļ�
//        	}
//			file.createNewFile();//�����ļ�
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
	}

}
