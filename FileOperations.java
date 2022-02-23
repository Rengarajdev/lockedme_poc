package lockme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations extends CreateYourFolders{

	
	public void existsaddfile() 
	{
		
		String filename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Directory path:");
		String folderpath=sc.next();
		System.out.println("Enter Folder name and File name:");
		filename=sc.next();
		
		
		filename=folderpath+File.separator+filename;
		File f=new File(filename);
		
		
		try {
			if(f.createNewFile()) {
				System.out.println("File " +f +" Created");
			}else
			{
				System.out.println("File exists");
			}
	}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

public void newadd() 
{
	CreateYourFolders cf=new CreateYourFolders();
	cf.CreateFolder();
	
	String filename;
			if(cf.value.equals("true")) {
		   Scanner sc=new Scanner(System.in);
	System.out.println("Enter File name:");
	filename=sc.next();
	
	File f1=new File(cf.path);
	filename=f1+File.separator+filename;
	File f=new File(filename);
	
	
	try {
		if(f.createNewFile()) {
			System.out.println("File " +f +" Created Successfully!");
		}else
		{
			System.out.println("Error occured please contact Admin..");
		}
}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	else 
	{
		System.out.println("File can't be created");
	}
}
public void deletefile() 
{
	
	String filename;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Folder Path:");
	File f1=new File(sc.next());
	System.out.println("Enter File name with extension if available:");
	filename=sc.next();
	filename=f1+File.separator+filename;
	File f=new File(filename);
	if(f.exists()==true) {
			
		if(f.delete()) {
			System.out.println("File " +f +" Deleted Succesfully");
		}
	}else if(f.exists()==false)
		{
			System.out.println("File not exists");
		}
		else
		{
			System.out.println("Deletion failed");
		}

}			public void search() 
			{
				

				String search;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter directory:");
				File f1=new File(sc.next());
				System.out.println("Enter File name with extension:");
				search=sc.next();
				search=f1+File.separator+search;
				File f=new File(search);
						try {
					if(f.exists()==true) {
						System.out.println("File " +f +" Exists");
					}else
					{
						System.out.println("Doesnt exists");
					}
			}
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
}	
public void sortingfile() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the directory to be sorted:");
	String paths=sc.next();
   File folder=new File(paths);
   folder.getAbsolutePath();
    
    String[] files=folder.list();
    
	System.out.println("**********************************************");

	for(int i=0;i<files.length;i++) {
	
		
		System.out.println(files[i].toUpperCase()); //Sorting alphabetical order
		}
	System.out.println("***********************************************");
	
}

}