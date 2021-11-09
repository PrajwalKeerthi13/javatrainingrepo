package com.cruds.exception;


	public class StudentExpection extends RuntimeException{
		private String info;
		
		public StudentExpection(String info)
		{
			this.info=info;
		}

		public String getInfo() {
			return info;
		}
		

	}


