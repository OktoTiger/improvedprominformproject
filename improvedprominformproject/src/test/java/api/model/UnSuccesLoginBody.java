package api.model;

public class UnSuccesLoginBody {
    public int status;
    public String title;
    public String path;
    public Object errorCode;
    public String errorMessage;

    public int getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public Object getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
