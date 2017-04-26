import random
from LinkedList import LinkedList
from Node import Node

class Node2D(object):

    def __init__(self, nextnode=None):
        self.nextNode = nextnode
        self.list = LinkedList.initialize()

    @classmethod
    def initialize(cls):
        ll = cls()
        return ll

    @classmethod
    def initializewithargs(cls, somelist):
        ll = cls()
        ll.list = somelist
        return ll

    def getnextnode(self):
        return self.nextNode

    def setnextnode(self, nextnode):
        self.nextNode = nextnode

    def populatelist(self, size):
        for i in range(size):
            tempint = random.randrange(1, 2147483647)
            tempnode = Node.initializewithargs(tempint)
            self.list.insertatbeginning(tempnode)

    def populatecycle(self, size):
        for i in range(size):
            tempint = random.randrange(1, 2147483647)
            tempnode = Node.initializewithargs(tempint)
            self.list.insertatbeginning(tempnode)
        tempnode = Node.initializewithargs(516)
        self.list.insertcycle(tempnode)


