package org.fsk;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private String question;
    private T input;
    private Long executionTime;
    private String methodName;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public T getInput() {
        return input;
    }

    public void setInput(T input) {
        this.input = input;
    }

    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "Result{" +
                "question='" + question + '\'' +
                ", input=" + input +
                ", executionTime=" + executionTime +
                ", methodName='" + methodName + '\'' +
                '}';
    }
}
