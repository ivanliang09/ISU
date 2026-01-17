// NAME: Ivan Liang

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> questions = new ArrayList<>(); // Creates an ArrayList to store every question in part A
        ArrayList<Character> answers = new ArrayList<>(); // Creates an ArrayList to store every answer in part A

        questions.add("When you are deciding whether or not to make a U-turn, your first consideration should be to check:\na. Traffic regulations.\nb. Presence of trees, fire hydrants or poles near the curb.\nc. Turning radius of your car.\nd. Height of curb.");
        answers.add('A');
        questions.add("What must a driver do before entering a highway from a private road or driveway?\na. Enter quickly.\nb. Yield to all vehicles.\nc. Sound horn.\nd. Take right-of-way.");
        answers.add('B');
        questions.add("Never change lanes without:\na. Looking in mirror only.\nb. Signaling and checking safety.\nc. Honking.\nd. Slowing down.");
        answers.add('B');
        questions.add("Driving at night is more dangerous because:\na. Slower reaction time.\nb. Less visibility.\nc. Parking lights only.\nd. Slippery roads.");
        answers.add('B');
        questions.add("To recover from a skid you should:\na. Steer straight.\nb. Opposite direction.\nc. Steer where you want to go.\nd. Brake hard.");
        answers.add('C');
        questions.add("When may you lend your license?\na. Emergencies.\nb. Learners.\nc. Never.\nd. ID purposes.");
        answers.add('C');
        questions.add("When another vehicle is passing you must:\na. Speed up.\nb. Move left.\nc. Signal no passing.\nd. Move right.");
        answers.add('D');
        questions.add("Drive at a speed that lets you:\na. Stop within 150m.\nb. Stop within 90m.\nc. Stop within 60m.\nd. Stop safely.");
        answers.add('D');
        questions.add("Four-way stop right-of-way goes to:\na. Left turn.\nb. Left driver.\nc. Straight driver.\nd. Right driver.");
        answers.add('D');
        questions.add("Flashing green light means:\na. Stop.\nb. Left turn only.\nc. Pedestrians only.\nd. Proceed.");
        answers.add('D');

        ArrayList<String> moreQuestions = new ArrayList<>(); // Creates an ArrayList to store every question in part B
        ArrayList<Character> moreAnswers = new ArrayList<>(); // Creates an ArrayList to store every answer in part B

        moreQuestions.add("City speed limit unless posted?\na. 50 km/h\nb. 40 km/h\nc. 60 km/h\nd. 80 km/h");
        moreAnswers.add('A');
        moreQuestions.add("Yellow diamond sign means:\na. Warning\nb. Stop\nc. Info\nd. Regulation");
        moreAnswers.add('A');
        moreQuestions.add("Parking distance from hydrant?\na. 5m\nb. 1m\nc. 2m\nd. 3m");
        moreAnswers.add('A');
        moreQuestions.add("Stop for school bus with flashing red lights:\na. Behind only\nb. From both directions\nc. One lane only\nd. School hours");
        moreAnswers.add('B');
        moreQuestions.add("Yellow traffic light means:\na. Stop immediately\nb. Stop if safe\nc. Speed up\nd. Go");
        moreAnswers.add('B');
        moreQuestions.add("Before changing lanes:\na. Signal only\nb. Mirrors only\nc. Signal + mirrors + blind spot\nd. Honk");
        moreAnswers.add('C');
        moreQuestions.add("Seatbelts of people under 16 are responsibility of:\na. Passenger\nb. Driver\nc. Police\nd. Parent");
        moreAnswers.add('B');
        moreQuestions.add("Cross solid yellow when:\na. Never\nb. Passing\nc. Turning\nd. Daytime");
        moreAnswers.add('C');
        moreQuestions.add("Emergency vehicle approaching:\na. Continue\nb. Speed up\nc. Stop in the middle\nd. Pull over to the right");
        moreAnswers.add('D');
        moreQuestions.add("Pedestrian at crosswalk:\na. Slow\nb. Honk\nc. Pass behind\nd. Stop");
        moreAnswers.add('D');

        ArrayList<String> tempA = new ArrayList<>(questions); // Create temporary duplicate ArrayLists
        ArrayList<Character> tempAnsA = new ArrayList<>(answers);
        ArrayList<String> tempB = new ArrayList<>(moreQuestions);
        ArrayList<Character> tempAnsB = new ArrayList<>(moreAnswers);

        while (true) {
            System.out.println("Welcome to the G1 Road Rules Application!"); // Welcome the user
            System.out.println("1. Write a G1 Test"); // Choice 1
            System.out.println("2. Login as admin"); // Choice 2
            System.out.println("3. Exit");
            int choice = sc.nextInt(); // Gets user input
            sc.nextLine(); // Consume newline character

            if (choice == 1) {
                int scoreA = 0; // Set the beginning scores
                int scoreB = 0;
                boolean testEnded = false; // Boolean variable to check if passing a part A/B is still possible


                System.out.println("\n--- PART A ---");
                for (int i = 0; i < 6 && !testEnded; i++) {
                    int randomNumber = (int) (Math.random() * tempA.size()); // Randomly generate a number to select test questions
                    System.out.println(tempA.get(randomNumber)); // Gets the question from the randomly generated number
                    char user = sc.nextLine().toUpperCase().charAt(0); // User inputs the multiple choice answer
                    if (user == tempAnsA.get(randomNumber)) {
                        System.out.println("Correct!");
                        scoreA++; // Adds score if correct
                    } else {
                        System.out.println("Incorrect...");
                    }
                    if (scoreA + (5 - i) < 4) { // Checks if it is still possible to pass after every question
                        System.out.println("Cannot pass Part A. Test ended.");
                        testEnded = true; // Causes the for loop to end
                    }
                    tempA.remove(randomNumber); // Removes the question from part A to not repeat questions
                    tempAnsA.remove(randomNumber); // Removes the answer from part A because the question is already gone
                }

                if (!testEnded) {
                    System.out.println("\n--- PART B ---"); // Part B is the same as Part A, but the score gets added to a different variable
                    for (int i = 0; i < 6 && !testEnded; i++) {
                        int randomNumber = (int) (Math.random() * tempB.size());
                        System.out.println(tempB.get(randomNumber));
                        char user = sc.nextLine().toUpperCase().charAt(0);
                        if (user == tempAnsB.get(randomNumber)) {
                            System.out.println("Correct!");
                            scoreB++;
                        } else {
                            System.out.println("Incorrect...");
                        }
                        if (scoreB + (5 - i) < 4) {
                            System.out.println("Cannot pass Part B. Test ended.");
                            testEnded = true;
                        }
                        tempB.remove(randomNumber);
                        tempAnsB.remove(randomNumber);
                    }
                }

                if (!testEnded) {
                    int total = scoreA + scoreB; // Adds up both parts to get total score
                    double percent = (total / 12.0) * 100; // Gets percentage
                    String formattedPercent = String.format("%.2f", percent);
                    System.out.println("\nPart A: " + scoreA + "/6"); // Displays your score for each part
                    System.out.println("Part B: " + scoreB + "/6");
                    System.out.println("Final Score: " + formattedPercent + "%"); // Displays your total percentage

                    if (percent >= 75 && scoreA >= 4 && scoreB >= 4) { // Checks if you passed or not
                        System.out.println("PASS\n");
                    } else {
                        System.out.println("FAIL\n");
                    }
                }
                
            } else if (choice == 2) { // Administrator panel
                System.out.println("Enter password:");
                if (!sc.nextLine().equals("password")) { // Password is "password"
                    System.out.println("Incorrect password.");
                } else {
                    System.out.println("a. Add question");
                    System.out.println("b. Remove question");
                    String adminChoice = sc.nextLine();
                    
                    if (adminChoice.equals("a")) {
                        System.out.println("Enter the full question with multiple choice options (A-D). Use \"\\\\n\" to separate each option:"); // Asks user to input the question
                        System.out.println("For example: What should you do at a go light?\\\\na. Stop\\\\nb. Go\\\\nc. Wait\\\\nd. Honk"); // Demonstrates how a question should be added

                        String newQuestion = sc.nextLine();
                        System.out.println("Choose which part you want to add it to A/B: ");
                        String answer = sc.nextLine().toUpperCase();
                        
                        if (answer.equals("A")) {
                            questions.add(newQuestion); // Question is added to the end of the questions Arraylist

                            System.out.println("Enter the correct answer (A-D) only:");
                            char newAnswer = sc.nextLine().toUpperCase().charAt(0); // Forces a capital letter
                            answers.add(newAnswer); // Answer is also added to the end of the answers ArrayList

                            System.out.println("Question added successfully!");
                        } else if (answer.equals("B")) { // Same as the part above
                            moreQuestions.add(newQuestion);

                            System.out.println("Enter the correct answer (A-D) only:");
                            char newAnswer = sc.nextLine().toUpperCase().charAt(0);
                            moreAnswers.add(newAnswer);

                            System.out.println("Question added successfully!");
                        } else {
                            System.out.println("Invalid");
                        }

                    }
                    
                    if (adminChoice.equals("b")) { // Removing a question
                        System.out.println("Enter the part you want to remove a question in A/B:");
                        String answer = sc.nextLine().toUpperCase();
                        if (answer.equals("A")) {
                            System.out.println("Select the question you want to remove: ");
                            for (int i = 0; i < questions.size(); i++) {
                                System.out.println((i + 1) + ". " + questions.get(i)); // Prints out every question in part A
                            }
                            int input = sc.nextInt() - 1; // Gets user input, then subracts 1 to match the index value
                            if (input >= 0 && input < questions.size()) { // Checks whether the question exists/is valid
                                questions.remove(input); // Removes the question
                                answers.remove(input); // Removes the answer to the question
                            } else {
                                System.out.println("Invalid");
                            }
                        } else if (answer.equals("B")) {
                            System.out.println("Select the question you want to remove: ");
                            for (int i = 0; i < moreQuestions.size(); i++) {
                                System.out.println((i + 1) + ". " + moreQuestions.get(i)); // Prints out every question in part B
                            }
                            int secondInput = sc.nextInt() - 1; // Gets user input, then subracts 1 to match the index value
                            if (secondInput >= 0 && secondInput < moreQuestions.size()) { // Checks whether the question exists/is valid
                                questions.remove(moreQuestions); // Removes the question
                                answers.remove(moreAnswers); // Removes the answer to the question
                            } else {
                                System.out.println("Invalid");
                            }
                        }
                    }
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice"); // Did not choose 1 or 2 or 3
            }
        }
    }
}
