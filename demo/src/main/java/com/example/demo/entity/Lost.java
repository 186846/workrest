package com.example.demo.entity;

public class Lost {
    private String lost_id;
    private String lost_name;
    private String lost_position;
    private String lost_description;
    private String claim_position;
    private String lost_date;
    private String is_returned;

    public String getLost_id() {
        return lost_id;
    }

    public void setLost_id(String lost_id) {
        this.lost_id = lost_id;
    }

    public String getLost_name() {
        return lost_name;
    }

    public void setLost_name(String lost_name) {
        this.lost_name = lost_name;
    }

    public String getLost_position() {
        return lost_position;
    }

    public void setLost_position(String lost_position) {
        this.lost_position = lost_position;
    }

    public String getLost_description() {
        return lost_description;
    }

    public void setLost_description(String lost_description) {
        this.lost_description = lost_description;
    }

    public String getClaim_position() {
        return claim_position;
    }

    public void setClaim_position(String claim_position) {
        this.claim_position = claim_position;
    }

    public String getLost_date() {
        return lost_date;
    }

    public void setLost_date(String lost_date) {
        this.lost_date = lost_date;
    }

    public String getIs_returned() {
        return is_returned;
    }

    public void setIs_returned(String is_returned) {
        this.is_returned = is_returned;
    }


    @Override
    public String toString() {
        return "Lost{" +
                "lost_id='" + lost_id + '\'' +
                ", lost_name='" + lost_name + '\'' +
                ", lost_position='" + lost_position + '\'' +
                ", lost_description='" + lost_description + '\'' +
                ", claim_position='" + claim_position + '\'' +
                ", lost_date='" + lost_date + '\'' +
                ", is_returned='" + is_returned + '\'' +
                '}';
    }
}
