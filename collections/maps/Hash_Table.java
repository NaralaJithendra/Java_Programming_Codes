package com.examples.java.collections.maps;

import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"Hash Table\" is in \"Java Util\" Package");
		Hashtable<String, String> table= new Hashtable<>();
		table.put("Devi Sri Prasad", "DP");
		table.put("Taylor Swift", "TS");
		table.put("Justin Bieber", "JB");
		table.put("S P BalaSubrahmanyam" ,"SB");
		table.put("Keeravani", "KV");
		table.put("A R Rahman", "AR");
		table.put("Ilayaraja", "IR");
		table.put("Yuvan Shankar Raja", "SR");
		table.put("Haris Jaya Raj", "HR");
		table.put("Hip Hop Tamizha", "HT");
		table.put("Ghibran", "GB");
		table.put("The Weeknd", "TW");
		table.put("Micheal Jackson", "MJ");
		table.put("Ed Shareen", "ES");
		table.put("Ariana Grande", "AG");
		table.put("Harry Styles", "HS");
		table.put("Thaman S","TS");
		table.put("Anup Rubens", "AR");
		table.put("Anirudh Ravichandran", "AR");
		table.put("Selena Gmez","SG");
		table.put("Halsey", "HS");
		table.put("Drake", "DK");
		table.put("Bts", "BTS");
		table.put("Sia", "SA");
		table.put("Bruno Mars", "BM");
		table.put("Billie Eilish", "BE");
		table.put("Imagine Dragons", "ID");
		table.put("Marshmello", "MM");
		table.put("Olivia Rodrigo", "OR");
		table.put("Dua Lipa", "DL");
		table.put("Maroon5", "M5");
		table.put("Katy Perry", "KP");
		table.put("Shawn Mendes","SM");
		table.put("Black Pink" , "BP");
		table.put("Brain Tyler", "BT");
		table.put("Vidya Vox", "VV");
		table.put("Alan Walker", "AW");
		table.put("Miley Cyrus", "MC");
		table.put("Anne Marrie", "AM");
		table.put("Hailee Steinfeld", "HS");
		table.put("Charlie Puth", "CP");
		table.put("Ellie Goulding", "EG");
		table.put("Rihanna", "RH");
		table.put("Jonas Brothers", "JB");
		table.put("Demi Lovoto", "DL");
		table.put("Eminem", "EN");
		table.put("Camila Cabello", "CC");
		table.put("Lil Nas X", "LN");
		
		System.out.println(table);//Output: {Selena Gmez=SG, Eminem=EN, Harry Styles=HS, Olivia Rodrigo=OR, Rihanna=RH, Sia=SA, Haris Jaya Raj=HR, The Weeknd=TW, Lil Nas X=LN, Shawn Mendes=SM, Bruno Mars=BM, Ellie Goulding=EG, Micheal Jackson=MJ, Yuvan Shankar Raja=SR, Bts=BTS, Ghibran=GB, Maroon5=M5, Ariana Grande=AG, Dua Lipa=DL, Halsey=HS, Jonas Brothers=JB, Devi Sri Prasad=DP, Hip Hop Tamizha=HT, Anne Marrie=AM, Billie Eilish=BE, Keeravani=KV, Hailee Steinfeld=HS, Ilayaraja=IR, S P BalaSubrahmanyam=SB, Charlie Puth=CP, Anup Rubens=AR, Camila Cabello=CC, Imagine Dragons=ID, A R Rahman=AR, Vidya Vox=VV, Black Pink=BP, Katy Perry=KP, Taylor Swift=TS, Ed Shareen=ES, Anirudh Ravichandran=AR, Demi Lovoto=DL, Brain Tyler=BT, Thaman S=TS, Miley Cyrus=MC, Marshmello=MM, Justin Bieber=JB, Alan Walker=AW, Drake=DK}
		
		System.out.println(table.getOrDefault("Taylor Swift", "Not Found"));//Output: TS
		
	    System.out.println(table.getOrDefault("Alan Silvestri", "AS"));//Output: AS
	    
	    System.out.println(table.get("Taylor Swift")); //Output: TS
	    
	    System.out.println(table.values());//Output: [SG, EN, HS, OR, RH, SA, HR, TW, LN, SM, BM, EG, MJ, SR, BTS, GB, M5, AG, DL, HS, JB, DP, HT, AM, BE, KV, HS, IR, SB, CP, AR, CC, ID, AR, VV, BP, KP, TS, ES, AR, DL, BT, TS, MC, MM, JB, AW, DK]
	    
	    System.out.println(table.keys());//Output: java.util.Hashtable$Enumerator@36aa7bc2
	    
	    System.out.println(table.entrySet());//Output:[Selena Gmez=SG, Eminem=EN, Harry Styles=HS, Olivia Rodrigo=OR, Rihanna=RH, Sia=SA, Haris Jaya Raj=HR, The Weeknd=TW, Lil Nas X=LN, Shawn Mendes=SM, Bruno Mars=BM, Ellie Goulding=EG, Micheal Jackson=MJ, Yuvan Shankar Raja=SR, Bts=BTS, Ghibran=GB, Maroon5=M5, Ariana Grande=AG, Dua Lipa=DL, Halsey=HS, Jonas Brothers=JB, Devi Sri Prasad=DP, Hip Hop Tamizha=HT, Anne Marrie=AM, Billie Eilish=BE, Keeravani=KV, Hailee Steinfeld=HS, Ilayaraja=IR, S P BalaSubrahmanyam=SB, Charlie Puth=CP, Anup Rubens=AR, Camila Cabello=CC, Imagine Dragons=ID, A R Rahman=AR, Vidya Vox=VV, Black Pink=BP, Katy Perry=KP, Taylor Swift=TS, Ed Shareen=ES, Anirudh Ravichandran=AR, Demi Lovoto=DL, Brain Tyler=BT, Thaman S=TS, Miley Cyrus=MC, Marshmello=MM, Justin Bieber=JB, Alan Walker=AW, Drake=DK]
	    
	    System.out.println(table.keySet());//Output:[Selena Gmez, Eminem, Harry Styles, Olivia Rodrigo, Rihanna, Sia, Haris Jaya Raj, The Weeknd, Lil Nas X, Shawn Mendes, Bruno Mars, Ellie Goulding, Micheal Jackson, Yuvan Shankar Raja, Bts, Ghibran, Maroon5, Ariana Grande, Dua Lipa, Halsey, Jonas Brothers, Devi Sri Prasad, Hip Hop Tamizha, Anne Marrie, Billie Eilish, Keeravani, Hailee Steinfeld, Ilayaraja, S P BalaSubrahmanyam, Charlie Puth, Anup Rubens, Camila Cabello, Imagine Dragons, A R Rahman, Vidya Vox, Black Pink, Katy Perry, Taylor Swift, Ed Shareen, Anirudh Ravichandran, Demi Lovoto, Brain Tyler, Thaman S, Miley Cyrus, Marshmello, Justin Bieber, Alan Walker, Drake]

	}

}
