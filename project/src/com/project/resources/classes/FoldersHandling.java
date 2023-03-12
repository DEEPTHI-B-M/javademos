package com.project.resources.classes;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class FoldersHandling {
	private File directory;

	public FoldersHandling(String path) {
		this.directory = new File(path);
	}

	public List<File> listAllFiles() throws NullPointerException {
		List<File> files = Arrays.asList(this.directory.listFiles());
		files.sort(new Filesort());
		return files;
	}

	public File getDirectory() {
		return this.directory;
	}
}

class Filesort implements Comparator<File> {
	@Override
	public int compare(File o1, File o2) {
		return o2.getName().compareTo(o2.getName());
	}

}

