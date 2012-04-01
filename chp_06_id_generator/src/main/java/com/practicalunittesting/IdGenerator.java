package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface IdGenerator {

    /**
     * @return unique id
     */
	Long nextId();
}