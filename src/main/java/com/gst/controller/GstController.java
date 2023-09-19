package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gs;
	@PostMapping(value="/setGst")
	public String setGst(@RequestBody Gst gst) {
		return gs.setGst(gst);
	}
	@PostMapping(value="/setAllGst")
	public String setAllGst(@RequestBody List<Gst> gsts) {
		return gs. setAllGst(gsts);
	}
	
	@GetMapping(value="/getAllGst")
	public List<Gst> getAllGst(){
		return gs.getAllGst();
		
	}
	@GetMapping(value ="/getByIdGst/{id}")
	
		public Gst getByIdGst(@PathVariable int id){
			return gs.getByIdGst(id);
		}
	
 @GetMapping(value="/getTaxByHsn/{a}")
 public int getTaxByHsn(@PathVariable int a) {
	 return gs.getTaxByHsn(a);
 }
 
	@PatchMapping(value="/updateGst/{id}")
	public String updateGst(@PathVariable int id,@RequestBody Gst gst) {
		return gs.updateGst(id,gst);
	}
 }


