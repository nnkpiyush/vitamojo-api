package utils;


import org.yaml.snakeyaml.Yaml;

import Base.config;

public class YamlReader {
	private String filePath;
	public YamlReader(String filePath) {
		this.filePath = filePath;
	}
	
	public config readConfig() {
		 return new Yaml().loadAs(FileReader.read(filePath), config.class);
	}
}
