import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class FileTest {
	private File saveAs(File f) throws IOException {
		return f;
	}

	@Test
	public void testFileSystemError() {
		File f = new FullFile("foo") {
			public boolean createNewFile() throws IOException {
				throw new IOException();
			}
		};
		try {
			saveAs(f);
			fail();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
