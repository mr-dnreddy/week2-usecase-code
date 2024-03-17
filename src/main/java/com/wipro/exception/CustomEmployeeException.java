package com.wipro.exception;

public class CustomEmployeeException  extends RuntimeException{
	
	public CustomEmployeeException(String message) {
        super(message);
    }

    public static class EmployeeNotFoundException extends CustomEmployeeException {
        public EmployeeNotFoundException(String message) {
            super(message);
        }
    }

    public static class EmployeeAlreadyExistsException extends CustomEmployeeException {
        public EmployeeAlreadyExistsException(String message) {
            super(message);
        }
    }

    public static class EmployeeUpdateException extends CustomEmployeeException {
        public EmployeeUpdateException(String message) {
            super(message);
        }
    }

    public static class EmployeeDeleteException extends CustomEmployeeException {
        public EmployeeDeleteException(String message) {
            super(message);
        }
    }

    public static class EmployeeAddException extends CustomEmployeeException {
        public EmployeeAddException(String message) {
            super(message);
        }
    }
}


