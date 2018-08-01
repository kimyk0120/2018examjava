package exam.exam_pg;

import java.io.FileInputStream;
import java.io.IOException;


public class PgExam {

	
	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		FileInputStream fis=new FileInputStream(projectPath+"/src/exam/exam_pg/a.xlsx");
		
		
	}
	
}//.class
