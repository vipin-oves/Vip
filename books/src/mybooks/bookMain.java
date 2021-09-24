package mybooks;

import java.util.Scanner;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class bookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");// reading content from config file
				SessionFactory sf = null; // making connection to database
				Session s = null;
				Transaction t = null;
				bookget b = null;
				String choice="";
				do
				{
				System.out.println("1. Adding Books\n2. Search Books\n3. Update Book\n4. Delete Book");
				
				System.out.println("chosse any one option");
				int ch = sc.nextInt();
				
				if(ch==1)
				{
				
					try
					{
						b = new bookget();
						System.out.println("Book No : ");
						b.setBno(sc.nextInt());
						System.out.println("Book Name : ");
						b.setBname(sc.next());
						System.out.println("Book Author : ");
						b.setAuthor(sc.next());
						System.out.println("Book Price : ");
						b.setPrice(sc.nextFloat());
						
						sf = cfg.buildSessionFactory();;
						s = sf.openSession();
						t = s.beginTransaction();
						
						Serializable sz = s.save(b);
						//s.persist(b);
						t.commit();
						System.out.println("Book added with " + (Serializable) sz + " Book Number ");
						//System.out.println("Book added ...");
									
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}		
				}
				if(ch==2)
				{
					sf = cfg.buildSessionFactory();;
					s = sf.openSession();
					
					System.out.println("Enter Book Number : ");
					int bno =  sc.nextInt();
					
					bookget bok = (bookget) s.get("mybooks.bookget", bno);
					
					if(bok!=null)
					{
						System.out.println("Book No : " + bok.getBno());
						System.out.println("Book Name : " + bok.getBname());
						System.out.println("Book Author : " + bok.getAuthor());
						System.out.println("Book Price : " + bok.getPrice());				
					}				
					else
						System.out.println("book Not Found");
					
				}
				if(ch==3)
				{
					//update			
					try
					{
						sf = cfg.buildSessionFactory();;
						s = sf.openSession();
						t = s.beginTransaction();
						
						System.out.println("Enter Book Number : ");
						int bno =  sc.nextInt();
						
						bookget bok = (bookget) s.get("mybooks.bookget", bno);
						
						if(bok!=null)
						{
							System.out.println("Current Book Name : " + bok.getBname());
							System.out.println("Enter New  Name for Book to Modify ");
							bok.setBname(sc.next());
							s.update(bok);
							t.commit();
							System.out.println("Book Updated...");
						}				
						else
							System.out.println("book Not Found");
						
					}
					catch(Exception ex)
					{
						
					}
					
				}
				
				if(ch==4)
				{
					//delete
					
					try
					{
						sf = cfg.buildSessionFactory();;
						s = sf.openSession();
						t = s.beginTransaction();
						
						System.out.println("Enter Book Number : ");
						int bno =  sc.nextInt();
						
						bookget bok = (bookget) s.get("mybooks.bookget", bno);
						
						if(bok!=null)
						{
							System.out.println("Book Name : " + bok.getBname());
							System.out.println("Do You want delete[y/n] : ");
							String chk = sc.next();
							if(chk.equals("y"))
							{
								s.delete(bok);
								t.commit();
								System.out.println("Book Deleted...");
							}
							else
							    System.out.println("Book Not Deleted...");
						}				
						else
							System.out.println("book Not Found");
					
					}
					catch(Exception ex)
					{
						
					}
			
				}
				System.out.println("Want to continue [y/n]");
				choice=sc.next();
				}while(choice.equals("y"));
				sf.close();
				s.close();

	}

}
