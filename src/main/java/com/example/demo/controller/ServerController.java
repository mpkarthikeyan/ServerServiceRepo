package com.example.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Server;

@RestController
public class ServerController {
	
	Map<String ,Server> serverMap=new HashMap<String ,Server>();
	
	
	
	@RequestMapping(method=RequestMethod.GET, path="/server/fetch" ,produces="application/json;charset=utf-8")
	public @ResponseBody Collection<Server> fetchServers(){
		
		return serverMap.values();
		
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/update")
	public @ResponseBody String updateServer(@RequestParam(value="name", required=true) String name, 
			     @RequestParam(value="customer", required=false) String customer,@RequestParam(value="region", required=false) String region){
		
		String msg="";
     Server insertServer= serverMap.get(name);
		
		if(insertServer != null) {
			insertServer.setCustomer(customer);
			insertServer.setName(name);
			insertServer.setRegion(region);
			msg="updated sucessfully";
		}else {
		   msg="no server found to update with the provided name ";
		}
		return msg; 
		
	}
	@RequestMapping(method=RequestMethod.GET, path="/insert")
	public @ResponseBody String InsertServer(@RequestParam(value="name", required=true) String name, 
			     @RequestParam(value="customer", required=true) String customer,@RequestParam(value="region", required=true) String region){
		
		
Server insertServer= serverMap.get(name);
		
		if(insertServer != null) {
			insertServer.setCustomer(customer);
			insertServer.setName(name);
			insertServer.setRegion(region);
		}else {
		serverMap.put(name, new Server(name, region, customer));
		}
		return "insertedSucessfilly"; 
		
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/delete")
	public @ResponseBody String updateServer(@RequestParam(value="name", required=true) String serverName){
		Server deleteServer= serverMap.get(serverName);
		String msg="";

		if(deleteServer != null) {
			serverMap.remove(serverName);
			msg="Deleted Sucessfully";
		}else {
			msg ="Server not found to delete";
		}
		return msg;
	}
	
	{
		serverMap.put("oracle", new Server("oracle","ca","DBA"));
		serverMap.put("Jboss", new Server("Jboss","tx","app"));
		serverMap.put("weblogic", new Server("weblogic","ny","ecomm"));
	}
	

}
