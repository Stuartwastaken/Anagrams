package anagrams;

import anagrams.model.*;
import anagrams.view.AnagramButton;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import javax.swing.*;

public class ScorePanelTests {
	@Test public void testConstructor()
    {
		ScorePanelViewModel score = new ScorePanelViewModel();
		assertNotNull(score);
	}
	
	@Test public void testUpdateScore()
    {
		ScorePanelViewModel scoreModel = new ScorePanelViewModel();
		scoreModel.updateScore(2000);
		assertEquals(scoreModel.score, 2000);		
	}
	
	
}
