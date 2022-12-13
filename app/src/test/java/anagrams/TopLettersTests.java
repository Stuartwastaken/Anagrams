package anagrams;

import anagrams.model.*;
import anagrams.view.AnagramButton;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import javax.swing.*;

public class TopLettersTests {
	@Test public void testConstructor()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		
		assertNotNull(top);
    }
    
    @Test public void testSetLetter()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		JButton button = new JButton();
		top.setLetter(button);
		
		assertEquals(top.buttons.get(0), button);
	}
	
	@Test public void testSetLetterFalse()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		JButton button = new JButton();
		
		assertNotEquals(top.buttons.get(0), button);
	}
    
    @Test public void testGetPotentialWord()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		JButton button = new AnagramButton("C");
		JButton button2 = new AnagramButton("A");
		JButton button3 = new AnagramButton("T");
		top.setLetter(button);
		top.setLetter(button2);
		top.setLetter(button3);
		
		assertEquals(top.getPotentialWord(), "CAT");
	}
    
    @Test public void testGetIndex()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		JButton button = new AnagramButton("C");
		JButton button2 = new AnagramButton("A");
		JButton button3 = new AnagramButton("T");
		top.setLetter(button);
		top.setLetter(button2);
		top.setLetter(button3);
		
		assertEquals(top.getIndex(), 3);
	}
	
	    @Test public void testGetButtons()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		JButton button = new AnagramButton("C");
		JButton button2 = new AnagramButton("A");
		JButton button3 = new AnagramButton("T");
		top.setLetter(button);
		top.setLetter(button2);
		top.setLetter(button3);
		
		assertEquals(top.getButtons().size(), 6);
	}
    
}
    
