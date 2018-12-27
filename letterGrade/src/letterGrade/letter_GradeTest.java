package letterGrade;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class letter_GradeTest {
	private letter_Grade letter_GradeChecker;
	
	
	@Before
	public void setUp() throws Exception {
		letter_GradeChecker=new letter_Grade();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void TCS101() {
		Assert.assertEquals('X', letter_GradeChecker.letterGrade(101));
	}
	
	
	@Test
	public void TCS95() {
		Assert.assertEquals('A', letter_GradeChecker.letterGrade(95));
	}

	@Test
	public void TCS89() {
		Assert.assertEquals('B', letter_GradeChecker.letterGrade(89));
	}
	
	@Test
	public void TCS85() {
		Assert.assertEquals('B', letter_GradeChecker.letterGrade(85));
	}
	
	@Test
	public void TCS79() {
		Assert.assertEquals('C', letter_GradeChecker.letterGrade(79));
	}

	@Test
	public void TCS75() {
		Assert.assertEquals('C', letter_GradeChecker.letterGrade(75));
	}
	
	@Test
	public void TCS69() {
		Assert.assertEquals('D', letter_GradeChecker.letterGrade(69));
	}

	@Test
	public void TCS65() {
		Assert.assertEquals('D', letter_GradeChecker.letterGrade(65));
	}
	
	@Test
	public void TCS59() {
		Assert.assertEquals('F', letter_GradeChecker.letterGrade(59));
	}
	
}
