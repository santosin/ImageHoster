package ImageHoster.model;


import javax.persistence.*;
import java.util.Date;

@Entity
//@Table annotation provides more options to customize the mapping.
//Here the name of the table to be created in the database is explicitly mentioned as 'images'. Hence the table named 'images' will be created in the database with all the columns mapped to all the attributes in 'Image' class
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column annotation specifies that the attribute will be mapped to the column in the database.
    //Here the column name is explicitly mentioned as 'id'
    @Column(name = "id")
    private Integer id;


    @Column(columnDefinition = "TEXT")
    private String text;



    @Column(name = "createdDate")
    private Date createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    //Below annotation indicates that the name of the column in 'users' table referring the primary key in 'user' table will be 'user_id'
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    //Below annotation indicates that the name of the column in 'users' table referring the primary key in 'user' table will be 'user_id'
    @JoinColumn(name = "image_id")
    private Image image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }




}
