CC=gcc
CFLAGS=-std=c99 -Wall

# additional flags for gcov
TESTFLAGS=-fprofile-arcs -ftest-coverage

test: test.c 1732FindTheHighestAltitude.h 1732FindTheHighestAltitude.c
	# build the test
	$(CC) $(CFLAGS) $(TESTFLAGS) -o test test.c 1732FindTheHighestAltitude.c

	# run the test, which will generate test-1732FindTheHighestAltitude.gcna and test-1732FindTheHighestAltitude.gcno
	./test

	# compute how test is covering 1732FindTheHighestAltitude.c
	gcov -c -p test-1732FindTheHighestAltitude

clean:
	rm -f *.o test *.gcov *.gcda *.gcno
