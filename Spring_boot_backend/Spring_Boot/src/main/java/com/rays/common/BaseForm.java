package com.rays.common;

public class BaseForm {

	public Long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BaseDTO getDto() {
		return null;
	}

	public BaseDTO initDto(BaseDTO dto) {

		if (id != null && id > 0) {
			dto.setId(id);
		} else {
			dto.setId(null);
		}

		return dto;

	}

}
