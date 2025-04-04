package com.javaex.problem08;

public class Book {
	    private int bookNo;
	    private String title;
	    private String author;
	    private int stateCode;
	    //소스 - using field
		public Book(int bookNo, String title, String author) {
			this.bookNo = bookNo;
			this.title = title;
			this.author = author;
			this.stateCode = 1;
		}

		public int getBookNo() {
			return bookNo;
		}
		
		public void setBookNo(int bookNo) {
			this.bookNo = bookNo;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getStateCode() {
			return stateCode;
		}

		public void setStateCode(int stateCode) {
			this.stateCode = stateCode;
		}
		
		public void rent() {
			this.stateCode = 0;
			System.out.println(this.title + "이(가) 대여 됐습니다.");
		}	
		public void showInfo() {
			String status = (stateCode == 1) ? "재고있음" : "대여중";
			System.out.println(bookNo + "책제목: " + title + ", 작가: " + author + ",대여 유무: " + status);
		}
}
