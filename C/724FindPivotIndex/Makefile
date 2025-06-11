CC=gcc
CFLAGS=-std=c99 -Wall

# additional flags for gcov
TESTFLAGS=-fprofile-arcs -ftest-coverage

test: test.c 724FindPivotIndex.h 724FindPivotIndex.c
	# build the test
	$(CC) $(CFLAGS) $(TESTFLAGS) -o test test.c 724FindPivotIndex.c

	# run the test, which will generate test-724FindPivotIndex.gcna and test-724FindPivotIndex.gcno
	./test

	# compute how test is covering 724FindPivotIndex.c
	gcov -c -p test-724FindPivotIndex

clean:
	rm -f *.o test *.gcov *.gcda *.gcno
