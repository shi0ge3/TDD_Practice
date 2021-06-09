import java.io.File;
import java.io.IOException;

public class FullFile extends File {
	public FullFile(String path) {
		super(path);
	}

	public boolean createNewFile() throws IOException {
		throw new IOException();
	}
}
