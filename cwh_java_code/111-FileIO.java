import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

class WordPad{
	String fileName;	

	WordPad(String fileName){
		this.fileName = fileName;
		System.out.println("Operating on file: "+fileName);
	}

	void createFile(){
		File myFile = new File(fileName);	
		try{
			myFile.createNewFile();
		}
		catch (IOException e){
			// myFile.close(); -> doesn't exist for File class
			e.printStackTrace();
		}
		// what if the file creation fails.. soy because of permission issue
	}

	void writeFile(String content){
		try{
			FileWriter myFile = new FileWriter(fileName);	
			myFile.write(content);
			myFile.close(); // very important 
		}
		catch (IOException e){
			e.printStackTrace();	
		}
		// what if the file you trying to access doesn't exist :shrug
	}

	void readFile(){
		File myFile = new File(fileName);
		try{
			Scanner sc = new Scanner(myFile);
			// sc has taken input by now.. if it exists.. time to print the data
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		}
		catch(FileNotFoundException e){
			e.printStackTrace();	
		}
		// what if the file doesn't exist..
	}

	void deleteFile(){
		File myFile = new File(fileName);
		if (myFile.delete()) System.out.println("Successfully deleted the file "+fileName);
		else System.out.println("Failed to delete the file "+fileName);
	}
}

class Main{
	public static void main(String[] args){
		WordPad file = new WordPad("file.txt");
		// file.createFile();
		// file.writeFile("I am proffapt.\nI am not a related to apt anyhow.");
		// file.readFile();
		file.deleteFile();
	}
}
