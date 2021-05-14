package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecordStoreLearningTest {
	private RecordStore store;

	@BeforeEach
	public void setUp() {
		store = RecordStore.openRecordStore("testing", true);
	}

	@AfterEach
	public void tearDown() {
		RecordStore.deleteRecordStore("testing");
	}

	@Test
	public void testStore() {
		int id = store.addRecord(new byte[] {5, 6}, 0, 2);
		assertEquals(2, store.getRecordSize(id));
		byte[] buffer = new byte[2];
		assertEquals(2, store.getRecord(id, buffer, 0));
		assertEquals(5, buffer[0]);
		assertEquals(6, buffer[1]);
	}

}
