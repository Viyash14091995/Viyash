package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties P;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Adactincucumber\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		P = new Properties();
		P.load(fis);
	}

	public String getBrowserName() {
		String browsername = P.getProperty("browsername");
		return browsername;
	}

	public String geturl() {
		String url = P.getProperty("url");
		return url;
	}

}
