CC=gcc
CFLAGS=-std=c99 -Wall

# additional flags for gcov
TESTFLAGS=-fprofile-arcs -ftest-coverage

test: test.c 300LongestIncreasingSubsequence.h 300LongestIncreasingSubsequence.c
	# build the test
	$(CC) $(CFLAGS) $(TESTFLAGS) -o test test.c 300LongestIncreasingSubsequence.c

	# run the test, which will generate test-300LongestIncreasingSubsequence.gcna and test-300LongestIncreasingSubsequence.gcno
	./test

	# compute how test is covering 300LongestIncreasingSubsequence.c
	gcov -c -p test-300LongestIncreasingSubsequence

clean:
	rm -f *.o test *.gcov *.gcda *.gcno
