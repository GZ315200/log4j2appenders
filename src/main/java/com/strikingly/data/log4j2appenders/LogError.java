package com.strikingly.data.log4j2appenders;

public class LogError {

    private String project;
    private int level;
    private String body;
    private long logTime;

    public LogError(String project, int level, String body, long logTime) {
        this.project = project;
        this.level = level;
        this.body = body;
        this.logTime = logTime;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getLogTime() {
        return logTime;
    }

    public void setLogTime(long logTime) {
        this.logTime = logTime;
    }
}
