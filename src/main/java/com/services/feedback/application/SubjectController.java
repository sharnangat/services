package com.services.feedback.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public String executeAddSubject(@RequestBody Subject dto) {

		subjectService.addSubject(dto);

		return "Success";
	}

}
