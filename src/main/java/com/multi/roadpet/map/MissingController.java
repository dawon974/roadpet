package com.multi.roadpet.map;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MissingController {

	@Autowired
	MissingService missingService;
	
	@RequestMapping(value="map",produces = "application/json") //all 검색 
	@ResponseBody
	public List<MissingVO> all() {
		return missingService.all();
	}

	@RequestMapping(value = "map", produces = "application/json")
	public void insert(MissingVO missingVO, HttpServletRequest request, MultipartFile file, Model model) throws IllegalStateException, IOException {

	}
}
