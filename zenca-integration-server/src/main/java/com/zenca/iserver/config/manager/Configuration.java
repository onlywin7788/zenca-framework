package com.zenca.iserver.config.manager;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

public class Configuration {

    public void load() throws Exception
    {
        String APP_BASE_HOME = System.getenv("ZENCA_HOME");
        String REPOSITORY_PATH = APP_BASE_HOME + File.separator + "config" +  File.separator + "application.yaml";

        loadRepository(REPOSITORY_PATH);
    }

    public void loadRepository(String path) throws Exception
    {

        Yaml yaml = new Yaml();
        InputStream in = new FileInputStream(path);

        Map<String,String> result = (Map<String,String>)yaml.load(in);

        String type = result.get("TYPE");
        String host = result.get("HOST");
        String dbName = result.get("DBNAME");
        String user = result.get("USER");
        String password = result.get("PASSWORD");
    }

}
