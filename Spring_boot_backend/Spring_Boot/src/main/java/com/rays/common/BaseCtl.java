package com.rays.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;

@RestController
public class BaseCtl {

	public ORSResponse validate(BindingResult bindingResult) {

		ORSResponse res = new ORSResponse(true);
		

		if (bindingResult.hasErrors()) {
			res.setSuccess(false);

			Map<String, String> error = new HashMap();

			List<FieldError> list = bindingResult.getFieldErrors();

			list.forEach(e -> {

				error.put(e.getField(), e.getDefaultMessage());
			});

			res.addInputError(error);
		}

		return res;

	}

}
