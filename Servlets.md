**Q: What is a Servlet? Explain how a servlet is processed.**

**Answer:**

A **Servlet** is a Java class used to build web applications. It runs on a web server and handles client requests and responses, typically over HTTP. It is a part of the **Jakarta Servlet API (formerly Java Servlet API)** and is used to create dynamic content, like generating HTML based on user input or interacting with databases.

### How a Servlet is Processed (Servlet Life Cycle):

The servlet life cycle is managed by the **Servlet container** (like Apache Tomcat or Jetty), and it involves **three main stages**:

1. **Initialization (`init()` method):**

   * This happens only once when the servlet is first loaded.
   * The servlet container calls the `init()` method to initialize resources (like DB connections or config files).

2. **Request Handling (`service()` method):**

   * Every time a client (usually a browser) sends a request, the servlet container calls the `service()` method.
   * The `service()` method checks the request type (GET, POST, etc.) and calls the appropriate method: `doGet()`, `doPost()`, etc.
   * This is where the main logic of the servlet goes—processing input, calling business logic, and generating a response (like HTML or JSON).

3. **Destruction (`destroy()` method):**

   * When the server shuts down or the servlet is no longer needed, the `destroy()` method is called.
   * It cleans up resources like closing DB connections or stopping threads.

### Example Workflow:

* User sends a request to a servlet by visiting `http://example.com/HelloServlet`.
* The servlet container checks if the servlet is already loaded. If not, it loads it and calls `init()`.
* Then it calls `service()`, which in turn calls `doGet()` or `doPost()` depending on the request.
* The servlet processes the request and sends back a response (like a dynamic HTML page).
* When the servlet is no longer needed, `destroy()` is called.

---
## Q: Can we modify the init(), service() or destroy() method of servlet?

Yes, we can modify the `init()`, `service()`, and `destroy()` methods of a servlet, and in fact, it’s quite common to do so depending on the servlet’s purpose.

### 1. `init()` method:

* This method is called once when the servlet is first loaded by the container.
* We can override it to perform initialization tasks like setting up database connections, reading configuration files, or allocating resources.
* It's important to call `super.init(config)` if we override the version that takes a `ServletConfig` parameter.

### 2. `service()` method:

* This method handles all client requests and routes them to the appropriate method based on the HTTP request type (like `doGet()`, `doPost()`, etc.).
* While we **can** override `service()`, it's more common to override `doGet()` or `doPost()` directly.
* Overriding `service()` is useful if we want custom logic for handling all request types in a uniform way.

### 3. `destroy()` method:

* This method is called once before the servlet is unloaded.
* We typically override it to release resources like closing database connections, stopping background threads, or cleaning up temporary files.

```java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MyHttpServlet extends HttpServlet {

    private Connection connection;

    @Override
    public void init() throws ServletException {
        // Initialization logic (e.g., setting up JDBC connection)
        try {
            // Example: Establish a JDBC connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("JDBC connection initialized.");
        } catch (SQLException | ClassNotFoundException e) {
            throw new ServletException("Unable to establish JDBC connection", e);
        }
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Custom request handling logic (called for each request)
        String method = request.getMethod();
        if ("GET".equals(method)) {
            doGet(request, response);
        } else if ("POST".equals(method)) {
            doPost(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request (override as needed)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>GET Request Handled</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST request (override as needed)
        String username = request.getParameter("username");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>POST Request Handled</h1>");
        out.println("<p>Username: " + username + "</p>");
    }

    @Override
    public void destroy() {
        // Cleanup resources (e.g., closing JDBC connection)
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("JDBC connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing JDBC connection: " + e.getMessage());
        }
    }
}

```

---

**Q: Write a servlet which will accept user name and password in a form, which will compare both in the database to display success or failure.**

Look at `Servlet Example 2` in Repository

---