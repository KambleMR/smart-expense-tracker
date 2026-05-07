  # 💰 Personal Expense Tracker System

A Spring Boot + Thymeleaf based web application that helps users track and analyze their expenses with powerful insights. This project is designed to provide a clean, interactive, and user-friendly dashboard to manage personal finances with charts, filters, and reports.


---

## 🚀 Features

### 🔑 Authentication
- User Registration: Create a new account with secure credential storage.
- User Login: Secure login for existing users.


### 🏠 Homepage Dashboard
- 📊 Fetch Total Monthly Expenses – View monthly expense summary.
- 🔢 Number of Transactions – Quick count of total transactions in the current month.
- 🏷 Top Spending Category – Identify where you spend the most.
- 💳 Last Transaction – View the most recent transaction details.
- 📈 Category-wise Spending Chart – Visual breakdown of expenses by category.
- 🧾 Recent Transactions – List of your latest transactions at a glance.

### 🗂 Transactions
- View All Transactions: See all transactions with pagination.
- Add New Transaction: Quickly add expenses with category and amount selection.

### 🏷 Categories
- Fetch all available expense categories.
- View recent transactions under each category.
- Display total expenses category-wise.

### 📑 Reports & Analytics
- Filters:
    - Date Range (From – To)
    - View Type (Daily, Monthly, Category-wise)
    - Min / Max Amount Filter
- Insights:
    - Average Spend / Day (based on selected range)
    - Month vs Last Month Comparison (+/- %)
    - Peak Spending Day (with total amount)
- Charts:
    - Category-wise Spending (Bar Chart)
    - Daily Spending (Bar Chart)
    - Top 5 Expense Categories      
- Download Options: Export reports as PDF or Excel.


### 👤 Profile
- View Name, Email, Account Creation Date.
- View Monthly Total Transactions.
- View All-Time Total Transactions.

### 🔒 Logout
- Secure session termination with redirect to login page.


---

## 🛠️ Tech Stack

| Layer            | Technology                           |
|------------------|--------------------------------------|
| Backend          | Java 17, Spring Boot                 |
| Frontend         | HTML5, CSS3, JavaScript, Thymeleaf   |
| Build Tool       | Maven                                |
| View Engine      | Thymeleaf                            |
| Security         | Spring Security (RBAC)               |
| Database         | My Sql                               |
| Hosting          | Render/Railway)                      |
| Version Control  | Git & GitHub                         |

---

## 📂 Project Structure
```
Smart-Expense-Manager/
│
├── src/main/java/com/example/expensetracker/
│   ├── controller/    # Handles web requests & responses
│   ├── service/       # Business logic for expenses and users
│   ├── repository/    # JPA Repositories for database operations
│   └── entity/        # Expense and User entities
│
├── src/main/resources/
│   ├── templates/     # Thymeleaf HTML templates
│   └── application.properties
│
└── pom.xml
```

---
## 📸 Screenshots


- 🔑 Register Page 
  ![Register](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Register_Page.png)  
 

- 🔐 Login Page  
  ![Login Page](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Login_Page.png)

- 🏠 Home Page 
  ![HomePage](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/DashBoard_Page.png)

- 📋 Add New Transaction  
  ![Add New Transaction](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Add_New_Transactiion_Page.png)

- 📤 Transaction List 
  ![Transaction List](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Add_New_Transactiion_Page.png)

- 📑 Reports  
  ![Reports](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Reports_Page.png)

- Category
- ![Category page](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Category_Page.png)

- Profile
- ![Profile Page](https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java/blob/main/Expense%20Tracker%20Web%20App%20Preview/Profile_Page.png)
---

# 🛠️ Installation & Setup


## 1. Clone the Repository
```properties
git clone https://github.com/ankitdoi-coder/Smart-Expense-Manager-Full-Stack-Java.git
cd Smart-Expense-Manager-Full-Stack-Java
```

## 2. Configure Database
- Create a database in MySQL
- Update application.properties with your DB username & password
  ```spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

## 3. Build and Run

- Use the following command to run the project:

```bash
./mvnw spring-boot:run
```
## 4. Open in Browser
- Navigate to http://localhost:8080

  
## Video Preview
- soon....
## Folder Structure

```
├── Controller/           # All controllers (routes)
├── Model/                # Book.java entity
├── Service/              # Service layer interfaces and implementations
├── Repository/           # BookRepository interface (JPA)
├── config/               # Spring Security configuration
├── templates/            # Thymeleaf HTML pages
├── static/               # CSS, JavaScript, and images
└── application.properties
```
---

## 📌 Future Enhancements

- AI-based budget suggestions
- Expense prediction based on past data
- Mobile-responsive PWA support

---
## 🤝 Contributing
Contributions are welcome!
- Fork the repo
- Create a feature branch
- Submit a Pull Request

---

## 📄 License

My License – Free for learning, educational use, and personal modifications.

## Contact

**Ankit Kumar Gurjar**  
📧 Email: mukeshofficial2003@gmail.com  
🔗 LinkedIn: [[https://.linkedin.com/in/mukesh-kamble-6a5487252/](https://www.linkedin.com/in/mukesh-kamble-6a5487252/)] 
📂 GitHub: [https://github.com/ankitdoi--coder](https://github.com/ankitdoi--coder)
