package StreamsMainPackage;

import StreamsMainPackage.Course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //HOW TO CREATE STREAM: Source to Stream Making
        //There are different ways to do it:

            // 1. Creating Stream from Array

        String[] courses = {"Java", "JS", "TS"};
        //Convert above to a stream below. Name of the stram is courseStream.
        //This is ready to go to flow. Next in the flow is intermadiate. So
        //we can use courseStream in intermadiate, but not courses because it's
        //not a stream
        Stream<String> courseStream = Arrays.stream(courses);




            // 2. Creating Stream from Collection (Used in development very often)
        List<String> courseList = Arrays.asList("Java", "JS", "TS");
        Stream<String> coursesStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Spring", 102),
                new Course("Microservices", 103)
        );

        Stream<Course> myCourseStream = myCourses.stream();




            //3. Creating Stream from Values (Almost never used in development)
        Stream<Integer> stream = Stream.of(1,2,3,4,5);


        //HOW TO USE INTERMADIATE OPERATIONS:
            //look at StreamsMainPackage.StreamOperations class




    }
}
