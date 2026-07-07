package pay.manvik.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pay.manvik.dto.Studentorder;

//JpaRepository will provide predefined methods for us in orders to performe the operation
//student ID in integer and Studentoreder is avilable

public interface StudentOrderRepo extends JpaRepository<Studentorder, Integer> {

    public Studentorder findByRazorpayOrderId(String razorpayOrderId);

}
