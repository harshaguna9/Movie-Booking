package com.moviebookingspring.moviebooking.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MainExceptionHandler {

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<?> handleEmptyResultDataAccessException(EmptyResultDataAccessException exception)
	{
		return (ResponseEntity<?>) ResponseEntity.notFound();	
	}
}
