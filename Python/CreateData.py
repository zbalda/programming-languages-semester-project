from time import sleep
import traceback
import random
from LinkedList import LinkedList
from Node import Node


class CreateData():
    def __init__(self, amount=0, delaymillisec=0):
        self.amount = amount
        self.delaymillisec = delaymillisec

    def createData(self):
        mylist = LinkedList.initialize()

        for i in range(self.amount):
            sleep(self.delaymillisec)
            tempint = random.randint(1, 2147483647)
            tempnode = Node.initializewithargs(tempint)
            mylist.insertatbeginning


test = CreateData(10000, .001)
test.createData()

# print(
#    str(test.listsize) + ' ' +
#    str(test.initsize) + ' ' +
#    str(test.inserts) + ' ' +
#    str(test.delaymilisec) + ' ' +
#    str(test.rate)
# )



