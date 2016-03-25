package service.impl;

import service.MyService;

public class MyServiceImpl implements MyService{

	@Override
	public boolean valid(String username, String password) {
		if(username.equals("crazyit")&&password.equals("leegang"))
			return true;
		else
			return false;
	}

}
