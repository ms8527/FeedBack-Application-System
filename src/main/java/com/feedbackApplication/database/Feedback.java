package com.feedbackApplication.database;

public class Feedback {

	public Feedback(){
		
	}
	
	private String feedbackReceiver;
	private String feedbackSubmitter;
	private String feedbackDate;
	private String feedbackText;
	private String anonymous;
	private int rating;
	public String getFeedbackReceiver() {
		return feedbackReceiver;
	}
	public void setFeedbackReceiver(String feedbackReceiver) {
		this.feedbackReceiver = feedbackReceiver;
	}
	public String getFeedbackSubmitter() {
		return feedbackSubmitter;
	}
	public void setFeedbackSubmitter(String feedbackSubmitter) {
		this.feedbackSubmitter = feedbackSubmitter;
	}
	public String getFeedbackDate() {
		return feedbackDate;
	}
	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}
	public String getFeedbackText() {
		return feedbackText;
	}
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}
	public String getAnonymous() {
		return anonymous;
	}
	public void setAnonymous(String anonymous) {
		this.anonymous = anonymous;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
