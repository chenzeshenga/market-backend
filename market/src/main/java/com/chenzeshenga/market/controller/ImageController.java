package com.chenzeshenga.market.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImageController {

	@RequestMapping("/wemall/images")
	public void getImage(@RequestParam String filename, HttpServletRequest request,
			HttpServletResponse response) {

		response.setContentType("image/jpeg");

		 Path path = Paths.get("/tmp/images", filename);
//		Path path = Paths.get("C:\\Users\\chenz\\Downloads", filename);
		try {
			byte[] bytes = Files.readAllBytes(path);
			response.getOutputStream().write(bytes);
			response.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
