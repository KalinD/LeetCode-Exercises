CC=gcc
CFLAGS=-std=c99 -Wall

# additional flags for gcov
TESTFLAGS=-fprofile-arcs -ftest-coverage

test: test.c 45JumpGameII.h 45JumpGameII.c
	# build the test
	$(CC) $(CFLAGS) $(TESTFLAGS) -o test test.c 45JumpGameII.c

	# run the test, which will generate test-45JumpGameII.gcna and test-45JumpGameII.gcno
	./test

	# compute how test is covering 45JumpGameII.c
	gcov -c -p test-45JumpGameII

clean:
	rm -f *.o test *.gcov *.gcda *.gcno
