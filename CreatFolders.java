package lockme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class CreateYourFolders 
{
	public String path;
	public File newfile;
	public String value;
	public void CreateFolder() {
	//public String path;
	//Fetching path to create folder
	System.out.println("Enter the path where You want to Create a folder: ");
	Scanner sc=new Scanner(System.in);
	path=sc.next();
	path=path+File.separator;
	System.out.println("Path is "+path );
	//Fetching folder name
	System.out.println("Enter the folder name:");
	path=path+sc.next();
	//Instantiate file class
	File file=new File(path);
	 newfile=file;
	try {
	if(!file.exists()) {
	//creating a folder using mkdir() method
	boolean bool=file.mkdirs();
	
	if(bool) {
		System.out.println("Folder is created Successfully!");
		value="true";
	}
	else
	{
		System.out.println("Folder creation failed...");
		value="False";
	}
	}else
	{
		System.out.println("Folder already exists");
		value="False";
	}
	}
	
	catch(Exception ex)
	{
		System.out.println("Folder cant be created");
	}
}
}