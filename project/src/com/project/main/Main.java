package com.project.main;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.project.resources.classes.FileOperations;
import com.project.resources.classes.FoldersHandling;


public class Main {
	static Scanner input = new Scanner(System.in);
	static final String PATH = "C:\\javafsd\\javademos\\javademos\\javademoproject";
	static FoldersHandling foldersHandling = new FoldersHandling(PATH);

	public static void main(String[] args) {
		developerInfo();
		String op;
		boolean flag = true;
		while (flag) {
			System.out.println("--------------------------------------------------------");
			System.out.println("|                      Main Menu                       |");
			System.out.println("--------------------------------------------------------");
			System.out.println(
					"1. Fetch all files\n2. Do operations(Create, Delete, Search)\nOther option leads to exit\nEnter your option:");
			op = input.next();
			input.nextLine();
			switch (op) {
			case "1":
				try {
					List<File> files = foldersHandling.listAllFiles();
					if (files.size() > 0) {
						System.out.println("------Files in " + foldersHandling.getDirectory().getName() + " directory are------");
						for (File file : files)
							System.out.println(file.getName());
					} else {
						System.out.println("Folder is empty");
					}
				} catch (NullPointerException e) {
					System.out.print("Folder Not found");
				}
				break;
			case "2":
				boolean flag1 = true;
				String filename, op1;
				FileOperations fileOperations = new FileOperations(foldersHandling);
				while (flag1) {
					System.out.println("--------------------------------------------------------");
					System.out.println("|                       Operations                     |");
					System.out.println("--------------------------------------------------------");
					System.out.println(
							"1. Create a file\n2. Delete a file\n3. Search a file\n4. Back to main menu\nEnter Your option(Any other digits to exit):");
					try {
						op1 = input.next();
						input.nextLine();
						switch (op1) {
						case "1":
							System.out.print("Enter the file name to create: ");
							filename = input.nextLine();
							fileOperations.createFile(filename);
							break;
						case "2":
							System.out.print("Enter the file name to delete: ");
							filename = input.nextLine();
							fileOperations.deleteFile(filename);
							break;
						case "3":
							System.out.print("Enter the file name to search: ");
							filename = input.nextLine();
							if (fileOperations.searchFile(filename))
								System.out.println(filename + " found");
							else
								System.out.println(filename + " not found");
							break;
						case "4":
							flag1 = false;
							break;
						default:
							System.out.println("------Thank You for using the Application------");
							System.exit(0);
						}
					} catch (InputMismatchException ime) {
						System.out.println("Please enter the valid options");
					}
				}

				break;
			default:
				System.out.println("------Thank You for using the Application------");
				System.exit(0);
			}
		}
	}

	private static void developerInfo() {
		System.out.println("--------------------------------------------------------");
		System.out.println("|                     Project 1                     |");
		System.out.println("|                  Developer: Deepthi B M                 |");
	}
}
