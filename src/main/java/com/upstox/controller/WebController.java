/**
 * 
 */
package com.upstox.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author manobendra_b
 *
 */
@RestController
public class WebController {

	@RequestMapping(value = "/rws/margin/calc/mar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String marginStratgyBuilder(@RequestBody String margin ) {
		System.err.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.err.println("Data: "+margin);
        
        
        return "data";
    }
    
}
