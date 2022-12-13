package anagrams;

import anagrams.model.*;
import anagrams.view.AnagramButton;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import javax.swing.*;

public class BottomLettersTests {
	@Test public void testConstructor()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		BottomLetterViewModel bottom = new BottomLetterViewModel(top);
		
		assertNotNull(bottom);
    }

	@Test public void testImport()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		BottomLetterViewModel bottom = new BottomLetterViewModel(top);
		Difficulty diff = new TestingMode();
		bottom.importLetters(diff);
		
		assertNotNull(bottom.getButtons());		
	}

	@Test public void testReturnedButtons()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		BottomLetterViewModel bottom = new BottomLetterViewModel(top);
		Difficulty diff = new TestingMode();
		bottom.importLetters(diff);
		ArrayList<JButton> listOfButtons = bottom.getButtons();
		
		assertEquals(listOfButtons.size(), 6);
	}
	
	@Test public void testSetLetter()
    {
		TopLetterViewModel top = new TopLetterViewModel();
		BottomLetterViewModel bottom = new BottomLetterViewModel(top);
		Difficulty diff = new TestingMode();
		bottom.importLetters(diff);
		
		AnagramButton addedButton = new AnagramButton("A");
		
		ArrayList<JButton> listOfButtons = bottom.getButtons();
		
		assertEquals(listOfButtons.size(), 6);
	}	
	
}
