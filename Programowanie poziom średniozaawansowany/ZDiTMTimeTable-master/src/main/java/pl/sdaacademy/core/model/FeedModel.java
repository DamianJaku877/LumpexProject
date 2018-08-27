package pl.sdaacademy.core.model;

public abstract class FeedModel {
    protected String id;

    public FeedModel(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
