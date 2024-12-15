
#### **TASK**

- Create two new classes: **StudentIndex** and **MyThirdProgram**.  
- In the **StudentIndex** class, the following should be included:  
	- A field containing the student's last name.  
	- A field for the number of the student's subjects.  
	- An array of grades (numbers).  
	- A constructor with parameters for the last name and the number of subjects.  
	- A method to retrieve grades from the user.  
	- A method to display the student's last name and their grades. The grades should be displayed as words (e.g., "good," "satisfactory," etc.). Use a `switch statement`.  
	- A method that returns the student's highest grade. Use `sort`.  
	- A method to display the grades that the student did not receive. Use `break` or `continue`.  

- In the **MyThirdProgram** class, the following should be included in the `main` method:  
	- Ask the user to enter the last name and the number of subjects.  
	- Create a student object.  
	- Retrieve their grades using the appropriate method.  (`setGrades()`)
	- Display their grades using the appropriate method.  
	- Display their highest grade using the appropriate method.  
	- Display the grades the student does not have using the appropriate method.

---

```
Enter student's last name: 
Pi
Enter number of subjects: 
3
Enter grades for 3 subjects: 
subject 1: 6
subject 2: 3
subject 3: 1
Student Pi
Grades: 
6 — invalid grade
3 — satisfactory
1 — invalid grade
Highest grade: 3
Missing grades: 2 4 5 
```

