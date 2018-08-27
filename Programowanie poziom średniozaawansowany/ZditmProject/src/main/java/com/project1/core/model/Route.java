package com.project1.core.model;

public class Route extends FeedModel {
    private String route_short_name;
    private String route_long_name;
    private String route_desc;
    private String route_type;
    private String route_url;
    private String route_color;
    private String route_text_color;

    public Route(String route_id, String route_short_name, String route_long_name, String route_desc, String route_type, String route_url, String route_color, String route_text_color) {
        super(route_id);
        this.route_short_name = route_short_name;
        this.route_long_name = route_long_name;
        this.route_desc = route_desc;
        this.route_type = route_type;
        this.route_url = route_url;
        this.route_color = route_color;
        this.route_text_color = route_text_color;
    }

    public String getRoute_id() {
        return id;
    }

    public void setRoute_id(String route_id) {
        this.id = route_id;
    }

    public String getRoute_short_name() {
        return route_short_name;
    }

    public void setRoute_short_name(String route_short_name) {
        this.route_short_name = route_short_name;
    }

    public String getRoute_long_name() {
        return route_long_name;
    }

    public void setRoute_long_name(String route_long_name) {
        this.route_long_name = route_long_name;
    }

    public String getRoute_desc() {
        return route_desc;
    }

    public void setRoute_desc(String route_desc) {
        this.route_desc = route_desc;
    }

    public String getRoute_type() {
        return route_type;
    }

    public void setRoute_type(String route_type) {
        this.route_type = route_type;
    }

    public String getRoute_url() {
        return route_url;
    }

    public void setRoute_url(String route_url) {
        this.route_url = route_url;
    }

    public String getRoute_color() {
        return route_color;
    }

    public void setRoute_color(String route_color) {
        this.route_color = route_color;
    }

    public String getRoute_text_color() {
        return route_text_color;
    }

    public void setRoute_text_color(String route_text_color) {
        this.route_text_color = route_text_color;
    }
}
