package patterns;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	Properties props;

	public ConfigurationReader() throws IOException {

		props = new Properties();
		props.load(getClass().getResourceAsStream("/config.properties"));
	}

	public String getUrl() {
		String url = props.getProperty("db_url");
		return url;
	}

	
	

}
