package com.ajn.InnerClassesBasics;

public class Button {

	private String title;
	private OnClickListener OnCLickListener;
	
	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setOnCLickListener(OnClickListener onCLickListener) {
		this.OnCLickListener = onCLickListener;
	}
	
	public void onClick() {							//onClick() of button class
		this.OnCLickListener.onClick(this.title);
	}
	
	public interface OnClickListener{
		public void onClick(String title);			//onClick of OnClickListener Class,
													//which is defined inside psvm method of the main class
	}
	
	
}
