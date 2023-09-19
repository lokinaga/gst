package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;
@Service
public class GstService {
@Autowired
GstDao gd;
	public String setGst(Gst gst) {
		
		return gd.setGst(gst);
	}
	public String setAllGst(List<Gst> gsts) {
		
		return gd.setAllGst(gsts);
	}
	public List<Gst> getAllGst() {
		
		return gd.getAllGst();
	}
	public Gst getByIdGst(int id) {
	
		return gd.getByIdGst(id);
	}
	public int getTaxByHsn(int a) {
		
		return gd.getTaxByHsn(a);
	}

}
