1. **Can JavaScript be in a separate file? Discuss in detail.**

Yes, JavaScript can (and should often) be written in a separate file. This approach is known as using **external JavaScript**. It offers several benefits:

- **Code reusability**: The same JavaScript file can be linked to multiple HTML pages.
- **Separation of concerns**: Keeps HTML structure and JS behavior separate for better readability and maintenance.
- **Faster page loading**: Browsers can cache external JavaScript files.

**How it works:**

- The JavaScript code is saved in a `.js` file.
- The HTML file uses the `<script src="filename.js"></script>` tag to include the JS file, typically before the `</body>` tag.

**Example:**

```html
<!-- index.html -->
<!DOCTYPE html>
<html>
<head>
<title>External JS Example</title>
<script src="script.js"></script>
</head>
<body>
  <button onclick="sayHello()">Click Me</button>
</body>
</html>
```

```javascript
// script.js
function sayHello() {
  alert("Hello from external JS!");
}
```

---

2. **What are key usages of JavaScript?**

JavaScript is a client-side scripting language used to add interactivity and dynamic behavior to web pages. Key usages include:

* **Form validation**: Preventing submission if inputs are invalid.
* **DOM manipulation**: Changing content, style, or structure of web elements dynamically.
* **Event handling**: Responding to user actions like clicks, hovers, and keypresses.
* **Animations and visual effects**: Creating interactive UIs and transitions.
* **AJAX**: Communicating with the server without reloading the page.
* **Data storage**: Using `localStorage`/`sessionStorage` to save data in the browser.
* **Building web applications**: Frameworks like React, Angular, and Vue use JavaScript.

---

3. **How are HTML forms and JavaScript related?**

HTML forms and JavaScript work together to create interactive user input interfaces:

* JavaScript validates form inputs before submission.
* It can dynamically update or disable form fields based on user actions.
* JavaScript can prevent form submission if conditions aren’t met.
* It can use event listeners like `onchange`, `onsubmit`, or `onblur`.

**Example:**

```html
<form onsubmit="return validateForm()">
  <input type="text" id="username">
  <input type="submit">
</form>
<script>
function validateForm() {
  const name = document.getElementById("username").value;
  if (name === "") {
    alert("Username is required");
    return false;
  }
}
</script>
```

---

4. **Write an HTML Page and also provide a JavaScript for accepting a user ID and password from the user to ensure the input is not empty.**

```html
<!DOCTYPE html>
<html>
<head><title>Login Form</title></head>
<body>
  <form onsubmit="return validateLogin()">
    <label>User ID: <input type="text" id="userId"></label><br>
    <label>Password: <input type="password" id="password"></label><br>
    <input type="submit" value="Login">
  </form>

  <script>
    function validateLogin() {
      const userId = document.getElementById("userId").value;
      const password = document.getElementById("password").value;
      if (userId.trim() === "" || password.trim() === "") {
        alert("Both fields are required.");
        return false;
      }
      return true;
    }
  </script>
</body>
</html>
```

---

5. **Write an HTML Page and stop the user if the user attempts to tab out of the user ID or password fields without entering anything.**

```html
<!DOCTYPE html>
<html>
<head><title>Blur Validation</title></head>
<body>
  <form>
    <label>User ID: <input type="text" id="userId" onblur="checkEmpty(this)"></label><br>
    <label>Password: <input type="password" id="password" onblur="checkEmpty(this)"></label><br>
    <input type="submit" value="Submit">
  </form>

  <script>
    function checkEmpty(field) {
      if (field.value.trim() === "") {
        alert(`${field.id} cannot be empty!`);
        field.focus();
      }
    }
  </script>
</body>
</html>
```

---

6. **How to create objects in JavaScript? Explain with suitable examples.**

* **Using Object Literal:**

```javascript
const person = {
  name: "Alice",
  age: 25,
  greet: function () {
    console.log("Hello, " + this.name);
  }
};
person.greet();
```

* **Using Constructor Function:**

```javascript
function Car(make, model) {
  this.make = make;
  this.model = model;
}
const myCar = new Car("Toyota", "Corolla");
```

* **Using `new Object()`:**

```javascript
const obj = new Object();
obj.name = "Book";
obj.price = 200;
```

* **Using Class (ES6):**

```javascript
class Student {
  constructor(name, roll) {
    this.name = name;
    this.roll = roll;
  }
}
const s1 = new Student("John", 101);
```

---

7. **How to create an array and read elements in JavaScript**

```javascript
const fruits = ["Apple", "Banana", "Mango"];
const numbers = new Array(10, 20, 30);

console.log(fruits[0]); // Apple

for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}
```

---

8. **What are the variable conventions available in JavaScript?**

* `var`: Function-scoped, can be redeclared.
* `let`: Block-scoped, cannot be redeclared.
* `const`: Block-scoped, constant reference.

**Naming:**

* Use `camelCase`
* Start with letter, `_`, or `$`
* Avoid reserved keywords

---

9. **Explain with example how to access values of textboxes of a form using JavaScript**

```html
<form name="loginForm" id="loginForm">
  <input type="text" id="username" name="username">
  <input type="text" id="email" name="email">
  <button onclick="readValues()">Read</button>
</form>

<script>
function readValues() {
  const userById = document.getElementById("username").value;
  const emailByForm = document.loginForm.email.value;
}
</script>
```

---

10. **Explain how to call JavaScript from an HTML page**

* Inline: `<button onclick="alert('Hi')">Click</button>`
* Internal: `<script>function greet(){}</script>`
* External: `<script src="script.js"></script>`

---

11. **List and briefly explain any five functions in JavaScript**

| Function       | Description                     |
| -------------- | ------------------------------- |
| `parseInt()`   | Converts string to integer      |
| `alert()`      | Displays alert popup            |
| `isNaN()`      | Checks if value is not a number |
| `setTimeout()` | Delays execution                |
| `typeof`       | Returns data type               |

---

12. **How to set a default parameter value for a JavaScript function?**

```javascript
function greet(name = "Guest") {
  console.log("Hello, " + name);
}
greet();         // Hello, Guest
```

---

13. **How to open a URL in a new tab in JavaScript?**

```javascript
window.open("https://www.example.com", "_blank");
```

---

14. **How do I declare a namespace in JavaScript?**

```javascript
var MyApp = {};
MyApp.user = {
  name: "Alice",
  display: function () {
    console.log("User:", this.name);
  }
};
```

---

15. **What is JavaScript? How to validate a sample login form using JavaScript?**

JavaScript is a lightweight, interpreted scripting language used to create interactive websites.

**Form Example:**

```html
<form onsubmit="return validateForm()">
  <input type="text" id="username">
  <input type="password" id="password">
</form>
<script>
function validateForm() {
  const user = document.getElementById("username").value;
  const pass = document.getElementById("password").value;
  if (user === "" || pass === "") {
    alert("Required fields!");
    return false;
  }
}
</script>
```

---

16. **Design a form to accept workshop registration details and validate five fields using JavaScript**

```html
<form onsubmit="return validateRegistration()">
  <input type="text" id="name">
  <input type="text" id="email">
  <input type="text" id="mobile">
  <input type="text" id="institution">
  <input type="date" id="dob">
</form>
<script>
function validateRegistration() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;
  const inst = document.getElementById("institution").value;
  const dob = document.getElementById("dob").value;
  if (!email.includes("@") || !/^\d{10}$/.test(mobile)) {
    alert("Invalid input");
    return false;
  }
}
</script>
```

---

17. **Explain Document Object Model (DOM) with suitable example**

The DOM is a tree-like structure representing HTML elements.

```html
<p id="message">Hello</p>
<button onclick="changeText()">Click</button>
<script>
function changeText() {
  document.getElementById("message").innerText = "Welcome to DOM!";
}
</script>
```

---

18. **Differences between JavaScript and jQuery**

| Feature         | JavaScript        | jQuery                     |
| --------------- | ----------------- | -------------------------- |
| Type            | Language          | Library                    |
| Syntax          | Verbose           | Concise                    |
| Browser Support | Manual handling   | Built-in support           |
| Performance     | Faster            | Slightly slower            |
| Use Case        | General scripting | DOM, AJAX, animation, etc. |

---

19. **Why are there two different versions of the jQuery library?**

* **Development Version**: Full, readable, with comments.
* **Production Version**: Minified for performance.

```html
<script src="jquery-3.6.0.js"></script> <!-- Dev -->
<script src="jquery-3.6.0.min.js"></script> <!-- Prod -->
```

---

20. **What are the different Data Types available in JavaScript?**

* **Primitive**: String, Number, Boolean, Null, Undefined, Symbol, BigInt
* **Non-Primitive**: Object, Array, Function, Date

```javascript
let name = "Alice";        // String
let nums = [1, 2, 3];      // Array
let user = {name: "Bob"};  // Object
```

---

24. **Write a program of your choice to demonstrate the use of DOM**

```html
<h2 id="title">Click the button to change background</h2>
<button onclick="changeBackground()">Change Color</button>
<script>
function changeBackground() {
  document.body.style.backgroundColor = "lightblue";
  document.getElementById("title").innerText = "Background Changed!";
}
</script>
```

---

25. **What are the errors made while processing the DOM?**

| Error Type                   | Description              |
| ---------------------------- | ------------------------ |
| ❌ Access before load         | DOM not ready            |
| ❌ Wrong id/selector          | Element not found        |
| ❌ Typing mistake             | Misspelled method        |
| ❌ Null reference             | Using `.value` on `null` |
| ❌ No element existence check | Causes runtime errors    |
