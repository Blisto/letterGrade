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
	public void TC1() {
		Assert.assertEquals('X', letter_GradeChecker.letterGrade(101));
	}

	@Test
	public void TC2() {
		Assert.assertEquals('X', letter_GradeChecker.letterGrade(-1));
	}

	@Test
	public void TC3() {
		Assert.assertEquals('A', letter_GradeChecker.letterGrade(100));
	}
	
	@Test
	public void TC4() {
		Assert.assertEquals('A', letter_GradeChecker.letterGrade(95));
	}
	
	@Test
	public void TC5() {
		Assert.assertEquals('A', letter_GradeChecker.letterGrade(90));
	}

	@Test
	public void TC6() {
		Assert.assertEquals('B', letter_GradeChecker.letterGrade(85));
	}
	
	@Test
	public void TC7() {
		Assert.assertEquals('B', letter_GradeChecker.letterGrade(80));
	}

	@Test
	public void TC8() {
		Assert.assertEquals('C', letter_GradeChecker.letterGrade(75));
	}
	
	@Test
	public void TC9() {
		Assert.assertEquals('C', letter_GradeChecker.letterGrade(70));
	}

	@Test
	public void TC10() {
		Assert.assertEquals('D', letter_GradeChecker.letterGrade(65));
	}
	
	@Test
	public void TC11() {
		Assert.assertEquals('D', letter_GradeChecker.letterGrade(60));
	}

	@Test
	public void TC12() {
		Assert.assertEquals('F', letter_GradeChecker.letterGrade(59));
	}
}
