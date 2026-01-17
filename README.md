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
### **percent**
- Gets the final score in percentage
### **newQuestion & newAnswer**
- Gets the new question and answer before adding it to the ArrayList
### **answer**
- Gets the user input when choosing part A or B for removing/adding questions
### **input & secondInput**
- Gets the user input for the question they want to remove
### **valid & validChecker**
- Boolean variables for the error handling
### **removeQ & removeA ArrayLists**
- Duplicate ArrayLists for the question removal function
### **secondUser**
- Similar to user, but only used for the indexing for removing a question

## **Overall Logic:**
- Comments on the code

## **Work Log**
- 1/13: Brainstorming/Selecting the part
- 1/14: Rough outline and code didn't work at all. Needed many fixes
- 1/15: Improved the logic and refined some parts
- 1/16: Playtesting and checking for bugs
- 1/17: Submitted the project
