package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class TestController {



	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customer() {
		return "customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String addCustomer(@RequestParam CommonsMultipartFile[] fileUpload)
			throws Exception {
//		if (fileUpload != null && fileUpload.length > 0) {
//			for (CommonsMultipartFile aFile : fileUpload) {
//				Member uploadFile = new Member();
////				uploadFile.setName(aFile.getOriginalFilename());
//				uploadFile.setData(aFile.getBytes());
//				fileUploadService.save(uploadFile);
//			}
//		}

		return "customer";
	}

}
