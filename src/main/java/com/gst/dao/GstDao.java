package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;
@Repository
public class GstDao {
@Autowired
GstRepository gr;
	public String setGst(Gst gst) {
		
		gr.save(gst);
		return "saved successfully";
	}
	public String setAllGst(List<Gst> gsts) {
		 gr.saveAll(gsts);
		return "saved sucess";
	}
	public List<Gst> getAllGst() {
		
		return gr.findAll();
	}
	public Gst getByIdGst(int id) {
		
		return gr.findById(id).get();
	}
	public int getTaxByHsn(int a) {
		
		return gr.findbyHsn(a);
	}

}
