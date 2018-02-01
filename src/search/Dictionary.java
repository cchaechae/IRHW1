package search;
import java.io.*;
import java.util.*;

/**
 * This class keeps track of the number of unique strings added to the dictionary
 *  
 * @author dkauchak
 *
 */
public class Dictionary{
	
	/**
	 * Adds a word to the dictionary
	 * 
	 * @param word the word to be added
	 */
	HashSet<String> wordlist = new HashSet<String>();
	int lsize;
	public void addWord(String word){
		if (!wordlist.contains(word))
		{
			wordlist.add(word);
		}
		else
		{
			System.out.println("Word already exists");
		}
	}
	
	/**
	 * Get the size of the dictionary
	 * 
	 * @return the dictionary size
	 */
	public int size(){
		lsize = wordlist.size();
		return lsize;
	}
	
//	public static void main(String[] args)
//	{
//
//		Dictionary wlist = new Dictionary();
//		wlist.addWord("123");
//		wlist.addWord("1234");
//		wlist.addWord("test1");
//		wlist.addWord("test2");
//		int testsize = wlist.size();
//		System.out.println(testsize);
//	}
}
