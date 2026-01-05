package com.kodewala.interviewquestions.question7;

public class SmartPhone implements Camera , MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("Playing music ");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking pictures");
		
	}

}
