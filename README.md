# Zira – A Mini Project Management System

Zira is a lightweight project management application inspired by Jira. It allows teams to create projects, assign members, manage to-do lists, and visualize project progress using pie charts. This application was built as a training project using **Struts**, **MySQL**, **HTML/CSS**, and **JavaScript**.

## Features

- **Project Management**:  
  - Create new projects  
  - Add members to projects  
  - Assign tasks to team members  

- **Task Tracking**:  
  - Personal to-do lists for each user based on assigned tasks  
  - Task statuses: To Do, In Progress, Done  

- **Progress Visualization**:  
  - Pie charts representing task status for each project  

## Technologies Used

- **Backend**:  
  - Struts (MVC framework)  
  - MySQL (Relational Database)

- **Frontend**:  
  - HTML5, CSS3  
  - JavaScript (for dynamic behaviors)  

## Getting Started

### Prerequisites
- JDK 17  
- Apache Tomcat or similar servlet container  
- MySQL Server  

### Setup Instructions

1. **Clone the repository**:
    ```bash
    git clone https://github.com/al-ameen-dev/zira-project-management.git
    cd zira-project-management
    ```

2. **Database Setup**:
    - Create a MySQL database named `ziradb`.
    - Import the SQL schema and initial data:
      ```bash
      mysql -u root -p ziradb < schema.sql
      ```
  
3. **Configure Database Connection**:
    - Update `DBconnection.java` (or your connection file) with your MySQL username and password.

4. **Build and Deploy**:
    - Build the project using your IDE or `ant/maven` if configured.
    - Deploy the `.war` file to your Tomcat `webapps` directory.
    - Start Tomcat and access the application at:  
      ```
      http://localhost:8080/zira-project-management/register
      ```

5. **Login**:
    - Use predefined user credentials or register a new account if registration is available.

## Screenshots
*![image](https://github.com/user-attachments/assets/7ed0f9d9-6d1e-4e40-aa53-2114dcf028f8)*
*![image](https://github.com/user-attachments/assets/afa905d8-26d0-4874-90f5-7a92a85f7fe3)*
*![image](https://github.com/user-attachments/assets/382f54af-f297-4515-85a0-aa2057501a93)*
*![image](https://github.com/user-attachments/assets/89e850ab-749d-4d10-9c0a-75a562f7dfe5)*


## Future Enhancements
- User authentication with roles and permissions  
- Comment system for tasks  
- Email notifications for task updates  
- More advanced reporting features  

## License
This project is for educational purposes only.

---

