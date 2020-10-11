package models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String details;

    public CommonObject(Integer id, String description, String details) {
        this.id = id;
        this.description = description;
        this.details = details;
    }

    public CommonObject() {
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "CommonObject{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
