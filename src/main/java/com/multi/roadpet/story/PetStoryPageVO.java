package com.multi.roadpet.story;

public class PetStoryPageVO {
	
	private int start;
	private int end;
	private int page;

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setStartEnd() {
		start = 1 + (page -1) * 6;
	//			1 + (1 - 1) * 6 = 1
	//			1 + (2 - 1) * 6 = 7
	//			1 + (3 - 1) * 6 = 13
		end = page * 6;
	//        1 * 6 = 6
	//		  2 * 6 = 12
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "PageVO [start=" + start + ", end=" + end + ", page=" + page + "]";
	}

}