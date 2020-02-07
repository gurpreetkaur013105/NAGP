package com.nagarro.service;

import java.io.IOException;

public interface AppService {

	int TOTAL_ALLOWED_ATTEMPT = 4;

	void startApplication() throws IOException;

}
