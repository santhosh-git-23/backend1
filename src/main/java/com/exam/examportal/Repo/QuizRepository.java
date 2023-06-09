package com.exam.examportal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

}
