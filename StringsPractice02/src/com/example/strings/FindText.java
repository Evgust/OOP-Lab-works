package com.example.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "gettys.html";
    private Pattern pattern;
    private Matcher m;

    public static void main(String[] args) {
        FindText find = new FindText();
        if (args.length >= 1) {
            find.fileName = args[0];  // Override default file name
        }
        if (args.length >= 2) {
            find.pattern = Pattern.compile(args[1]);  // Override default regex
        } else {
            // If no regex provided, use a default pattern.
            find.pattern = Pattern.compile("<h4>");
        }
        find.run();
    }

    public void run() {
        pattern = Pattern.compile("<h4>");
        pattern = Pattern.compile("\\bto\\b");
        pattern = Pattern.compile("^\\s{4}");
        pattern = Pattern.compile("^<[p|d]");
        pattern = Pattern.compile("^</.*?>$");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";

            int c = 1;
            while ((line = reader.readLine()) != null) {
                m = pattern.matcher(line);
                if (m.find()) {
                    System.out.println(" " + c + " " + line);
                }
                c++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
