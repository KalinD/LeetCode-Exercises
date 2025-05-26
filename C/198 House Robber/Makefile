CC=gcc
CFLAGS=-std=c99 -Wall

# additional flags for gcov
TESTFLAGS=-fprofile-arcs -ftest-coverage

test: test.c 198HouseRobber.h 198HouseRobber.c
	# build the test
	$(CC) $(CFLAGS) $(TESTFLAGS) -o test test.c 198HouseRobber.c

	# run the test, which will generate test-198HouseRobber.gcna and test-198HouseRobber.gcno
	./test

	# compute how test is covering 198HouseRobber.c
	gcov -c -p test-198HouseRobber

clean:
	rm -f *.o test *.gcov *.gcda *.gcno
