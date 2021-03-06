package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sip.ams.entities.Etudiant;

@Controller
public class FirstController {
	     @RequestMapping("/first")
	     public String home(Model m)
	     {
	    	 String nom = "Sahar Ben Sassi";
	    	 String universite = "Test";
	    	 String email ="saharbsassi@gmail.com";
	    	 String tel ="+216 58 767 443";
	    	 m.addAttribute("name", nom);
	    	 m.addAttribute("myUniversity", universite);
	    	 m.addAttribute("myEmail", email);
	    	 m.addAttribute("myTel", tel);
	    	 
	    	 ArrayList<String> cours = new ArrayList<>();
	    	 cours.add("Java OCA");
	    	 cours.add("Java OCP");	
	    	 cours.add("Spring");
	    	 cours.add("Microservices");
	    	 m.addAttribute("cours", cours);
	    	
	    	 return "home/app";
	     }
	     @RequestMapping("/list")
	     public String Etudiant(Model m)
	     {
	    	 ArrayList<Etudiant> students = new ArrayList<>();
	    	 students.add(new Etudiant("Ala", 25, "ala@gmail.com", "Tunis", 20205306));
	    	 students.add(new Etudiant("Marwen", 27, "marou@gmail.com", "Tunis", 58124530));
	    	 students.add(new Etudiant("Sahar", 30, "Sahar@gmail.com", "Nabeul", 41258030));
	    	 m.addAttribute("students", students);
	    	 return "home/Etudiant";
	     }
	     @RequestMapping("/add")
	     public String addEtudiant(Model m) {
	     return "home/addStudent";
	
	     }
}
