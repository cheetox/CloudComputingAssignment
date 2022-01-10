# CloudComputingAssignment

**Get Employees**
----
  Returns all employees.

* **URL**

  /employee

* **Method:**

  `GET`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
        "id": 1,
        "name": "Meris",
        "surname": "Grishakin",
        "address": "93088 Elgar Drive"
    }`
    

**Get Employee**
----
  Returns a single employee with given id.

* **URL**

  /employee/:id

* **Method:**

  `GET`
  
*  **URL Params**

   **Required:**
 
   `id=[integer]`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
        "id": 1,
        "name": "Meris",
        "surname": "Grishakin",
        "address": "93088 Elgar Drive"
    }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />

**Create Employee**
----
  Creates and return an employee with given data.

* **URL**

  /employee

* **Method:**

  `POST`

* **Data Params**

  `{
        "name": "Meris",
        "surname": "Grishakin",
        "address": "93088 Elgar Drive"
    }`

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{
        "id": 1,
        "name": "Meris",
        "surname": "Grishakin",
        "address": "93088 Elgar Drive"
    }`
    

**Delete Employee**
----
  Deletes employee with given id, if exists.

* **URL**

  /employee/:id

* **Method:**

  `DELETE`
  
*  **URL Params**

   **Required:**
 
   `id=[integer]`

* **Success Response:**

  * **Code:** 200 <br />
 
