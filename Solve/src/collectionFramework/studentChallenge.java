package collectionFramework;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

//This is the last program of this package

class Account implements Serializable
{
	String account;
	String name;
	double balance;
	
	public Account(String account, String name, double balance)
	{
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Account number = "+account+" Name = "+name+" Balance = "+balance;
	}
}




public class studentChallenge {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		Account acc =null;
		
		HashMap<String,Account> hm = new HashMap<>();
		
		try
		{
			FileInputStream fis = new FileInputStream("C:/JavaFiles/Account.txt");
			ObjectInputStream ois  = new ObjectInputStream(fis);
			
			int count = ois.readInt();
			
			for(int i = 0 ; i < count ; i++)
			{
				acc = (Account) ois.readObject();
				System.out.println(acc);
				hm.put(acc.account, acc);
			}
			fis.close();
			ois.close();
		}
		catch(Exception e)
		{
			
		}
		
		FileOutputStream fos = new FileOutputStream("C:/JavaFiles/Account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("Enter the choice shown below : ");
		
		int choice;
		String account, name;
		double balance;
		
		do
		{
			System.out.println(" 1. Create Account ");
			System.out.println(" 2. Delete Account ");
			System.out.println(" 3. View Account ");
			System.out.println(" 4. View All Account ");
			System.out.println(" 5. Save ");
			System.out.println(" 6. Exit ");
			
			choice = sc.nextInt();
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			switch(choice)
			{
				case 1: System.out.println(" Enter the Account Number : ");
					    account = sc.nextLine();
					    System.out.println(" Enter the Name : ");
					    name = sc.nextLine();
					    System.out.println("Enter the Balance : ");
					    balance = sc.nextDouble();
					    acc = new Account(account, name, balance);
					    hm.put(account, acc);
					    System.out.println(" Account Created ");
					    break;
					    
				case 2: System.out.println(" Enter Account Number that has to be deleted : ");
						account = sc.nextLine();
						hm.remove(account);
						System.out.println(" Account Deleted ");
						
				case 3: System.out.println("\n Enter Account Nnumber to view the account : ");
						account  = sc.nextLine();
						System.out.println(hm.get(account)+"\n");
						break;
						
				case 4: for(Account a:hm.values())
						{
							System.out.println(a);
						}
						break;
				
				case 5: 
				
				case 6: oos.writeInt(hm.size());
						for(Account a:hm.values())
						{
							oos.writeObject(a);
						}				   
			}
		}while(choice != 6);
		{
			oos.flush();
			oos.close();
			fos.close();	
		}
		sc.close();
	}
}
