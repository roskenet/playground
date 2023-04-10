package poc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
public class Jsonvals {

    @Id
    private int id;
//    @Column(columnDefinition = "jsonb")
    private String item;
    @Enumerated(EnumType.STRING) // ordinal is good as well
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
