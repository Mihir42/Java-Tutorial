public class Heart {

    private boolean healthy;
    private String size;

    public Heart(boolean healthy, String size) {
        this.healthy = healthy;
        this.size = size;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
