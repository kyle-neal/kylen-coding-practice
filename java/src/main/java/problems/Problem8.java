/*
You've built an in-flight entertainment system with on-demand movie streaming.
Users on longer flights like to start a second movie right when their first one ends,
but they complain that the plane usually lands before they can see the ending.
So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.

Write a function that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes)
and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.

When building your function:

Assume your users will watch exactly two movies
Don't make your users watch the same movie twice
Optimize for runtime over memory
 */

package main.java.problems;

import main.java.util.Utilities;

import java.util.HashSet;
import java.util.Set;

public class Problem8 extends Problem {
    @Override
    public void solve() {
        int[] movies = Utilities.createArray(10);
        int flightTime = Utilities.randomNumber(60);
        System.out.print("Given:\n[ ");
        for (int i :
                movies) {
            System.out.print(i + " ");
        }
        System.out.println("]\n where flight time is " + flightTime + ", hasEvenMovieTimes is "
                + hasEvenMovieTimesv1(flightTime, movies));
    }

    //Solved in n^2 time
    public static boolean hasEvenMovieTimesv1(int flightTime, int[] movies) {
        for (int i = 0; i < movies.length; i++) {
            for (int j = 0; j < movies.length; j++) {
                if (movies[i] + movies[j] == flightTime && j != i)
                    return true;
            }
        }
        return false;
    }

    // Solved in n time
    public static boolean hasEvenMovieTimesv2(int flightTime, int[] movies) {
        Set<Integer> s = new HashSet<>();
        for (int firstMovie : movies) {
            int secondMovieTime = flightTime - firstMovie;
            if (s.contains(secondMovieTime)) return true;
            s.add(firstMovie);
        }
        return false;
    }

}
