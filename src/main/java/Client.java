public class Client implements Comparable<Client> {

    private int id;
    private String name;
    private String adress;
    private String nip;


    public Client(int id, String name, String adress, String nip) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.nip = nip;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public int compareTo(Client o) {
        return o.getId();
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", nip='" + nip + '\'' +
                '}';
    }
}
