import java.util.Scanner;
public class GestionDeCommande {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner choix = new Scanner(System.in);
		
		int selectionMenu;
		int selectionAcc;
		int selectionBoisson;
		int sDessert;
		int facture=9;
		int commande=0;

		Menu menu1 = new Menu("poulet");
		Menu menu2 = new Menu("boeuf");
		Menu menu3 = new Menu("végétarien");
		
		
		Accompagnement accompagnement1 = new Accompagnement("Légumes frais");
		Accompagnement accompagnement2 = new Accompagnement("Frites");
		Accompagnement accompagnement3 = new Accompagnement("Riz");
		
		
		
		
		Boisson boisson1 = new Boisson("eau plate");
		Boisson boisson2 = new 	Boisson("eau gazeuse");
		Boisson boisson3 = new 	Boisson("soda");
		
		
		
		Dessert dessert1 = new Dessert("Tiramisu");
		Dessert dessert2 = new Dessert("Flan");
		Dessert dessert3 = new Dessert("Yaourt");
					
		
		//****************** CONDITION DE CHOIX POUR MENUS **************
		
		
		
		do {
			
			
	         System.out.println("Choix menu");
			
			System.out.println("1 - " + menu1.ChoixMenu());
			System.out.println("2 - " + menu2.ChoixMenu());
			System.out.println("3 - "+ menu3.ChoixMenu());
			
			
			selectionMenu = choix.nextInt();
			
	
	         switch(selectionMenu)
		{
	
		case 1: 
		{System.out.println("Vous avez choisi comme menu : " + menu1.ChoixMenu());
		break;}
		
		case 2: 
		{System.out.println("Vous avez choisi comme menu : " + menu2.ChoixMenu());
		break;}
		
		case 3: 
		{System.out.println("Vous avez choisi comme menu : " + menu3.ChoixMenu());
		break;}
		
		default:
			{
				System.out.println("Vous n'avez rien choisi ");
				System.out.println("Choix menu");
				System.out.println(menu1.ChoixMenu());
				System.out.println(menu2.ChoixMenu());
				System.out.println(menu3.ChoixMenu());
				break;
			}
		
			
		}	
	       //****************** FIN CONDITION DE CHOIX POUR MENUS ************** 
	         
	        
	         
	         
	         
	         
	         
	         
	       //****************** CONDITION DE CHOIX POUR ACCOMPAGNEMENTS **************
	         
	         
			
			do {
				
				
				if(selectionMenu==3) {
		        	 
		        	 System.out.println("\nVoulez vous comme accompagnement " + accompagnement3.ChoixAccompagnement()+ " (Appuyer 4 pour OUI ou 5 pour NON)");
		            
		         }
		         
		         else {
		        	 
		        	 System.out.println("Vous n'avez rien choisi ");
		        	 System.out.println("\nChoix Accompagnements");
		         
					 System.out.println("1 - " + accompagnement1.ChoixAccompagnement());
					 System.out.println("2 - " + accompagnement2.ChoixAccompagnement());
					 System.out.println("3 - " + accompagnement3.ChoixAccompagnement());
					
		         }
		 		
				
				selectionAcc = choix.nextInt();
				
				 switch(selectionAcc)
					{
				
					case 1: 
						if(selectionAcc==3)
					{System.out.println("Vous avez choisi comme accompagnement : " + accompagnement1.ChoixAccompagnement());
					break;}
					
					case 2: 
					{System.out.println("Vous avez choisi comme accompagnement : " + accompagnement2.ChoixAccompagnement());
					break;}
					
					case 3: 
					{System.out.println("Vous avez choisi comme accompagnement : " + accompagnement3.ChoixAccompagnement());
					break;}
					
					case 4:
					{System.out.println("Vous avez choisi comme accompagnement : " + accompagnement3.ChoixAccompagnement());
					break;}
					
					case 5: 
					{System.out.println("Vous ne voulez pas d'accompagnement pour votre Menu : " + menu3.ChoixMenu());
					break;}
					
					default:
						{
							System.out.println("Vous n'avez rien choisi ");
							System.out.println("\nChoix Accompagnements");

							System.out.println(accompagnement1.ChoixAccompagnement());
							System.out.println(accompagnement2.ChoixAccompagnement());
							System.out.println(accompagnement3.ChoixAccompagnement());
							break;
						}
					}
				
				//****************** FIN CONDITION DE CHOIX POUR ACCOMPAGNEMENT **************
				 
				 
				 
				 
				 
				 
				 
				 
				 
				    //****************** CONDITION DE CHOIX POUR BOISSON **************
				 
				
					
				
					
					do {
						
						
						if(selectionMenu==2) {
				        	 System.out.println("****************************************************************");
				        	System.out.println("Vous avez choisi un Menu boeuf qui est un menu sans \nboisson taper sur 4 pour passer aux choix dessert");
				        	
				          
				         }
				         
				         else {
				        	 
				        		System.out.println("\nChoix Boisson");

								System.out.println("1 - " + boisson1.ChoixBoisson());
								System.out.println("2 - " + boisson2.ChoixBoisson());
								System.out.println("3 - " + boisson3.ChoixBoisson());
				         }
						
						
								
							selectionBoisson = choix.nextInt();
							
							 switch(selectionBoisson)
								{
							
								case 1: 
								{System.out.println("Vous avez choisi comme boisson : " + boisson1.ChoixBoisson());
								break;}
								
								case 2: 
								{System.out.println("Vous avez choisi comme boisson  : " + boisson2.ChoixBoisson());
								break;}
								
								case 3: 
								{System.out.println("Vous avez choisi comme boisson  : " + boisson3.ChoixBoisson()+"\n");
								break;}
								
								case 4: 
								{System.out.println("");
								break;}
								
								default:
									{
										System.out.println("Vous n'avez rien choisi ");
										System.out.println("\nChoix Boisson");

										System.out.println("1 - " + boisson1.ChoixBoisson());
										System.out.println("2 - " + boisson2.ChoixBoisson());
										System.out.println("3 - " + boisson3.ChoixBoisson());
										break;
									}
								}
							
							
						
						 
						//****************** FIN CONDITION DE CHOIX POUR BOISSON **************
						 
						 
						 
						 
						 
						 
						 
						 

						 
						//****************** CONDITION DE CHOIX POUR DESSERT ******************
							
		
							
							do {
								
								 System.out.println("\nChoix Dessert");

									System.out.println("1 - " + dessert1.ChoixDessert());
									System.out.println("2 - " + dessert2.ChoixDessert());
									System.out.println("3 - " + dessert3.ChoixDessert());
								
								sDessert = choix.nextInt();
								
								 switch(sDessert)
									{
								
									case 1: 
									{System.out.println("Vous avez choisi comme dessert : " + dessert1.ChoixDessert());
									break;}
									
									case 2: 
									{System.out.println("Vous avez choisi comme dessert  : " + dessert2.ChoixDessert());
									break;}
									
									case 3: 
									{System.out.println("Vous avez choisi comme dessert  : " + dessert3.ChoixDessert()+"\n");
									break;}
									
									default:
										{
											System.out.println("Vous n'avez rien choisi ");
											 System.out.println("\nChoix Dessert");

												System.out.println("1 - " + dessert1.ChoixDessert());
												System.out.println("2 - " + dessert2.ChoixDessert());
												System.out.println("3 - " + dessert3.ChoixDessert());
											break;
										}
										
										
									}
								//****************** FIN CONDITION DE CHOIX POUR DESSERT ******************
								 
								 
								 
								 
								 
								 
								 
								//****************** CONDITION POUR AFFICHER LA COMMANDE  ****************
								
								 do {
									 
									 System.out.println("******************************************************************");
									 System.out.println("Votre commande: \n");
									 System.out.println("******************************************************************");
								  
								  switch(selectionMenu)
								  {
								  case 1:
								 	 System.out.println("menu: " + menu1.ChoixMenu());
								 	 break;
								  case 2:
								 	 System.out.println("menu: " + menu2.ChoixMenu());
								 	 break;
								 	 
								  case 3:
								 	 System.out.println("menu: " + menu3.ChoixMenu());
								 	 break;
								  default:
								 		System.out.println("Vous n'avez rien choisi comme menu");
								 		 break;
								 		 
								  }
								
								 
								  switch(selectionAcc)
								  {
								  case 1:
								 	 System.out.println("accompagnement: " + accompagnement1.ChoixAccompagnement());
								 	 break;
								  case 2:
								 	 System.out.println("accompagnement: " + accompagnement2.ChoixAccompagnement());
								 	 break;
								 	 
								  case 3:
								 	 System.out.println("accompagnement: " + accompagnement3.ChoixAccompagnement());
								 	 break;
								 	
								  case 4:
									{System.out.println("accompagnement : " + accompagnement3.ChoixAccompagnement());
									break;}
									
								  case 5: 
									{System.out.println("Vous ne voulez pas d'accompagnement pour votre Menu : " + menu3.ChoixMenu());
									break;}
									
								  default:
								 		System.out.println("Vous n'avez rien choisi comme accompagnement");
								 		 break;
								 		 
								  }
								  
								  
								  
								  
								  switch(selectionBoisson)
								  {
								  case 1:
								 	 System.out.println("boisson: " + boisson1.ChoixBoisson());
								 	 break;
								  case 2:
								 	 System.out.println("boisson: " + boisson2.ChoixBoisson());
								 	 break;
								 	 
								  case 3:
								 	 System.out.println("boisson: " + boisson3.ChoixBoisson());
								 	 break;
								 
								 	 default:
								 		 System.out.println("Vous n'avez rien choisi comme boisson");
								 		 break;
								  }
								  
								  
								  
								  switch(sDessert)
								  {
								  case 1:
								 	 System.out.println("dessert: " + dessert1.ChoixDessert());
								 	 break;
								  case 2:
								 	 System.out.println("dessert: " + dessert2.ChoixDessert());
								 	 break;
								 	 
								  case 3:
								 	 System.out.println("dessert: " + dessert3.ChoixDessert());
								 	 break;

								 	 
								 	 default:
								 		System.out.println("Vous n'avez rien choisi comme dessert");
								 		 break;
								  }
								  System.out.println("******************************************************************");
								  System.out.println("\nfacture: " + facture + " euro\n");
								  System.out.println("Votre commande est la commande numéro: " + (commande+1) +"\n");
								  System.out.println("******************************************************************\n");
								  System.out.println("Merci A Bientot :)");
								 
							//****************** FIN CONDITION DE CHOIX POUR DESSERT ******************
								    
								  
								 }while(selectionBoisson==123);
				
							}while(sDessert==123);
					
					}while(selectionBoisson==123);
				 	 
			
			}while(selectionAcc==123);
			
			
		}while(selectionMenu==123);			
				
		}

	}


