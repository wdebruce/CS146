import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab2_JUnitTest {

	@Test
	void test() {
		Lab2 lab = new Lab2();
		assertTrue(lab.anagram("hello", "ohell"));
		assertTrue(lab.anagram("listen", "silent"));
		assertFalse(lab.anagram("Extra", "Extraa"));
		assertTrue(lab.anagram("a gentleman", "elegant man"));
		assertTrue(lab.anagram("Clint Eastwood", "old west action"));
		assertTrue(lab.anagram("William Shakespeare", "I'll make a wise phrase"));
		assertTrue(lab.anagram("a decimal point", "I'm a dot in place"));
	}

}
