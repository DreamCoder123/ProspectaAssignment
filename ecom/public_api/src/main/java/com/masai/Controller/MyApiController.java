package com.masai.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.MyApiException;
import com.masai.Service.ApiServiceImpl;
import com.masai.model.myapi;

@RequestMapping("/home")
@RestController
public class MyApiController {
	
	@Autowired
	ApiServiceImpl service;
	
	@PostMapping("/create")
    public ResponseEntity<myapi> createApi(@RequestBody myapi obj){

        myapi api = service.createApi(obj);
        return new ResponseEntity<myapi>(api,HttpStatus.OK);

    }
    
 

    
    
    @GetMapping("/category")
    public ResponseEntity<List<myapi>> getByCategories() throws MyApiException{
    	List<myapi> list = service.getByCategories();
    	
    	return new ResponseEntity<List<myapi>>(list,HttpStatus.OK);
    }
    
    @GetMapping("/health")
    public ResponseEntity<List<myapi>> getByHealth() throws MyApiException{
    	List<myapi> list = service.getByHealth();
    	return new ResponseEntity<List<myapi>>(list,HttpStatus.OK);
    }
    
    @GetMapping("/random")
    public ResponseEntity<myapi> RandomApi() throws MyApiException{
        myapi api = service.getByRandom();
        return new ResponseEntity<myapi>(api,HttpStatus.OK);

    }
    
    @GetMapping("/searchbyat")
    public ResponseEntity<List<String>> searchByAt(@RequestParam String des) throws MyApiException{
        List<String> li = service.getListBySearch(des);
        return new ResponseEntity<List<String>>(li,HttpStatus.OK);

    }
    
}
