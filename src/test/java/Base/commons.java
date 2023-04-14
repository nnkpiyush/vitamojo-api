package Base;



import utils.YamlReader;


public class commons {
	public static config config;
	
	static {
		
		config = new YamlReader("config.yml").readConfig();	
	}
	public commons() {
		
	}
	
	

}
