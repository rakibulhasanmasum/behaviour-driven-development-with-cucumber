package com.trucklagbe.managers;

import com.trucklagbe.dataProviders.ConfigFileReader;
import com.trucklagbe.dataProviders.JsonDataReader;
import com.trucklagbe.dataProviders.RoutesFileReader;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonDataReader jsonDataReader;
    private static RoutesFileReader routesFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
    }

    public JsonDataReader getJsonReader() {
        return (jsonDataReader == null) ? jsonDataReader = new JsonDataReader() : jsonDataReader;
    }

    public RoutesFileReader getRoutesReader() {
        return (routesFileReader == null) ? routesFileReader = new RoutesFileReader() : routesFileReader;
    }
}
