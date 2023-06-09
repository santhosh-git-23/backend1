package com.exam.examportal.service;

import java.util.Set;

import com.exam.examportal.model.exam.Quiz;


public interface QuizService {
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getQuizzes();
	public Quiz getQuiz(Long quizId);
	public void deleteQuiz(Long quizId);
}
