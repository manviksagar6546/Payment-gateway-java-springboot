package pay.manvik.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_orders")
public class Studentorder {
    //This class save data in DB table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;

    private String name;
    //email phone course amount data come from UI
    private String email;
    private String phone;
    private String course;
    private Integer amount;
    //when new order come orderstatus will be created an when payment done orderstatus will be complete
    private String orderstatus;
    private String razorpayOrderId;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getRazorpayOrderId() {
        return razorpayOrderId;
    }

    public void setRazorpayOrderId(String razorpayOrderId) {
        this.razorpayOrderId = razorpayOrderId;
    }

    @Override
    public String toString() {
        return "Studentorder{" +
                "orderid=" + orderid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", course='" + course + '\'' +
                ", amount=" + amount +
                ", orderstatus='" + orderstatus + '\'' +
                ", razorpayOrderId='" + razorpayOrderId + '\'' +
                '}';
    }

    public void setOrderStatus(Object status) {

    }
}
