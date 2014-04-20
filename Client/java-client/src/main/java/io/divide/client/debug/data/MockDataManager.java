package io.divide.client.debug.data;

import com.google.inject.Inject;
import io.divide.client.BackendConfig;
import io.divide.client.data.DataManager;
import io.divide.client.data.DataWebService;

/**
 * Created by williamwebb on 4/6/14.
 */
public class MockDataManager extends DataManager {

    @Inject MockDataWebService mockDataWebService;

    @Inject
    public MockDataManager(BackendConfig config) {
        super(config);
    }

    @Override
    public DataWebService getWebService(){
        return mockDataWebService;
    }

    @Override
    public void initAdapter(BackendConfig config){};
}