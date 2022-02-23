package lockme;

import java.io.File;
import java.util.Scanner;



public class VirtualKeyRepositoryMenu {

	
	static int choice=0;
	public static void main(String[] args) {
		FileOperations fo=new FileOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("********************************************************");
		System.out.println("\t\tWelcome to locked me");
		System.out.println("********************************************************");
		do{
		System.out.println("\t1.Create Folder");
		System.out.println("\t2.Add Files to the existing folder");
		System.out.println("\t3.Add Files to the new folder");
		System.out.println("\t4.Delete Files");
		System.out.println("\t5.Search Files");
		System.out.println("\t6.Sort");
		System.out.println("\t7.Exit");
		System.out.println("********************************************************");
		System.out.println("Enter your choice here:");
				choice=sc.nextInt();
			if(choice>=1)
			{
				if(choice==1)
			fo.CreateFolder();
				if(choice==2)
			fo.existsaddfile();
				if(choice==3)
			fo.newadd();
				if(choice==4)
			fo.deletefile();
				if(choice==5)
					fo.search();
				if(choice==7)
				{
					System.out.println("Thank you for using Virtual Key repository. Visit again!");
					System.out.println("\t\t*****");
					System.exit(0);
					
				}
				if(choice==6)
					fo.sortingfile();
				
			}
		}
		while(true);
		
	}

}