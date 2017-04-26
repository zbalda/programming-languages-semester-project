from time import sleep
import traceback
from LinkedList2D import LinkedList2D
from Node2D import Node2D

class CreateAndDeleteCycles ():

    def __init__(self, initsize=0, listsize=0, inserts=0, delaymilisec=0, rate=0):
        self.initsize = initsize
        self.listsize = listsize
        self.inserts = inserts
        self.delaymilisec = delaymilisec
        self.rate = rate

    def runtest(self):
        mylist = LinkedList2D.initialize()
        for i in range(self.listsize):
            tempnode = Node2D.initialize()
            tempnode.populatecycle(self.listsize)
            mylist.insertatbeginning(tempnode)
        for i in range(self.inserts):
            for i in range(self.rate):
                sleep(self.delaymilisec)
                tempnode = Node2D.initialize()
                tempnode.populatecycle(self.listsize)
                mylist.insertatend(tempnode)
            sleep(self.delaymilisec)
            mylist.removefirst()

test = CreateAndDeleteCycles(10000, 100, 10000, 1, 2)
test.runtest()

#print(
#    str(test.listsize) + ' ' +
#    str(test.initsize) + ' ' +
#    str(test.inserts) + ' ' +
#    str(test.delaymilisec) + ' ' +
#    str(test.rate)
#)



