package com.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	
	
	//int wordCount=0;
	static String texte = "Two men in a smoking-room were talking of their private-school days."+"\n"+
	"‘At our school,’ said A., ‘we had a ghost’s footmark on the staircase. What was it like? Oh"+"\n"+
	"very unconvincing. Just the shape of a shoe, with a square toe, if I remember right. The staircase "+"\n"+
	"was a stone one. I never heard any story about the thing. That seems odd, when you come to think of it."+"\n"+
	"Why didn’t somebody invent one, I wonder?’ ‘You never can tell with little boys. They have a mythology of their own."+"\n"+
	"There’s a subject for you, by the way —“The Folklore of Private Schools”.’ ‘Yes; the crop is rather scanty"+"\n"+
	"There’s a subject for you, by the way —“The Folklore of Private Schools”.’ ‘Yes; the crop is rather scanty"+"\n"+
	"There’s a subject for you, by the way —“The Folklore of Private Schools”.’ ‘Yes; the crop is rather scanty";
	
	static int longs = texte.length();
	
	
	

	public static void main(String[] args) {
		//  Ecrire une application WordCount aui permet de retourner pour une chaine de caractere donnée; le nombre de mots
		// le nombre de lignes et le nombre de charactere
		boolean dansMot1 = true;
		boolean dansMot = false;
		int nbrCars =0, nbreMots =0, nbreLignges =0;
		
		for(int i=0; i<longs; i++) {
			char c = texte.charAt(i);
			nbrCars++;
			switch(c) {
			case '\n':
				nbreLignges++;
				continue;
			case '\t':
				continue;
			case ' ':
				if(dansMot) {
					nbreMots++;
					dansMot=false;
				}
				break;
			default:
				dansMot = true;
				
			
			}
		}
		
			System.out.println("\t"+nbrCars+"\t"+nbreMots+"\t"+nbreLignges);	
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	/*	  
		 int words = 0;
		 int lines = 0;
		 int characters = 0;
		 for(int i=0;i<texte.length();i++) {
			char tx = texte.charAt(i);
			characters++;				
			}
		 words = words + words.split(" ");
	 
		
			 
			
		 
		 
		 
		 
		 
		 
		 System.out.println("lines: "+lines);
		 System.out.println("words: "+words);
		 System.out.println("characters: "+characters);
			        
	
	 	
	 */
		
		
		
		
		
		
		/*
		 int charCount = 0;
         
	     int wordCount = 0;
	         
	     int lineCount = 0;
			
		
		
		   //String currentLine = reader.readLine();
           
           while (texte != null)
           {
               //Updating the lineCount
                
               lineCount++;
                
               //Getting number of words in currentLine
                
               String[] words = texte.split(" ");
                
               //Updating the wordCount
                
               wordCount = wordCount + words.length;
                
               //Iterating each word
                
               for (String word : words)
               {
                   //Updating the charCount
                    
                   charCount = charCount + word.length();
               }
                
               //Reading next line into currentLine
                
               //texte = reader.readLine();
           }
           //Printing charCount, wordCount and lineCount
           
           System.out.println("Number Of Chars In A File : "+charCount);
            
           System.out.println("Number Of Words In A File : "+wordCount);
            
           System.out.println("Number Of Lines In A File : "+lineCount);
        
		*/
            
 
		
	/*	
			
		int charsCount =0;
		int wordsCount=0;
		int linesCount =0;
		char tx = texte.charAt(0);
		 while (!(texte== null)) {
	            //String tmpStr = texte.charAt(0);
	            if (!texte.equalsIgnoreCase("")) {
	                String replaceAll = texte.replaceAll("\\s+", "");
	                charsCount += replaceAll.length();
	                wordsCount += texte.split(" ").length;
	            }
	            ++linesCount;
	        }

	        //display the count of characters, words, and lines
	        System.out.println("# of chars: " + charsCount);
	        System.out.println("# of words: " + wordsCount);
	        System.out.println("# of lines: " + linesCount);

		
		*/
		
		
		
		

		
/*		
		//String yourInput = "...";
		Matcher m = Pattern.compile("\r\n|\r|\n").matcher(texte);
		int lines = 0;
		while (m.find())
		{
		    lines ++;
		    
		    System.out.println(lines);
		    
		    */
		    
		    
		    
		}
		

	}


