package com.va.week8;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class PatientController {
	
	@RequestMapping("/patientform")
	public String patientForm(@ModelAttribute(name="patientForm") Patient patient,  Model m) throws StreamWriteException, DatabindException, IOException
	{
	  String patientId = patient.getPatientId();
     String firstName= patient.getFirstName();
     String lastName= patient.getLastName();
	
     /*
      * add the logic of creating json file from the dynamic inputs from ther user!. 
      */
     
     ObjectMapper objectMapper = new ObjectMapper();
     Patient patient1 = new Patient(patientId, firstName, lastName);  // dynamic inputs from the user!- html file.
    // objectMapper.writeValue(new File("templates/patient.json"), patient1);
     
     // create a file object
     File file = new File("/templates/patient.json");

     // write JSON to a File
     objectMapper.writeValue(file, patient1);
          
		return "homepagepage";
		
	}

}

