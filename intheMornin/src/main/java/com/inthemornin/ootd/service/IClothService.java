package com.inthemornin.ootd.service;

import com.inthemornin.ootd.model.CustomerVO;

public interface IClothService {
	int getCount();
	int getCount(int deptid);
	void insertCust(CustomerVO cust);
}
