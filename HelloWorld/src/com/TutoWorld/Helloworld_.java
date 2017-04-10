package com.TutoWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.portlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.portlet.ModelAndView;

@Controller

@RequestMapping("/Hello")

public class Helloworld_ {

 // public ModelAndView printHello() 
	 @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";}}
//@RequestMapping(value="/Hello", method=RequestMethod.POST)
////@ResponseBody
//public String index1(){
	
	//return "index1";
//


	 /// @RequestMapping(value="/Hello",method=RequestMethod.POST)
	 // @ResponseBody
	 // int save(@RequestBody Smartphones Hello)
	    //{
	    //    return model1.save(Hello);
	   // }
	  //model1.addObject("message","hello.. world..");
	   
    
    // return model1;
 // }
//}


 

   

    
   
   


