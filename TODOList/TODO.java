class TODO  {

    private String desc;
    private int priority;
    private boolean complete;

    TODO(String desc, int priority)  {
        this.desc = desc;
        this.priority = priority;
        complete = false;
    }

    public void setStatus(boolean complete) {
        this.complete = complete;
    }

    public String getDesc() { return desc;}

    public int getPriority() { return priority;}

    public String getComplete() {
        if (complete)   {
            return "complete";
        }
        return "unfinished";
    }


}