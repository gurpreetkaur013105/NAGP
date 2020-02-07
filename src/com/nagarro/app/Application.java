package com.nagarro.app;

import java.io.IOException;
import com.nagarro.service.AppService;
import com.nagarro.service.impl.AppServiceImpl;

public class Application {

	public static void main(String[] args) {

		AppService app = new AppServiceImpl();

		try {
			app.startApplication();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
