# 💳 Payment Gateway Integration using Spring Boot & Razorpay

A full-stack payment gateway integration project built with **Spring Boot**, **Thymeleaf**, **MySQL**, and **Razorpay**. The application allows users to create payment orders, complete secure online payments, and automatically update the payment status in the database through Razorpay callbacks.

---

## 🚀 Features

- Create Razorpay payment orders
- Secure payment checkout using Razorpay
- Automatic payment callback handling
- Store payment details in MySQL
- Update payment status after successful payment
- Responsive payment success page
- Clean Spring Boot MVC architecture

---

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot 3
- Spring MVC
- Spring Data JPA
- Maven

### Frontend
- HTML5
- CSS3
- Thymeleaf

### Database
- MySQL

### Payment Gateway
- Razorpay

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │     ├── controller
 │   │     ├── service
 │   │     ├── repo
 │   │     ├── dto
 │   │     └── PaymentintegrationApplication
 │   │
 │   ├── resources
 │   │     ├── templates
 │   │     ├── static
 │   │     └── application.properties
 │
 └── test
```

---

## ⚙️ How It Works

1. User fills the payment form.
2. Spring Boot creates a Razorpay Order.
3. Order details are stored in MySQL.
4. Razorpay Checkout opens.
5. User completes the payment.
6. Razorpay sends a callback.
7. Spring Boot verifies the callback and updates the payment status.
8. Success page is displayed.

---

## 🗄️ Database

Table:

```
student_orders
```

Stores:

- Order ID
- Customer Name
- Email
- Phone Number
- Course
- Amount
- Razorpay Order ID
- Payment Status

---

---

## 📸 Screenshots

Add screenshots here.

- Home Page
  <img width="891" height="492" alt="image" src="https://github.com/user-attachments/assets/05c1fcb2-bb7f-4d8f-b635-0bfcaa220bd6" />
  
- Razorpay Checkout
  <img width="951" height="835" alt="image" src="https://github.com/user-attachments/assets/fe60926e-f82a-4b3d-bc23-4b01ca9b1932" />
  <img width="1800" height="1007" alt="image" src="https://github.com/user-attachments/assets/d186e764-1e26-4bf3-802a-e5020779603d" />
  <img width="1793" height="997" alt="image" src="https://github.com/user-attachments/assets/8be54e45-f415-4adb-a23b-e384a12604fc" />
  <img width="1891" height="856" alt="Screenshot 2026-07-08 073528" src="https://github.com/user-attachments/assets/70598278-f343-4fa7-9625-b1dfbec9e817" />

- Payment Success Page
  <img width="1883" height="812" alt="image" src="https://github.com/user-attachments/assets/67ae44ac-3295-4cc8-81c9-18edce23a587" />

- MySQL Database
  <img width="792" height="22" alt="image" src="https://github.com/user-attachments/assets/c77458da-d771-4a3f-a1e2-ea3c2c0eddd1" />

---

## 📌 Future Improvements

- Razorpay Signature Verification
- Email Confirmation
- PDF Payment Receipt
- Payment History Dashboard
- Admin Panel
- Exception Handling
- Logging with SLF4J

---

## 👨‍💻 Author

**Manvik Sagar**

- GitHub: https://github.com/manviksagar6546
- LinkedIn: https://www.linkedin.com/feed/update/urn:li:activity:7480237656434483202/
---

## ⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub.
