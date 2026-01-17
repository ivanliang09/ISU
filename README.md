# ISU

## **Variables & Short Explanations:**

### **questions ArrayList**
- Stores all part A questions
### **answers ArrayList**
- Stores the correct answer (A–D) for each corresponding question in questions.
### **moreQuestions ArrayList**
- Stores all Part B questions with multiple-choice options.
### **moreAnswers ArrayList**
- Stores the correct answer (A–D) for each corresponding question in moreQuestions.
### **Temporary ArrayLists (tempA, tempAnsA, tempB, tempAnsB)**
-  Copies of the question and answer lists for each test attempt.
- Random questions are selected from these lists and removed after being asked to avoid repetition.
### **scoreA and scoreB**
- Keep track of the number of correct answers in Part A and Part B, respectively.
### **testEnded**
- Boolean to indicate if the test should be terminated early because the user can no longer pass a section.
### **choice**
- Stores the user’s initial menu selection (1 = take test, 2 = admin login).
### **randomNumber**
- Uses a random number generator to select test questions
### **user**
- Gets the user input for multiple choice answer
### **anotherUser**
- Used for the adding question part, where the variable stores a valid input after crossing the error handler
### **percent**
- Gets the final score in percentage
### **newQuestion & newAnswer**
- Gets the new question and answer before adding it to the ArrayList
### **answer**
- Gets the user input when choosing part A or B for removing/adding questions
### **input & secondInput**
- Gets the user input for the question they want to remove
### **valid, anotherValid & validChecker & anotherValidChecker**
- Boolean variables for the error handling
### **ans**
- User input, if it passes the error handling, then the value is given to another variable to continue the program
### **removeQ & removeA ArrayLists**
- Duplicate ArrayLists for the question removal function
### **secondUser**
- Similar to user, but only used for the indexing for removing a question
### **optionA, optionB, optionC & optionD**
- Gets user input for each multiple choice option, which is then concatenated into the full question
### **completedQuestion**
- Concateanted every part of the question, then adds to the question list.



## **Overall Logic:**
- Comments on the code

## **Work Log**
- 1/13: Brainstorming/Selecting the part
- 1/14: Rough outline and code didn't work at all. Needed many fixes
- 1/15: Improved the logic and refined some parts
- 1/16: Playtesting and checking for bugs
- 1/17: Fixed adding, and removing questions. Then added an error handling system. Finally, submitted the project.
