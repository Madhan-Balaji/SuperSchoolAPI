package com.madtech.superschoolapi.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
	
	private ClassLoader classLoader;
	private Properties prop;
	private InputStream input;
	
	public PropertiesLoader() {
		this.classLoader = getClass().getClassLoader();
		this.prop = new Properties();
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
			if(!this.prop.isEmpty()) this.prop.clear();
			this.prop.load(this.input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.prop;
	}

}
