package ismtrain;
import java.util.Scanner;
 public class HotelMenu{
 public static void main(String args[]){
  
                  int PRICE=70;
      HotelMenu obj = new HotelMenu();
	int choice,SouthPrice,idliPlates,South,Idli,Dosa,Uttappa,Gujarati,Roti,Subji,Rice,Punjabi,Naan,Pulav,Chinese,Manchurian,Noodles,Soup,Mexican,Tacos,Discada,Menudo,Continental,Pizza,French,Pan,Caribbean,Jerk,Couch,Pepperpot,Italian,Bread,Pasta,Lasagna,Korean,Kimchi,Pajeon,Donaktsu,Japanese,Sushi,Unagi,Wagyu;
while(true){
      Scanner  objScanner = new Scanner(System.in);
	System.out.println("1....................SouthIndian");
	System.out.println("2....................Gujarati");
	System.out.println("3....................punjabi");  
	System.out.println("4....................chinese");
	System.out.println("5....................mexican");
	System.out.println("6....................continental");
	System.out.println("7....................caribbean");
	System.out.println("8....................Italian");
	System.out.println("9....................Korean");
	System.out.println("10....................Japanese");
                 System.out.println("11....................exit");
                 
choice=objScanner.nextInt();
       switch(choice){
                                   case 1 : System.out.println("You have selected South Indian");
			System.out.println("1.......Idli");
			System.out.println("2.......Dosa");
			System.out.println("3........Uttappa");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			South=objScanner.nextInt();
			        switch(South){
					case 1: System.out.println("You have selected Idli");
						System.out.println("1....... Rava Idli");
						System.out.println("2.......Masala Idli");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Idli=objScanner.nextInt();
						          switch(Idli){
								case 1: System.out.println("You have selected Rava Idli");
									System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected masala Idli");
System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch Idli	
                                                    			break;
					case 2: System.out.println("You have selected Dosa");
						System.out.println("1....... Mysore Dosa");
						System.out.println("2.......Masala Dosa");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Dosa=objScanner.nextInt();
						          switch(Dosa){
								case 1: System.out.println("You have selected Mysore Dosa");
System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Masala Dosa");
System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch dosa
                  	                                  			break;
					case 3: System.out.println("You have selected Uttappa");
						System.out.println("1....... Onion Uttappa");
						System.out.println("2.......Masala Uttappa");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Uttappa=objScanner.nextInt();
						          switch(Uttappa){
								case 1: System.out.println("You have selected onion Uttappa");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Masala Uttappa");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                 			        }// end of uttappa swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of south switch
		                 break;
    		case 2: System.out.println("This is Gujarati");
			System.out.println("1.......Roti");
			System.out.println("2.......Subji");
			System.out.println("3........Rice");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Gujarati=objScanner.nextInt();
			        switch(Gujarati){
					case 1: System.out.println("You have selected Roti");
						System.out.println("1....... Rumali Roti");
						System.out.println("2.......Butter Roti");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Roti=objScanner.nextInt();
						          switch(Roti){
								case 1: System.out.println("You have selected Rumali Roti");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Butter Roti");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch roti	
                                                    			break;
					case 2: System.out.println("You have selected Subji");
						System.out.println("1....... Sev tomato");
						System.out.println("2.......Mix vegetables");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Subji=objScanner.nextInt();
						          switch(Subji){
								case 1: System.out.println("You have selected Sev tomato");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Mix vegetables");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch subji
                  	                                  			break;
					case 3: System.out.println("You have selected Rice");
						System.out.println("1....... Fried rice");
						System.out.println("2.......Jeera masala rice");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Rice=objScanner.nextInt();
						          switch(Rice){
								case 1: System.out.println("You have selected Fried Rice");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Jeera masala rice");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of rice swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of gujarati switch
                                                    break;
		case 3: System.out.println("This is Punjabi");
			System.out.println("1.......Naan");
			System.out.println("2.......Subji");
			System.out.println("3........Pulav");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Punjabi=objScanner.nextInt();
			        switch(Punjabi){
					case 1: System.out.println("You have selected Naan");
						System.out.println("1....... cheese Naan");
						System.out.println("2.......Butter Naan");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Naan=objScanner.nextInt();
						          switch(Naan){
								case 1: System.out.println("You have selected Cheese Naan");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Butter Naan");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch Naan	
                                                    			break;
					case 2: System.out.println("You have selected Subji");
						System.out.println("1....... Paneer tikka");
						System.out.println("2.......Paneer kadhai");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Subji=objScanner.nextInt();
						          switch(Subji){
								case 1: System.out.println("You have selected Paneer tikka");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Paneer kadhai");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch subji
                  	                                  			break;
					case 3: System.out.println("You have selected Pulav");
						System.out.println("1....... Vegetable pulav");
						System.out.println("2.......Biriyani");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pulav=objScanner.nextInt();
						          switch(Pulav){
								case 1: System.out.println("You have selected Vegetable pulav");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Biriyani");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of pulav swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of punjabi switch
		break;
		case 4: System.out.println("This is Chinese");
			System.out.println("1.......Manuchurian");
			System.out.println("2.......Noodles");
			System.out.println("3........Soup");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Chinese=objScanner.nextInt();
			        switch(Chinese){
					case 1: System.out.println("You have selected Manchurian");
						System.out.println("1....... Dry manchurian");
						System.out.println("2.......Gravy manchurian");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Manchurian=objScanner.nextInt();
						          switch(Manchurian){
								case 1: System.out.println("You have selected Dry manchurian");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Gravy manchurian");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch manchurian	
                                                    			break;
					case 2: System.out.println("You have selected Noodles");
						System.out.println("1....... Schewan noodles");
						System.out.println("2.......Masala noodles");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Noodles=objScanner.nextInt();
						          switch(Noodles){
								case 1: System.out.println("You have selected Schewan noodles");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Masala noodles");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch noodles
                  	                                  			break;
					case 3: System.out.println("You have selected Soup");
						System.out.println("1....... Hot n sour soup");
						System.out.println("2.......Manchau soup");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Soup=objScanner.nextInt();
						          switch(Soup){
								case 1: System.out.println("You have selected Hot n sour soup");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Manchau soup");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of Soup swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of chinese switch
			break;
		case 5: System.out.println("This is Mexican");
			System.out.println("1.......Tacos");
			System.out.println("2.......Discada");
			System.out.println("3........Menudo");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Mexican=objScanner.nextInt();
			        switch(Mexican){
					case 1: System.out.println("You have selected Tacos");
						System.out.println("1....... Regular Tacos");
						System.out.println("2.......Cheese Tacos");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Tacos=objScanner.nextInt();
						          switch(Tacos){
								case 1: System.out.println("You have selected Regualr tacos");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Cheese tacos");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch tacos	
                                                    			break;
					case 2: System.out.println("You have selected Discada");
						System.out.println("1....... Regular Discada");
						System.out.println("2.......Cheese Discada");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Discada=objScanner.nextInt();
						          switch(Discada){
								case 1: System.out.println("You have selected Regular Discada");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Cheese Discada");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch discada
                  	                                  			break;
					case 3: System.out.println("You have selected Menudo");
						System.out.println("1....... Regular Menudo");
						System.out.println("2.......Cheese Menudo");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Menudo=objScanner.nextInt();
						          switch(Menudo){
								case 1: System.out.println("You have selected Regular menudo");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Cheese menudo");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of menudo swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of Mexican switch
			break;
	                  case 6: System.out.println("This is Continental");
			System.out.println("1.......Pizza");
			System.out.println("2.......French fries");
			System.out.println("3........Pancakes");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Continental=objScanner.nextInt();
			        switch(Continental){
					case 1: System.out.println("You have selected Pizza");
						System.out.println("1....... Margherita");
						System.out.println("2.......farmhouse");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pizza=objScanner.nextInt();
						          switch(Pizza){
								case 1: System.out.println("You have selected Margherita");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Farmhouse");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch pizza	
                                                    			break;
					case 2: System.out.println("You have selected French fries");
						System.out.println("1....... Peri-peri fries");
						System.out.println("2.......Ghost fries");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						French=objScanner.nextInt();
						          switch(French){
								case 1: System.out.println("You have selected Peri-peri fries");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Ghost fries");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch french
                  	                                  			break;
					case 3: System.out.println("You have selected Pancakes");
						System.out.println("1....... Honey-oat");
						System.out.println("2.......Paramesien");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pan=objScanner.nextInt();
						          switch(Pan){
								case 1: System.out.println("You have selected Honey-oat");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Paramesien");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of pan swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of contiental switch
                                                    break;
		case 7: System.out.println("This is Caribbean");
			System.out.println("1.......Jerk");
			System.out.println("2.......Couch");
			System.out.println("3........Pepperpot");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Caribbean=objScanner.nextInt();
			        switch(Caribbean){
					case 1: System.out.println("You have selected Jerk");
						System.out.println("1....... Chicken Jerk");
						System.out.println("2.......Beef Jerk");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Jerk=objScanner.nextInt();
						          switch(Jerk){
								case 1: System.out.println("You have selected Chicken jerk");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected masala Beef jerk");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch Jerk	
                                                    			break;
					case 2: System.out.println("You have selected Couch");
						System.out.println("1....... White Couch");
						System.out.println("2.......Masala Couch");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Couch=objScanner.nextInt();
						          switch(Couch){
								case 1: System.out.println("You have selected White Couch");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Masala Couch");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch Couch
                  	                                  			break;
					case 3: System.out.println("You have selected Pepperpot");
						System.out.println("1....... Veg. pepperpot");
						System.out.println("2.......Chicken with Beef pepperpot");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pepperpot=objScanner.nextInt();
						          switch(Pepperpot){
								case 1: System.out.println("You have selected Veg. pepperpot");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Chicken with beef pepperpot");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of pepperpot swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of caribbean switch
                                                    break;
		case 8: System.out.println("This is Italian");
			System.out.println("1.......Focaccia Bread");
			System.out.println("2.......Pasta");
			System.out.println("3........Lasagna");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Italian=objScanner.nextInt();
			        switch(Italian){
					case 1: System.out.println("You have selected Focaccia Bread");
						System.out.println("1....... Paramesian");
						System.out.println("2.......Honey-oat bread");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Bread=objScanner.nextInt();
						          switch(Bread){
								case 1: System.out.println("You have selected paramesian");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Honey-oat bread");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch Bread	
                                                    			break;
					case 2: System.out.println("You have selected Pasta");
						System.out.println("1....... Maccroni");
						System.out.println("2.......Cheese");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pasta=objScanner.nextInt();
						          switch(Pasta){
								case 1: System.out.println("You have selected Maccroni pasta");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Cheese pasta");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch pasta
                  	                                  			break;
					case 3: System.out.println("You have selected Lasagna");
						System.out.println("1....... Peri-peri ");
						System.out.println("2.......Tandoori");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Lasagna=objScanner.nextInt();
						          switch(Lasagna){
								case 1: System.out.println("You have selected Peri-peri");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Tandoori lasagna");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of Lasagna swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of Italian switch
                                                    break;
		case 9:System.out.println("This is Korean");
			System.out.println("1.......Kinchi");
			System.out.println("2.......Pajeon");
			System.out.println("3........Donkatsu");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Korean=objScanner.nextInt();
			        switch(Korean){
					case 1: System.out.println("You have selected Kimchi");
						System.out.println("1....... Veg. Kimchi");
						System.out.println("2.......non-veg. kimchi");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Kimchi=objScanner.nextInt();
						          switch(Kimchi){
								case 1: System.out.println("You have selected veg. Kimchi");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Non-veg. kimchi");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch kimchi	
                                                    			break;
					case 2: System.out.println("You have selected Pajeon");
						System.out.println("1....... Beef Pajeon");
						System.out.println("2.......Pork Pajeon");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Pajeon=objScanner.nextInt();
						          switch(Pajeon){
								case 1: System.out.println("You have selected Beef pajeon");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Pork pajeon");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch pajeon
                  	                                  			break;
					case 3: System.out.println("You have selected Donaktsu");
						System.out.println("1....... Rolls donaktsu");
						System.out.println("2.......Sandwich donaktsu");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Donaktsu=objScanner.nextInt();
						          switch(Donaktsu){
								case 1: System.out.println("You have selected Rolls Donaktsu");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Sandwich donaktsu");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of Donaktsu swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of Korean switch
                                                    break;
		case 10:System.out.println("This is Japanese");
			System.out.println("1.......Sushi");
			System.out.println("2.......Unagi");
			System.out.println("3........Wagyu");
			System.out.println("4........Exit");
			System.out.println("Enter your choice");                                                                                                 
			Japanese=objScanner.nextInt();
			        switch(Japanese){
					case 1: System.out.println("You have selected Sushi");
						System.out.println("1....... Roll sushi");
						System.out.println("2.......fried sushi");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Sushi=objScanner.nextInt();
						          switch(Sushi){
								case 1: System.out.println("You have selected Roll Sushi0");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Fried shushi");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}// end of switch sushi	
                                                    			break;
					case 2: System.out.println("You have selected Unagi");
						System.out.println("1....... Vegetables");
						System.out.println("2.......Chicken-pork-beef mix");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Unagi=objScanner.nextInt();
						          switch(Unagi){
								case 1: System.out.println("You have selected Vegetables unagi");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Chicken-pork-beef unagi");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
							}//end of switch unagi
                  	                                  			break;
					case 3: System.out.println("You have selected Wagyu");
						System.out.println("1....... seafood Wagyu");
						System.out.println("2.......meat Wagyu");
						System.out.println("3........Exit");
						System.out.println("Enter your choice");                                                                                                 
						Wagyu=objScanner.nextInt();
						          switch(Wagyu){
								case 1: System.out.println("You have selected seafood wagyu");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                  	                                  						break;
								case 2: System.out.println("You have selected Meat wagyu");System.out.println("Enter no. of plates you want:");
									          idliPlates=objScanner.nextInt();
							                                         SouthPrice=idliPlates*PRICE;
								                         System.out.println("Total Price of Idli is " +SouthPrice);
                                                    						break;
								case 3: System.exit(0);
                                                    						break;
                                         }// end of wagyu swith
                                                    			break;
					case 4: System.exit(0);
                                                    			break;
			}// end of Japanese switch
                                                    break;
		case 11: System.exit(0);
                                                 break;	
		} //end of switch

	} // end of while


} //end of main
}