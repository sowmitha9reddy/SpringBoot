package com.example.springboot.model;

public class User {
         private int id;
         private String name;
         private String dept;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String name, String dept) {
			super();
			this.name = name;
			this.dept = dept;
		}
		
		public User(int id, String name, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
         
}
