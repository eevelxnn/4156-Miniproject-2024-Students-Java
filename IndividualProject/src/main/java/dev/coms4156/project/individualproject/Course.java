package dev.coms4156.project.individualproject;

import java.io.Serial;
import java.io.Serializable;

/**
 * Represents a course within an educational institution.
 * This class store information about a course such as the instructor, location, time slot,
 * the amount of students enrolled, and the max capacity.
 */
public class Course implements Serializable {

  /**
   * Constructs a new Course object with the given parameters. Initial count starts at 0.
   *
   * @param instructorName     The name of the instructor teaching the course.
   * @param courseLocation     The location where the course is held.
   * @param timeSlot           The time slot of the course.
   * @param capacity           The maximum number of students that can enroll in the course.
   */
  public Course(String instructorName, String courseLocation, String timeSlot, int capacity) {
    this.courseLocation = courseLocation;
    this.instructorName = instructorName;
    this.courseTimeSlot = timeSlot;
    this.enrollmentCapacity = capacity;
    this.enrolledStudentCount = 0;
  }

  /**
   * Enrolls a student in the course if there is space available.
   *
   * @return true if the student is successfully enrolled, false otherwise.
   */
  public boolean enrollStudent() {
    if (enrolledStudentCount < enrollmentCapacity) {
      enrolledStudentCount++;
      return true;
    }
    return false;
  }

  /**
   * Drops a student from the course if a student is enrolled.
   *
   * @return true if the student is successfully dropped, false otherwise.
   */
  public boolean dropStudent() {
    if (enrolledStudentCount > 0) {
      enrolledStudentCount--;
      return true;
    }
    return false;
  }

  /**
   * Gets the location of the course.
   *
   * @return the current location of the course
   */
  public String getCourseLocation() {
    return this.courseLocation;
  }

  /**
   * Gets the name of the Instructor.
   *
   * @return the current name of instructor
   */
  public String getInstructorName() {
    return this.instructorName;
  }

  /**
   * Gets the timeslot of the course.
   *
   * @return the current timeslot of the course
   */
  public String getCourseTimeSlot() {
    return this.courseTimeSlot;
  }

  /**
   * Gets a string representing the name of the instructor, the location of the course,
   * and the timeslot of the course.
   *
   * @return a string containing instructorName, instructorName, and courseTimeSlot
   */
  @Override
  public String toString() {
    return "\nInstructor: " + instructorName 
      + "; Location: "  + courseLocation 
      + "; Time: " + courseTimeSlot;
  }

  /**
   * Reassigns the course to a new instructor.
   *
   * @param newInstructorName the name of the new instructor
   */
  public void reassignInstructor(String newInstructorName) {
    this.instructorName = newInstructorName;
  }

  /**
   * Reassigns the course to a new location.
   *
   * @param newLocation the new location that will be assigned
   */
  public void reassignLocation(String newLocation) {
    this.courseLocation = newLocation;
  }

  /**
   * Reassigns the time slot to a new time.
   *
   * @param newTime the new time slot that will be assigned 
   */
  public void reassignTime(String newTime) {
    this.courseTimeSlot = newTime;
  }

  /**
   * Sets the count of enrolled students to a new count.
   *
   * @param count the new count that is being assigned
   */
  public void setEnrolledStudentCount(int count) {
    this.enrolledStudentCount = count;
  }

  /**
   * Checks if the course is at max capacity.
   *
   * @return true if course is full, false if otherwise.
   */
  public boolean isCourseFull() {
    return enrollmentCapacity <= enrolledStudentCount;
  }

  @Serial
  private static final long serialVersionUID = 123456L;
  private final int enrollmentCapacity;
  private int enrolledStudentCount;
  private String courseLocation;
  private String instructorName;
  private String courseTimeSlot;
}
