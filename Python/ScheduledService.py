import threading
import time

exitFlag = 0

class ScheduledService (threading.Thread):
    def __init__(self, threadID, testType, delay):
        threading.Thread.__init__(self)
        self.threadID = threadID
        self.testType = testType
        self.delay = delay
    def run(self):
        print "Starting " + self.name
        test(self.testType, self.delay)
        print "Exiting " + self.name

def test(testType, delay):
    if testType == "Timer":
        for x in range(0, 500): # 100 = 100*10 milliseconds = 1000 milliseconds = 1 second
            print int(round(time.time() * 1000))
            time.sleep((delay/1000))
    elif testType == "CreateData":

        print "Create Data test finished."
    elif testType == "CreateThenDeleteData":

        print "Create then Delete Data test finished."
    elif testType == "CreateAndDeleteNodes":
        
        print "Create and Delete Lists test finished."
    elif testType == "CreateAndDeleteLists":
        cadl = CreateAndDeleteLists.initialize()
        print "Create and Delete Lists test finished."
    elif testType == "CreateAndDeleteCycles":
        
        print "Create and Delete Cycles test finished."
    else: 
        print "invalid test type input"

# Create new threads
timerThread = ScheduledService(1, "Timer", 10)
dataThread = ScheduledService(2, "CreateAndDeleteLists", 10)

# Start new Threads
timerThread.start()
timerThread.start()

print "Exiting Main Thread"
