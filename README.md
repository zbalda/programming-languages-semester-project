# Programming Languages Semester Project

## Evaluation Aspects
* Total execution time 
* Down time (from garbage collection)
* Amount of memory used (beginning, end, and throughout)
* Processing Power used
* Hardware specs of client machine
* Java Virtual Machine used
* Java garbage collection method used
* Sizes of Java memory spaces
* Sizes of Python memory spaces


## Tests

### Test 1: Create Data
For this test, we create a linked list of 1K, 10K, 100K, 1M, 10M,  100M, and 1B integers.

Prediction: Java will perform garbage collection only to move memory from newer to older memory spaces (if need be). Because Python also uses memory spaces, it will likely do the same. 

Results: TBD


### Test 2: Create then Deleting Data
This test is the same as Test 1, except after we create the data, we dereference it at two different rates. For one, we dereference the list item by item by removing the frst element of the list until it is empty. For the other, we clear the list by setting the first element to null.

Prediction: Notice that we create all data before deleting it. Python and Java both only perform garbage collection when a memory space is full. Thus, both should only perform garbage collection to move memory to different spaces during the memory creation phase. During and after the dereference phase, garbage collection will never be 'triggered' because none of the memory spaces will fill up.

Results: TBD

### Test 3: Create and Delete Nodes
For this test, we use a linked list to create and dereference data during runtime (as a typical program would). We start by creating a linked list of some initial size. Then, for some number of iterations, we add some number of items to the end of the list while deleting some number of items from the beginning (e.g. delete one, add two). 

Prediction: This test should be good for seeing how each handles cleaning up "single items" (i.e. none of the items being cleaned up reference anything else).

Results: TBD

### Test 4: Create and Delete Lists
This test is the same as Test 3, except instead of creating a linked list of integers, we create a linked list of linked lists. We first create a linked list of some initial size and populate that linked list with linked lists (these could be uniform in size, or be staggered). For some number of iterations we add some number of lists to the end of the list while deleting some number of lists from the beginning of the list.

Prediction: This test should be good for seeing how each handles cleaning up "chains of data" (i.e. when multiple pieces of data that are "chained together" by referencies become unreachable).

Results: TBD

### Test 5: Create and Delete Cycles
This test is essentially the same as Test 4, but instead of having each node in the list hold a linked list, we have each node hold a "cycle". This cycle is just a linked list whose last node points to its first. Just like for Test 4, we stagger the sizes of these cycles (possibly even use the same pattern(s).

Prediction: Java should act the same, Python probably won't do as well.

Results: TBD

### Test 6: Scheduled Service
For this test, we create some scheduled task for some time interval that produces an error when that task is unable to be performed on time (from garbage collection freezeup). We use tests 3, 4, and 5 for creating and deleting data, and test for each Java garbage collection method.
