from time import sleep
import traceback
import random
from LinkedList import LinkedList
from Node import Node


class CreateAndDeleteNodes():
    def __init__(self, initsize=0, listsize=0, inserts=0, delaymilisec=0, rate=0):
        self.initsize = initsize
        self.listsize = listsize
        self.inserts = inserts
        self.delaymilisec = delaymilisec
        self.rate = rate

    def runtest(self):
        mylist = LinkedList.initialize()

        for i in range(self.initsize):
            tempint = random.randint(1, 2147483647)
            tempnode = Node.initializewithargs(tempint)
            mylist.insertatbeginning(tempnode)

        for i in range(self.inserts):
            for i in range(self.rate):
                sleep(self.delaymilisec)
                tempint = random.randint(1, 2147483647)
                tempnode = Node.initializewithargs(tempint)
                mylist.insertatend(tempnode)
            sleep(self.delaymilisec)
            mylist.removefirst()


test = CreateAndDeleteNodes(10000, 100, 10000, .001, 2)
test.runtest()

# print(
#    str(test.listsize) + ' ' +
#    str(test.initsize) + ' ' +
#    str(test.inserts) + ' ' +
#    str(test.delaymilisec) + ' ' +
#    str(test.rate)
# )



