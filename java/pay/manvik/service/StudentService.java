package pay.manvik.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pay.manvik.dto.Studentorder;
import pay.manvik.repo.StudentOrderRepo;

import java.util.Map;

//This class is a spring bean

@Service
public class StudentService {

    //to comunicate with Db I am injecting my repo by using Autowired

    @Autowired
    private StudentOrderRepo studentRepo;

    @Value("${razorpay.key.id}") //value anotation purpose is to read the properties which is in app.pro file
    private String razorPayKey;

    @Value("${razorpay.secret.key}")
    private String razorPaySecret;

    private RazorpayClient client;

    //Now create the order in table
    //After paymet I will Update order

    //this method to create the order
    public Studentorder createOrder(Studentorder stuOrder) throws Exception {
        //this is the data which I am sending to razor in order to create the order
        JSONObject orderReq = new JSONObject();
        orderReq.put("amount", stuOrder.getAmount() * 100); // amount in paisa
        orderReq.put("currency", "INR");
        orderReq.put("receipt", stuOrder.getEmail());

        this.client = new RazorpayClient(razorPayKey, razorPaySecret);

        //create order in razoepay/ need parameter
//        client.orders.create(null);
        Order razorPayOrder = client.orders.create(orderReq);

        System.out.println("razorPayOrder: " + razorPayOrder);

        stuOrder.setRazorpayOrderId(razorPayOrder.get("id"));
        stuOrder.setOrderStatus(razorPayOrder.get("status"));

        studentRepo.save(stuOrder);

        return stuOrder;
    }

    //this method to update the order
    public Studentorder updateOrder(Map<String, String> responsePayLoad){

        System.out.println(responsePayLoad);

        String razorPayOrderId = responsePayLoad.get("razorpay_order_id");

        System.out.println("Order ID = " + razorPayOrderId);

        Studentorder order  = studentRepo.findByRazorpayOrderId(razorPayOrderId);

        System.out.println("Order = " + order);

        order.setOrderstatus("PAYMENT_COMPLETED");

        //send email to customer - actually razorpay send email to he/her

        return studentRepo.save(order);
    }

}
