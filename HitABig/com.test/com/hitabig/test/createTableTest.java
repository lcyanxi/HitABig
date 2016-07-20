package com.hitabig.test;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class createTableTest {
	public static void main(String args[]){
		  new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
	   }
}
