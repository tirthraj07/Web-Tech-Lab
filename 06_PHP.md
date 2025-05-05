## Q: What is PHP? Where is it used?

PHP stands for **Hypertext Preprocessor**. It’s a **server-side scripting language** mainly used for **developing dynamic web pages and web applications**. Since it's executed on the server, the result (usually HTML) is sent to the client’s browser, but the actual PHP code stays hidden from the user.

PHP is popular because it's open-source, easy to learn, and integrates well with HTML and databases like MySQL.

**Where it's used:**

* **Web development:** PHP is widely used to build websites, especially dynamic ones that interact with databases.
* **Content Management Systems (CMS):** Platforms like WordPress, Joomla, and Drupal are built with PHP.
* **E-commerce sites:** Websites like Magento and OpenCart are PHP-based.
* **Server-side form handling:** PHP processes data from HTML forms.
* **Database interaction:** It's commonly used with MySQL or PostgreSQL for CRUD operations.

---
## Q: Why PHP is known as scripting language?

A scripting language or script language is a programming language that supports scripts, programs written for a special run-time environment that can interpret (rather than compile) and automate the execution of tasks that could be executed one-by-one.

PHP is known as a **scripting language** because it is **interpreted at runtime rather than compiled beforehand**. This means the PHP code is executed line by line on the server whenever a request is made, instead of being converted into machine code before execution like in compiled languages (e.g., C++ or Java).

In particular:

* PHP scripts are written inside files (usually with `.php` extension).
* These scripts are processed by a PHP interpreter on the server.
* The output (usually HTML) is sent to the user's browser.

Since PHP is mainly used to **automate tasks inside web pages**—like processing forms, accessing databases, or managing sessions—it fits the role of a scripting language perfectly.

---

## Q: What do you mean by Server Side Scripting? Why is php a Server Side Scripting language?

Server-side scripting refers to the process where code is executed on the server, not on the user's browser. It allows websites to generate dynamic content, interact with databases, manage sessions, and control how data is processed before being sent to the user.

PHP is a server-side scripting language because its code is executed on the server, not in the user's browser.

---

## Q: What these tags specify in PHP : <?php and ?>  

The tags `<?php` and `?>` in PHP are called **PHP opening and closing tags**. They are used to tell the server where the PHP code starts and ends within a file.

* `<?php` — This is the **opening tag**. It signals the beginning of PHP code.
* `?>` — This is the **closing tag**. It marks the end of PHP code.

Everything written between these tags is treated as PHP code and will be executed on the server.

**Example:**

```php
<?php
echo "Hello, world!";
?>
```

In this example, the `echo` statement prints "Hello, world!" to the web page.

---

## Q: Can we run PHP from HTML file? If yes, how?  

Yes, **we can run PHP code within an HTML file**, but the file must be saved with a **`.php` extension** instead of `.html`. This allows the web server (with PHP installed) to recognize and process the PHP code inside the HTML.

### **How to do it:**

1. **Rename the file:**
   Change the file extension from `.html` to `.php` (e.g., `index.php`).

2. **Embed PHP code inside HTML using `<?php ... ?>` tags:**

```php
<!DOCTYPE html>
<html>
<head>
    <title>PHP in HTML</title>
</head>
<body>
    <h1>Welcome</h1>
    <p>Today's date is: 
        <?php 
            echo date("Y-m-d"); 
        ?>
    </p>
</body>
</html>
```

Checkout `PHP Example 1` in the repository!

---

## Q: Explain variables in PHP

In PHP, a **variable** is used to **store data** that can be used and modified throughout a script. Variables in PHP are **declared using the `$` symbol**, followed by the variable name.

### **Key Points about PHP Variables:**

* A variable starts with the **`$`** sign, followed by the name.
* Variable names are **case-sensitive** (`$name` and `$Name` are different).
* Must start with a **letter or underscore** (e.g., `$name`, `$_count`)
* Cannot start with a number (e.g., `$2value` is invalid)
* Cannot contain spaces or special characters (except underscore)
* The **value of a variable can change** during program execution.
* You **don’t need to declare the data type**—PHP is a **loosely typed language**, so it automatically detects the type based on the value assigned.

### **Syntax:**

```php
$variable_name = value;
```

### **Example:**

```php
<?php
$name = "John";
$age = 25;
$isStudent = true;

echo "Name: $name, Age: $age";
?>
```

### **Types of data variables can hold:**

* Strings
* Integers
* Floats
* Booleans
* Arrays
* Objects
* NULL

---

## Q: Explain all possible types of scope of variable? 

The **scope of a variable** determines **where the variable can be accessed or used** within a script. PHP supports **four types of variable scope**:

### 1. **Local Scope**

A variable declared **inside a function** is called a **local variable**. It can **only be accessed within that function**.

**Example:**

```php
<?php
function greet() {
    $message = "Hello"; // local variable
    echo $message;
}
greet();
// echo $message; // Error: undefined outside the function
?>
```

### 2. **Global Scope**

A variable declared **outside any function** has **global scope**. It can be accessed anywhere in the script, but **not directly inside functions** unless declared using the `global` keyword.

**Example:**

```php
<?php
$siteName = "My Website"; // global variable

function showSite() {
    global $siteName; // allows access to global variable
    echo $siteName;
}
showSite();
?>
```

### 3. **Static Scope**

A variable declared with the `static` keyword inside a function retains its **value between function calls**. Normally, local variables are deleted once the function ends, but `static` variables keep their value.

**Example:**

```php
<?php
function counter() {
    static $count = 0;
    $count++;
    echo $count . "<br>";
}
counter(); // 1
counter(); // 2
counter(); // 3
?>
```

### 4. **Super Global Scope**

PHP provides several built-in **superglobal variables** that are accessible **from anywhere in the script**, regardless of scope. These include:

* `$_GET`
* `$_POST`
* `$_SERVER`
* `$_SESSION`
* `$_COOKIE`
* `$_FILES`
* `$_REQUEST`
* `$_ENV`

**Example:**

```php
<?php
echo $_SERVER['SERVER_NAME']; // outputs the server name eg (localhost)
?>
```

### Summary Table:

| Scope        | Declared In      | Accessible In                         | Keyword Required |
| ------------ | ---------------- | ------------------------------------- | ---------------- |
| Local        | Inside function  | Same function only                    | No               |
| Global       | Outside function | Inside function (with `global`)       | Yes              |
| Static       | Inside function  | Same function (persists across calls) | Yes (`static`)   |
| Super Global | System-defined   | Everywhere                            | No               |

---

## Q: Write a program in PHP to calculate Square Root of a number? 

```php
<?php
// Function to calculate square root
function calculateSquareRoot($number) {
    // Check if the number is non-negative
    if ($number >= 0) {
        $sqrt = sqrt($number);
        return $sqrt;
    } else {
        return "Error: Square root of a negative number is not a real number.";
    }
}

// Example
$number = 25;
$result = calculateSquareRoot($number);

echo "The square root of $number is: $result";
?>
```

---

## Q: What is the purpose of $_PHP_SELF

`$_PHP_SELF` is a **superglobal variable** in PHP that returns the current script's filename or URL, including the query string if applicable. It is commonly used to refer to the script that is currently executing or handling a request.

### **Purpose of `$_PHP_SELF`:**

1. **Form Action**: It is most often used as the action in an HTML form. This allows the form to submit to itself, which can be useful for handling form data in the same script (often called "self-processing forms").

2. **Self-Referencing**: It helps to refer back to the same script, for example, when you want to display results of a form or process user input without redirecting to another page.

### **Example:**

```php
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    echo "Hello, " . $_POST['name'] . "!";
}
?>

<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
    Name: <input type="text" name="name">
    <input type="submit">
</form>
```

In this example:

* The form submits to itself (the same PHP script), and the script processes the form data after submission.
* `$_SERVER['PHP_SELF']` returns the current script name, which is used as the form's action attribute to ensure the form submits to the same script.

---

## Q: What do you meant by WAMP, LAMP and XAMP? 
**WAMP**, **LAMP**, and **XAMP** are acronyms that refer to software stacks commonly used for web development. These stacks combine different technologies to help developers build dynamic websites and web applications. Here's a breakdown of each:

### **1. WAMP (Windows, Apache, MySQL, PHP)**

WAMP is a software stack used primarily for developing and hosting web applications on Windows operating systems. It includes the following components:

* **W**indows: The operating system on which the stack runs.
* **A**pache: The web server that serves web pages.
* **M**ySQL: The database management system used to store data for applications.
* **P**HP: The server-side scripting language used for dynamic content generation.

**Use Case**: WAMP is suitable for developers working on Windows who need to develop dynamic websites or web applications using PHP and MySQL.

### **2. LAMP (Linux, Apache, MySQL, PHP)**

LAMP is a popular software stack for web development, primarily used in Linux environments. It includes:

* **L**inux: The operating system that serves as the base of the stack.
* **A**pache: The web server that handles HTTP requests.
* **M**ySQL: The database management system used for storing and retrieving data.
* **P**HP: The programming language used for dynamic web pages and server-side scripting.

**Use Case**: LAMP is widely used by developers who want to deploy web applications in Linux environments. It's a reliable, open-source stack for developing and hosting websites.

### **3. XAMP (Cross-platform, Apache, MySQL, PHP)**

XAMP is a cross-platform software stack, meaning it works on multiple operating systems (Windows, Linux, Mac OS, etc.). It includes:

* **X** (Cross-platform): The ability to run on various operating systems, including Windows, Linux, and macOS.
* **A**pache: The web server used to serve web pages.
* **M**ySQL: The relational database management system.
* **P**HP: The scripting language for generating dynamic web content.

**Use Case**: XAMP is designed for developers who want to develop on multiple platforms without being tied to a specific operating system. It's particularly useful for testing and developing on different systems, as it's available for Windows, Linux, and macOS.
---

## Q: What is the purpose of “nl2br “string function? 
The **`nl2br()`** function in PHP is used to **convert newlines (`\n`) into HTML line breaks (`<br />`)**. This function is particularly useful when you want to display text that contains newlines (such as text from a form or user input) on a webpage while preserving the line breaks in HTML format.

### **Purpose:**

* It converts **newline characters (`\n`)** into **HTML line break tags (`<br />`)** to ensure that newlines in the input string are properly displayed in HTML output.

### **Example 1:**

```php
<?php
$text = "This is the first line.\nThis is the second line.\nThis is the third line.";
echo nl2br($text);
?>
```

**Output:**

```
This is the first line.<br />
This is the second line.<br />
This is the third line.
```
---

## Q: How to link two html pages

In PHP, you can create links using **HTML anchor (`<a>`) tags** inside PHP scripts. The anchor tag's `href` attribute defines the destination URL of the link, and you can use PHP to dynamically generate the link’s URL or other attributes.

You can create a static link in PHP by simply writing an anchor tag inside PHP echo statement:

```php
<?php
echo '<a href="https://www.example.com">Visit Example</a>';
?>
```

**Explanation:**

* This will create a link that, when clicked, takes the user to `https://www.example.com` with the text **"Visit Example"**.

You can also do this:
```php
<?php
$website = "https://www.example.com";
$text = "Click here to visit Example!";
echo '<a href="' . $website . '">' . $text . '</a>';
?>
```

---

## Q: Write the name of PHP functions that can be used to build a function that accepts any number ofarguments? 

### 1. **`func_get_args()`**

The `func_get_args()` function returns an array of all arguments passed to the function.

#### Example:

```php
function myFunction() {
    $args = func_get_args(); // Get all arguments
    foreach ($args as $arg) {
        echo $arg . " ";
    }
}

myFunction(1, 2, 3, "hello", 5.5); // Output: 1 2 3 hello 5.5
```

### 2. **`...$args` (Variadic Functions)**

PHP 5.6 and later support **variadic functions** using the `...` operator. This allows you to pass any number of arguments directly as an array.

#### Example:

```php
function myFunction(...$args) {
    foreach ($args as $arg) {
        echo $arg . " ";
    }
}

myFunction(1, 2, 3, "hello", 5.5); // Output: 1 2 3 hello 5.5
```
---

## Q: Purpose of $_REQUEST Variable in PHP

The $_REQUEST variable in PHP is a superglobal array that is used to collect data after submitting a form. It contains the combined contents of $_GET, $_POST, and $_COOKIE arrays, which means it holds input data sent via GET, POST, or COOKIE methods.

GET: Data passed through the URL query string.
POST: Data passed through HTTP POST method (form data).
COOKIE: Data stored in cookies that is sent with the HTTP request.

The $_REQUEST array allows you to access form data and other information regardless of the method used to send it.

**Checkout `PHP Example 2` witch uses $_REQUEST, $_SERVER and $_PHP_SELF**

---

## Q: What is the difference between include and require in PHP
The difference between `include` and `require` in PHP lies in how they handle errors when the specified file is **not found** or **fails to load**:

### `include`

* **If the file is not found**, PHP **throws a warning**, but the script **continues to execute**.
* Use it when the file is **optional** and the script can still run without it.

**Example:**

```php
include('optional_file.php');
echo "This will still run even if the file is missing.";
```

### `require`

* **If the file is not found**, PHP **throws a fatal error** and the script **stops execution**.
* Use it when the file is **essential** (e.g., configuration or function files).

**Example:**

```php
require('config.php');
echo "This will NOT run if config.php is missing.";
```
---


---
## Q: Explain Arrays and Loops in PHP

### **Arrays in PHP:**

An **array** in PHP is a **variable** that can hold multiple values at once. Arrays can store values of **different data types**, such as strings, integers, and even other arrays.

There are two main types of arrays in PHP:

1. **Indexed Arrays** (numeric indices)
2. **Associative Arrays** (named keys)

#### 1. **Indexed Arrays:**

In indexed arrays, the elements are stored with a numeric index starting from 0 by default.

**Example:**

```php
<?php
// Indexed array
$fruits = array("Apple", "Banana", "Cherry");

// Accessing elements
echo $fruits[0]; // Outputs: Apple
echo $fruits[1]; // Outputs: Banana
?>
```

You can also use **short syntax** to define arrays:

```php
$fruits = ["Apple", "Banana", "Cherry"];
```

#### 2. **Associative Arrays:**

In associative arrays, the elements are stored with **named keys** instead of numeric indices.

**Example:**

```php
<?php
// Associative array
$person = array("name" => "John", "age" => 25, "city" => "New York");

// Accessing elements by key
echo $person["name"]; // Outputs: John
echo $person["age"];  // Outputs: 25
?>
```

### **3. Multidimensional Array**

A **multidimensional array** is an array that contains one or more arrays within it. These arrays can be either numeric or associative arrays, and you can have an array of arrays, or even arrays with different dimensions.

#### **Example:**

```php
<?php
// Multidimensional array
$students = array(
    "John" => array("age" => 20, "city" => "New York"),
    "Jane" => array("age" => 22, "city" => "Los Angeles"),
    "Paul" => array("age" => 21, "city" => "Chicago")
);

// Accessing elements
echo $students["John"]["age"];  // Outputs: 20
echo $students["Jane"]["city"]; // Outputs: Los Angeles
?>
```

* A multidimensional array is like an array of arrays, where each element can be an array itself.
* You can use multiple indices (or keys) to access nested elements, such as `$array[0][1]` or `$array["key1"]["key2"]`.


### **Loops in PHP:**

Loops are used to **repeat a block of code** multiple times. PHP supports several types of loops:

#### 1. **`for` loop:**

The `for` loop is used when you know in advance how many times you want to execute a statement or a block of statements.

**Example:**

```php
<?php
// Using a for loop to print numbers from 1 to 5
for ($i = 1; $i <= 5; $i++) {
    echo $i . "<br>";
}
?>
```

#### 2. **`while` loop:**

The `while` loop executes a block of code as long as the specified condition is `true`.

**Example:**

```php
<?php
// Using a while loop to print numbers from 1 to 5
$i = 1;
while ($i <= 5) {
    echo $i . "<br>";
    $i++;
}
?>
```

#### 3. **`foreach` loop:**

The `foreach` loop is used to iterate over arrays. It’s specifically designed for **arrays** and is simpler than using `for` or `while` loops.

**Syntax:**

```php
foreach ($array as $value) {
    // Code to be executed for each value
}
```

**Example (Indexed Array):**

```php
<?php
// Using foreach with an indexed array
$fruits = ["Apple", "Banana", "Cherry"];
foreach ($fruits as $fruit) {
    echo $fruit . "<br>";
}
?>
```

**Example (Associative Array):**

```php
<?php
// Using foreach with an associative array
$person = array("name" => "John", "age" => 25, "city" => "New York");
foreach ($person as $key => $value) {
    echo "$key: $value<br>";
}
?>
```

#### 4. **`do-while` loop:**

The `do-while` loop is similar to the `while` loop, but the code block is executed **at least once**, even if the condition is `false` at the beginning.

**Example:**

```php
<?php
// Using a do-while loop to print numbers from 1 to 5
$i = 1;
do {
    echo $i . "<br>";
    $i++;
} while ($i <= 5);
?>

### **Combining Arrays and Loops:**

You can use loops to iterate over arrays and process each element.

**Example:**

```php
<?php
$fruits = ["Apple", "Banana", "Cherry"];

// Using a foreach loop to print each element in the array
foreach ($fruits as $fruit) {
    echo $fruit . "<br>";
}
?>
```
---

## Q: Dot Operator in PHP

In PHP, the **`.` (dot)** operator is used for **concatenating (joining) strings**. When you use `echo`, it outputs whatever is passed to it, but if you want to combine multiple strings or variables into a single output, you use the **dot operator**.

### Example:

```php
<?php
$name = "John";
$age = 25;

echo "Name: " . $name . ", Age: " . $age;
?>
```

**Explanation:**

* The **`.`** is used to concatenate the string `"Name: "` with the value of `$name`, then concatenate that with `", Age: "` and finally with the value of `$age`.
* This results in the output: `Name: John, Age: 25`.

Without the dot operator, you cannot combine strings and variables directly in `echo`.

---

## Q: Strings and String methods in PHP

### **Strings in PHP:**

In PHP, a **string** is a sequence of characters enclosed within either **single quotes** (`'`) or **double quotes** (`"`). Strings are one of the most common data types used in PHP for handling text and can be manipulated in a variety of ways.

#### **Creating Strings:**

1. **Single-quoted Strings:**

   * A string enclosed in single quotes is treated as a literal string.
   * Variables inside single-quoted strings are **not** parsed (except for special characters like `\\` or `\'`).

   **Example:**

   ```php
   $name = 'John';
   echo 'Hello, $name';  // Outputs: Hello, $name
   ```

2. **Double-quoted Strings:**

   * A string enclosed in double quotes can interpret variables within the string.
   * Escape sequences like `\n` (new line) or `\t` (tab) are processed.

   **Example:**

   ```php
   $name = 'John';
   echo "Hello, $name";  // Outputs: Hello, John
   ```

---

### **Common String Methods in PHP:**

PHP provides many built-in string functions to manipulate and analyze strings.

#### **1. `strlen()`**

Returns the length of a string.

**Example:**

```php
<?php
$str = "Hello, World!";
echo strlen($str);  // Outputs: 13
?>
```

#### **2. `strtoupper()`**

Converts a string to uppercase.

**Example:**

```php
<?php
$str = "hello";
echo strtoupper($str);  // Outputs: HELLO
?>
```

#### **3. `strtolower()`**

Converts a string to lowercase.

**Example:**

```php
<?php
$str = "HELLO";
echo strtolower($str);  // Outputs: hello
?>
```

#### **4. `ucwords()`**

Converts the first character of each word in a string to uppercase.

**Example:**

```php
<?php
$str = "hello world";
echo ucwords($str);  // Outputs: Hello World
?>
```

#### **5. `ucfirst()`**

Converts the first character of a string to uppercase.

**Example:**

```php
<?php
$str = "hello";
echo ucfirst($str);  // Outputs: Hello
?>
```

#### **6. `trim()`**

Removes whitespace (or other characters) from the beginning and end of a string.

**Example:**

```php
<?php
$str = "   Hello, World!   ";
echo trim($str);  // Outputs: Hello, World!
?>
```

#### **7. `str_replace()`**

Replaces all occurrences of a substring within a string.

**Example:**

```php
<?php
$str = "Hello, World!";
echo str_replace("World", "PHP", $str);  // Outputs: Hello, PHP!
?>
```

#### **8. `substr()`**

Returns a part of a string, starting from a specified position.

**Example:**

```php
<?php
$str = "Hello, World!";
echo substr($str, 7, 5);  // Outputs: World
?>
```

#### **9. `strpos()`**

Finds the position of the first occurrence of a substring in a string.

**Example:**

```php
<?php
$str = "Hello, World!";
echo strpos($str, "World");  // Outputs: 7
?>
```

#### **10. `strlen()`**

Returns the length of a string (number of characters).

**Example:**

```php
<?php
$str = "Hello";
echo strlen($str);  // Outputs: 5
?>
```

#### **11. `explode()`**

Splits a string into an array by a specified delimiter.

**Example:**

```php
<?php
$str = "apple,banana,cherry";
$arr = explode(",", $str);
print_r($arr);  // Outputs: Array ( [0] => apple [1] => banana [2] => cherry )
?>
```

#### **12. `implode()`**

Joins array elements into a string using a specified delimiter.

**Example:**

```php
<?php
$arr = ["apple", "banana", "cherry"];
$str = implode(",", $arr);
echo $str;  // Outputs: apple,banana,cherry
?>
```

#### **13. `str_repeat()`**

Repeats a string a specified number of times.

**Example:**

```php
<?php
$str = "PHP ";
echo str_repeat($str, 3);  // Outputs: PHP PHP PHP
?>
```

#### **14. `sprintf()`**

Returns a formatted string.

**Example:**

```php
<?php
$name = "John";
$age = 25;
echo sprintf("My name is %s and I am %d years old.", $name, $age);
// Outputs: My name is John and I am 25 years old.
?>
```

#### **15. `str_split()`**

Splits a string into an array of characters.

**Example:**

```php
<?php
$str = "Hello";
print_r(str_split($str));  // Outputs: Array ( [0] => H [1] => e [2] => l [3] => l [4] => o )
?>
```
---

## Q: Array Methods in PHP

### **1. `array_push()`**

Adds one or more elements to the end of an array.

**Syntax:**

```php
array_push($array, $value1, $value2, ...);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana");
array_push($fruits, "Cherry", "Date");
print_r($fruits);
?>
```

**Output:**

```
Array
(
    [0] => Apple
    [1] => Banana
    [2] => Cherry
    [3] => Date
)
```



### **2. `array_pop()`**

Removes and returns the last element of an array.

**Syntax:**

```php
array_pop($array);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry");
$last_fruit = array_pop($fruits);
echo $last_fruit;  // Outputs: Cherry
print_r($fruits);
?>
```

**Output:**

```
Apple
Array
(
    [0] => Apple
    [1] => Banana
)
```



### **3. `array_shift()`**

Removes and returns the first element of an array.

**Syntax:**

```php
array_shift($array);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry");
$first_fruit = array_shift($fruits);
echo $first_fruit;  // Outputs: Apple
print_r($fruits);
?>
```

**Output:**

```
Apple
Array
(
    [0] => Banana
    [1] => Cherry
)
```



### **4. `array_unshift()`**

Adds one or more elements to the beginning of an array.

**Syntax:**

```php
array_unshift($array, $value1, $value2, ...);
```

**Example:**

```php
<?php
$fruits = array("Banana", "Cherry");
array_unshift($fruits, "Apple", "Date");
print_r($fruits);
?>
```

**Output:**

```
Array
(
    [0] => Apple
    [1] => Date
    [2] => Banana
    [3] => Cherry
)
```



### **5. `array_slice()`**

Returns a portion of an array.

**Syntax:**

```php
array_slice($array, $offset, $length, $preserve_keys);
```

* `$offset`: Starting index (can be negative).
* `$length`: Number of elements to return.
* `$preserve_keys`: If `true`, the original keys are preserved.

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry", "Date", "Elderberry");
$sliced_fruits = array_slice($fruits, 2, 3);
print_r($sliced_fruits);
?>
```

**Output:**

```
Array
(
    [0] => Cherry
    [1] => Date
    [2] => Elderberry
)
```



### **6. `array_merge()`**

Merges two or more arrays into one array.

**Syntax:**

```php
array_merge($array1, $array2, ...);
```

**Example:**

```php
<?php
$array1 = array("Apple", "Banana");
$array2 = array("Cherry", "Date");
$merged_array = array_merge($array1, $array2);
print_r($merged_array);
?>
```

**Output:**

```
Array
(
    [0] => Apple
    [1] => Banana
    [2] => Cherry
    [3] => Date
)
```



### **7. `array_keys()`**

Returns all the keys of an array.

**Syntax:**

```php
array_keys($array);
```

**Example:**

```php
<?php
$person = array("name" => "John", "age" => 25, "city" => "New York");
$keys = array_keys($person);
print_r($keys);
?>
```

**Output:**

```
Array
(
    [0] => name
    [1] => age
    [2] => city
)
```



### **8. `array_values()`**

Returns all the values of an array, indexed numerically.

**Syntax:**

```php
array_values($array);
```

**Example:**

```php
<?php
$person = array("name" => "John", "age" => 25, "city" => "New York");
$values = array_values($person);
print_r($values);
?>
```

**Output:**

```
Array
(
    [0] => John
    [1] => 25
    [2] => New York
)
```



### **9. `array_key_exists()`**

Checks if a specific key exists in an array.

**Syntax:**

```php
array_key_exists($key, $array);
```

**Example:**

```php
<?php
$person = array("name" => "John", "age" => 25);
if (array_key_exists("name", $person)) {
    echo "The 'name' key exists in the array.";
}
?>
```

**Output:**

```
The 'name' key exists in the array.
```



### **10. `array_map()`**

Applies a callback function to the elements of an array.

**Syntax:**

```php
array_map($callback, $array);
```

**Example:**

```php
<?php
$numbers = array(1, 2, 3);
$squared_numbers = array_map(function($n) { return $n * $n; }, $numbers);
print_r($squared_numbers);
?>
```

**Output:**

```
Array
(
    [0] => 1
    [1] => 4
    [2] => 9
)
```



### **11. `array_filter()`**

Filters elements of an array using a callback function.

**Syntax:**

```php
array_filter($array, $callback);
```

**Example:**

```php
<?php
$numbers = array(1, 2, 3, 4, 5);
$even_numbers = array_filter($numbers, function($n) { return $n % 2 == 0; });
print_r($even_numbers);
?>
```

**Output:**

```
Array
(
    [1] => 2
    [3] => 4
)
```



### **12. `array_reverse()`**

Reverses the order of the elements in an array.

**Syntax:**

```php
array_reverse($array);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry");
$reversed_fruits = array_reverse($fruits);
print_r($reversed_fruits);
?>
```

**Output:**

```
Array
(
    [0] => Cherry
    [1] => Banana
    [2] => Apple
)
```



### **13. `in_array()`**

Checks if a value exists in an array.

**Syntax:**

```php
in_array($value, $array);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry");
if (in_array("Banana", $fruits)) {
    echo "Banana is in the array.";
}
?>
```

**Output:**

```
Banana is in the array.
```



### **14. `array_search()`**

Searches for a value in an array and returns the corresponding key.

**Syntax:**

```php
array_search($value, $array);
```

**Example:**

```php
<?php
$fruits = array("Apple", "Banana", "Cherry");
$key = array_search("Banana", $fruits);
echo $key;  // Outputs: 1
?>
```



### **15. `array_diff()`**

Compares two arrays and returns the elements that are present in the first array but not in the second.

**Syntax:**

```php
array_diff($array1, $array2);
```

**Example:**

```php
<?php
$array1 = array("Apple", "Banana", "Cherry");
$array2 = array("Banana", "Cherry");
$result = array_diff($array1, $array2);
print_r($result);
?>
```

**Output:**

```
Array
(
    [0] => Apple
)
```

---

