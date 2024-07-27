package com.shivanshu.AlgoQuest.dao;

import com.shivanshu.AlgoQuest.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
