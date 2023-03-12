package com.project.resources.classes;

import java.io.File;

import java.io.IOException;;

public class FileOperations {
	private static FoldersHandling foldersHandling;

	public FileOperations(FoldersHandling foldersHandling) {
		FileOperations.foldersHandling = foldersHandling;
	}

	public void createFile(String filename) {
		File directory = foldersHandling.getDirectory();
		File newFile = new File(directory.toString() + "\\" + filename);
		if (directory.exists() && directory.isDirectory()) {
			if (!this.searchFile(filename)) {
				try {
					if (newFile.createNewFile()) {
						System.out.println(filename + " file created");
					} else {
						System.out.println(filename + " not created try again");
					}
				} catch (IOException e) {
					System.out.println("Error happens please try again");
				}
			}else {
				System.out.println(filename+" already exist");
			}
		} else {
			System.out.println("Folder not Found");
		}
	}

	public void deleteFile(String filename) {
		File directory = foldersHandling.getDirectory();
		File newFile = new File(directory.toString() + "\\" + filename);
		if (directory.exists() && directory.isDirectory()) {
			if (this.searchFile(filename)) {
				if (newFile.delete()) {
					System.out.println(filename + " Deleted Successfully");
				} else {
					System.out.println("New file not created created try again");
				}
			} else {
				System.out.println("File does not exist");
			}

		} else {
			System.out.println("Folder not Found");
		}
	};

	public boolean searchFile(String filename) {
		File directory = foldersHandling.getDirectory();
		File file = new File(directory.toString() + "\\" + filename);
		if (foldersHandling.listAllFiles().contains(file))
			return true;
		return false;
	}

}