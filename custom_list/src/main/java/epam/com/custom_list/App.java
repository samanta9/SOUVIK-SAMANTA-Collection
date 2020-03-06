package epam.com.custom_list;


import java.util.*;



public class App 
{
	
	public static void main( String args[])
	{
		   Scanner sc=new Scanner(System.in);
		  
		  List <String> l=new ArrayList<>();
	  l.add("one");
	  l.add("two");
	  l.add("three");
	  l.add("four");
	  l.add("five");
	  l.add("six");
	  l.add("seven");
	  l.add("eight");
	  l.add("nine");
	  l.add("ten");
		  
		 while(true)
		{				 
	
	         System.out.println(" \n *************************** ARRAY LIST ****************************  \n ");
			 
		      System.out.println(" \n  1. FETCHING \n  2. ADDING  \n  3. REMOVING  \n  4. PRINTING \n  5. EXIT  ");
			   System.out.println(" \n -------------------------------------------------------------- \n ");
		      System.out.print("\n ENTER YOUR CHOICE :: ");
		       int c =sc.nextInt();
			  
		    switch(c)
		   {
				  
			   case 1:  System.out.println("\n  THE ARRAY LIST IS : "+l);
            			   System.out.print("\n ENTER THE STRING TO FETCH : ");
						String s=sc.next();
            			System.out.println("\n IS "+s+" PRESENT IN THE LIST : "+l.contains(s));
						 System.out.println(" \n -------------------------------------------------------------- \n ");
			            break;
				
				case 2:  System.out.println("\n  THE ARRAY LIST IS : "+l);
				        System.out.print("\n ENTER THE STRING TO ADD : ");
						String t=sc.next();
            			l.add(t);
						 System.out.println("\n "+t+" IS ADDED TO THE LIST ENTER (4) TO SEE THE LIST ");
						  System.out.println(" \n -------------------------------------------------------------- \n ");
			            break;
						
						
				case 3:   System.out.println("\n  THE ARRAY LIST IS : "+l);
				         System.out.print("\n ENTER THE STRING TO REMOVE :  ");
						String u=sc.next();
						if(l.contains(u)==true)
						{
            			l.remove(u);
						 System.out.println("\n "+u+" IS REMOVED FROM THE LIST ENTER (4) TO SEE THE LIST ");
						}
						else
						{
							System.out.println("\n SORRY YOU CAN NOT REMOVE " +u+" BECAUSE IT IS NOT PRESENT IN THE LIST " );
						}
						 System.out.println(" \n -------------------------------------------------------------- \n ");
			            break;
						
				case 4: 
				        System.out.println("\n  THE ARRAY  LIST IS : "+l);
						
				        Iterator <String> i = l.iterator();
		                while (i.hasNext())
			            System.out.println (i.next());
					     
						  System.out.println(" \n -------------------------------------------------------------- \n ");
				        break;
					   
					   
                 case 5: System.out.println("\n  !!!!! THANK YOU !!!!!! \n ");	
			              break;
                  
				 default :  System.out.println(" \n WRONG CHOICE PLEASE RE-ENTER YOUR CHOICE \n ");	
				              System.out.println(" \n -------------------------------------------------------------- \n ");
			                break;
				  
						
		   }
		   
		   if(c==5)
			 break;
		}
		  
		  
		  
	}
	
}
