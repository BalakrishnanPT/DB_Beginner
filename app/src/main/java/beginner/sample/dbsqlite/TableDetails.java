package beginner.sample.dbsqlite;

public class TableDetails {
    String name, mobile, address;

    public TableDetails(String name, String mobile, String address) {

        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public TableDetails() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "TableDetails{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
