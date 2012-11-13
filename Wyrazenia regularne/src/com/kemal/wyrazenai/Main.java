package com.kemal.wyrazenai;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	Pattern p;
	Matcher m;
	BufferedReader file;
	String teksty = "";
	String[] teksty2 = null;

	public Main() throws IOException {
		file = new BufferedReader(new FileReader(
				"C:\\Users\\user\\Desktop\\plan.txt"));

		String text = "";
		while ((text = file.readLine()) != null) {
			teksty += text + "\n";
		}
		p = Pattern.compile("\n");
		teksty2 = p.split(teksty);

		for (String s : teksty2) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) throws IOException {
		new Main();

	}
}
