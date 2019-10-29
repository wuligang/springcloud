package com.wlg.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {

	private Long deptno;
	private String dname;
	private String db_source;

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

}
