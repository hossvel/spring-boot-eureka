package com.devhoss.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.model.Historico;

@RestController
public class RccServiceController {

	   private static Map<Integer, List<Historico>> historicoDB = new HashMap<Integer, List<Historico>>();
	   
	    static {
	    	historicoDB = new HashMap<Integer, List<Historico>>();
	 
	        List<Historico> lst = new ArrayList<Historico>();
	        Historico std = new Historico("BCP","DI",1200);
	        lst.add(std);
	        std = new Historico("MI BANCO","DD",100);
	        lst.add(std);
	        historicoDB.put(1, lst);
	 
	        lst = new ArrayList<Historico>();
	        std = new Historico("BBVA","DI",10450);
	        lst.add(std);
	        std = new Historico("SCOTIABANK","DD",4345);
	        lst.add(std);
	 
	        historicoDB.put(2, lst);
	 
	    }
	 
	    @RequestMapping(value = "/historico/{id}", method = RequestMethod.GET)
	    public List<Historico> getHistorico(@PathVariable int id) {
	        System.out.println("Getting Student details for " + id);
	 
	        List<Historico> histList = historicoDB.get(id);
	        if (histList == null) {
	        	histList = new ArrayList<Historico>();
	            Historico std = new Historico("Not Found", "N/A",0);
	            histList.add(std);
	        }
	        return histList;
	    }
	
}
