package com.madtech.superschool.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
	
	private ClassLoader classLoader;
	private Properties prop;
	private InputStream input;
	
	public PropertiesLoader() {
		this.classLoader = getClass().getClassLoader();
	}
	
	public Properties getPersistenceProperties() {
		return this.getProperties("persistence.properties");
	}
	
	public Properties getConfigProperties() {
		return this.getProperties("config.properties");
	}
	
	private Properties getProperties(String fileName) {
		this.input = this.classLoader.getResourceAsStream(fileName);
		try {
			this.prop.clear();
			this.prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.prop;
	}

}
