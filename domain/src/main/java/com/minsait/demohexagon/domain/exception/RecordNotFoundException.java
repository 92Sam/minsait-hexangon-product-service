package com.minsait.demohexagon.domain.exception;

@ErrorResponseStatus(404)
public class RecordNotFoundException extends CustomException {
  RecordNotFoundException(final String message) {
    super(message);
  }
}
