# Spring Boot API Documentation

This repository contains a Spring Boot project with CRUD operations for `Categories` and `Products`.

## Category CRUD Operations

Below are the APIs required to manage categories:

### 1. Get All Categories
- **Endpoint:** `GET http://localhost:8080/api/categories?page=3`
- **Description:** Fetch all categories with pagination.
- **Parameters:**
  - `page`: The page number to fetch .

### 2. Create a New Category
- **Endpoint:** `POST http://localhost:8080/api/categories`
- **Description:** Create a new category by sending category details in the request body.

### 3. Get Category by Id
- **Endpoint:** `GET http://localhost:8080/api/categories/{di}`
- **Description:** Fetch a category by its ID.
- **Path Variables:**
  - `di`: The ID of the category.

### 4. Update Category by Id
- **Endpoint:** `PUT http://localhost:8080/api/categories/{di}`
- **Description:** Update an existing category by ID.
- **Path Variables:**
  - `di`: The ID of the category.
- **Request Body:** Send updated category details in the request body.

### 5. Delete Category by Id
- **Endpoint:** `DELETE http://localhost:8080/api/categories/{di}`
- **Description:** Delete a category by its ID.
- **Path Variables:**
  - `di`: The ID of the category.

---

## Product CRUD Operations

Below are the APIs required to manage products:

### 1. Get All Products
- **Endpoint:** `GET http://localhost:8080/api/products?page=2`
- **Description:** Fetch all products with pagination.
- **Parameters:**
  - `page`: The page number to fetch.

### 2. Create a New Product
- **Endpoint:** `POST http://localhost:8080/api/products`
- **Description:** Create a new product by sending product details in the request body.

### 3. Get Product by Id
- **Endpoint:** `GET http://localhost:8080/api/products/{di}`
- **Description:** Fetch a product by its ID.
- **Path Variables:**
  - `di`: The ID of the product.

### 4. Update Product by Id
- **Endpoint:** `PUT http://localhost:8080/api/products/{di}`
- **Description:** Update an existing product by ID.
- **Path Variables:**
  - `di`: The ID of the product.
- **Request Body:** Send updated product details in the request body.

### 5. Delete Product by Id
- **Endpoint:** `DELETE http://localhost:8080/api/products/{di}`
- **Description:** Delete a product by its ID.
- **Path Variables:**
  - `di`: The ID of the product.

---

## How to Run the Project

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Ensure that you have Java and Maven installed.
4. Run the application using the command:
   ```bash
   mvn spring-boot:run



### Explanation of Sections:

1. **Implementations**:

A) Used Spring boot

B) Used Rest controller

C) DB configuration for handle data effectively

D) Use annotation based configuration 

E) JPA & Hibernate



