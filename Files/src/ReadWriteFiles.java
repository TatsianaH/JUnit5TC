import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteFiles {

	public static void main(String[] args) throws FileNotFoundException {
//read from a file

		File readFile = new File("readFile.txt");
		Scanner scanFile = new Scanner(readFile);
		
		/*
		 * первый вариант добавления Exception
		 * второй смотри в main
		 import java.io.FileNotFoundException;
		 import java.util.Scanner;
		 try {Scanner scanFile = new Scanner(readFile);
		} 
		catch
			(FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
		while (scanFile.hasNext())
			System.out.println(scanFile.nextLine());
		scanFile.close();
		
//write into a file
		File writeFile = new File("writeFile.txt");
		PrintWriter printFile = new PrintWriter(writeFile);//  PrintWriter спец класс для записи файла
		printFile.println("My first string");
		printFile.println("My second string");
		printFile.println("My third string");
		printFile.close();
	}

}
