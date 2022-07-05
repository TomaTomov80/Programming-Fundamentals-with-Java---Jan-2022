package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseShedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());


        while (!commandList.get(0).equals("course start")) {

            String commandWord = commandList.get(0);

            switch (commandWord) {

                case "Add":
                    String lessonTitle = commandList.get(1);

                    if (!courseShedule.contains(lessonTitle)) {
                        courseShedule.add(lessonTitle);
                    }

                    break;

                case "Insert":
                    lessonTitle = commandList.get(1);
                    int index = Integer.parseInt(commandList.get(2));

                    if (!courseShedule.contains(lessonTitle)) {
                        courseShedule.add(index, lessonTitle);
                    }

                    break;

                case "Remove":
                    lessonTitle = commandList.get(1);
                    String exercise = lessonTitle + "-Exercise";

                    courseShedule.remove(lessonTitle);
                    courseShedule.remove(exercise);

                    break;

                case "Swap":
                    String firstLessonTitle = commandList.get(1);
                    String secondLessonTitle = commandList.get(2);
                    String firstLessonTitleExercise = commandList.get(1) + "-Exercise";
                    String secondLessonTitleExercise = commandList.get(2) + "-Exercise";


                    if (courseShedule.contains(firstLessonTitle) && courseShedule.contains(secondLessonTitle)) {

                        Collections.swap(courseShedule, courseShedule.indexOf(firstLessonTitle), courseShedule.indexOf(secondLessonTitle));

                    }

                    if (courseShedule.contains(firstLessonTitleExercise)){
                        courseShedule.remove(firstLessonTitleExercise);
                        courseShedule.add(courseShedule.indexOf(firstLessonTitle) + 1, firstLessonTitleExercise);
                    }
                    if (courseShedule.contains(secondLessonTitleExercise)){
                        courseShedule.remove(secondLessonTitleExercise);
                        courseShedule.add(courseShedule.indexOf(secondLessonTitle) + 1, secondLessonTitleExercise);
                    }
                    break;

                case "Exercise":
                    lessonTitle = commandList.get(1);
                    exercise = lessonTitle + "-Exercise";

                    if (courseShedule.contains(lessonTitle) && !courseShedule.contains(exercise)) {

                        courseShedule.add(courseShedule.indexOf(lessonTitle) + 1, exercise);
                    } else if (!courseShedule.contains(lessonTitle)) {
                        courseShedule.add(lessonTitle);
                        courseShedule.add(exercise);
                    }

                    break;
            }

            commandList = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        }

        for (int i = 0; i < courseShedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courseShedule.get(i));
        }
    }
}
