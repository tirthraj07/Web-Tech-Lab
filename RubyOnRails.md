## What is Ruby?

Ruby is a **high-level, interpreted programming language** known for its **simplicity, readability, and productivity**. It was created by **Yukihiro "Matz" Matsumoto** and first released in **1995**. 

### Key Features of Ruby:

* **Object-Oriented:** Everything in Ruby is an object, even primitive data types like numbers and booleans.
* **Dynamic Typing:** You don't have to declare variable types explicitly.
* **Flexible Syntax:** Ruby has a clean, human-readable syntax
* **Garbage Collected:** Ruby has automatic memory management.
* **Rich Standard Library:** Comes with many built-in methods and classes for common tasks.

### Common Uses of Ruby:

* **Web development:** Most notably via the **Ruby on Rails** framework, which made Ruby very popular for building web applications.
* **Scripting and automation**
* **Data processing**
* **Prototyping and MVP development**

### Example Code:

```ruby
# Hello World in Ruby
puts "Hello, world!"

# A simple class
class Person
  def initialize(name)
    @name = name
  end

  def greet
    "Hello, my name is #{@name}."
  end
end

person = Person.new("Alice")
puts person.greet
```


---

## What is Ruby on Rails?

**Ruby on Rails** (often just called **Rails**) is a **web application framework** written in the **Ruby** programming language. Rails follows the **Model-View-Controller (MVC)** architectural pattern and is designed to make building web applications **faster and easier**, emphasizing **convention over configuration** and **don’t repeat yourself (DRY)** principles.

Ruby on Rails was developed by **David Heinemeier Hansson**

### Key Features of Ruby on Rails:

* **MVC Architecture:** Separates the application into three layers:

  * **Model:** Manages the data and business logic.
  * **View:** Handles the user interface.
  * **Controller:** Manages the flow between models and views.

* **Convention over Configuration:** Rails has sensible defaults, so developers can do more with less code and configuration.

* **DRY Principle (Don't Repeat Yourself):** Encourages reusable code and avoids redundancy.

* **Built-in ORM (ActiveRecord):** Maps database tables to Ruby classes automatically and simplifies database interactions.

* **RESTful Routing:** Rails encourages the use of RESTful routes for organizing web app actions.

* **Integrated Testing:** Comes with tools to write and run tests.

---


##  What is the current version of Ruby and Ruby on rails?

Ruby Programming Language: Ruby 3.4.3
Key Features:
- Enhanced performance with improvements to the YJIT compiler - Ruby's JIT compiler written in C
- Introduction of RJIT, a pure-Ruby JIT compiler
- Modular Garbage Collector for better memory management

Ruby on Rails Framework: Rails 8.0.2


## Ways to install Ruby on Rails

1. Use of version manager like `apt` or `brew`
2. Using docker containers with `ruby:3.4` image
3. Using RailsInstaller (Legacy):  used to bundle Ruby with its dependencies

Once Ruby is installed, simply run
```bash
gem install rails
```

## Explain DRY in Rails

DRY stands for “Don't Repeat Yourself”, a key software design principle that is central to Ruby on Rails.

Example:
1. Reusable Views with Partials
```html
<!-- app/views/posts/_header.html.erb -->
<h1>Header 1</h1>
```
Use the header as partial
```html
<!-- app/views/posts/new.html.erb -->
<%= render 'header' %>
```

2. Helpers for Shared Logic
```ruby
# app/helpers/posts_helper.rb
def format_date(date)
  date.strftime("%b %d, %Y")
end
```
Logic like date formatting is abstracted away to a helper instead of being repeated in multiple views.

```erb
<%= format_date(post.created_at) %>
```

----

## What is a Rails Script?

In Ruby on Rails, a Rails script is a command-line tool used to perform common tasks related to application development, testing, deployment, and debugging. These scripts are typically executed using the rails command (formerly script/ in older versions before Rails 3).

```bash
rails <script_name> [options]
```

### 📋 Common Rails Scripts / Commands:

| Script / Command              | Purpose                                            |
| ----------------------------- | -------------------------------------------------- |
| `rails new app_name`          | Creates a new Rails application                    |
| `rails server` (`rails s`)    | Starts a local web server (Puma by default)        |
| `rails generate` (`rails g`)  | Generates models, controllers, migrations, etc.    |
| `rails db:migrate`            | Applies database schema changes via migrations     |
| `rails routes`                | Lists all routes defined in the app                |
| `rails test` / `rails spec`   | Runs tests (depending on the test framework used)  |
| `rails db:create` / `db:drop` | Creates or deletes the database                    |
| `rails assets:precompile`     | Precompiles static assets (used in production)     |
---

---
## Rails DB Operations

In **Rails**, the `rails db` commands are used to manage your application's **database lifecycle**: creating, deleting, migrating, seeding, and resetting databases. These operations are essential when you're building and maintaining your application's data structure.

### 1. **Create the Database**

Creates the database defined in `config/database.yml`.

```bash
rails db:create
```

> Creates development and test databases (e.g., `db/development.sqlite3` if using SQLite).

---

### 2. **Drop/Delete the Database**

Deletes the database entirely.

```bash
rails db:drop
```

> Destroys the database for all environments (usually dev and test).

---

### 3. **Migrate the Database**

Applies all pending migrations to update the schema.

```bash
rails db:migrate
```

> Used after generating models or editing migration files.

---

### 4. **Rollback the Last Migration**

Reverts the most recent migration.

```bash
rails db:rollback
```

> Use `STEP=n` to roll back multiple steps:

```bash
rails db:rollback STEP=2
```

---

### 5. **Reset the Database**

Drops, creates, and migrates the database in one go.

```bash
rails db:reset
```

> Useful if you want to wipe and rebuild the database structure (without seeds).

---

### 6. **Seed the Database**

Populates the database with default/test data from `db/seeds.rb`.

```bash
rails db:seed
```

---

### 7. **Recreate from Scratch**

If you want to wipe and repopulate everything (common in development):

```bash
rails db:drop db:create db:migrate db:seed
```

## Example Use Case

Let's say you're building a blog app:

1. Generate a model:

   ```bash
   rails generate model Post title:string body:text
   ```

2. Migrate the DB:

   ```bash
   rails db:migrate
   ```

3. Add seed data in `db/seeds.rb`:

   ```ruby
   Post.create(title: "Hello", body: "This is my first post")
   ```

4. Seed it:

   ```bash
   rails db:seed
   ```

---

## What is an Active Record in Rails?

Active Record is the Object-Relational Mapping (ORM) layer built into Ruby on Rails. It connects Ruby classes (your models) to database tables, allowing you to interact with your database using pure Ruby code — no raw SQL needed.

---

## What are Models in Ruby on Rails

In Ruby on Rails, a model is a core component of the Model-View-Controller (MVC) architecture. The model is responsible for representing data and handling business logic related to that data. It communicates directly with the database to store, retrieve, and manipulate data. In Rails, models are typically ActiveRecord models, meaning they interact with the database via ActiveRecord, an Object-Relational Mapping (ORM) library that Rails provides.

---

## What are hashes in Ruby?

In **Ruby**, a **hash** is a **collection of key-value pairs**, similar to dictionaries in Python or objects in JavaScript.

### Basic Structure of a Hash:

```ruby
person = {
  "name" => "Alice",
  "age" => 30
}
```

Or using **symbol keys** (common in Ruby):

```ruby
person = {
  name: "Alice",
  age: 30
}
```

### Common Hash Operations:

#### Accessing a value:

```ruby
person[:name]  # => "Alice"
```

#### Adding or updating a key-value pair:

```ruby
person[:email] = "alice@example.com"
```

#### Iterating over a hash:

```ruby
person.each do |key, value|
  puts "#{key}: #{value}"
end
```

#### Deleting a key:

```ruby
person.delete(:age)
```

### Example: Nested Hash

```ruby
user = {
  name: "Bob",
  contact: {
    email: "bob@example.com",
    phone: "123-456"
  }
}

puts user[:contact][:email]  # => "bob@example.com"
```

---

## What are blocks in Ruby and how are they created?

### What Are Blocks in Ruby?

A **block** in Ruby is an **anonymous chunk of code** that can be **passed to a method** and **executed**. Think of it like a small function that you can give to a method to customize its behavior.

Blocks are a key feature of Ruby and are often used for iteration, callbacks, and custom logic.

---

### Syntax: Two Ways to Create Blocks

#### 1. **Using curly braces `{}`** (preferred for single-line blocks)

```ruby
[1, 2, 3].each { |num| puts num }
```

#### 2. **Using `do...end`** (preferred for multi-line blocks)

```ruby
[1, 2, 3].each do |num|
  puts "Number: #{num}"
end
```

---

### Example: Defining Your Own Method That Accepts a Block

```ruby
def greet
  puts "Hello!"
  yield if block_given?
  puts "Goodbye!"
end

greet { puts "Nice to meet you!" }
```

**Output:**

```
Hello!
Nice to meet you!
Goodbye!
```

* `yield` calls the block passed to the method.
* `block_given?` checks if a block was provided to avoid errors.

---

### Blocks With Parameters

```ruby
def greet_person
  yield("Alice") if block_given?
end

greet_person { |name| puts "Hello, #{name}!" }
```

**Output:**

```
Hello, Alice!
```
---

## `super` method in Ruby

In Ruby (and Ruby on Rails), the super keyword is used to call the same method from the parent (super) class — allowing you to extend or customize behavior in a subclass without completely overriding it.

```ruby
class Animal
  def speak
    puts "Animal sound"
  end
end

class Dog < Animal
  def speak
    super  # Calls Animal's speak
    puts "Bark!"
  end
end

Dog.new.speak
```

Ouput
```text
Animal sound
Bark!
```

---

## Disadvantages of Ruby on Rails

Yes, while **Ruby on Rails** (RoR) is a powerful and popular framework for building web applications, it does have some potential **disadvantages**. Here are some of the common drawbacks:

---

### 1️⃣ **Performance Issues**

* **Slower Than Some Alternatives**: Ruby, the language that Rails is built on, is often considered slower compared to languages like **Node.js**, **Go**, or **Java**. This can make Rails less ideal for high-performance applications, particularly those that need to handle a **large number of requests** per second (e.g., real-time applications, heavy computation tasks).

  **Solution**: For most web apps, this is not a significant concern, but if you need extreme performance, you may need to optimize Rails or use it in combination with other technologies (e.g., Redis, background jobs).

---

### 2️⃣ **Memory Consumption**

* Rails can consume a lot of **memory** due to its rich features, and this may become an issue in certain environments (e.g., low-resource servers or applications requiring rapid scaling).

  **Solution**: Proper application optimization, caching, and monitoring can help alleviate this issue.

---

### 3️⃣ **Learning Curve for Beginners**

* Although Rails follows the **"convention over configuration"** philosophy, it might still be challenging for new developers to understand its **opinionated** structure and vast number of built-in features. This can lead to confusion and slowdowns when getting started.

  **Solution**: Following the Rails guides, tutorials, and best practices can help overcome the learning curve.

---

### 4️⃣ **Less Flexibility in Architecture**

* Rails is highly opinionated, meaning that it enforces certain conventions on how applications should be structured (e.g., MVC architecture). This can be beneficial for rapid development, but it might feel restrictive if you want to implement a custom or non-standard architecture.

  **Solution**: You can always deviate from Rails conventions by modifying the structure or using other architectural patterns, but this can lead to complexity.

---

### 5️⃣ **Longer Startup Times**

* Rails has a relatively **long startup time** due to its reliance on **auto-loading** and initialization of numerous components. For small apps or during development, this can be frustrating when iterating quickly.

  **Solution**: You can optimize the development environment or use tools like `spring` to speed up Rails' boot time.

---

### 6️⃣ **Scalability Issues**

* While Rails is great for small to medium-sized applications, scaling can be more difficult for very large applications. The **Monolithic** nature of Rails apps can make them harder to break down into smaller, more scalable services (microservices).

  **Solution**: You can scale a Rails app using techniques like **horizontal scaling** (adding more servers) or split your app into microservices when needed.

---

### 7️⃣ **Community and Libraries**

* While Rails has a large and active community, it is not as **universally adopted** as other frameworks like **Node.js** or **Django**. Additionally, some libraries (gems) may be outdated or poorly maintained, leading to issues with compatibility or security.

  **Solution**: The Rails ecosystem is still strong, but it’s essential to evaluate and choose well-maintained gems. If a gem isn't updated, consider contributing or switching to an alternative.

---

### 8️⃣ **Overhead for Simple Applications**

* For small projects or simple applications, Rails may feel like **overkill**. It has many built-in features, which can introduce unnecessary complexity, especially when you don't need everything Rails offers.

  **Solution**: For simple applications, you can consider lighter frameworks or even raw Ruby with Sinatra or similar minimalistic frameworks.

---

### 9️⃣ **Hosting and Deployment Costs**

* While Rails applications can be deployed to popular cloud providers (e.g., **Heroku**, **AWS**), the **server costs** might be higher compared to other frameworks due to the memory and performance overhead.

  **Solution**: This is typically a concern for larger applications. With proper optimization and the use of cloud services, costs can be managed effectively.