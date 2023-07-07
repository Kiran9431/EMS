public class Response {
    private int status;
    private String message;
    private String errorMessage;

    // Constructors, getters, and setters
     

    public Response(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Response(int status, String message, String errorMessage) {
		super();
		this.status = status;
		this.message = message;
		this.errorMessage = errorMessage;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

