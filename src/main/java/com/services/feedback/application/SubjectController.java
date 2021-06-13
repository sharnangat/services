package com.services.feedback.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.services.feedback.model.dto.SubjectDTO;
import com.services.model.Subject;
import com.services.spring.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity executeAddSubject(@RequestBody SubjectDTO dto) {

		subjectService.addSubject(dto);

		ResponseEntity entity = new ResponseEntity(dto, HttpStatus.CREATED);

		return entity;
	}

	@RequestMapping("/fetch")
	public @ResponseBody ResponseEntity fetchData() {

		List<Subject> lst = subjectService.fetchList();

		ResponseEntity entity = new ResponseEntity(lst, HttpStatus.OK);

		return entity;
	}
	
	@RequestMapping("/gets")
	
	public @ResponseBody ResponseEntity fetchById(@RequestParam int  id ) {
				
	Optional<Subject> s=	subjectService.fetchById1(id);
		
		ResponseEntity entity = new ResponseEntity(s, HttpStatus.OK);
		
		return entity;
		
	}
	

}
