# Questions


### **1) What do you mean by CSS? What are the different ways to create CSS?**

**CSS (Cascading Style Sheets)** is used to style and layout web pages — for example, to change fonts, colors, spacing, positioning of elements, and responsiveness of a website.

#### Different ways to apply CSS:
1. **Inline CSS**  
   - Applied directly inside HTML elements using the `style` attribute.  
   - Example: `<p style="color: red;">Hello</p>`

2. **Internal CSS**  
   - Written inside a `<style>` tag in the `<head>` section of the HTML page.  
   - Used for styling a single page.

3. **External CSS**  
   - Linked via a separate `.css` file using the `<link>` tag.  
   - Best practice for styling multiple pages consistently.

---

### **2) What is JSON? Why use JSON over XML?**

**JSON (JavaScript Object Notation)** is a lightweight data-interchange format used to transmit data between a server and a web application.

Example:
```json
{
  "name": "Alice",
  "age": 25,
  "isStudent": false
}
```
- **Simpler and more readable** syntax.
- **Faster to parse** (native in JavaScript).
- **Less data overhead** (no closing tags).
- **Easier to use with APIs** and modern web apps.

---

### **3) Five Differences between HTML and HTML5**

| HTML | HTML5 |
|------|-------|
| Does not support audio/video tags | Supports `<audio>` and `<video>` |
| Limited storage options | Introduces `localStorage` and `sessionStorage` |
| Uses SGML-based parsing | Uses a simplified parsing model |
| No native support for drawing graphics | Supports `<canvas>` for graphics and animations |
| Requires third-party plugins for multimedia | No plugins needed for audio/video |

---

### **4) What are the different design issues in web development?**

Some major design issues include:

1. **Responsiveness** – Ensuring the website works on all screen sizes.
2. **Navigation** – Clear and user-friendly navigation is essential.
3. **Performance** – Fast load times and optimized media.
4. **Cross-browser compatibility** – Site must work in Chrome, Firefox, Safari, etc.
5. **Accessibility** – Design must be inclusive for users with disabilities.
6. **Content hierarchy** – Clear visual structure and call-to-actions.
7. **Security** – Protect against data breaches, XSS, CSRF, etc.

---

### **5) What is the purpose of HTTP?**

**HTTP (HyperText Transfer Protocol)** is the protocol used to transfer data over the web.

#### Its main purposes:
- Request and receive **webpages, images, videos, and data**.
- It’s the foundation for communication between **web clients (browsers)** and **servers**.
- Works in a **request-response** model:
  - Client sends an HTTP request.
  - Server sends back an HTTP response.

---

### **6) How Does a Web Browser Work?**
### **7) Describe the steps involved when a web browser requests for and obtains a web page from a web server**

A **web browser** is a software application used to access and display content from the web, such as webpages, images, and videos.

#### 1. **User enters a URL**
- Example: `https://www.example.com`
- The browser starts by interpreting this URL to find the domain.

#### 2. **DNS Lookup**
- The browser contacts a **DNS (Domain Name System)** server to translate the domain name into an **IP address**.
- Example: `www.example.com → 93.184.216.34`

#### 3. **Send HTTP/HTTPS Request**
- The browser sends an **HTTP or HTTPS request** to the server at the resolved IP address.
- It requests specific resources like an HTML file, images, or scripts.

#### 4. **Server Responds**
- The server sends back an **HTTP response**, which includes:
  - Status code (e.g., 200 OK, 404 Not Found)
  - HTML content
  - CSS, JavaScript, images, etc.

#### 5. **Rendering the Page**
- The browser processes the HTML and builds the **DOM (Document Object Model)**.
- Then it:
  - Loads and applies **CSS** to style elements.
  - Executes **JavaScript** to add interactivity or fetch more data.
  - Displays the final **visual layout** to the user.

#### 6. **Continual Updates**
- JavaScript can update the DOM dynamically (AJAX, APIs), so the browser can update content without reloading the whole page.

---

### **Components Inside a Browser**
| Component         | Role                                                  |
|------------------|--------------------------------------------------------|
| **Rendering Engine** | Parses HTML/CSS, builds and paints the page |
| **JavaScript Engine** | Executes scripts (e.g., Google’s V8 in Chrome)    |
| **Networking**     | Handles HTTP/HTTPS requests                          |
| **UI Layer**       | User interface — address bar, back button, tabs      |
| **Data Storage**   | Cookies, cache, localStorage, sessionStorage         |

---

### **8) Define the terms i. Website, ii. Web Page, iii. Web Server, iv.  URL and v. Home Page.**

#### i. **Website**
A **website** is a collection of related web pages hosted on a server and accessible via a domain name (like `www.example.com`).  
> Example: A university website with pages for admissions, courses, and faculty.

#### ii. **Web Page**
A **web page** is a single document or file within a website, written in HTML and viewable in a web browser.  
> Example: `www.example.com/contact.html`

#### iii. **Web Server**
A **web server** is a computer or software that stores and serves web pages to users over the internet using HTTP.  
> Example: Apache, Nginx

#### iv. **URL (Uniform Resource Locator)**
A **URL** is the address of a specific web resource on the internet.  
> Example: `https://www.example.com/about.html`

#### v. **Home Page**
A **home page** is the main or default page of a website, usually the first page a visitor sees.  
> Example: `index.html` is typically the home page.

---

### **9) Why is HTTP called a stateless protocol?**

**HTTP is called stateless** because each request made by a client (browser) to the server is independent — the server **does not remember** any previous interactions.

#### 🧾 Why is it so?
- HTTP was designed for simplicity and scalability.
- It allows many users to connect without overloading the server with user-specific data.
- Any state (like login status) must be **manually managed** using cookies or sessions.

---

### **10) Three Common HTTP Commands (Methods)**

| Method | Description | Example |
|--------|-------------|---------|
| **GET** | Requests data from the server (e.g., a web page). | `GET /index.html` |
| **POST** | Sends data to the server (e.g., from a form). | `POST /submit-form` |
| **PUT** | Updates or replaces data on the server. | `PUT /user/1` (update user info) |

---

### **11) HTML Tags – Explanation with Example**

**HTML tags** are keywords enclosed in angle brackets (`<>`) that define elements on a web page.

#### 🔍 Example:
```html
<p>This is a paragraph.</p>
```
- `<p>` is the **opening tag**
- `</p>` is the **closing tag**
- `This is a paragraph.` is the content
- Together they create a **paragraph element**

---

### **12) Describe Any Five HTML Tags**

| Tag | Description | Example |
|-----|-------------|---------|
| `<h1>` | Heading level 1 (largest) | `<h1>Welcome</h1>` |
| `<a>` | Creates a hyperlink | `<a href="about.html">About</a>` |
| `<img>` | Displays an image | `<img src="logo.png" alt="Logo">` |
| `<ul>` | Creates an unordered list | `<ul><li>Item</li></ul>` |
| `<form>` | Defines a form for user input | `<form action="/submit"></form>` |

---

### **13) How to Set Up Your Own Website – Requirements**

To set up your own website, you’ll need the following:

#### Basic Requirements:
1. **Domain Name**  
   - A unique address people use to visit your site.  
   - Example: `www.myportfolio.com`  
   - Purchase from: GoDaddy, Namecheap, Google Domains, etc.

2. **Web Hosting**  
   - A service that stores your website files and makes them accessible online.  
   - Types: Shared Hosting, VPS, Cloud Hosting, etc.  
   - Popular providers: Hostinger, Bluehost, SiteGround, AWS.

3. **Website Files**  
   - Your HTML, CSS, JavaScript, images, and media content.

4. **FTP Client or Hosting Dashboard**  
   - To upload your files (use FileZilla, or hosting's file manager).

5. **Optional CMS (Content Management System)**  
   - Like WordPress for easier content editing without coding.

6. **Responsive Design**  
   - Ensure your website works well on desktops, tablets, and phones.

---

### **14) Create a Web Page to Display Personal Info with a Photograph**

Here’s an example of a simple HTML page you can use:

#### `about-me.html`

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>About Me</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      padding: 30px;
      background-color: #f8f8f8;
      color: #333;
    }
    .container {
      max-width: 600px;
      margin: auto;
      background: white;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px #ccc;
      text-align: center;
    }
    img {
      width: 150px;
      height: 150px;
      border-radius: 50%;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>About Me</h1>
    <img src="myphoto.jpg" alt="My Photo">
    <p>
      Hello! My name is Tirthraj Mahajan. I am currently a student with a strong interest in web development and design. I enjoy learning new technologies and working on creative projects. In my free time, I like reading, coding, and exploring the world of digital design. My goal is to build user-friendly websites that are visually appealing and functional. This webpage is my first step towards becoming a web developer.
    </p>
  </div>
</body>
</html>
```

---

### **15) Major Differences Between Internet Explorer and Mozilla Firefox**

| Feature | **Internet Explorer** | **Mozilla Firefox** |
|--------|------------------------|----------------------|
| **Developer** | Microsoft | Mozilla Foundation |
| **Standards Compliance** | Poor/limited | Strong HTML5/CSS3 support |
| **Speed** | Slower performance | Faster and more optimized |
| **Add-ons/Extensions** | Limited support | Extensive extension library |
| **Security** | Vulnerable, outdated | Regular updates, strong security features |
| **Modern Status** | Discontinued (replaced by Edge) | Actively maintained and updated |
| **Cross-platform** | Windows only | Windows, macOS, Linux |

---