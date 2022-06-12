package com.example.midtermhamzamushtaq11886;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class News {
    @SerializedName("data")
    @Expose
    private List<Result> data = null;
    public List<Result> getData() {
        return data;
    }

    public void setData(List<Result> data) {
        this.data = data;
    }
    public class Result {

        @SerializedName("id")
        @Expose
        private int id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("heading")
        @Expose
        private String heading;
        @SerializedName("reference")
        @Expose
        private String reference;
        @SerializedName("time")
        @Expose
        private String time;
        
        public String getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getHeading() {
            return heading;
        }
        public void setHeading(String heading) {
            this.heading = heading;
        }
        public String getReference() {
            return reference;
        }
        public void setReference(String reference) {
            this.reference = reference;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
    }
}