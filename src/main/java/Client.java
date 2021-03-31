import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    public Client()
    {}

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    private int id;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
