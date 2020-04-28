package com.mahmoud.daggertest.models.custom;

public class ModelThrowable {
    private Throwable throwable;
    private boolean displayMessage;
    private boolean displayViewMessage;

    public boolean isDisplayViewMessage() {
        return displayViewMessage;
    }

    public void setDisplayViewMessage(boolean displayViewMessage) {
        this.displayViewMessage = displayViewMessage;
    }

    public ModelThrowable(Throwable throwable, boolean displayMessage, boolean displayViewMessage) {
        this.throwable = throwable;
        this.displayMessage = displayMessage;
        this.displayViewMessage = displayViewMessage;
    }

    public ModelThrowable(String throwable, boolean displayMessage, boolean displayViewMessage) {
        this.throwable = new Throwable(throwable);
        this.displayMessage = displayMessage;
        this.displayViewMessage = displayViewMessage;
    }

    public ModelThrowable(Throwable throwable, boolean displayMessage) {
        this.throwable = throwable;
        this.displayMessage = displayMessage;
        this.displayViewMessage = false;
    }

    public ModelThrowable(String throwable, boolean displayMessage) {
        this.throwable = new Throwable(throwable);
        this.displayMessage = displayMessage;
        this.displayViewMessage = false;
    }



    public ModelThrowable(String throwable) {
        this.throwable = new Throwable(throwable);

    }

    public ModelThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public boolean isDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(boolean displayMessage) {
        this.displayMessage = displayMessage;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }


}
