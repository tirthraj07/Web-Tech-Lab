## Q: What is Angular JS and why is it used?

AngularJS is a JavaScript-based open-source front-end framework developed by Google. It is used for building dynamic, single-page web applications (SPAs), where most of the processing happens in the browser instead of the server.

It is used because it allows developers to extend HTML with additional attributes and bind data to HTML elements using expressions. AngularJS follows the MVC (Model-View-Controller) architecture, making it easier to separate concerns in the code. It also supports features like two-way data binding, dependency injection, and reusable components, which make development faster and more efficient.

---
## Q: Why to use AngularJS? What are the advantages of AngularJS? 

AngularJS is used to make the development of dynamic and interactive web applications easier and more efficient. It helps manage the complexity of client-side code by providing a structured framework based on MVC (Model-View-Controller) and powerful features like two-way data binding and dependency injection.

### Advantages of AngularJS:

1. **Two-Way Data Binding:**
   Any changes in the UI are immediately reflected in the application data and vice versa. This reduces the need to write extra code to keep the model and view in sync.

   **Example:**

   ```html
   <div ng-app="">
     <input type="text" ng-model="name">
     <p>Hello, {{name}}!</p>
   </div>
   ```

   Typing in the input box updates the paragraph text instantly.

2. **MVC Architecture:**
   AngularJS follows MVC, where the application logic (Model), UI (View), and control flow (Controller) are separated, making code more organized and maintainable.

3. **Dependency Injection (DI):**
   AngularJS has a built-in dependency injection mechanism that helps manage how components like services or controllers get their dependencies, making the code more modular and testable.

4. **Directives:**
   AngularJS introduces directives like `ng-model`, `ng-repeat`, and custom directives to extend HTML functionality and create reusable components.

   **Example:**

   ```html
   <ul>
     <li ng-repeat="item in items">{{item}}</li>
   </ul>
   ```

5. **Single Page Application (SPA) Support:**
   AngularJS is designed to build SPAs where the page doesn't reload, improving performance and user experience.

6. **Community and Support:**
   Backed by Google and a large community, AngularJS has plenty of tutorials, libraries, and tools available.

---

## Q: How AngularJS is different from other JavaScript Framework? 

AngularJS differs from other JavaScript frameworks in several important ways, especially in how it structures applications, handles data binding, and extends HTML. Here’s a clear explanation:

### 1. **Two-Way Data Binding (vs. One-Way in Others):**

AngularJS offers *automatic synchronization* of data between the model and the view. When the data in the model changes, the view updates automatically, and vice versa. Many other frameworks (like Backbone.js) require manual DOM manipulation or only support one-way data binding.

**Example:**

```html
<input type="text" ng-model="message">
<p>{{message}}</p>
```

Typing in the input updates the paragraph in real time without needing extra code.

### 2. **Dependency Injection:**

AngularJS has a built-in dependency injection system, which simplifies development and testing by automatically supplying components like services, factories, and controllers where they are needed. Many older frameworks lacked this or required external libraries for it.

### 3. **Use of Directives to Extend HTML:**

AngularJS uses custom HTML attributes (directives) like `ng-model`, `ng-repeat`, and `ng-if` to add behavior to HTML elements. This approach is more declarative compared to imperative DOM manipulation in jQuery or even Backbone.js.

**Example:**

```html
<ul>
  <li ng-repeat="fruit in fruits">{{fruit}}</li>
</ul>
```

### 4. **Built-in MVC Pattern:**
AngularJS comes with built-in support for the Model-View-Controller architecture. Other frameworks, like jQuery, are not structured this way and require developers to build this separation manually.

### 5. **Complete Framework (vs. Library):**
Unlike jQuery (which is just a library for DOM manipulation), AngularJS is a complete front-end framework. It includes routing, form validation, HTTP services, and more—so developers don’t need to rely on many third-party plugins.

### 6. **Single Page Application (SPA) Support:**
AngularJS was designed from the start to support SPAs efficiently, including routing and view switching without page reloads. Frameworks like jQuery or older libraries required additional tools or manual setup for SPAs.

### 7. **Testing Support:**
AngularJS was designed with testing in mind, especially unit testing using tools like Jasmine and end-to-end testing with Protractor. It encourages writing testable code, unlike some older frameworks.

---

## Q: Does AngularJS has dependency on jQuery? 

No, AngularJS **does not have a strict dependency on jQuery**. It can work perfectly fine without jQuery.

However, **if jQuery is loaded before AngularJS**, then AngularJS will use the full jQuery library. If not, it will fall back to its own built-in lightweight version called **jqLite** (also known as Angular's lite jQuery implementation).

### What is jqLite?

jqLite is a minimal subset of jQuery that AngularJS includes internally to handle basic DOM manipulation and event handling. It provides enough functionality for most tasks AngularJS needs, like:

* DOM traversal
* Event binding
* Class manipulation
* Element creation

### When should you include jQuery?

You should only include jQuery explicitly if:

* You want to use jQuery plugins or features not available in jqLite.
* You need advanced DOM manipulation that jqLite doesn’t support.

### Example (with and without jQuery):

If you include jQuery:

```html
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
```

Then AngularJS will use jQuery.

If you don’t include jQuery:

```html
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
```

Then AngularJS uses jqLite instead.

### Conclusion:

AngularJS is independent of jQuery by default, but it can optionally use it if present. This design gives developers flexibility depending on their needs.

---

## Q: Is AngularJS a library, framework, plugin or a browser extension? 
AngularJS is a **framework**, specifically a **structural framework for dynamic web applications**.

### Here's why AngularJS is considered a framework:

* It provides a complete solution for building client-side applications, including:

  * **Data binding**
  * **Routing**
  * **Form validation**
  * **HTTP communication**
  * **Dependency injection**
  * **Templating**
  * **Modular architecture**

* Unlike a **library** (like jQuery), which is typically used to perform specific tasks (such as DOM manipulation), a **framework** provides a full structure and enforces patterns like MVC (Model-View-Controller).

* It is **not** a **plugin** because it doesn’t extend the functionality of another software system through a plugin interface.

* It is also **not** a **browser extension**, because it runs inside the web page, not as a tool added to the browser interface.

---

## Q: What is core module in AngularJS? 

In AngularJS, the **core module** refers to the **main built-in module** provided by the AngularJS framework, which is named **`ng`**.

This `ng` module contains all the **core features** and **essential directives, services, and filters** that AngularJS provides out of the box to build applications.

### Key features provided by the `ng` core module include:

1. **Directives**
2. **Filters**
3. **Services**
4. **Dependency Injection system**
5. **Expression parsing and evaluation**

--- 

## Q:  What is the size of angular.js file? 

The size of the `angular.js` file depends on the **version** and whether it's the **development (uncompressed)** or **production (minified)** build.

### Typical sizes for AngularJS 1.7.x (latest stable version):

* **Uncompressed (Development version):**

  * `angular.js` ≈ **1.2 MB** (around 1,200 KB)
  * This version includes comments and whitespace, useful for debugging and development.

* **Minified (Production version):**

  * `angular.min.js` ≈ **60–100 KB** (depending on version and compression)
  * This version is compressed for faster loading in production environments, making it reasonably lightweight for front-end applications, especially considering that it’s a complete framework.

* **Gzipped (Compressed by server):**

  * When served with gzip compression (common in production), the size can reduce to around **30–40 KB**.

### Example CDN link:

```html
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
```

---
## Q: What browsers AngularJS support? 
AngularJS supports all major desktop and mobile browsers that were widely used at the time of its latest versions (primarily AngularJS 1.2 to 1.7).

### Officially Supported Browsers:

#### **Desktop Browsers:**

* **Google Chrome** (latest and previous major versions)
* **Mozilla Firefox** (latest and previous major versions)
* **Safari** (version 6+)
* **Microsoft Edge**
* **Internet Explorer 9, 10, and 11**

  * AngularJS 1.3+ dropped support for **IE 8**

#### **Mobile Browsers:**

* **Mobile Safari** (iOS 6+)
* **Android Browser** (Android 4.1+)
* **Chrome for Android**
* **Firefox for Android**

### Notes:

* **AngularJS 1.2** supported **Internet Explorer 8**, but starting from **AngularJS 1.3**, IE8 support was officially dropped due to its outdated standards.
* AngularJS tries to follow web standards to remain cross-browser compatible, but some advanced features may behave slightly differently on older browsers.

---
### Q: Hello World Example of Angular JS

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hello World with AngularJS</title>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
</head>
<body>

  <!-- Define the AngularJS application and controller -->
  <div ng-app="myApp" ng-controller="myCtrl">
    <!-- Display the data from the controller -->
    <h1>{{ message }}</h1>
  </div>

  <script>
    // Create an AngularJS module and controller
    var app = angular.module('myApp', []); // Define the module

    // Define the controller
    app.controller('myCtrl', function($scope) {
      // Initialize a variable in the controller
      $scope.message = 'Hello, World from AngularJS!';
    });
  </script>

</body>
</html>
```

#### 1. **`ng-app`**:

* **Purpose**: The `ng-app` directive is used to define the AngularJS application. It tells AngularJS to manage and control the behavior of the entire HTML page within the specified element.
* **How it works**: When `ng-app` is added to an element, AngularJS will scan the entire HTML document inside that element for AngularJS-specific directives and process them.
* **Example**:

  ```html
  <div ng-app="myApp">
    <!-- AngularJS application will manage this div -->
  </div>
  ```

In the example above, the `ng-app="myApp"` initializes an AngularJS application with the name `myApp`. It means AngularJS will take control of this element and everything inside it.

#### 2. **`ng-controller`**:

* **Purpose**: The `ng-controller` directive is used to define a controller for a specific part of the HTML view. The controller is responsible for providing the data (via the `$scope` object) and business logic to the view.
* **How it works**: The `ng-controller` binds the specified controller to an element, which allows the controller to manage the scope and logic for that part of the view.
* **Example**:

  ```html
  <div ng-controller="myCtrl">
    <p>{{ message }}</p>
  </div>
  ```

In this example, the controller `myCtrl` is assigned to the `<div>` element. The controller will control the data and logic inside this div, including binding the `message` variable to the view.

**In the controller:**

```javascript
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
  $scope.message = 'Hello, World!';
});
```

Here, the controller `myCtrl` sets the `message` property on `$scope`, and AngularJS automatically updates the view with this value (`Hello, World!`).

---



---
### Q: What is Angular Prefix `$` and `$$`?

In AngularJS, variables, services, and objects that begin with `$` or `$$` have special meanings or use cases:

#### 1. **`$` Prefix**:

* **Purpose**: Variables or services prefixed with `$` are **built-in AngularJS services**, **objects**, or **properties** that have specific meanings or functions within the framework.
* **Example Services**:

  * `$scope`: The scope object that binds the controller with the view.
  * `$http`: A service used for making HTTP requests.
  * `$routeParams`: Provides access to route parameters when using AngularJS routing.
  * `$timeout`: A wrapper around JavaScript's `setTimeout`.
  * `$location`: Provides access to the browser’s URL and can be used for routing and URL manipulation.
* **Why the `$` Prefix?**: The `$` prefix is used to distinguish AngularJS services, objects, and properties from user-defined variables to avoid conflicts.

**Example**:

```javascript
app.controller('myCtrl', function($scope, $http) {
  $http.get('/api/data').then(function(response) {
    $scope.data = response.data;
  });
});
```

Here, `$http` is a built-in service in AngularJS used to perform HTTP requests.

#### 2. **`$$` Prefix**:

* **Purpose**: The `$$` prefix is used for **internal, private AngularJS properties** or **functions** that are not intended for use by the developer. They are used internally by the AngularJS framework for internal operations.

* **Example**:

  * `$$watchers`: Used internally by AngularJS to keep track of all watchers in the `$scope`.
  * `$$test`: An internal property for testing purposes (not typically used in application code).
  * `$$childTail`, `$$childHead`: Used for internal AngularJS scope handling.

* **Why the `$$` Prefix?**: The `$$` is used to clearly distinguish internal, non-public properties or functions that are not meant to be directly accessed or modified by the user. It signals that these are AngularJS internals and should be avoided for application-level code.

**Example**:

```javascript
// Example of an internal property (not meant to be accessed directly)
var internalProperty = $$internalVariable;  // Avoid using this directly
```

---

## Q: Explain built-in directives with example

AngularJS provides several built-in directives that make it easier to build dynamic and interactive web applications. Below are some of the most commonly used built-in directives along with examples to demonstrate their usage.

### 1. **`ng-model`**

**Purpose:** Binds an input element to a model. It is used to create two-way data binding between the HTML element and the scope.

**Example:**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <input type="text" ng-model="name">
  <p>Hello, {{name}}!</p>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.name = 'Angular';
  });
</script>
```

In this example, when you type into the input box, the value automatically updates the `name` model, and the paragraph text updates in real-time.

### 2. **`ng-repeat`**

**Purpose:** Repeats an HTML element for each item in a collection (array or object).

**Example:**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <ul>
    <li ng-repeat="item in items">{{item}}</li>
  </ul>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.items = ['Apple', 'Banana', 'Cherry'];
  });
</script>
```

In this example, `ng-repeat` repeats the `<li>` element for each item in the `items` array.

### 3. **`ng-if`**

**Purpose:** Conditionally includes an HTML element in the DOM based on an expression.

**Example:**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <button ng-click="toggle()">Toggle</button>
  <div ng-if="isVisible">
    <p>This content is conditionally displayed.</p>
  </div>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.isVisible = true;
    $scope.toggle = function() {
      $scope.isVisible = !$scope.isVisible;
    };
  });
</script>
```

In this example, the content inside the `<div>` with `ng-if="isVisible"` is shown or hidden based on the value of `isVisible`.

### 4. **`ng-show` and `ng-hide`**

**Purpose:** These directives show or hide an element based on the truthiness of an expression. `ng-show` displays the element, and `ng-hide` hides it.

**Example (ng-show):**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <button ng-click="isVisible = !isVisible">Toggle</button>
  <p ng-show="isVisible">This text is conditionally shown.</p>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.isVisible = true;
  });
</script>
```

In this example, when the button is clicked, it toggles the visibility of the `<p>` tag.

### 5. **`ng-click`**

**Purpose:** Binds an expression to an HTML element’s click event.

**Example:**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <button ng-click="count = count + 1">Click Me</button>
  <p>Button clicked {{count}} times</p>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.count = 0;
  });
</script>
```

This example increments the `count` variable each time the button is clicked, and the number of clicks is displayed in the paragraph.


### 6. **`ng-class`**

**Purpose:** Dynamically assigns CSS classes to an element based on an expression.

**Example:**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <button ng-click="toggleClass()">Toggle Class</button>
  <p ng-class="{'highlight': isHighlighted}">This text will have a dynamic class.</p>
</div>
<style>
  .highlight {
    color: red;
    font-weight: bold;
  }
</style>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.isHighlighted = false;
    $scope.toggleClass = function() {
      $scope.isHighlighted = !$scope.isHighlighted;
    };
  });
</script>
```

In this example, clicking the button toggles the `highlight` class, which applies styling to the paragraph.

### 7. **`ng-model`**

**Purpose:** Binds an input element to a model, enabling two-way data binding.

**Example (again for ng-model):**

```html
<div ng-app="myApp" ng-controller="myCtrl">
  <input type="text" ng-model="message">
  <p>The message is: {{message}}</p>
</div>
<script>
  var app = angular.module('myApp', []);
  app.controller('myCtrl', function($scope) {
    $scope.message = '';
  });
</script>
```

This example binds the input field to the `message` model, and the paragraph shows whatever is typed into the input field in real-time.

### 8. **`ng-bind`**
The ng-bind directive in AngularJS is used to bind an expression (usually a model variable) to an HTML element, essentially replacing the inner content of that element with the value of the expression.

It is similar to using the AngularJS expression syntax {{ expression }}, but ng-bind offers advantages, especially in preventing the flash of uncompiled content during page load. Using ng-bind ensures that the content is not visible to the user until AngularJS has fully compiled and processed the expression, reducing the flicker effect.

```html
<body>

  <div ng-app="myApp" ng-controller="myCtrl">
    <h1 ng-bind="message"></h1>
  </div>

  <script>
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function($scope) {
      $scope.message = 'Hello, World from ng-bind!';
    });
  </script>

</body>
```

---

## Q:  Write a note on how an angularJS application can be developed using MVC architecture?

### Developing an AngularJS Application Using MVC Architecture

AngularJS is designed with the **Model-View-Controller (MVC)** architecture in mind, though it's not strictly limited to that pattern. In AngularJS, the architecture helps in organizing the application by separating concerns into different layers:

1. **Model (M)**: Represents the data and business logic. It typically consists of services, factories, and models.
2. **View (V)**: Represents the user interface (UI). It is what the user sees and interacts with, typically written in HTML with AngularJS bindings and directives.
3. **Controller (C)**: Acts as the intermediary between the Model and the View. It handles the logic, fetches data, and updates the View.

#### Basic File Structure:

```plaintext
- index.html
- app.js
- controllers/
  - mainController.js
- services/
  - dataService.js
```

#### 1. **`index.html`**:

```html
<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>AngularJS MVC Example</title>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
  <script src="app.js"></script>
  <script src="controllers/mainController.js"></script>
  <script src="services/dataService.js"></script>
</head>
<body>

  <div ng-controller="mainController">
    <h1>List of Items</h1>
    <ul>
      <li ng-repeat="item in items">
        {{ item.name }}
      </li>
    </ul>
  </div>

</body>
</html>
```

#### 2. **`app.js`**:

```javascript
var app = angular.module('myApp', []);
```

#### 3. **`services/dataService.js`**:

```javascript
angular.module('myApp').service('dataService', function($http) {
  this.getData = function() {
    return $http.get('https://api.example.com/data');
  };
});
```

#### 4. **`controllers/mainController.js`**:

```javascript
angular.module('myApp').controller('mainController', function($scope, dataService) {
  dataService.getData().then(function(response) {
    $scope.items = response.data;
  }, function(error) {
    console.error("Error fetching data:", error);
  });
});
```

---

### **How It Works**:

1. **Model**: The `dataService` (Service) provides the data for the application by making an HTTP request.
2. **Controller**: The `mainController` fetches the data using `dataService` and binds it to the scope as `items`.
3. **View**: The HTML view uses `ng-repeat` to loop through the `items` array and display the data dynamically.

**dependency injection** automatically provides the `dataService` to the `mainController` when you define it in the controller's function signature.
* AngularJS **injects** the **`dataService`** into the controller automatically. The `dataService` must be registered with the AngularJS module, which is done in the `services/dataService.js` file when you create the service.


### **Advantages of MVC in AngularJS**:

* **Separation of concerns**: The data (Model), logic (Controller), and UI (View) are all separated, making the application easier to manage and scale.
* **Reusability**: Services can be reused in different controllers or views.
* **Testability**: Each component (Model, View, Controller) can be tested independently.

---

## Q: How angular modules load the dependencies? 
In AngularJS, modules load dependencies using **dependency injection** (DI), which is a core feature of the framework. AngularJS modules help in organizing and structuring the application by managing services, controllers, directives, and other components. These components are made available to the application by specifying dependencies when defining the module or when registering the components.

Refer to the above example for reference

---

## Q: What are Expressions in AngularJS? 

### **Expressions in AngularJS**

In AngularJS, **expressions** are used to bind data to the view. They are similar to JavaScript expressions but with some specific differences. Expressions allow you to embed dynamic content within HTML templates and provide a way to display data or perform operations in a declarative manner.

1. **Binding Data to the View**:

   * Expressions are evaluated by AngularJS and the result is automatically reflected in the view.
   * They are typically used inside `{{}}` (double curly braces) to bind data to HTML elements.

2. **Syntax**:

   * The basic syntax of an AngularJS expression is `{{ expression }}`. AngularJS evaluates the expression and displays the result in the HTML.

#### 1. **Basic Expression**:

You can use expressions to display the value of variables from the `$scope`:

```html
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.name = 'John Doe';
});
</script>

<div ng-controller="myCtrl">
<p>Hello, {{ name }}!</p>
</div>

```

* In this example, `{{ name }}` binds to the `$scope.name` variable and will display `"Hello, John Doe!"`.

#### 2. **Mathematical Expressions**:

AngularJS expressions can also include mathematical operations like addition, subtraction, etc.

```html
<p>{{ 5 + 3 }}</p>  <!-- Output: 8 -->
```

* You can compute expressions like `{{ 5 + 3 }}`, and AngularJS will evaluate the result (`8`) and display it in the view.

#### 3. **Using Functions in Expressions**:

AngularJS allows you to use functions within expressions as long as they are part of the scope.

```html
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.getSum = function(a, b) {
    return a + b;
    };
});
</script>

<div ng-controller="myCtrl">
<p>Sum of 5 and 3 is: {{ getSum(5, 3) }}</p>
</div>
```

* Here, `getSum(5, 3)` is a function in the controller that AngularJS evaluates in the expression, and the result (`8`) is displayed.

#### 4. **Expressions with Arrays and Objects**:

You can also use expressions to access values from arrays and objects.

```html
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.user = {
    name: 'Alice',
    age: 30
    };
});
</script>

<div ng-controller="myCtrl">
<p>Name: {{ user.name }}</p>  <!-- Output: Alice -->
<p>Age: {{ user.age }}</p>    <!-- Output: 30 -->
</div>
```

* In this example, `{{ user.name }}` and `{{ user.age }}` access the properties of the `user` object defined in the `$scope`.

#### 5. **Boolean Expressions**:

AngularJS expressions can evaluate boolean values:

```html
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.isValid = true;
});
</script>

<div ng-controller="myCtrl">
<p>{{ isValid ? 'Valid' : 'Invalid' }}</p>  <!-- Output: Valid -->
</div>
```
---

## Q: How AngularJS expressions are different from the JavaScript expressions? 

JavaScript expressions do not support two-way data binding. The developer must manually manage data flow between the model and the view.

AngularJS expressions can be two-way data bound. They automatically reflect changes made to the model or the view. If the data changes, the view will update, and if the view changes, the model will update.

JavaScript expressions throw errors in a more traditional manner. If an error occurs (e.g., trying to divide by zero or referencing an undefined variable), JavaScript will throw an exception or display an error in the console.

AngularJS expressions can fail silently if an error occurs within the expression, such as trying to access an undefined property. AngularJS handles errors gracefully and might leave the expression as an empty string.

JavaScript expressions do not natively support filters; however, you can manipulate or format data using custom functions or external libraries.

AngularJS expressions support filters that can format data for display (like date or currency filters) directly in the view.

---

## Q: What are Filters in AngularJS?

### **Filters in AngularJS**

**Filters** in AngularJS are used to format or transform data before it is displayed in the view. They allow you to apply a specific transformation to an expression's result in the template, making it more readable or suitable for presentation. 

1. **`currency` Filter**:
   Formats a number as a currency value.

   ```html
   <div>{{ amount | currency }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <p>{{ price | currency }}</p>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.price = 1234.56;
     });
   </script>
   ```

   Output: `$1,234.56` (formatted as currency)

2. **`date` Filter**:
   Formats a date object as a string. You can specify the format you want for the date.

   ```html
   <div>{{ today | date:'yyyy-MM-dd' }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <p>{{ today | date:'yyyy-MM-dd' }}</p>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.today = new Date();
     });
   </script>
   ```

   Output: `2025-05-04` (current date in `yyyy-MM-dd` format)

3. **`filter` Filter**:
   Filters an array based on a condition or search string. It returns a new array with only the elements that match the condition.

   ```html
   <div>{{ items | filter:'apple' }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <ul>
       <li ng-repeat="item in items | filter:'apple'">{{ item }}</li>
     </ul>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.items = ['apple', 'banana', 'apple pie', 'orange'];
     });
   </script>
   ```

   Output: `apple`, `apple pie` (only the items containing "apple")

4. **`uppercase` and `lowercase` Filters**:
   Converts a string to uppercase or lowercase.

   ```html
   <div>{{ text | uppercase }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <p>{{ message | uppercase }}</p>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.message = 'Hello, AngularJS!';
     });
   </script>
   ```

   Output: `HELLO, ANGULARJS!` (text converted to uppercase)

5. **`limitTo` Filter**:
   Limits the array or string to a specific number of elements or characters.

   ```html
   <div>{{ items | limitTo:3 }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <p>{{ items | limitTo:3 }}</p>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.items = ['apple', 'banana', 'cherry', 'date'];
     });
   </script>
   ```

   Output: `apple,banana,cherry` (only the first 3 items of the array)

6. **`json` Filter**:
   Converts an object or array to a JSON string for easy viewing.

   ```html
   <div>{{ person | json }}</div>
   ```

   Example:

   ```html
   <div ng-app="myApp" ng-controller="myCtrl">
     <p>{{ person | json }}</p>
   </div>

   <script>
     var app = angular.module('myApp', []);
     app.controller('myCtrl', function($scope) {
       $scope.person = { name: 'Alice', age: 25 };
     });
   </script>
   ```

   Output: `{"name":"Alice","age":25}` (object is converted to a JSON string)

### **Chaining Filters**:

You can chain multiple filters together to apply several transformations in one expression.

```html
<div>{{ price | currency | uppercase }}</div>
```

* In this example, the `currency` filter is applied first, followed by the `uppercase` filter to convert the result to uppercase.

### Custom Filters
```javascript
angular.module('myApp', [])
  .filter('myCustomFilter', function() {
    return function(input) {
      // Custom transformation logic
      return modifiedInput;
    };
  });
```
---

## Q: What are different ways to invoke a directive? 

In AngularJS, a **directive** is a special token in the markup that tells the AngularJS compiler (`$compile`) to attach a specified behavior to that DOM element. When using directives, there are **four different ways** to invoke or apply them to elements in HTML:

| Invocation Method | Example                            | Notes                                                      |
| ----------------- | ---------------------------------- | ---------------------------------------------------------- |
| Attribute         | `<div my-directive></div>`         | Most common and recommended way                            |
| Element           | `<my-directive></my-directive>`    | Custom element; ensure HTML5 compatibility                 |
| Class             | `<div class="my-directive"></div>` | Rarely used; can conflict with CSS class names             |
| Comment           | `<!-- directive: my-directive -->` | Rare use case; Angular still processes the directive logic |

---

### **Directive Declaration (`restrict` Option)**

When defining a custom directive, you specify how it can be used via the `restrict` property:

```javascript
app.directive('myDirective', function() {
  return {
    restrict: 'AEC', // A = Attribute, E = Element, C = Class, M = Comment (for older AngularJS versions)
    template: '<p>This is my directive!</p>'
  };
});
```

* `'A'`: Only usable as an attribute.
* `'E'`: Only usable as an element.
* `'C'`: Only usable as a class.
* `'M'`: Only usable as a comment (supported in older versions like AngularJS 1.0.x).

---

## Q: Can you give a simple example of custom attribute directive ?

Yes, here's a simple example of a **custom attribute directive** in AngularJS (Angular 1.x):

```html
<!DOCTYPE html>
<html ng-app="myApp">
<head>
  <title>Custom Attribute Directive</title>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
</head>
<body ng-controller="MainCtrl">

  <h2 my-highlight>Hello from AngularJS Directive!</h2>

  <script>
    // Step 2: Define the AngularJS module
    var app = angular.module('myApp', []);

    // Step 3: Create a custom attribute directive
    app.directive('myHighlight', function() {
      return {
        restrict: 'A', // A = Attribute only
        link: function(scope, element, attrs) {
          element.css('background-color', 'lightyellow');
        }
      };
    });

    // Step 4: Define controller (optional here)
    app.controller('MainCtrl', function($scope) {
      // no logic needed for this simple example
    });
  </script>
</body>
</html>
```
---

## Q:  What is Global API?

### **What is Global API in AngularJS?**

In AngularJS, the **Global API** refers to a set of core functions provided directly by the AngularJS framework which can be used **outside the scope of the AngularJS application context**, often directly from JavaScript.

These APIs are available through the **`angular` object**, which is the global namespace provided by AngularJS.


| Function                | Description                                                      |
| ----------------------- | ---------------------------------------------------------------- |
| `angular.module()`      | Creates, registers, or retrieves an AngularJS module.            |
| `angular.element()`     | Wraps a DOM element in a jQuery/jQLite wrapper (like `$(...)`).  |
| `angular.copy()`        | Creates a deep copy of an object or array.                       |
| `angular.equals()`      | Checks if two objects or values are deeply equal.                |
| `angular.extend()`      | Merges the properties of one object into another (shallow copy). |
| `angular.isArray()`     | Checks if a value is an array.                                   |
| `angular.isDate()`      | Checks if a value is a date object.                              |
| `angular.isFunction()`  | Checks if a value is a function.                                 |
| `angular.isObject()`    | Checks if a value is an object.                                  |
| `angular.isUndefined()` | Checks if a value is `undefined`.                                |
| `angular.toJson()`      | Converts a JavaScript object to a JSON string.                   |
| `angular.fromJson()`    | Parses a JSON string into a JavaScript object.                   |

### 🔍 **Example Usage**:

#### 1. **`angular.module()`**

Used to create or retrieve a module.

```javascript
var app = angular.module('myApp', []);
```

#### 2. **`angular.copy()`**

Used to create a deep copy of an object.

```javascript
var original = { name: "Alice" };
var copy = angular.copy(original);
```

#### 3. **`angular.element()`**

Wraps the DOM element in Angular's jQuery lite wrapper.

```javascript
var el = angular.element(document.querySelector('#myDiv'));
el.addClass('highlight');
```

---
